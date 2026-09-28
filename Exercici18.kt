import java.util.Scanner

/**
 * Fes un programa que rebi dos nombres enters i imprimeixi true si el primer és major que el segon, false en cap altre cas.
 * Demanar dos numeros enters
 *
 * imprimir el resultar amb un boolean mayor que
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar enters
    print("Introdueix un numero enter:")
    var num1=scan.nextInt()
    print("Introdueix un altre numero enter:")
    var num2=scan.nextInt()

    //Imprimeix el resultat amb un boolean

    print(num1 > num2 )
}