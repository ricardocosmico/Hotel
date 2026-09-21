/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author vini
 */
import java.util.ArrayList;
import java.util.List;


 //A classe central do sistema. Une o Hóspede ao Quarto, registra os
 //serviços consumidos num ArrayList e gerencia a lógica de validação de pessoas.
 
public class Reserva {
    private String idReserva;
    private Hospede hospede;
    private Quarto quarto;
    private String dataReserva;
    private int numPessoas;
    private String status;
    
    // ArrayList: Uma lista dinâmica que pode crescer e diminuir. 
    // Guarda todos os serviços extras que a reserva consumiu.
    private List<ReservaServico> servicosUtilizados;

    /**
     * A cláusula 'throws' avisa que quem for criar uma reserva precisa 
     * estar preparado para lidar com a CapacidadeExcedidaException.
     */
    public Reserva(String idReserva, Hospede hospede, Quarto quarto, String dataReserva, 
                   int numPessoas, String status) throws CapacidadeExcedidaException {
        this.idReserva = idReserva;
        this.hospede = hospede;
        this.quarto = quarto;
        this.dataReserva = dataReserva;
        this.status = status;
        
        // Inicializa o ArrayList vazio. Sem isso, daria erro de NullPointerException ao adicionar algo.
        this.servicosUtilizados = new ArrayList<>(); 
        
        // Chama a função interna para validar as regras de negócio
        validarEAtribuirPessoas(numPessoas, quarto);
    }

    /**
     * Valida se o número de pessoas é aceitável.
     * Utiliza 'throw new' para barrar a execução e disparar um erro imediato
     * caso as regras de negócio sejam violadas.
     */
    public void validarEAtribuirPessoas(int numPessoas, Quarto quarto) throws CapacidadeExcedidaException {
        // Regra 1: Não faz sentido reserva para 0 pessoas.
        if (numPessoas <= 0) {
            throw new IllegalArgumentException("Erro: A reserva deve ter pelo menos 1 pessoa.");
        }
        
        // Regra 2: Compara a quantidade pedida com a capacidade do TipoQuarto.
        if (numPessoas > quarto.getTipoQuarto().getCapacidade()) {
            throw new CapacidadeExcedidaException("Capacidade excedida! Tentativa de alocar " + numPessoas + 
                                                  " pessoas no quarto " + quarto.getNumero() + 
                                                  " que suporta apenas " + quarto.getTipoQuarto().getCapacidade() + ".");
        }
        
        // Se passou pelas validações, salva o valor.
        this.numPessoas = numPessoas;
    }

    
     //Função para adicionar um novo consumo na lista (ArrayList) da reserva.
     
    public void adicionarServico(ReservaServico servico) {
        this.servicosUtilizados.add(servico);
    }

    
    public String getIdReserva() { return idReserva; }
    public Hospede getHospede() { return hospede; }
    public Quarto getQuarto() { return quarto; }
    public int getNumPessoas() { return numPessoas; }
    public List<ReservaServico> getServicosUtilizados() { return servicosUtilizados; }
}
