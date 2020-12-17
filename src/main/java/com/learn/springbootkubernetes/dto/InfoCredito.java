/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculadoraCreditoHipotecario.dto;

/**
 *
 * @author ricardo
 */
public class InfoCredito {
    
    public Double valorCasa;
    public Double porcentaje;
    public Double saldoInicial;
    public Integer plazo1;
    public Double tasaAnual;
    public Double tasaMensual;
    public Integer plazoMeses;
    public Double pago;

    public InfoCredito(Double valorCasa, Double porcentaje, Double saldoInicial, Integer plazo1, Double tasaAnual, Double tasaMensual, Integer plazoMeses, Double pago) {
        this.valorCasa = valorCasa;
        this.porcentaje = porcentaje;
        this.saldoInicial = saldoInicial;
        this.plazo1 = plazo1;
        this.tasaAnual = tasaAnual;
        this.tasaMensual = tasaMensual;
        this.plazoMeses = plazoMeses;
        this.pago = pago;
    }
    
    public Double getValorCasa() {
        return valorCasa;
    }

    public void setValorCasa(Double valorCasa) {
        this.valorCasa = valorCasa;
    }

    public Double getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Double porcentaje) {
        this.porcentaje = porcentaje;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Integer getPlazo1() {
        return plazo1;
    }

    public void setPlazo1(Integer plazo1) {
        this.plazo1 = plazo1;
    }

    public Double getTasaAnual() {
        return tasaAnual;
    }

    public void setTasaAnual(Double tasaAnual) {
        this.tasaAnual = tasaAnual;
    }

    public Double getTasaMensual() {
        return tasaMensual;
    }

    public void setTasaMensual(Double tasaMensual) {
        this.tasaMensual = tasaMensual;
    }

    public Integer getPlazoMeses() {
        return plazoMeses;
    }

    public void setPlazoMeses(Integer plazoMeses) {
        this.plazoMeses = plazoMeses;
    }

    public Double getPago() {
        return pago;
    }

    public void setPago(Double pago) {
        this.pago = pago;
    }
    
    
    
}
