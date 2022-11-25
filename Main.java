package ConversorTemperaturaMoeda;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {

    @SuppressWarnings({"empty-statement", "UnusedAssignment"})
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        int opcaoTemp = 0, opcaoMoeda = 0, opcaoMenu = 0;
        float tempC, tempF, cotacaoDolar, moedaR, moedaD;

        System.out.println("BEM- VINDO AO SEU NOVO CONVERSOR AGORA EM JAVA");
        System.out.println("Antes de iniciar suas conversões lembre-se:");
        System.out.println("Use somente vírgula para separar as casas decimais."
                );
        System.out.print("\n");

        do {
            System.out.println("       Menu Inicial");
            System.out.println("O que você deseja fazer?");
            System.out.println("1 - Converter Temperatura");
            System.out.println("2 - Converter Moeda");
            System.out.println("3 - Sair do Programa");
            opcaoMenu = leia.nextInt();
            System.out.print("\n");
            switch (opcaoMenu) {

                case 1: {
                    System.out.println("Qual conversão você deseja realizar?");
                    System.out.println("1 - Converter Celsius para Fahrenheit");
                    System.out.println("2 - Converter Fahrenheit para Celsius");
                    System.out.println("3 - Voltar ao Menu Inicial");
                    opcaoTemp = leia.nextInt();
                    System.out.print("\n");
                    switch (opcaoTemp) {
                        case 1:
                            System.out.println("Digite a temperatura em Celsius"
                                    + " a ser convertida:");
                            tempC = leia.nextFloat();
                            tempF = tempC * 1.8f + 32;
                            System.out.println(df.format(tempC) + "°C "
                                    + "convertida para Fahrenheit é "
                                    + df.format(tempF) + "°F");
                            System.out.print("\n");
                            break;

                        case 2:
                            System.out.println("Digite a temperatura em "
                                    + "Fahrenheit a ser convertida");
                            tempF = leia.nextFloat();
                            tempC = (tempF - 32) / 1.8f;
                            System.out.println(df.format(tempF) + "°F "
                                    + "convertida para Fahrenheit é "
                                    + df.format(tempC) + "°C");
                            System.out.print("\n");
                            break;

                        case 3:
                            opcaoTemp = opcaoMenu;
                            System.out.print("\n");
                            break;

                    }

                }
                break;

                case 2: {
                    System.out.println("Qual conversão você deseja realizar?");
                    System.out.println("1 - Converter Reais para Dólar");
                    System.out.println("2 - Converter Dólar para Reais");
                    System.out.println("3 - Voltar ao Menu Inicial");
                    opcaoMoeda = leia.nextInt();
                    System.out.print("\n");
                    switch (opcaoMoeda) {
                        case 1:
                            System.out.println("Qual a cotação atual do "
                                    + "Dólar?");
                            cotacaoDolar = leia.nextFloat();
                            System.out.println("Qual o valor em reais que você "
                                    + "deseja converter?");
                            moedaR = leia.nextFloat();
                            moedaD = moedaR / cotacaoDolar;
                            System.out.println("R$" + df.format(moedaR) + " "
                                    + "convertido na cotação de US$" + 
                                    df.format(cotacaoDolar) + " passa a valer "
                                            + "US$" + df.format(moedaD));
                            System.out.print("\n");
                            break;

                        case 2:
                            System.out.println("Qual a cotação atual do "
                                    + "Dólar?");
                            cotacaoDolar = leia.nextFloat();
                            System.out.println("Qual o valor em Dólar que "
                                    + "você deseja converter?");
                            moedaD = leia.nextFloat();
                            moedaR = moedaD * cotacaoDolar;
                            System.out.println("US$" + df.format(moedaD) + 
                                    " convertido na cotação de US$" 
                                    + df.format(cotacaoDolar) + 
                                    " passa a valer R$" + df.format(moedaR));
                            System.out.print("\n");
                            break;

                        case 3:
                            opcaoTemp = opcaoMenu;
                            System.out.print("\n");
                            break;

                    }
                    break;
                }
                case 3: {
                    System.exit(0);
                    break;
                }
            }

        } while (opcaoMenu != 3);
    }
}
