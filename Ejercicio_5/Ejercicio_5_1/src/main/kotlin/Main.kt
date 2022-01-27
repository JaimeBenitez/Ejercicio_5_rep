fun main(args: Array<String>) {
   var nota: Float?
   /*Mediante este bucle nos aseguramos que hasta que no ponga un input valido(en este caso un Float) seguira pidiendo
   la entrada de input*/
   do{
       print("Introduce tu nota:")
       nota = readLine()?.toFloatOrNull()
   } while (nota == null)
println("Ha sacado una calificación de ${calificacion(nota)}")
}

fun calificacion (nota: Float): String{
// funcion que recibe una nota y nos devuelve la calificación que corresponde
    when(nota){
        in  1f..4f -> return "Suspenso"
        in 5f..6f -> return "Aprobado"
        in 7f..8f -> return "Notable"
        in 9f..10f -> return "Sobresaliente"
        else -> return "el valor introducido no es correcto"
    }
}