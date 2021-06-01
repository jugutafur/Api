package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Domain.Repository.ProductsHomeRepository;
import com.prueba.demo.Persistence.CRUD.ProductosHogarCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosHogar;
import com.prueba.demo.Persistence.Mapper.ProductsHomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosHogarRepository implements ProductsHomeRepository {

    @Autowired
    private ProductosHogarCrudRepository productosHogarCrudRepository;

    @Autowired
    private ProductsHomeMapper productsHomeMapper;


    @Override
    public List<ProductsHome> getAll() {
        List<ProductosHogar> productosHogar=(List<ProductosHogar>) productosHogarCrudRepository.findAll();
        return productsHomeMapper.totoProductsHome(productosHogar);
    }

    @Override
    public Optional<ProductsHome> getRegister(int id) {
        return productosHogarCrudRepository.findById(id).map(productosHogar -> productsHomeMapper.toProductsHome(productosHogar));
    }

    @Override
    public String getText(int id) {
        return  "texto de ProductsHome = "+ id;
    }
}
