package edu.cibertec.carrito.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CarritoController {

    @RequestMapping("/")
    public String carritoMostrar() {
        return "index";
    }
}
