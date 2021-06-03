package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsShoes;
import com.prueba.demo.Persistence.Entity.ProductosZapatos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsShoesMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsShoes toProductsShoes(ProductosZapatos productosZapatos);
    List<ProductsShoes> toProductsShoes(List<ProductosZapatos> productosZapatos);

    @InheritInverseConfiguration
    ProductosZapatos toProductosZapatos(ProductsShoes productsShoes);
}
