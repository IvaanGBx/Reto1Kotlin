fun main(){
    opciones(1)
    var opcion: Int = readLine()?.toInt() ?: 0
    var ingredientes: String? = null

    menuInicial@ while (opcion.equals(3).not()) {
        opciones(1)
        if (validarOpcion(opcion, 3)) {
            when (opcion) {
                //Hacer Recetas
                1 -> {
                    menuIngredientes@ while (opcion in 1..9) {
                        opciones(2)
                        opcion = readLine()?.toInt() ?: 0
                        if (validarOpcion(opcion, 9)) {
                            when (opcion) {
                                1 -> {
                                    ingredientes = ingredientes?.plus("Agua\n") ?: "Agua\n"
                                    continue@menuIngredientes
                                }
                                2 -> {
                                    ingredientes = ingredientes?.plus("Leche\n") ?: "Leche\n"
                                    continue@menuIngredientes
                                }
                                3 -> {
                                    ingredientes = ingredientes?.plus("Carne\n") ?: "Carne\n"
                                    continue@menuIngredientes
                                }
                                4 -> {
                                    ingredientes = ingredientes?.plus("Verduras\n") ?: "Verduras\n"
                                    continue@menuIngredientes
                                }
                                5 -> {
                                    ingredientes = ingredientes?.plus("Frutas\n") ?: "Frutas\n"
                                    continue@menuIngredientes
                                }
                                6 -> {
                                    ingredientes = ingredientes?.plus("Cereal\n") ?: "Cereal\n"
                                    continue@menuIngredientes
                                }
                                7 -> {
                                    ingredientes = ingredientes?.plus("Huevos\n") ?: "Huevos\n"
                                    continue@menuIngredientes
                                }
                                8 -> {
                                    ingredientes = ingredientes?.plus("Aceite\n") ?: "Aceite\n"
                                    continue@menuIngredientes
                                }
                                9 -> {
                                    opcion = 0
                                    continue@menuInicial
                                }
                            }
                        }else{
                            opcion = readLine()?.toInt() ?: 0
                        }
                    }
                }

                //Ver recetas
                2 -> {
                    opciones(3)
                    ingredientes = ingredientes ?: "No hay ingredientes en su receta\n"
                    println(ingredientes)
                    break@menuInicial
                }
            }
        }else{
            opcion = readLine()?.toInt() ?: 0
        }
    }
}

fun validarOpcion(opcionEscogida: Int, opcionMax: Int): Boolean {
    val error = "Ingrese una opción válida. \n \n"

     return if (opcionEscogida in 1..opcionMax) {
        true
    } else {
        println(error)
        false
    }
}

fun opciones (opcionMenu: Int){
    val bienvenida = """
        ***Bienvenido a Recipe Maker***
        
        Selecciona la opción deseada
        
        1. Hacer una receta
        2. Ver mis recetas
        3. Salir
                
                
    """.trimIndent()

    val recetas = "***Tus Recetas*** \n"

    val ingredientes = """
        
        ***Escoge los ingredientes que necesites***
        1. Agua
        2. Leche
        3. Carne
        4. Verduras
        5. Frutas
        6. Cereal
        7. Huevos
        8. Aceite
        9. Volver
        
        
    """.trimIndent()

    when (opcionMenu){
        1 -> println(bienvenida)
        2 -> println(ingredientes)
        3 -> println(recetas)
    }
}
