package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductsFurniture;
import com.prueba.demo.Domain.ProductsHome;

import java.util.List;
import java.util.Optional;

public interface ProductsHomeRepository {
    List<ProductsHome> getAll();
    Optional<ProductsHome> getRegister(int id);
    String getText(int id);
}
