package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Persistence.Entity.ProductosAliados;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProductsPartnerMapper {
    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    ProductsPartner toProductsPartner(ProductosAliados productosAliados);
    List<ProductsPartner> toProductsPartner(List<ProductosAliados> productosAliados);

    @InheritInverseConfiguration
    ProductosAliados toProductosAliados(ProductsPartner productsPartner);
}
