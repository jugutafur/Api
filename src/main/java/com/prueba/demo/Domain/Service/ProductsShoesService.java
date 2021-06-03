package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsShoes;
import com.prueba.demo.Domain.Repository.ProductsShoesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsShoesService {

    @Autowired
    public ProductsShoesRepository productsShoesRepository;

    public List<ProductsShoes> getAll(){return productsShoesRepository.getAll();};
    public Optional<ProductsShoes> getRegister(int id){return productsShoesRepository.getRegister(id);}
    public String getText(int id){return productsShoesRepository.getText(id);}
}
