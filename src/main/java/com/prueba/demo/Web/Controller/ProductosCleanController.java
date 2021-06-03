package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsClean;
import com.prueba.demo.Domain.Service.ProductsCleanService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Aseo")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class ProductosCleanController {

    @Autowired
    private ProductsCleanService productsCleanService;

    @GetMapping("/todos")
    public List<ProductsClean> getAll(){return productsCleanService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("Get only One")
    @ApiResponse(code = 200 , message = "ok producto clean only")
    public Optional<ProductsClean> getRegister(
            @ApiParam (value = "obtine un solo elemento de clean", example = "5")
            @PathVariable ("este") int id){
        return productsCleanService.getRegister(id);
    }

    @GetMapping("prueba{otro}")
    @ApiOperation("Get item ProductsClean")
    @ApiResponse(code = 200, message = "ok ProductsClean")
    public String getText(
            @ApiParam(value = "Obtiene getText", required = true, example = "3")
            @PathVariable("otro") int id){
        return productsCleanService.getText(id);}
}
