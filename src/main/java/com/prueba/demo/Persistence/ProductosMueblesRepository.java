package com.prueba.demo.Persistence;


import com.prueba.demo.Domain.ProductsFurniture;
import com.prueba.demo.Domain.Repository.ProductsFurnitureRepository;
import com.prueba.demo.Persistence.CRUD.ProductsFurnitureCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosMuebles;
import com.prueba.demo.Persistence.Mapper.ProductsFurnitureMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosMueblesRepository implements ProductsFurnitureRepository {

    @Autowired
    private ProductsFurnitureCrudRepository productsFurnitureCrudRepository;

    @Autowired
    private ProductsFurnitureMapper productsFurnitureMapper;

    @Override
    public List<ProductsFurniture> getAll() {
        List<ProductosMuebles> productosMuebles=(List<ProductosMuebles>) productsFurnitureCrudRepository.findAll();
        return productsFurnitureMapper.toProductsFurniture(productosMuebles);
    }

    @Override
    public Optional<ProductsFurniture> getRegister(int id) {
        return productsFurnitureCrudRepository.findById(id).map(productosMuebles -> productsFurnitureMapper.toProductsFurniture(productosMuebles));
    }

    @Override
    public String getText(int id) {
        return "texto de ProductsFurniture = "+ id;
    }
}
