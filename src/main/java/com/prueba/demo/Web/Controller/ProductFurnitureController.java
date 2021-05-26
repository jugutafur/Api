package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsFurniture;
import com.prueba.demo.Domain.Service.ProductsFurnitureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Muebles")
public class ProductFurnitureController {

    @Autowired
    private ProductsFurnitureService productsFurnitureService;

    @GetMapping("/test")
    public String hola(){return "ventana de prueba desde PClean";}

    @GetMapping("/todos")
    public List<ProductsFurniture> getAll(){return productsFurnitureService.getAll();}
}
