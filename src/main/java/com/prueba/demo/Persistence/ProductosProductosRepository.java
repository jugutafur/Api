package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductsProducts;
import com.prueba.demo.Domain.Repository.ProductsProductsRepository;
import com.prueba.demo.Persistence.CRUD.ProductosProductosCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosProductos;
import com.prueba.demo.Persistence.Mapper.ProductsProductsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosProductosRepository implements ProductsProductsRepository {

    @Autowired
    private ProductosProductosCrudRepository productosProductosCrudRepository;

    @Autowired
    private ProductsProductsMapper productsProductsMapper;


    @Override
    public List<ProductsProducts> getAll() {
        List<ProductosProductos> productosProductos= (List<ProductosProductos>) productosProductosCrudRepository.findAll();
        return productsProductsMapper.toProductsProducts(productosProductos);
    }

    @Override
    public Optional<ProductsProducts> getRegister(int id) {
        return productosProductosCrudRepository.findById(id).map(productosProductos -> productsProductsMapper.toProductsProducts(productosProductos));
    }

    @Override
    public String getText(int id) {
        return "texto de ProductsProducts = "+ id;
    }
}
