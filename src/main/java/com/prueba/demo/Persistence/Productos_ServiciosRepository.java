package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.Product_Services;
import com.prueba.demo.Domain.Repository.Product_ServicesRepository;
import com.prueba.demo.Persistence.CRUD.Productos_ServiciosCrudRepository;
import com.prueba.demo.Persistence.Entity.Productos_Servicios;
import com.prueba.demo.Persistence.Mapper.Product_ServicesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class Productos_ServiciosRepository implements Product_ServicesRepository {

    @Autowired
    private Productos_ServiciosCrudRepository productos_serviciosCrudRepository;

    @Autowired
    private Product_ServicesMapper product_servicesMapper;


    @Override
    public List<Product_Services> getAll() {
        List<Productos_Servicios> productos_servicios= (List<Productos_Servicios>) productos_serviciosCrudRepository.findAll();
        return product_servicesMapper.toProduct_Services(productos_servicios);
    }

    /*
    @Override
    public Optional<Product_Services> getProduct_Services(int id) {
        return Optional.empty();
    }

     */
}
