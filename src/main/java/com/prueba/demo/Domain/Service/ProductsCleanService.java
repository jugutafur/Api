package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsClean;
import com.prueba.demo.Domain.Repository.ProductsCleanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsCleanService {

    @Autowired
    private ProductsCleanRepository productsCleanRepository;

    public List<ProductsClean> getAll(){return productsCleanRepository.getAll();}
}
