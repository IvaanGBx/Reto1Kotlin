import kotlin.system.exitProcess
import kotlin.arrayOf as arrayOf

var ingredientes = arrayOf("Agua","Leche","Carne","Verduras","Frutas","Cereal","Huevos","Aceites")
var miRecetas: MutableList<String> = ArrayList()
var opcion: Int? = 0
val validar = {opEs: Int, rangoMax: Int -> opEs in 1..rangoMax}

fun main(){
    menuPrincipal()
}

fun menuPrincipal(){
    println("""
        ***Bienvenido a Recipes Maker***
        Selecciona una de las siguientes opciones!
        
        1. Hacer Receta
        2. Ver mis recetas
        3. Salir
    """.trimIndent())

    opcion = readLine()?.toInt() ?: 0
    if (validar(opcion!!, 3)) menus(opcion!!)
    else {
        println("\n Por favor, selecciona una opción válida\n")
        menuPrincipal()
    }
}

fun menus(menu: Int){
    when(menu){
        1 -> makeRecipe()
        2 -> viewRecipe()
        3 -> exitProcess(menu)
    }
}

fun makeRecipe(){
    println("\n Selecciona un ingrediente para agregar a tu nueva receta \n")
    println("0. Volver")
    for (i in ingredientes){
        println("${ingredientes.indexOf(i)+1}. $i")
    }

    opcion = readLine()?.toInt() ?: 0
    if (validar(opcion!!, ingredientes.size)){
        println(ingredientes[opcion!!-1])
        addRecipe(opcion!!)
        makeRecipe()
    } else if (opcion!!.equals(0)){
        menuPrincipal()
    } else {
        println("\n Por favor, selecciona una opción válida\n")
        makeRecipe()
    }
}

fun addRecipe(index: Int){
    miRecetas.add(ingredientes[index-1])
}

fun viewRecipe(){
    println("Tus receta es: \n")
    for (i in miRecetas){
        println(i)
    }
}