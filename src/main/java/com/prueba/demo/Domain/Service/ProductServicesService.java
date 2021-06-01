package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Repository.ProductServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductServicesService {

    @Autowired
    private ProductServicesRepository productservicesRepository;

    public List<ProductServices> getAll(){return productservicesRepository.getAll();}
    public Optional<ProductServices> getRegister(int id){return  productservicesRepository.getRegister(id);}
    public String getText(int id){return productservicesRepository.getText(id); }
}
