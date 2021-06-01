package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Domain.Repository.ProductsHomeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsHomeService {

    @Autowired
    private ProductsHomeRepository productsHomeRepository;

    public List<ProductsHome> getAll(){return productsHomeRepository.getAll();}
    public Optional<ProductsHome> getRegister(int id) {return productsHomeRepository.getRegister(id);}
    public String getText(int id) {return productsHomeRepository.getText(id);}
}
