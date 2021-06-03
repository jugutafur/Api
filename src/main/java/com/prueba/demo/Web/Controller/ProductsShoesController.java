package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsShoes;
import com.prueba.demo.Domain.Service.ProductsShoesService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Zapatos")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class ProductsShoesController {

    @Autowired
    private ProductsShoesService productsShoesService;


    @GetMapping("todos")
    public List<ProductsShoes> getAllt(){return productsShoesService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("get todos los item zapatos")
    @ApiResponse(code = 200, message = "ok ProductsShoesController")
    public Optional<ProductsShoes>getRegister(
            @ApiParam(value = "obtiene todos los zapatos", required = true, example = "3")
            @PathVariable("este") int id){
        return productsShoesService.getRegister(id);}

    @GetMapping("prueba{otro}")
    @ApiOperation("get text of test")
    @ApiResponse(code= 200, message = "ok response")
    public String getText(
            @ApiParam(value = "get item zapatos", required = true, example = "3")
            @PathVariable("otro") int id){
        return productsShoesService.getText(id);}
}
