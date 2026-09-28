import java.util.Scanner

/**
 * Fes un programa que afegeixi donat un nombre enter, imprimeixi el mateix número en decimal
 * Demanar un numero enter
 * converteix a double
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar enter
    print("Introdueix un numero enter:")
    var segons=scan.nextInt()

    //converteix a double
    var resultat = segons.toDouble()

    //Imprimeix el resultat

    print(resultat)
}