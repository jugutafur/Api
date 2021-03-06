package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Persistence.Entity.ProductosServicios;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductServicesMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductServices toProductServices (ProductosServicios productosservicios);
    List<ProductServices> toProductServices(List<ProductosServicios> productosServicios);

    @InheritInverseConfiguration
    ProductosServicios toProductosServicios(ProductServices productservices);
}
