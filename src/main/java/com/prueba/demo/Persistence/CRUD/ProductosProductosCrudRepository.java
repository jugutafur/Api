package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosProductos;
import org.springframework.data.repository.CrudRepository;

public interface ProductosProductosCrudRepository extends CrudRepository<ProductosProductos, Integer> {
}
