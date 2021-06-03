package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.ProductosZapatos;
import org.springframework.data.repository.CrudRepository;

public interface ProductosZapatosCrudRepository extends CrudRepository<ProductosZapatos,Integer> {
}
