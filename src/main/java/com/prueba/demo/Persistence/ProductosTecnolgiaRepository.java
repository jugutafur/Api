package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductsTechnology;
import com.prueba.demo.Domain.Repository.ProductsTechnologyRepository;
import com.prueba.demo.Persistence.CRUD.ProductosTecnologiaCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosTecnologia;
import com.prueba.demo.Persistence.Mapper.ProductsTechnologyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosTecnolgiaRepository implements ProductsTechnologyRepository {

    @Autowired
    private ProductosTecnologiaCrudRepository productosTecnologiaCrudRepository;

    @Autowired
    private ProductsTechnologyMapper productsTechnologyMapper;

    @Override
    public List<ProductsTechnology> getAll() {
        List<ProductosTecnologia> productosTecnologias = (List<ProductosTecnologia>) productosTecnologiaCrudRepository.findAll();
        return productsTechnologyMapper.toProductsTechnology(productosTecnologias);
    }

    @Override
    public Optional<ProductsTechnology> getRegister(int id) {
        return productosTecnologiaCrudRepository.findById(id).map(productosTecnologia -> productsTechnologyMapper.toProductsTechnology(productosTecnologia));
    }


    @Override
    public String getText(int id) {
        return "texto de ProductsTechnology = "+ id;
    }
}
