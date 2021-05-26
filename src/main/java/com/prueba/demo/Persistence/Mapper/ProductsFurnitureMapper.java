package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsFurniture;
import com.prueba.demo.Persistence.Entity.ProductosMuebles;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsFurnitureMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsFurniture toProductsFurniture(ProductosMuebles productosMuebles);
    List<ProductsFurniture> toProductsFurniture(List<ProductosMuebles> productosMuebles);

    @InheritInverseConfiguration
    ProductosMuebles toProductosMuebles(ProductsFurniture productsFurniture);
}
