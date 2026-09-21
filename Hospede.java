/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author ricardo
 */
public class Hospede extends Pessoa {
    private String cpf;
    private String email;
    private String dataNascimento;
    
    public Hospede(String idHospede, String nome, String cpf, String email, String telefone, 
                   String dataNascimento) {
        super(idHospede, nome, telefone);
        this.cpf = cpf;
        this.email = email;
        this.dataNascimento = dataNascimento;
    }
    //Mesma funcionalidade da Classe Pessoa
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(String dataNascimento) { this.dataNascimento = dataNascimento; }
}
