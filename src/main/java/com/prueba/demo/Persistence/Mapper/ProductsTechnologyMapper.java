package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsTechnology;
import com.prueba.demo.Persistence.Entity.ProductosTecnologia;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsTechnologyMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsTechnology toProductsTechnology(ProductosTecnologia productosTecnologia);
    List<ProductsTechnology> toProductsTechnology(List<ProductosTecnologia> productosTecnologias);

    @InheritInverseConfiguration
    ProductosTecnologia toProductosTecnologia (ProductsTechnology productsTechnology);
}
