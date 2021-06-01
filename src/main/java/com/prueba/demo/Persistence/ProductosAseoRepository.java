package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.ProductsClean;
import com.prueba.demo.Domain.Repository.ProductsCleanRepository;
import com.prueba.demo.Persistence.CRUD.KitCrudRepository;
import com.prueba.demo.Persistence.CRUD.ProductosAseoCrudRepository;
import com.prueba.demo.Persistence.Entity.Kit;
import com.prueba.demo.Persistence.Entity.ProductosAseo;
import com.prueba.demo.Persistence.Mapper.ProductsCleanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosAseoRepository implements ProductsCleanRepository {

    @Autowired
    private ProductosAseoCrudRepository productosAseoCrudRepository;

    @Autowired
    private ProductsCleanMapper productsCleanMapper;


    @Override
    public List<ProductsClean> getAll() {
        List<ProductosAseo> productosAseo=(List<ProductosAseo>) productosAseoCrudRepository.findAll();
        return productsCleanMapper.toProductsClean(productosAseo);
    }

    @Override
    public Optional<ProductsClean> getRegister(int id) {
        return productosAseoCrudRepository.findById(id).map(productosAseo -> productsCleanMapper.toProductsClean(productosAseo));
    }

    @Override
    public String getText(int id) {
        return "texto de prueba Aseo = "+ id;
    }
}
