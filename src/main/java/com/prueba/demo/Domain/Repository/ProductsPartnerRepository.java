package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Domain.ProductsPartner;

import java.util.List;
import java.util.Optional;

public interface ProductsPartnerRepository {
    List<ProductsPartner> getAll();
    Optional<ProductsPartner> getRegister(int id);
    String getText(int id);
}
