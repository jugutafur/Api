package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Domain.Repository.ProductsHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsHomeService {

    @Autowired
    private ProductsHomeRepository productsHomeRepository;

    public List<ProductsHome> getAll(){return productsHomeRepository.getAll();}
}
