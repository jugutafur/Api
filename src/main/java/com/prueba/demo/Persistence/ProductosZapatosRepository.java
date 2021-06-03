package com.prueba.demo.Persistence;

import com.prueba.demo.Domain.ProductsShoes;
import com.prueba.demo.Domain.Repository.ProductsShoesRepository;
import com.prueba.demo.Persistence.CRUD.ProductosZapatosCrudRepository;
import com.prueba.demo.Persistence.Entity.ProductosZapatos;
import com.prueba.demo.Persistence.Mapper.ProductsShoesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class ProductosZapatosRepository implements ProductsShoesRepository {

    @Autowired
    public ProductosZapatosCrudRepository productosZapatosCrudRepository;

    @Autowired
    public ProductsShoesMapper productsShoesMapper;



    @Override
    public List<ProductsShoes> getAll() {
        List<ProductosZapatos> productosZapatos= (List<ProductosZapatos>) productosZapatosCrudRepository.findAll();
        return productsShoesMapper.toProductsShoes(productosZapatos);
    }

    @Override
    public Optional<ProductsShoes> getRegister(int id) {
        return productosZapatosCrudRepository.findById(id).map(productosZapatos -> productsShoesMapper.toProductsShoes(productosZapatos));
    }

    @Override
    public String getText(int id) { return "texto de ProductosZapatos = "+ id; }
}
