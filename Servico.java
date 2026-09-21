/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author vini
 */
/**
 * Catálogo de serviços extras que o hotel oferece (ex: Lavanderia, Frigobar).
 */
public class Servico {
    private String idServico;
    private String nome;
    private double valor;

   
    public Servico(String idServico, String nome, double valor) {
        this.idServico = idServico;
        this.nome = nome;
        this.valor = valor;
    }

   
    public String getIdServico() { return idServico; }
    public void setIdServico(String idServico) { this.idServico = idServico; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getValor() { return valor; }
    public void setValor(double valor) { this.valor = valor; }
}
    

