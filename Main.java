/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hotel;

/**
 *
 * @author vini
 */

public class Main {
    public static void main(String[] args) {
        
    
        Cargo cargoGarcom = new Cargo("01", "Garçom", 2200.00);
        Funcionario funcPaulo = new Funcionario("001", "Paulo Costa", cargoGarcom, "(74) 94444-1111");
        Hospede hospedeAna = new Hospede("001", "Ana Silva", "111.222.333-44", "ana@email.com", "(74) 99999-1111", "15/04/1995");
        
        TipoQuarto tipoStandard = new TipoQuarto("01", "Standard", 2, 250.00);
        Quarto quarto101 = new Quarto("001", "101", 1, tipoStandard, "Disponível");

        Servico servicoCafe = new Servico("001", "Café da manhã", 35.00);
        Servico servicoAgua = new Servico("002", "Água Mineral", 5.00);


        System.out.println("--- TESTE 1: RESERVA VÁLIDA E USO DE ARRAYLIST ---");
        try {
          
            Reserva reservaValida = new Reserva("0001", hospedeAna, quarto101, "10/08/2026", 2, "Confirmada");
            
            
            reservaValida.adicionarServico(new ReservaServico("U01", servicoCafe, funcPaulo, "11/08/2026", 2));
            reservaValida.adicionarServico(new ReservaServico("U02", servicoAgua, funcPaulo, "11/08/2026", 3));
            
            System.out.println("Reserva criada para: " + reservaValida.getHospede().getNome());
            System.out.println("Serviços consumidos:");
            
            double totalServicos = 0;
            
            for (ReservaServico rs : reservaValida.getServicosUtilizados()) {
                System.out.println("- " + rs.getServico().getNome() + " (Total: R$ " + rs.calcularTotal() + ")");
                totalServicos += rs.calcularTotal();
            }
            System.out.println("Valor total de consumos extras: R$ " + totalServicos);

        } catch (CapacidadeExcedidaException | IllegalArgumentException e) {
            // Se algo desse errado no bloco 'try', o código cairia aqui.
            System.out.println("Erro inesperado: " + e.getMessage());
        }


        // TESTE 2: Fluxo de Erro (demonstrando Try-Catch capturando erro)
        System.out.println("\n--- TESTE 2: TRY-CATCH CAPTURANDO THROW NEW ---");
        try {
            // TENTATIVA FALHA: Pedindo 4 pessoas em um quarto Standard (que suporta 2)
            // Isso vai forçar a classe Reserva a disparar o "throw new CapacidadeExcedidaException"
            Reserva reservaInvalida = new Reserva("0002", hospedeAna, quarto101, "12/08/2026", 4, "Pendente");
            
            // A execução é interrompida na linha de cima. Esta linha abaixo nunca será impressa.
            System.out.println("Esta linha não será impressa pois o erro vai pular pro catch.");
            
        } catch (CapacidadeExcedidaException e) {
            // O Catch "pega" o erro lançado e permite que o sistema mostre o problema 
            // sem travar/crashar o programa inteiro.
            System.out.println("Erro de Capacidade Capturado (Como esperado): " + e.getMessage());
            
        } catch (IllegalArgumentException e) {
            // Capturaria caso tentassem fazer reserva com 0 pessoas, por exemplo.
            System.out.println("Erro de Argumento Capturado: " + e.getMessage());
        }
    }
}
