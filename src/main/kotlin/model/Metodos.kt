package model

class Metodos{
    private val menu = Menus()

    fun mostrar(message: String?, lista: Array<String> ){
        if (!message.isNullOrBlank()) println(message)
        for (i in 1..lista.size){
            println("$i. ${lista[i - 1]}")
        }
    }

    fun seleccionar(range: Int): Int{
        println(menu.seleccionar)
        var opcion = readLine()?.toIntOrNull()
        while (opcion == null || opcion.toInt() !in 1..range){
            println(menu.error)
            opcion = readLine()?.toIntOrNull()
        }
        return opcion.toInt()
    }
}