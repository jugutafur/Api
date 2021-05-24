package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.Product_Services;
import com.prueba.demo.Persistence.Entity.Productos_Servicios;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface Product_ServicesMapper {

    @Mappings({
            @Mapping(source = "imagen", target = "image"),
            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "precio", target = "price"),
            @Mapping(source = "descripcion", target = "description")
    })
    Product_Services toProduct_Services (Productos_Servicios productos_servicios);
    List<Product_Services> toProduct_Services(List<Productos_Servicios> productos_servicios);

    @InheritInverseConfiguration
    Productos_Servicios toProductos_Servicios(Product_Services product_services);
}
