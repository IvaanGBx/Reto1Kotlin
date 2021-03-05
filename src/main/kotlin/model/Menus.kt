package model

class Menus {
    val bienvenida = """
        ***Bienvenido a Recipe Maker!***
        
    """.trimIndent()

    val seleccionar = "Por favor, seleccione una opción! \n"

    val error = "Por favor, ingrese una opción válida"

    val menuPrincipal = arrayOf("Hacer una Receta", "Ver mis recetas", "Salir")

    val categorias = arrayOf("Verduras", "Frutas", "Lacteos", "Carnes, Legumbres y Huevos", "Granos", "Aceites")

    val ingredientes = arrayOf(
        arrayOf("Cebollin", "Apio", "Tomate", "Cebolla", "Cilantro"), //1. Verduras 0
        arrayOf("Manzana", "Pera", "Uva", "Piña", "Melon", "Sandia"), //2. Frutas 1
        arrayOf("Leche", "Mantequilla"), //3. Lácteos 2
        arrayOf("Salchicha", "Pescado", "Huevos", "Carne", "Cerdo"), //4. Carnes, Legumbres y Huevos 3
        arrayOf("Frijol", "Lenteja", "Zaragoza"), //5. Granos 4
        arrayOf("Soja", "Oliva"), //6. Aceites 5
    )
}