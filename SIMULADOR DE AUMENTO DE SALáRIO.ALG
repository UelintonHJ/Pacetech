algoritmo "Simulador de Aumento de Sal?rio"
var
   salario, salAumento, porcentagem: real
   confirmacao: caractere
inicio
   Repita
   Escreva("Informe o valor sal?rial que voc? gostaria de simular +30% de aumento: R$ ")
   Leia (salario)
   Escreval("O valor do sal?rio que voc? INFORMOU ? R$ ", salario:6:2, " voc? CONFIRMA EST? INFORMA??O? S/N")
        Leia (confirmacao)
        Se (confirmacao = "s") ou (confirmacao = "S") entao
           porcentagem <- salario * 0.3
           salAumento <- porcentagem + salario
   Escreval("O sal?rio que voc? digitou sofrer? reajuste de mais R$", porcentagem:6:2," e passar? de R$ ", salario:6:2, " para R$ ", salAumento:6:2)
        Senao
   Escreva("Exit of simulator")
   Fimse
    Ate (confirmacao <> "s") ou  (confirmacao <> "S")
fimalgoritmo