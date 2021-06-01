package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsProducts;
import com.prueba.demo.Domain.Repository.ProductsProductsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsProductsService {

    @Autowired
    private ProductsProductsRepository productsProductsRepository;

    public List<ProductsProducts> getAll(){return productsProductsRepository.getAll();}
    public Optional<ProductsProducts> getRegister(int id){ return productsProductsRepository.getRegister(id);}
    public String getText(int id){ return productsProductsRepository.getText(id);}
}
