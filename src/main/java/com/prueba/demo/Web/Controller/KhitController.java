
package com.prueba.demo.Web.Controller;

import com.prueba.demo.Domain.Khit;
import com.prueba.demo.Domain.Service.KhitService;
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
@RequestMapping("/Khits")
public class KhitController {

    @Autowired
    private KhitService khitService;

    @GetMapping("/todos")
    @ApiOperation("Get all kits")
    @ApiResponse(code = 200, message = "muy bien")
    public List<Khit> getAll(){
        return khitService.getAll();
    }

    /*
    public List<Khit> ShowTitle(String title){
        return khitService.ShowTitle(title);
    }

     */

    @GetMapping("/ok/{este}")
    @ApiOperation("Get only item")
    @ApiResponse(code = 200, message = "super")
    public Optional<Khit> getRegister(
            @ApiParam(value = "obtine un solo elemento", required = true, example = "3")
            @PathVariable("este") int KhitId){
        return khitService.getRegister(KhitId);
    }
}