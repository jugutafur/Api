package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductsProducts;
import com.prueba.demo.Domain.ProductsTechnology;

import java.util.List;
import java.util.Optional;

public interface ProductsTechnologyRepository {
    List<ProductsTechnology> getAll();
    Optional<ProductsTechnology> getRegister(int id);
    String getText(int id);
}
