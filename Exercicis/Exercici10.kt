import java.util.Scanner

/**
 * Llegeix el diàmetre d'una pizza rodona i imprimeix la seva superfície. Pots usar Math.PI per escriure el valor de Pi.
 * Demanar el diametre
 * calcular superficie
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar el diametre
    println("CALCULA L'AREA DE TU PIZZA!")
    print("Introdueix el diametre:")
    var diametre=scan.nextDouble()

    //calcular superficie
    var resultat: Double = (Math.PI*(diametre/2)*(diametre/2))
    //Imprimeix el resultat
    print(resultat)
}
