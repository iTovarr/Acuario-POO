package acuario

// Clase abstracta
abstract class Pez {
    abstract val color: String
}

// Clases que heredan
class Tiburon : Pez() {
    override val color = "gris"
}

class PezPayaso : Pez() {
    override val color = "dorado"
}