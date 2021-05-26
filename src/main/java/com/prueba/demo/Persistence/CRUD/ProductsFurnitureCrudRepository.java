package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosMuebles;
import org.springframework.data.repository.CrudRepository;

public interface ProductsFurnitureCrudRepository extends CrudRepository<ProductosMuebles, Integer> {
}
