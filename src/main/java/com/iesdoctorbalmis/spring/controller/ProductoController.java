package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/productos")
public class ProductoController {

    @GetMapping
    public String getMethodName() {
        return "productos/lista";
    }

}
