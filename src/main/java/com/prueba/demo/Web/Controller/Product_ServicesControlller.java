package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.Product_Services;
import com.prueba.demo.Domain.Service.Product_ServicesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Product_Services")
public class Product_ServicesControlller {

    @Autowired
    private Product_ServicesService product_servicesService;

    @GetMapping("/todosProducts_Services")
    @ApiOperation("Get all Products Services")
    @ApiResponse(code = 200, message = "muy bien")
    public List<Product_Services> getAll(){return product_servicesService.getAll();}

    /*
    @GetMapping("/Products_Services/{item}")
    @ApiOperation("Get only one product_Service")
    @ApiResponse(code = 200, message = "muy bien")
    public Optional<Product_Services> getProduct_Services(){return product_servicesService.getProduct_Services();}

     */
}
