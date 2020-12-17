/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadoraCreditoHipotecario.service.impl;

import com.calculadoraCreditoHipotecario.dto.InfoCredito;
import com.calculadoraCreditoHipotecario.dto.InfoResult;
import com.calculadoraCreditoHipotecario.service.CalculadoraCreditoService;
import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Service;
/**
 *
 * @author ricardo
 */
@Service
public class CalculadoraCreditoServiceImpl implements CalculadoraCreditoService{
    /**
     * Metodo para calcular los creditos de un sistema hipotecario.
     * @param credito
     * @return lista de calculos por periodo dentro del rango de plazo por meses
     */
    @Override
    public List<InfoResult> obtenerCalculoCredito(InfoCredito credito) {
        credito.setTasaMensual(credito.getTasaAnual()/12);
        credito.setSaldoInicial(credito.getValorCasa()*credito.getPorcentaje());
        Double pagoCredito = this.obtenerPagoCredito(credito);
        List<InfoResult> result = new ArrayList<>();
        for (int i = 0; i < credito.getPlazoMeses(); i++) {
            InfoResult data = new InfoResult();
            data.setPeriodo(i+1);
            if (data.getPeriodo() == 1) {
                data.setSaldoInicial(credito.getValorCasa()*credito.getPorcentaje());
            }else {
                data.setSaldoInicial(result.get(i-1).getSaldoRestante());
            }
            data.setTasaInteres(credito.getTasaAnual()*100);
            data.setTasaInteresMensual(credito.getTasaMensual());
            data.setPagoIntereses(this.obtenerPagoIntereses(data.getSaldoInicial(), credito.getTasaMensual()));
            data.setPagoCredito(pagoCredito);
            data.setPagoCapital(this.obtenerPagoCapital(data.getPagoCredito(), data.getPagoIntereses()));
            data.setPagoTotal(data.getPagoCapital());
            data.setSaldoRestante(this.obtenerSaldoRestante(data.getSaldoInicial(), data.getPagoCapital()));
            result.add(data);
        }
        return result;
    }
    
    
    /**
     * Metodo para obtener el valor del credito.
     * @param credito datos enviados desde la vista del usuario
     * @return resultado para el pago a credito
     */
    private Double obtenerPagoCredito(InfoCredito credito) {
        Double tasaPeriodo = credito.getTasaMensual();
        Double saldoInicial = credito.getSaldoInicial();
        Double resultado =tasaPeriodo*saldoInicial/ (1-Math.pow((1+tasaPeriodo), -credito.getPlazoMeses()));
        return resultado;
    }
    
    /**
     * Metodo para obtener el saldo restante.
     * @param saldoInicial
     * @param pagoCapital
     * @return resultado para el saldo restante
     */
    private Double obtenerSaldoRestante(Double saldoInicial, Double pagoCapital){
        Double resultado = (saldoInicial - pagoCapital);
        return resultado;
    }
    
    /**
     * Metodo para obtener el pago del capital.
     * @param pagoCredito
     * @param pagoIntereses
     * @return resultado para el pago capital
     */
    private Double obtenerPagoCapital(Double pagoCredito, Double pagoIntereses){
        Double resultado = (pagoCredito - pagoCredito);
        return resultado;
    }
    
    /**
     * Metodo para obtener el pago de los intereses.
     * @param saldoInicial
     * @param tasaMensual
     * @return resultado para el pago de los intereses
     */
    private Double obtenerPagoIntereses(Double saldoInicial, Double tasaMensual){
        Double resultado = (saldoInicial * tasaMensual);
        return resultado;
    }
}
