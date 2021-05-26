package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosAseo;
import org.springframework.data.repository.CrudRepository;

public interface ProductosAseoCrudRepository extends CrudRepository<ProductosAseo,Integer> {
}
