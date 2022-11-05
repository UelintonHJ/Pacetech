algoritmo "Simulador de Aumento de Salário"
var
   salario, salAumento, porcentagem: real
   confirmacao: caractere
inicio
   Repita
   Escreva("Informe o valor salárial que você gostaria de simular +30% de aumento: R$ ")
   Leia (salario)
   Escreval("O valor do salário que você INFORMOU é R$ ", salario:6:2, " você CONFIRMA ESTÁ INFORMAÇÃO? S/N")
        Leia (confirmacao)
        Se (confirmacao = "s") ou (confirmacao = "S") entao
           porcentagem <- salario * 0.3
           salAumento <- porcentagem + salario
   Escreval("O salário que você digitou sofrerá reajuste de mais R$", porcentagem:6:2," e passará de R$ ", salario:6:2, " para R$ ", salAumento:6:2)
        Senao
   Escreva("Exit of simulator")
   Fimse
    Ate (confirmacao <> "s") ou  (confirmacao <> "S")
fimalgoritmo