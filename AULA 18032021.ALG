Algoritmo "Aula 18032021"
// 
//  
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Maria Eduarda Simon
// Data atual  : 18/03/2021
Var
// Seção de Declarações das variáveis 
N_1, N_2, N_3, N_4, media: real
sexo : caracter

Inicio
// Seção de Comandos, procedimento, funções, operadores, etc... 
    Escreva("Informe o primeiro número: ")
    Leia(N_1)
    Escreva("Informe o segundo número: ")
    Leia(N_2)
    Escreva("Informe o terceiro número: ")
    Leia(N_3)
    Escreva("Informe o quarto número: ")
    Leia(N_4)
    Escreva("Nos informe seu gênero: ")
    Leia(sexo)
//Processamento
media <- (N_1 + N_2 + N_3 + N_4) / 4
//Saída
   SE (media >= 70) ENTAO
   SE (sexo = "M") ENTAO
   Escreval("A média do aluno é: ", media)
   Escreval("Caro aluno! Você foi aprovado!")
SENAO
   Escreval("A média da aluna é: ", media)
   Escreval("Cara aluna! Você foi aprovada!")
FIMSE
SENAO
   SE (media < 70) ENTAO
   Escreval("A média do aluno é: ", media)
   Escreval("Caro aluno! Você foi reprovado!")
   SENAO
   Escreval("A média da aluna é: ", media)
   Escreval("Cara aluna! Você foi reprovada!")
   FIMSE
FIMSE

Fimalgoritmo