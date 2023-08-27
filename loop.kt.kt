import java.math.BigDecimal

fun main() {
    val precoDoProdutos = arrayOf(
        BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("1.99"), BigDecimal("31.99"),
        BigDecimal("21.99"), BigDecimal("10.99"), BigDecimal("5.99"), BigDecimal("3.99"),
    )
    //for
    var precoTotal =BigDecimal.ZERO
    for (preco in precoDoProdutos){
        precoTotal += preco
    }
    println("precoTotal = $precoTotal")
    //while
    var contador = 0
    precoTotal = BigDecimal.ZERO
    while(contador < precoDoProdutos.size){
        precoTotal += precoDoProdutos[contador]
        contador += 1
    }
    println("preco Total: $precoTotal")
    //dowhile
    contador = 0
    precoTotal = BigDecimal.ZERO
    do{
        precoTotal += precoDoProdutos[contador]
        contador += 1
    }while (contador < precoDoProdutos.size)
    println("precoTotal = $precoTotal")
}