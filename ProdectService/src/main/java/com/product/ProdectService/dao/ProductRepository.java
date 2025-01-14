package com.product.ProdectService.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.ProdectService.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
