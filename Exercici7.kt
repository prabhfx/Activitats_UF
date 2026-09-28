import java.util.Scanner

/**
* Escriu un programa que llegeixi un nombre enter i imprimeixi una frase amb el següent nombre enter. * *
 * Demanar el numero
 * imprimir la frase amb el numero sumant-li 1
 */


fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar el enter
    println("Escriu un numero enter:")
    var enter: Int=scan.nextInt()
    //sumar li 1
    var resultat= enter + 1


    //Imprimeix el resultat
    print("El seguent numero es $resultat")
}