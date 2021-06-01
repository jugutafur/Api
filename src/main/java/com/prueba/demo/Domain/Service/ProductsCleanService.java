package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.ProductsClean;
import com.prueba.demo.Domain.Repository.ProductsCleanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsCleanService {

    @Autowired
    private ProductsCleanRepository productsCleanRepository;

    public List<ProductsClean> getAll(){return productsCleanRepository.getAll();}
    public Optional<ProductsClean> getRegister(int id){return productsCleanRepository.getRegister(id);}
    public String getText(int id){return productsCleanRepository.getText(id);}
}
