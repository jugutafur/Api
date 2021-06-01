package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsFurniture;
import com.prueba.demo.Domain.Service.ProductsFurnitureService;
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
@RequestMapping("/Muebles")
public class ProductFurnitureController {

    @Autowired
    private ProductsFurnitureService productsFurnitureService;

    @GetMapping("/todos")
    public List<ProductsFurniture> getAll(){return productsFurnitureService.getAll();}

    @GetMapping("prueba{otro}")
    @ApiOperation("get item prueba ProductsFurniture")
    @ApiResponse(code = 200, message = "ok ProductsFurniture")
    public String getText(
            @ApiParam(value = "Obtine un solo elemento de ProductsFurniture", required = true, example = "3")
            @PathVariable("otro") int id){ return productsFurnitureService.getText(id);}

    @GetMapping("{este}")
    @ApiOperation("get item ProductsFurniture")
    @ApiResponse(code = 200, message = "ok ProductsFurniture")
    public Optional<ProductsFurniture> getRegister(
            @ApiParam(value = "Obtiene el objeto de getRegister", required = true, example = "2")
            @PathVariable("este") int id){
        return productsFurnitureService.getRegister(id);
    }

}
