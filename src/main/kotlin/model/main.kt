package model
private val menus = Menus()
private val metodos = Metodos()
private val recipe = Recipe()
private val seleccionar = {range: Int -> metodos.seleccionar(range) }

fun main(){
    var opcion: Int? = null
    println(menus.bienvenida)

    inicio@ while (opcion != menus.menuPrincipal.size) {
        metodos.mostrar(null, menus.menuPrincipal)
        opcion = seleccionar(menus.menuPrincipal.size)
        var receta: Array<String> = arrayOf()

        when (opcion) {
            1 -> {
                mostrarCategorias@ while (opcion != menus.categorias.size + 1) {
                    opcion = mostrarCategorias()

                    if (opcion == menus.categorias.size + 1) {
                        if (receta.isNotEmpty()) recipe.addRecipe(receta)
                        continue@inicio
                    }

                    mostrarIngredientes@ while (opcion != menus.ingredientes[opcion - 1].size + 1){
                        val ingrediente = mostrarIngredientes(opcion - 1)
                        if (ingrediente == menus.ingredientes[opcion - 1].size + 1) continue@mostrarCategorias
                        receta += menus.ingredientes[opcion - 1][ingrediente - 1]
                    }
                }
            }

            2 -> recipe.getRecipes()

            3 -> break
        }
    }
}

fun mostrarCategorias(): Int{
    metodos.mostrar("Escoja una categoría", menus.categorias)
    println("${menus.categorias.size + 1}. Volver")
    return seleccionar(menus.categorias.size + 1)
}

fun mostrarIngredientes(ingrediente: Int): Int {
    metodos.mostrar("Escoja un ingrediente", menus.ingredientes[ingrediente])
    println("${menus.ingredientes[ingrediente].size + 1}. Volver")
    return seleccionar(menus.ingredientes[ingrediente].size + 1)
}