/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author vinicius
 */

public class Quarto {
    private String idQuarto;
    private String numero;
    private int andar;
    private TipoQuarto tipoQuarto;
    private String status;

    public Quarto(String idQuarto, String numero, int andar, TipoQuarto tipoQuarto, String status) {
        this.idQuarto = idQuarto;
        this.numero = numero;
        this.andar = andar;
        this.tipoQuarto = tipoQuarto;
        this.status = status;
    }
  
    public String getIdQuarto() { return idQuarto; }
    public void setIdQuarto(String idQuarto) { this.idQuarto = idQuarto; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public int getAndar() { return andar; }
    public void setAndar(int andar) { this.andar = andar; }

    public TipoQuarto getTipoQuarto() { return tipoQuarto; }
    public void setTipoQuarto(TipoQuarto tipoQuarto) { this.tipoQuarto = tipoQuarto; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
