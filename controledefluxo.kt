package br.com.kanasha

fun main() {
    //(se)
    //if sempre seguido de um if.
    val tipoDeRota = "A_Pé"// A_Pé, Carro, Onibus e Trem
    if (tipoDeRota == "A_Pé") {
        println("Traçando rota apé")
    } else if (tipoDeRota == "Carro") {
        // Não é recomendado fazer ifs encadeados(É pratica.)
        println("Traçando rota a carro")
    }
    if (tipoDeRota == "Onibus") {
        println("Traçando rota de onibus")
    } else if (tipoDeRota == "Trem") {
        println("Traçando rota de Trem")
    }

//when(quando)
    when (tipoDeRota) {
        "A_Pé" -> println("tipoDeRota A pé")
        "A Carro" -> println("Traçando rota a carro")
        "Onibus" -> println("Traçando rota de onibus")
        "Trem" -> println("Traçando rota de trem")
        else -> println("Rota não implementada")
    }
}