package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsProducts;
import com.prueba.demo.Domain.Service.ProductsProductsService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Productos")
public class ProductsProductsController {

    @Autowired
    private ProductsProductsService productsProductsService;

    @GetMapping("todos")
    public List<ProductsProducts> getAll(){return productsProductsService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("get item ProductsProducts")
    @ApiResponse(code = 200, message = "ok getText")
    public Optional<ProductsProducts> getRegister(
            @ApiParam(value = "Obtiene only ProductsProducts" , required = true, example = "5")
            @PathVariable("este") int id){
        return productsProductsService.getRegister(id);}

    @GetMapping("prueba{otro}")
    @ApiOperation("get item de ProductsProducts")
    @ApiResponse(code = 200, message = "ok ProductsProducts")
    public String getText(
            @ApiParam(value = "Obtiene getText ", required = true, example = "4")
            @PathVariable("otro") int id){
        return productsProductsService.getText(id);}
}
