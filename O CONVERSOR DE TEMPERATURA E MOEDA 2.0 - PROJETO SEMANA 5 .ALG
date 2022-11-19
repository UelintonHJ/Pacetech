algoritmo "O Conversor de Temperatura e Moeda 2.0 - PROJETO SEMANA 5 "
var
   opcaoMenu, menuTemperatura, conversorCelsius, conversorFahrenheit, conversorReal, conversorDolar, menuMoeda: caractere
   temperaturaF, temperaturaC, fahrenheit, celsius : vetor [1..4] de real
   hora : vetor [1..4] de inteiro
   i, a, b, horaAtual, aux2 : inteiro
   aux, cotaDolar, dolar, reais : real

procedimento menuIniciar()
inicio
   escreval("Bem-vindo ao seu conversor de temperatura")
   escreval("O que você deseja fazer?")
   escreval("1 - Quero converter a temperatura atual")
   escreval("2 - Quero converter a moeda local")
   escreval("3 - Sair")
   leia(opcaoMenu)
   limpatela
fimprocedimento

procedimento menuTemperatura()
inicio
   escreval("Quero converter:")
   escreval("1 - Fahrenheit para Celsius")
   escreval("2 - Celsius para Fahrenheit")
   escreval("3 - Voltar para o menu inicial")
   leia(menuTemperatura)
   limpatela
fimprocedimento

procedimento conversorFahrenheit()
var
inicio
   para i de 1 ate 4 faca
      escreval("")
      escreva("Qual a temperatura em Farenheit que você deseja converter? ")
      leia(fahrenheit[i])
      temperaturaF[i] <- (fahrenheit[i] - 32) / 1.8
      escreva("Digite a hora em que foi feita está conversão: ")
      leia(hora[i])
   fimpara
   para a de 1 ate 4 faca
      para b de 1 ate 4 faca
         se temperaturaF [b] > temperaturaF [a] entao
            aux <- temperaturaF [b]
            aux2 <-hora[b]
            temperaturaF [b]<- temperaturaF [a]
            hora[b] <- hora[a]
            temperaturaF [a]<- aux
            hora[a] <-aux2
         fimse
      fimpara
   fimpara
   para i de 1 ate 4 faca
      escreval("")
      escreval("Sua temperatura armazenada no programa: ")
      escreval("Temperatura ", fahrenheit[i], "°C, registrada as", hora[i],"h corresponde a ",temperaturaF[i]:2:1, "°C")
      escreval("")
   fimpara
fimprocedimento

procedimento conversorCelsius()
inicio
   para i de 1 ate 4 faca
      escreval("")
      escreva("Qual a temperatura em Celsius que você deseja converter? ")
      leia(celsius[i])
      temperaturaC[i]<- ((celsius[i] * 1.8) + 32)
      escreva("Digite a hora em que foi feita está conversão: ")
      leia(hora[i])
   fimpara
   para a de 1 ate 4 faca
      para b de 1 ate 4 faca
         se temperaturaC [b] > temperaturaC [a] entao
            aux <- temperaturaC [b]
            aux2 <-hora[b]
            temperaturaC [b]<- temperaturaC [a]
            hora[b] <- hora[a]
            temperaturaC [a]<- aux
            hora[a] <-aux2
         fimse
      fimpara
   fimpara
   para i de 1 ate 4 faca
      escreval("")
      escreval("Sua temperatura armazenada no programa: ")
      escreval("Temperatura ", celsius[i], "°C, registrada as", hora[i],"h corresponde a ",temperaturaC[i]:2:1, "°C")
      escreval("")
   fimpara
fimprocedimento

procedimento menuMoeda()
inicio
   escreval("Quero converter:")
   escreval("1 - Dólar para Real")
   escreval("2 - Real para Dólar")
   leia(menuMoeda)
   limpatela
fimprocedimento

procedimento conversorDolar()
inicio
   escreval("Qual a cotação atual do Dólar?")
   leia(cotaDolar)
   escreval("O valor em DÓLAR que desejo converter:")
   leia(dolar)
   reais <- dolar * cotaDolar
   escreval("O valor convertido fica em R$ ", reais:2:2)
   escreval("")
fimprocedimento

procedimento conversorReal()
inicio
   escreval("Qual a cotação atual do Dólar?")
   leia(cotaDolar)
   escreval("O valor em REAIS que desejo converter:")
   leia(reais)
   dolar <- reais / cotaDolar
   escreval("O valor convertido fica em US$ ", dolar:2:2)
   escreval("")
fimprocedimento


inicio
   repita
      menuIniciar()
      escolha opcaoMenu
      caso "1"
         menuTemperatura()
         escolha menuTemperatura
         caso "1"
            conversorFahrenheit()
         caso "2"
            conversorCelsius()
         caso "3"
            menuIniciar()
         outrocaso
            escreval("Opção Inválida")
         fimescolha
      caso "2"
         menuMoeda()
         escolha menuMoeda()
         caso "1"
            conversorDolar()
         caso "2"
            conversorReal ()
         caso "3"
            menuIniciar()
         outrocaso
            escreval("Opção Inválida")
         fimescolha
      fimescolha
   ate opcaoMenu = "3"
fimalgoritmo