package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Persistence.Entity.ProductosHogar;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsHomeMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsHome toProductsHome(ProductosHogar productosHogar);
    List<ProductsHome> totoProductsHome(List<ProductosHogar> productosHogar);

    @InheritInverseConfiguration
    ProductosHogar toProductosHogar(ProductsHome productsHome);
}
