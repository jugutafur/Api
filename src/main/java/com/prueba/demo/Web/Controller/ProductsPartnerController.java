package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsPartner;
import com.prueba.demo.Domain.Service.ProductsPartnerService;
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
@RequestMapping("/Aliados")
public class ProductsPartnerController {

    @Autowired
    private ProductsPartnerService productsPartnerService;

    @GetMapping("todos")
    public List<ProductsPartner> getAll(){return productsPartnerService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("Get only one Aliados")
    @ApiResponse(code = 200, message = "ok item Productos Partner")
    public Optional<ProductsPartner> getRegister(
            @ApiParam(value = "Obtiene un solo elemento de Productos Partner", example = "3")
            @PathVariable("este") int id){
        return productsPartnerService.getRegister(id);
    }

    @GetMapping("/prueba{otro}")
    @ApiOperation("Get prueba Productos Partner")
    @ApiResponse(code= 200 , message = "ok prueba Productos Partner")
    public String getText(
            @ApiParam(value = "Obtiene ProductsPartner", required = true, example = "4")
            @PathVariable("otro") int id){
        return productsPartnerService.getText(id);
    }

}
