algoritmo "Conversor de Temperatura e Moeda - Projeto - Semana 4"
var
   celsius, fahrenheit, cotaDolar, dolar, reais: real
   menuInicial, menuTemperatura, menuMoeda: caractere
inicio
   repita
      escreval("O que você deseja fazer?")
      escreval("1 - Quero converter a temperatura atual")
      escreval("2 - Quero converter a moeda local")
      escreval("3 - Sair")
      leia(menuInicial)
      limpatela
      
      escolha menuInicial
      caso "1"
         escreval("Quero converter:")
         escreval("1 - Fahrenheit para Celsius")
         escreval("2 - Celsius para Fahrenheit")
         escreval("3 - Voltar para o menu inicial")
         leia(menuTemperatura)
         limpatela

         escolha menuTemperatura
         caso "1"
            escreval("A temperatura em Fahrenheit está marcando:")
            leia(fahrenheit)
            celsius <- (fahrenheit - 32) / 1.8
            escreval("A temperatura em Celsius é: ", celsius:2:1)
            escreval("Aperte ENTER para retornar ao menu")
            leia(menuInicial)
            limpatela

         caso "2"
            escreval("A temperatura em Celsius está marcando:")
            leia(celsius)
            fahrenheit <- (celsius * 1.8) + 32
            escreval("A temperatura em Fahrenheit é: ", fahrenheit:2:1)
            escreval("Aperte ENTER para retornar ao menu")
            leia(menuInicial)
            limpatela
         fimescolha

      caso "2"
         escreval("Quero converter:")
         escreval("1 - Dólar para Real")
         escreval("2 - Real para Dólar")
         leia(menuMoeda)
         limpatela
         escreval("Qual a cotação atual do Dólar?")
         leia(cotaDolar)
         limpatela

         escolha menuMoeda
         caso "1"
            escreval("O valor em DÓLAR que desejo converter:")
            leia(dolar)
            reais <- dolar * cotaDolar
            escreval("O valor convertido fica em R$ ", reais:2:2)
            escreval("Aperte ENTER para retornar ao menu")
            leia(menuInicial)
            limpatela

         caso "2"
            escreval("O valor em REAIS que desejo converter:")
            leia(reais)
            dolar <- reais / cotaDolar
            escreval("O valor convertido fica em US$ ", dolar:2:2)
            escreval("Aperte ENTER para retornar ao menu")
            leia(menuInicial)//só para espaçamento
            limpatela
         fimescolha
      fimescolha
   ate (menuInicial = "3")
   limpatela
   escreval("Até logo :)")
fimalgoritmo
