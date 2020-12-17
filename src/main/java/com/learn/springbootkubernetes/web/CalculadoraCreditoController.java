/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.learn.springbootkubernetes.web;


import com.learn.springbootkubernetes.dto.InfoCredito;
import com.learn.springbootkubernetes.dto.InfoResult;
import com.learn.springbootkubernetes.service.CalculadoraCreditoService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ricardo
 */
@RestController
@RequestMapping("${api.base.url}/calculo")
public class CalculadoraCreditoController {
    
    @Autowired
    private CalculadoraCreditoService service;
    
    @PostMapping("/obtenerCalculoCredito")
    public ResponseEntity<?> obtenerCalculoCredito(@RequestBody InfoCredito credito) {
        List<InfoResult> res = service.obtenerCalculoCredito(credito);
        if (res == null || res.isEmpty()) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.ok(res);
    }
    
    @GetMapping("/prueba")
    public String prueba() {
        return "pruebapri";
    }
}
