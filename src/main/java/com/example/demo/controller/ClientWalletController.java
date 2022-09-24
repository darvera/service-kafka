package com.example.demo.controller;

import com.example.demo.model.ClientWallet;
import com.example.demo.service.ClientWalletService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Slf4j
@RestController
@RequestMapping("/clientwallet")
public class ClientWalletController {
    @Autowired
    private ClientWalletService clientWalletService;

    @GetMapping()
    public Flux<ClientWallet> findAll(){
        return clientWalletService.findAll();
    }
    @PostMapping()
    public Mono<ClientWallet> save(@RequestBody ClientWallet p){
        return clientWalletService.save(p);
    }

    @PutMapping()
    public Mono<ClientWallet> update(@RequestBody ClientWallet p){
        return clientWalletService.update(p);
    }

    @GetMapping(value = "/{id}")
    public Mono<ClientWallet> findById(@PathVariable("id") String id){
        return clientWalletService.getId(id);
    }

    @DeleteMapping(value = "/{id}")
    public Mono<Void> delete(@PathVariable("id") String id){
        return clientWalletService.delete(id);
    }

}
