package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Service.ProductServicesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Product_Services")
public class Product_ServicesControlller {

    @Autowired
    private ProductServicesService product_servicesService;

    @GetMapping("/todosProducts_Services")
    @ApiOperation("Get all Products Services")
    @ApiResponse(code = 200, message = "muy bien")
    public List<ProductServices> getAll(){return product_servicesService.getAll();}

    /*
    @GetMapping("/Products_Services/{item}")
    @ApiOperation("Get only one product_Service")
    @ApiResponse(code = 200, message = "muy bien")
    public Optional<Product_Services> getProduct_Services(){return product_servicesService.getProduct_Services();}

     */
}
