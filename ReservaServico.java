/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author vini
 */

 
public class ReservaServico {
    private String idUso;
    private Servico servico;
    private Funcionario funcionario;
    private String dataUtilizacao;
    private int quantidade;

   
    public ReservaServico(String idUso, Servico servico, Funcionario funcionario, String dataUtilizacao, int quantidade) {
        this.idUso = idUso;
        this.servico = servico;
        this.funcionario = funcionario;
        this.dataUtilizacao = dataUtilizacao;
        this.quantidade = quantidade;
    }

    public Servico getServico() { return servico; }
    
   
    public double calcularTotal() { 
        return servico.getValor() * quantidade; 
    }
}
