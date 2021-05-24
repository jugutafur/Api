package com.prueba.demo.Domain.Repository;

import com.prueba.demo.Domain.Product_Services;
import java.util.List;
import java.util.Optional;

public interface Product_ServicesRepository {
    List<Product_Services> getAll();
    /*
    Optional<Product_Services> getProduct_Services(int id);

     */
}
