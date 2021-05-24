package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.Product_Services;
import com.prueba.demo.Domain.Repository.Product_ServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class Product_ServicesService {

    @Autowired
    private Product_ServicesRepository product_servicesRepository;

    public List<Product_Services> getAll(){return product_servicesRepository.getAll();}

    public Optional<Product_Services> getProduct_Services(){return product_servicesRepository.getProduct_Services();}
}
