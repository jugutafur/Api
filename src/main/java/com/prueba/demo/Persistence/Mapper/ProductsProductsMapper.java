package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsProducts;
import com.prueba.demo.Persistence.Entity.ProductosProductos;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsProductsMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsProducts toProductsProducts (ProductosProductos productosProductos);
    List<ProductsProducts> toProductsProducts (List<ProductosProductos> productosProductos);

    @InheritInverseConfiguration
    ProductosProductos toProductosProductos (ProductsProducts productsProducts);
}
