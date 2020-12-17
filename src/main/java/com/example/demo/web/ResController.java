/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author ricardo
 */

@RestController
public class ResController {
    
    @RequestMapping("hello")
    public String sayHello(){
        return ("Hello, SpringBoot on Wildfly");
    }
    
}
