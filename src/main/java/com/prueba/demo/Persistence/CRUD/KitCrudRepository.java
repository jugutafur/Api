package com.prueba.demo.Persistence.CRUD;

import com.prueba.demo.Persistence.Entity.Kit;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface KitCrudRepository extends CrudRepository<Kit, Integer> {

/*

    List<Kit> findByIdTitulo(String titulo);

 */


}
