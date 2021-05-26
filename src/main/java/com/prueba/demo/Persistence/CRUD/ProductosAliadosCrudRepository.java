package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosAliados;
import org.springframework.data.repository.CrudRepository;

public interface ProductosAliadosCrudRepository extends CrudRepository<ProductosAliados, Integer> {
}
