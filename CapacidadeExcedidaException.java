/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author ricardo
 */

public class CapacidadeExcedidaException extends Exception {
    // construtor que recebe a mensagem de erro e repassa para a superclasse (Exception)
    public CapacidadeExcedidaException(String mensagem) {
        super(mensagem);
    }
}
