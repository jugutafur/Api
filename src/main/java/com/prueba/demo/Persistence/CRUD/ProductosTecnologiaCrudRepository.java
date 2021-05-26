package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosTecnologia;
import org.springframework.data.repository.CrudRepository;

public interface ProductosTecnologiaCrudRepository extends CrudRepository<ProductosTecnologia, Integer> {
}
