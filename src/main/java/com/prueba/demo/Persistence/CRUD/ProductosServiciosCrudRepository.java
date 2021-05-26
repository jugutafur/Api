package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosServicios;
import org.springframework.data.repository.CrudRepository;

public interface ProductosServiciosCrudRepository extends CrudRepository<ProductosServicios, Integer> {
}
