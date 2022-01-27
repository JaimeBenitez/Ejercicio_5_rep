fun main() {

    var miLista = creaArray()
    var miLista2 = creaArray()
    var listaOrdenada = mutableListOf<Int>()
    for( i:Int in miLista){
        if(i%2 == 0){

            listaOrdenada.add(i)
        }

    }
    println("Lista añadiendole pares:$listaOrdenada")
    listaOrdenada.sort()
    println("Lista ordenada:$listaOrdenada")
    println("Primer indice: ${listaOrdenada[0]}")
    println("Ultimo indice: ${listaOrdenada[listaOrdenada.size - 1]}")
    println("Suma de todos: ${listaOrdenada.sum()}")
    miLista2.removeIf{ it%2 != 0}
    println("Lista quitandole los impares: $miLista2")
}

fun creaArray():MutableList<Int>{
    //Función que crea una lista de hasta 20 numeros aleatorios de entre 1 y 100
    var lista = mutableListOf<Int>()
    val numbers = 1..100
    while(lista.count() < 20){
        var randomNumber = numbers.random()
        lista.add(randomNumber)
    }
    return lista


}