package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Domain.Repository.ProductsPartnerRepository;
import com.prueba.demo.Persistence.CRUD.ProductosAliadosCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosAliados;
import com.prueba.demo.Persistence.Mapper.ProductsPartnerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

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

    @Override
    public Optional<ProductsPartner> getRegister(int id) {
        return productosAliadosCrudRepository.findById(id).map(productosAliados -> productsPartnerMapper.toProductsPartner(productosAliados));
    }

    @Override
    public String getText(int id) {
        return "mensaje de prueba de metodo productosAliados=  "+ id;
    }
}
