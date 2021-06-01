package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Domain.ProductsProducts;

import java.util.List;
import java.util.Optional;

public interface ProductsProductsRepository {
    List<ProductsProducts> getAll();
    Optional<ProductsProducts> getRegister(int id);
    String getText(int id);
}
