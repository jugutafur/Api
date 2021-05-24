package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Repository.ProductServicesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServicesService {

    @Autowired
    private ProductServicesRepository productservicesRepository;

    public List<ProductServices> getAll(){return productservicesRepository.getAll();}

    /*
    public Optional<Product_Services> getProduct_Services(int id){return product_servicesRepository.getProduct_Services(id);}

     */
}
