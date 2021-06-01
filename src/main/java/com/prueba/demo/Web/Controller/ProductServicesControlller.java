package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductServices;
import com.prueba.demo.Domain.Service.ProductServicesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Servicios")
public class ProductServicesControlller {

    @Autowired
    private ProductServicesService productservicesService;

    @GetMapping("/todos")
    @ApiOperation("Get all Products Services")
    @ApiResponse(code = 200, message = "ook babay")
    public List<ProductServices> getAll(){return productservicesService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("Get item getText")
    @ApiResponse(code = 200, message = "ok getText")
    public Optional<ProductServices> getRegister(
            @ApiParam(value = "Obtiene object getRegister", required = true, example = "2")
            @PathVariable("este") int id){
        return productservicesService.getRegister(id);}

    @GetMapping("prueba{otro}")
    @ApiOperation("Get item ProductServices")
    @ApiResponse(code = 200, message = "ok ProductServices")
    public String getText(
            @ApiParam(value = "Obtiene item getText", required = true, example = "3")
            @PathVariable("otro") int id){
        return productservicesService.getText(id);}
}
