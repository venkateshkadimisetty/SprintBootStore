package com.my.store.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.my.store.model.Store;
import com.my.store.repository.StoreRepository;



@RestController
@RequestMapping("/api")
public class StoreController {
	@Autowired
	private StoreRepository storeRepository;
	
	@GetMapping("/stores")
    public Page<Store> getAllProducts(Pageable pageable) {
        return storeRepository.findAll(pageable);
    }
    
    @PostMapping("/store")
    public Store createStore(@Valid @RequestBody Store store) {
        return storeRepository.save(store);
    }
}
