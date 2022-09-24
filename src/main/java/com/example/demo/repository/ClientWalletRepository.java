package com.example.demo.repository;

import com.example.demo.model.ClientWallet;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientWalletRepository extends ReactiveCrudRepository<ClientWallet, String> {

}
