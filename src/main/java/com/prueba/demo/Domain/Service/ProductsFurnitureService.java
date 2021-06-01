package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsFurniture;
import com.prueba.demo.Domain.Repository.ProductsFurnitureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsFurnitureService {

    @Autowired
    public ProductsFurnitureRepository productsFurnitureRepository;

    public List<ProductsFurniture> getAll(){return productsFurnitureRepository.getAll();}
    public Optional<ProductsFurniture> getRegister(int id){ return  productsFurnitureRepository.getRegister(id);}
    public String getText(int id) {return productsFurnitureRepository.getText(id);}
}
