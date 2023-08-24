fun main(){
    //sinal de atribuição(=)
    val inteiro = 1
    val helloworld = "Hello World operadores"

    /*Operadores com Strings
    + ->concatenar
     */
    println("Heloo" + "World")// vai resutar em Hello World normalmente
    println("outra forma de concatenação é ${"Usando essa notação"}")

    /*Operadores numéricos
    + -> somar
    - -> subtrair
    * -> Multiplicar
    / -> Dividir
    % -> Diviir e pegar o resto da divisão
     */
     println("33 + 47) = ${33 + 47}") //Deve resultar em 33 + 47 = 80
     println("33 - 47) = ${33 - 47}") //Deve resultar em 33 - 47 = -14
     println("7 * 8)   = ${7 * 8}") //Deve resultar em 7 * 8 = 56
     println("10 / 3)  = ${10 / 3}") //Deve resultar em 10 / 3 = 3
    println("10.3 / 3.0) = ${10.3 / 3.0}") // Deve resultar em 10.0 / 3.0 = 3.33333333
    println("10 % 3)  = ${10 % 3}") // Deve resultar em 1, pois o resto de 10 / 3 é 1

    /* Operadores de comparação

    == -> Igual
    > -> Maior
    < -> Menor
     */
    println("########## operadores de comparação ##########")

    //==
    println("1 == 1 -> ${1==1}") // Retorna true (verdadeiro)
    println("3 == 1 -> ${3==1}")//  Retorna false (falso)

    //>
    println("5 > 1 -> $5 > 1}")//  Retorna false (falso)
    println("1 > 3 -> ${1 > 3}")//  Retorna false (falso)

    //<
    println("1 < 3 -> ${1 < 3}")//  Retorna false (falso)
    println("5 < 1 -> ${5 < 1}")//  Retorna false (falso)

    //>=
    println("5 >= 1 -> ${5 >= 1}")//  Retorna false (veradeiro)
    println("5 <= 5 -> ${5 >= 5}")//  Retorna false (verdadeiro)
    println("1 == 3 -> ${1 >= 3}")//    Retorna false (falso)

    //Também conseguimos fazer comparação de Strings
    println("Joao == Joao -> ${"Joao" == "Joao"}") //Retorna true(verdadeiro)
    println("Joao != Joao -> ${"Joao" != "Joao"}") //Retorna false(falso)

    //Tomar cuidado com comparação de Array
    println(arrayOf(1, 2, 3).contentEquals(arrayOf(1, 2, 3))) //Maneira certa

    val array1 = arrayOf(1, 2, 3)
    val array2 = arrayOf(1, 2, 3)
    println(array1 == array2)
}