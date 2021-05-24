package com.prueba.demo.Persistence.Mapper;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Persistence.Entity.Kit;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring")
public interface KhitMapper {

    @Mappings({

            @Mapping(source = "titulo", target = "title"),
            @Mapping(source = "descripcion", target = "description"),
            @Mapping(source = "precio", target = "price" ),
            @Mapping(source = "imagen", target = "image")
    })
    Khit toKhit(Kit kit);
    List<Khit> toKhits(List<Kit> kits);

    @InheritInverseConfiguration
    Kit toKit(Khit khit);
}
