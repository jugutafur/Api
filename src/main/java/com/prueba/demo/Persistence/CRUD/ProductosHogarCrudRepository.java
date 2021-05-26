package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosHogar;
import org.springframework.data.repository.CrudRepository;

public interface ProductosHogarCrudRepository extends CrudRepository<ProductosHogar,Integer> {
}
