package ProjetoSemana7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Empregado funcionario = new Empregado("Não Cadastrado", 
                "Não Cadastrado", 0.0f);
        Empregado chefeRecepcao = new Empregado("Alphonse", "Capone", 1500.00f);
        Empregado chefeSeguranca = new Empregado("Carlo", "Gambino", 1650.00f);
        
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        
        int opcaoMenu = 0, opcaoCadastro = 0, opcaoSetor = 0;

        do {
            System.out.println("Cadastro de funcionários");
            System.out.println("1 - Cadastrar novo funcionário");
            System.out.println("2 - Funcionários cadastrados");
            System.out.println("3 - Sair");
            opcaoMenu = leia.nextInt();
            System.out.println(" ");
            switch (opcaoMenu) {
                case 1:
                    System.out.println("--Cadastrar Novo Funcionário--");
                    System.out.println("Digite o Primeiro Nome: ");
                    funcionario.setPrimeiroNome(leia.next());
                    System.out.println("Digite o Sobrenome: ");
                    funcionario.setSobrenome(leia.next());
                    System.out.println("Digite o Valor do Salário Mensal: ");
                    funcionario.setSalarioMensal(leia.nextFloat());
                    System.out.println("Novo funcionário: " 
                            + funcionario.getPrimeiroNome() + " " 
                            + funcionario.getSobrenome() + ", que receberá R$ " 
                            + df.format(funcionario.getSalarioMensal())
                            + "/mês, cadastrado com sucesso.");
                    System.out.println(" ");
                    break;

                case 2:
                    System.out.println("--Funcionários Cadastrados--");
                    System.out.println("Nome Completo: " 
                            + chefeRecepcao.nomeCompleto());
                    System.out.println("Salário Mensal: R$ " 
                            + df.format(chefeRecepcao.getSalarioMensal()));
                    System.out.println("Salário Anual foi Reajustado de: R$ " 
                            + df.format(chefeRecepcao.salarioAnual()) 
                            + " para R$ " 
                            + df.format(chefeRecepcao.salarioAnualReajustado())
                    );
                    System.out.println(" ");
                    System.out.println("Nome Completo: " 
                            + chefeSeguranca.nomeCompleto());
                    System.out.println("Salário Mensal: R$ " 
                            + df.format(chefeSeguranca.getSalarioMensal()));
                    System.out.println("Salário Anual foi Reajustado de: R$ " 
                            + df.format(chefeSeguranca.salarioAnual()) 
                            + " para R$ " 
                            + df.format(chefeSeguranca.salarioAnualReajustado())
                    );
                    System.out.println(" ");
                    System.out.println("Nome Completo: " 
                            + funcionario.nomeCompleto());
                    System.out.println("Salário Mensal: R$ " 
                            + df.format(funcionario.getSalarioMensal()));
                    System.out.println("Salário Anual foi Reajustado de: R$ " 
                            + df.format(funcionario.salarioAnual()) 
                            + " para R$ " 
                            + df.format(funcionario.salarioAnualReajustado()));
                    System.out.println(" ");
                    break;

                default:
                    System.out.println("Opção Inválida!");
                    break;
            }

        } while (opcaoMenu != 3);
    }
}
