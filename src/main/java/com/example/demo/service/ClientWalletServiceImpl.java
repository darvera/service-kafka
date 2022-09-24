package com.example.demo.service;

import com.example.demo.model.ClientWallet;
import com.example.demo.repository.ClientWalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ClientWalletServiceImpl  implements  ClientWalletService{
    @Autowired
    private ClientWalletRepository repository;
    @Override
    public Mono<ClientWallet> save(ClientWallet clientWallet) {
        return repository.save(clientWallet);
    }

    @Override
    public Mono<ClientWallet> update(ClientWallet clientWallet) {
        return repository.findById(clientWallet.getId())
                .switchIfEmpty(Mono.error(RuntimeException::new))
                .flatMap(v -> repository.save(clientWallet));
    }

    @Override
    public Flux<ClientWallet> findAll() {
        return repository.findAll()
                .filter(clientWallet -> clientWallet.getStatus() == 1);
    }

    @Override
    public Mono<ClientWallet> getId(String id) {
        return repository.findById(id)
                .switchIfEmpty(Mono.error(RuntimeException::new));
    }

    @Override
    public Mono<Void> delete(String id) {
        return repository.findById(id)
                .switchIfEmpty(Mono.error(RuntimeException::new))
                .flatMap(x -> repository.deleteById(id));
    }

    @Cacheable
    @Override
    public Mono<ClientWallet> getIdcache(String id) {
        return null;
    }
}
