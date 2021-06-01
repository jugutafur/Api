package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Repository.ProductServicesRepository;
import com.prueba.demo.Persistence.CRUD.ProductosServiciosCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosServicios;
import com.prueba.demo.Persistence.Mapper.ProductServicesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosServiciosRepository implements ProductServicesRepository {

    @Autowired
    private ProductosServiciosCrudRepository productosserviciosCrudRepository;

    @Autowired
    private ProductServicesMapper productservicesMapper;


    @Override
    public List<ProductServices> getAll() {
        List<ProductosServicios> productosservicios= (List<ProductosServicios>) productosserviciosCrudRepository.findAll();
        return productservicesMapper.toProductServices(productosservicios);
    }

    @Override
    public Optional<ProductServices> getRegister(int id) {
        return productosserviciosCrudRepository.findById(id).map(productosServicios -> productservicesMapper.toProductServices(productosServicios));
    }

    @Override
    public String getText(int id) {
        return "texto de ProductServices = "+ id;
    }
}
