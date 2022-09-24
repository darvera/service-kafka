package com.example.demo.service;

import com.example.demo.model.ClientWallet;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClientWalletService {
    Mono<ClientWallet> save(ClientWallet clientWallet);
    Mono<ClientWallet> update(ClientWallet clientWallet);
    Flux<ClientWallet> findAll();
    Mono<ClientWallet> getId(String id);
    Mono<Void> delete(String id);
    Mono<ClientWallet> getIdcache(String id);

}
