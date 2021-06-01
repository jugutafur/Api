package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.ProductsTechnology;
import com.prueba.demo.Domain.Service.ProductsTechnogyService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Tecnologia")
public class ProductsTechnologyController {

    @Autowired
    private ProductsTechnogyService productsTechnogyService;

    @GetMapping("todos")
    public List<ProductsTechnology> getAll(){return productsTechnogyService.getAll();}

    @GetMapping("{este}")
    @ApiOperation("Obtiene item ProductsTechnology")
    @ApiResponse( code = 200, message = "ok ProductsTechnology")
    public Optional<ProductsTechnology> getRegister(
            @ApiParam(value = "Obtiene Object getRegister", required = true, example = "4")
            @PathVariable("este") int id){
        return productsTechnogyService.getRegister(id);}

    @GetMapping("prueba{otro}")
    @ApiOperation("Get item ProductsTechnology")
    @ApiResponse(code = 200, message = "ok ProductsTechnology")
    public String getText(
            @ApiParam(value = "Obtiene object getText", required = true, example = "4")
            @PathVariable("otro") int id){
        return productsTechnogyService.getText(id);}
}
