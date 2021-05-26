package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsClean;
import com.prueba.demo.Persistence.Entity.ProductosAseo;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsCleanMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsClean toProductsClean(ProductosAseo productosAseo);
    List<ProductsClean> toProductsClean(List<ProductosAseo> productosAseos);

    @InheritInverseConfiguration
    ProductosAseo toProductosAseo(ProductsClean productsClean);
}
