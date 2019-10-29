package com.my.store.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.my.store.model.Store;


public interface StoreRepository extends JpaRepository<Store, Long>{
	 Page<Store> findAll(Pageable pageable);
}
