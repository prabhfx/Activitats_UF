import java.util.Scanner

/**
 * Escriu u nprograma que llegeixi un numero per entrada i imprimeixi el doble del seu valor
 *
 * Demanar un numero
 * multiplicar-lo per 2
 * imprimir el resultat
 */


fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar un numero
    print("Introdueix un Numero:")
    var numero: Int=scan.nextInt()

    //multiplicar
    var resultat= numero * 2

    //Imprimeix el resultat
    println(resultat)

}