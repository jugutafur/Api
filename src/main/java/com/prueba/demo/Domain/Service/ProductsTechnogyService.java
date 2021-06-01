package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsTechnology;
import com.prueba.demo.Domain.Repository.ProductsTechnologyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductsTechnogyService {

    @Autowired
    private ProductsTechnologyRepository productsTechnologyRepository;

    public List<ProductsTechnology> getAll(){return productsTechnologyRepository.getAll();}
    public Optional<ProductsTechnology> getRegister(int id){ return productsTechnologyRepository.getRegister(id);}
    public String getText(int id){ return productsTechnologyRepository.getText(id);}
}
