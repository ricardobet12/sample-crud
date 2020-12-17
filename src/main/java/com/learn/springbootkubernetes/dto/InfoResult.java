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
public class InfoResult {
    
    private Integer periodo;
    private Double saldoInicial;
    private Double tasaInteres;
    private Double tasaInteresMensual;
    private Double pagoIntereses;
    private Double pagoCapital;
    private Double pagoCredito;
    private Double pagoTotal;
    private Double saldoRestante;

    public InfoResult() {
    }
    
    

    public InfoResult(Integer periodo, Double saldoInicial, Double tasaInteres, Double tasaInteresMensual, Double pagoIntereses, Double pagoCapital, Double pagoCredito, Double pagoTotal, Double saldoRestante) {
        this.periodo = periodo;
        this.saldoInicial = saldoInicial;
        this.tasaInteres = tasaInteres;
        this.tasaInteresMensual = tasaInteresMensual;
        this.pagoIntereses = pagoIntereses;
        this.pagoCapital = pagoCapital;
        this.pagoCredito = pagoCredito;
        this.pagoTotal = pagoTotal;
        this.saldoRestante = saldoRestante;
    }
    public Integer getPeriodo() {
        return periodo;
    }

    public void setPeriodo(Integer periodo) {
        this.periodo = periodo;
    }

    public Double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(Double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public Double getTasaInteresMensual() {
        return tasaInteresMensual;
    }

    public void setTasaInteresMensual(Double tasaInteresMensual) {
        this.tasaInteresMensual = tasaInteresMensual;
    }

    public Double getPagoIntereses() {
        return pagoIntereses;
    }

    public void setPagoIntereses(Double pagoIntereses) {
        this.pagoIntereses = pagoIntereses;
    }

    public Double getPagoCapital() {
        return pagoCapital;
    }

    public void setPagoCapital(Double pagoCapital) {
        this.pagoCapital = pagoCapital;
    }

    public Double getPagoCredito() {
        return pagoCredito;
    }

    public void setPagoCredito(Double pagoCredito) {
        this.pagoCredito = pagoCredito;
    }

    public Double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(Double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    public Double getSaldoRestante() {
        return saldoRestante;
    }

    public void setSaldoRestante(Double saldoRestante) {
        this.saldoRestante = saldoRestante;
    }
    
    
    
}
