import java.util.Scanner

/**
 * Llegeix el preu original i el preu actual i imprimeix el descompte (en %).
 * Demanar el preu original i actual
 * multiplicar per 2
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar el preu original i actual
    println("CALCULAR DESCOMPTE!")
    print("Introdueix el preu original del producte:")
    var preu_original=scan.nextDouble()
    print("Introdueix el preu actual del producte:")
    var preu_actual=scan.nextDouble()

    //calcular descompte
    var resultat= 100-((preu_actual/preu_original) * 100).toFloat()
    //Imprimeix el resultat
    print("El teu descompte es de $resultat%")
}