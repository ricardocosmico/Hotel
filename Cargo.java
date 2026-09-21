/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author ricardo
 */

 
public class Cargo {
    private String idCargo;
    private String nomeCargo;
    private double salario;

    
    public Cargo(String idCargo, String nomeCargo, double salario) {
        this.idCargo = idCargo;
        this.nomeCargo = nomeCargo;
        this.salario = salario;
    }

    
    public String getIdCargo() { return idCargo; }
    public void setIdCargo(String idCargo) { this.idCargo = idCargo; }

    public String getNomeCargo() { return nomeCargo; }
    public void setNomeCargo(String nomeCargo) { this.nomeCargo = nomeCargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }
}
