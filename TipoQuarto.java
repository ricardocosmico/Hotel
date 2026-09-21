/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author ricardo
 */

public class TipoQuarto {
    private String idTipoQuarto;
    private String nome;
    private int capacidade;
    private double diaria;

 
    public TipoQuarto(String idTipoQuarto, String nome, int capacidade, double diaria) {
        this.idTipoQuarto = idTipoQuarto;
        this.nome = nome;
        this.capacidade = capacidade;
        this.diaria = diaria;
    }

   
    public String getIdTipoQuarto() { return idTipoQuarto; }
    public void setIdTipoQuarto(String idTipoQuarto) { this.idTipoQuarto = idTipoQuarto; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public int getCapacidade() { return capacidade; }
    public void setCapacidade(int capacidade) { this.capacidade = capacidade; }

    public double getDiaria() { return diaria; }
    public void setDiaria(double diaria) { this.diaria = diaria; }
}
