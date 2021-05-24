package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Repository.ProductServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesService {

    @Autowired
    private ProductServicesRepository product_servicesRepository;

    public List<ProductServices> getAll(){return product_servicesRepository.getAll();}

    /*
    public Optional<Product_Services> getProduct_Services(int id){return product_servicesRepository.getProduct_Services(id);}

     */
}
