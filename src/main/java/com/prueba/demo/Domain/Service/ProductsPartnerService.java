package com.prueba.demo.Domain.Service;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Domain.Repository.ProductsPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductsPartnerService {

    @Autowired
    private ProductsPartnerRepository productsPartnerRepository;

    public List<ProductsPartner> getAll(){return productsPartnerRepository.getAll();}
}
