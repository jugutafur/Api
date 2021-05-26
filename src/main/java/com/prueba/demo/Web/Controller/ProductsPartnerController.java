package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Domain.Service.ProductsPartnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Aliados")
public class ProductsPartnerController {

    @Autowired
    private ProductsPartnerService productsPartnerService;

    @GetMapping("/Test")
    public String Hola(){return "prueba desde controller Productos Partner";}

    @GetMapping("todos")
    public List<ProductsPartner> getAll(){return productsPartnerService.getAll();}

}
