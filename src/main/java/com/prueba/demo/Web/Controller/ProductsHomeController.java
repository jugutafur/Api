package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsHome;
import com.prueba.demo.Domain.Service.ProductsHomeService;
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
@RequestMapping("/Hogar")
public class ProductsHomeController {

    @Autowired
    private ProductsHomeService productsHomeService;

    @GetMapping("/todos")
    public List<ProductsHome> getAll(){return productsHomeService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("Get item ProductsHome")
    @ApiResponse(code = 200, message = "ok ProductsHome")
    public Optional<ProductsHome> getRegister(
            @ApiParam(value = "Obtine Object getRegister", required = true, example = "5")
            @PathVariable("este") int id){
        return productsHomeService.getRegister(id);}

    @GetMapping("prueba{otro}")
    @ApiOperation("Get prueba ProductsHome")
    @ApiResponse(code = 200, message = "ok ProductsHome")
    public String getText(
            @ApiParam(value = "Obtiene ProductsHome", required = true, example = "4")
            @PathVariable("otro") int id){
        return productsHomeService.getText(id);}
}