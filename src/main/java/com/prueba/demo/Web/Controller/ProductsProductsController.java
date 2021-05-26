package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsProducts;
import com.prueba.demo.Domain.Service.ProductsProductsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Productos")
public class ProductsProductsController {

    @Autowired
    private ProductsProductsService productsProductsService;

    @GetMapping("/test")
    public String hola(){return "ventana de prueba desde Productos Servicios";}

    @GetMapping("todos")
    public List<ProductsProducts> getAll(){return productsProductsService.getAll();}
}
