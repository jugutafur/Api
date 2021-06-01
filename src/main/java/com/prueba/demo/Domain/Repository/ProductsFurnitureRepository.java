package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.ProductsFurniture;

import java.util.List;
import java.util.Optional;

public interface ProductsFurnitureRepository {
    List<ProductsFurniture> getAll();
    Optional<ProductsFurniture> getRegister(int id);
    String getText(int id);
}
