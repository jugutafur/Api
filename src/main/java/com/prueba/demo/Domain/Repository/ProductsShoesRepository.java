package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductsShoes;

import java.util.List;
import java.util.Optional;

public interface ProductsShoesRepository {
    List<ProductsShoes> getAll();
    Optional<ProductsShoes> getRegister(int id);
    String getText(int id);
}
