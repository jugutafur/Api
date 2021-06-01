package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.ProductsClean;

import java.util.List;
import java.util.Optional;

public interface ProductsCleanRepository {
    List<ProductsClean> getAll();
    Optional<ProductsClean> getRegister(int id);
    String getText(int id);
}
