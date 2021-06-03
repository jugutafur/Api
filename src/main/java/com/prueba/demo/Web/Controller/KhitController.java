package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.Service.KhitService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Kits")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET})
public class KhitController {

    @Autowired
    private KhitService khitService;

    @GetMapping("/todos")
    @ApiOperation("Get all kits")
    @ApiResponse(code = 200, message = "muy bien")
    public List<Khit> getAll(){
        return khitService.getAll();
    }

    @GetMapping("{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Khit> getRegister(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int id){
        return khitService.getRegister(id);
    }

    @GetMapping("prueba{otro}")
    public String getOnlyOney(
            @ApiParam(value = "Obtiene un solo elemento", required = true, example = "4")
            @PathVariable("otro") int id ){
        return khitService.getOnlyOney(id);
    }
}