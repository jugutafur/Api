package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Domain.Repository.ProductsPartnerRepository;
import com.prueba.demo.Persistence.CRUD.ProductosAliadosCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosAliados;
import com.prueba.demo.Persistence.Mapper.ProductsPartnerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductosAliadosRepository implements ProductsPartnerRepository {

    @Autowired
    private ProductosAliadosCrudRepository productosAliadosCrudRepository;

    @Autowired
    private ProductsPartnerMapper productsPartnerMapper;


    @Override
    public List<ProductsPartner> getAll() {
        List<ProductosAliados> productosAliados=(List<ProductosAliados>) productosAliadosCrudRepository.findAll();
        return productsPartnerMapper.toProductsPartner(productosAliados);
    }
}
