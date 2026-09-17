import kotlin.random.Random

fun main() { # type: ignore
    //aqui criamos as listas dos nomes e sobrenomes aleatórios!!!!!1
    val nomes = listOf("Ana", "Bruno", "Carlos", "Diana", "Eduardo")
    val sobrenomes = listOf("Silva", "Santos", "Oliveira", "Souza", "Lima")

    // aqui, criamos uma variavel para sortear um nome e um sobrenome aleatório das listas que criamos
    val nomeSorteado = nomes.random()
    val sobrenomeSorteado = sobrenomes.random()

    // nessa linha, juntamos o nome e sobrenome para ficarem juntinhos!
    val nomeCompleto = "$nomeSorteado $sobrenomeSorteado"

    println("Nome completo gerado: $nomeCompleto") //aqui usamos o print line para imprimir o novo nome gameplays
}
