package model

class Recipe {
    private var recipes = mutableListOf<Array<String>>()

    fun addRecipe(receta: Array<String>) = this.recipes.add(receta)

    fun getRecipes() {
        if (!this.recipes.isNullOrEmpty()) {
            println("***Mis Recetas***\n")
            for (i in 0 until this.recipes.size) {
                println("Receta ${i + 1}:")
                for (j in this.recipes[i]) {
                    println(j)
                }
                println()
            }
        } else {
            println("No hay recetas.")
        }
    }
}