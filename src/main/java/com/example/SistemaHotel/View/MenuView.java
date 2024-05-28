//Tela do usuário com a exibição dos dados, permitindo a interação do usuario

package com.example.SistemaHotel.View;

import java.util.Scanner;

import com.example.SistemaHotel.Controller.FuncionarioController;
import com.example.SistemaHotel.Controller.HospedeController;
import com.example.SistemaHotel.Controller.QuartoController;
import com.example.SistemaHotel.Controller.ReservaController;
import com.example.SistemaHotel.Controller.TipoQuartoController;
import com.example.SistemaHotel.Model.DAO.FuncionarioDAO;
import com.example.SistemaHotel.Model.DAO.HospedeDAO;
import com.example.SistemaHotel.Model.DAO.IDAO;
import com.example.SistemaHotel.Model.DAO.QuartoDAO;
import com.example.SistemaHotel.Model.DAO.ReservaDAO;
import com.example.SistemaHotel.Model.entity.Funcionario;
import com.example.SistemaHotel.Model.entity.Hospede;
import com.example.SistemaHotel.Model.entity.TipoQuarto;

import ch.qos.logback.core.status.WarnStatus;

public class MenuView {

    public static void iniciar() {

       
       HospedeDAO hospede = new HospedeDAO();
       

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bem vindo!");
       
        int opcao;
        do {
            mostrarMenu();
            opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    // Gerenciar Hospede (Cadastrar Hospede, Atualizar Hospede, Excluir Hospede)
                    // mostrar sub menu
                    menuGerenciarHospede();
                    while (opcao != 4) {
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                // Cadastrar Hospede
                                System.out.println("Nome:");
                                String nome = scanner.nextLine();
                                System.out.println("CPF:");
                                String cpf = scanner.nextLine();
                                hospede.cadastrar(nome,cpf);
                                break;
                            case 2:
                                // Atualizar Hospede
                                hospede.atualizar(null);
                                break;
                            case 3:
                                // Excluir Hospede
                                hospede.excluir(null);
                                break;
                        }
                    }
                    break;
                case 2:
                    // Gerenciar Funcionários (Cadastrar Funcionario, Atualizar Funcionario, Excluir
                    // Funcionario)
                    menuGerenciarFuncionario();
                    while (opcao != 4) {
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                // Cadastrar Funcionario
                                funcionario.cadastrar();
                                break;
                            case 2:
                                // Atualizar Funcionario
                                funcionario.atualizar();
                                break;
                            case 3:
                                funcionario.excluir(f;
                                break;
                            case 4:
                                mostrarMenu();
                                break;
                        }
                    }
                    break;
                case 3:
                    // Gerenciar Reserva (inserir reservas, atualizar status e excluir reservas)
                    menuGerenciarReserva();
                    while (opcao != 4) {
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                // inserir reservas
                                reserva.inserir(null);
                                break;
                            case 2:
                                // Atualizar Status
                                reserva.atualizar(null);
                                break;
                            case 3:
                                // Excluir reservas
                                reserva.excluir(null);
                                break;
                            case 4:
                                mostrarMenu();
                                break;
                        }
                    }
                    break;
                case 4:
                    // Gerenciar Tipos de Quarto (inserir, atualizar e excluir tipos de quarto)
                    menuQuartos();
                    while (opcao != 4) {
                        opcao = scanner.nextInt();
                        switch (opcao) {
                            case 1:
                                // Inserir Quartos
                                quarto.inserir();
                                break;
                            case 2:
                                // Atualizar Quartos
                                quarto.atualizar();
                                break;
                            case 3:
                                // Excluir tipos de quarto)
                                quarto.excluir();
                                break;
                            default:
                                mostrarMenu();
                                break;
                        }
                    }
                    break;
                case 0:
                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0); 
    }

    // SUB MENU
    public static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("1 - Gerenciar Hospede");
        System.out.println("2 - Gerenciar Funcionario");
        System.out.println("3 - Gerenciar Reserva");
        System.out.println("4 - Tipos de Quarto");
    }

    public static void menuGerenciarFuncionario() {
        System.out.println("1 - Cadastrar Funcionário");
        System.out.println("2 - Atualizar Funcionário");
        System.out.println("3 - Excluir Funcionário");
        System.out.println("4 - Voltar");
    }

    public static void menuGerenciarHospede() {
        System.out.println("1 - Cadastrar Hospede");
        System.out.println("2 - Atualizar Hospede");
        System.out.println("3 - Excluir Hospede");
        System.out.println("4 - Voltar");
    }

    public static void menuGerenciarReserva() {
        System.out.println("1 - Inserir Reserva");
        System.out.println("2 - Atualizar Status");
        System.out.println("3 - Excluir Reserva");
        System.out.println("4 - Voltar");
    }

    public static void menuQuartos() {
        System.out.println("1 - Inserir Quarto");
        System.out.println("2 - Atualizar Quarto");
        System.out.println("3 - Excluir Tipo de Quarto");
        System.out.println("4 - Voltar");
    }


    
}
