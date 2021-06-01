package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.ProductsClean;

import java.util.List;
import java.util.Optional;

public interface ProductServicesRepository {
    List<ProductServices> getAll();
    Optional<ProductServices> getRegister(int id);
    String getText(int id);
}
