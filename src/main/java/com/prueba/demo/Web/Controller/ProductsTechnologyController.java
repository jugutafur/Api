package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsTechnology;
import com.prueba.demo.Domain.Service.ProductsTechnogyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Tecnologia")
public class ProductsTechnologyController {

    @Autowired
    private ProductsTechnogyService productsTechnogyService;

    @GetMapping("/Test")
    public String Hola(){return "prueba desde controller Productos Partner";}

    @GetMapping("/todos")
    public List<ProductsTechnology> getAll(){return productsTechnogyService.getAll();}
}
