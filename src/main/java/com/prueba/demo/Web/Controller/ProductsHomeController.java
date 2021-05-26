package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Domain.Service.ProductsHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Hogar")
public class ProductsHomeController {

    @Autowired
    private ProductsHomeService productsHomeService;

    @GetMapping("/test")
    public String hola(){return "ventana de prueba desde Pservicios";}

    @GetMapping("/todos")
    public List<ProductsHome> getAll(){return productsHomeService.getAll();}
}
