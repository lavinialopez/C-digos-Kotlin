import kotlin.random.Random

fun main() { # type: ignore
    //Listas de dados (usamos 'val' porque as listas em si não mudam)
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana", "Eduardo")
    val sobrenomes = listOf("Silva", "Santos", "Oliveira", "Souza", "Lima")

    // Sorteia um elemento de cada lista
    val nomeSorteado = nomes.random()
    val sobrenomeSorteado = sobrenomes.random()

    // Junta os dois usando String Template
    val nomeCompleto = "$nomeSorteado $sobrenomeSorteado"

    println("Nome completo gerado: $nomeCompleto")
}
