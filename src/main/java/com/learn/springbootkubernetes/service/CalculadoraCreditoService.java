/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadoraCreditoHipotecario.service;

import com.calculadoraCreditoHipotecario.dto.InfoCredito;
import com.calculadoraCreditoHipotecario.dto.InfoResult;
import java.util.List;

/**
 *
 * @author ricardo
 */
public interface CalculadoraCreditoService {
    
    List<InfoResult> obtenerCalculoCredito(InfoCredito credito);
    
}
