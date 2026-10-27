package com.iesdoctorbalmis.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/clientes")
public class ClienteController {

    @GetMapping
    public String getMethodName() {
        return "clientes/lista";
    }

}
