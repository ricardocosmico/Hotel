/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author ricardo
 */

public class Funcionario extends Pessoa {
    private Cargo cargo;

    public Funcionario(String idFuncionario, String nome, Cargo cargo, String telefone) {
        // Inicializa os dados na classe pai (Pessoa)
        super(idFuncionario, nome, telefone);
        this.cargo = cargo;
    }

    public Cargo getCargo() { return cargo; }
    public void setCargo(Cargo cargo) { this.cargo = cargo; }
}
