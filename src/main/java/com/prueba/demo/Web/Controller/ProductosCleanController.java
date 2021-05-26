package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsClean;
import com.prueba.demo.Domain.Service.ProductsCleanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Aseo")
public class ProductosCleanController {

    @Autowired
    private ProductsCleanService productsCleanService;

    @GetMapping("/test")
    public String hola(){return "ventana de prueba desde PClean";}

    @GetMapping("/todos")
    public List<ProductsClean> getAll(){return productsCleanService.getAll();}
}
