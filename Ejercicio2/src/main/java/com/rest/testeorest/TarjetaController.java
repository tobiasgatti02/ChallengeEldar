package com.rest.testeorest;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/tasas")
public class TarjetaController {

    @PostMapping
    public String obtenerTasa(@RequestBody Operacion operacion) {
        try {
            return operacion.getTarjeta().obtenerTasa(operacion);
        } catch (Exception e) {
            return "{\"error\": \"" + e.getMessage() + "\"}";
        }
    }



}