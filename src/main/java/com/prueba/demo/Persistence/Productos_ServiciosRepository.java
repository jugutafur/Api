package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Repository.ProductServicesRepository;
import com.prueba.demo.Persistence.CRUD.ProductosServiciosCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosServicios;
import com.prueba.demo.Persistence.Mapper.ProductServicesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class Productos_ServiciosRepository implements ProductServicesRepository {

    @Autowired
    private ProductosServiciosCrudRepository productos_serviciosCrudRepository;

    @Autowired
    private ProductServicesMapper product_servicesMapper;


    @Override
    public List<ProductServices> getAll() {
        List<ProductosServicios> productos_servicios= (List<ProductosServicios>) productos_serviciosCrudRepository.findAll();
        return product_servicesMapper.toProduct_Services(productos_servicios);
    }

    /*
    @Override
    public Optional<Product_Services> getProduct_Services(int id) {
        return Optional.empty();
    }

     */
}
