import java.util.Scanner

/**
 * Fes un programa que afegeixi 1 segon un nombre de segons determinat.
 * Demanar un numero entre 0 i 59
 * sumar un segon
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar segons
    print("Introdueix una cantidad de segons entre 0 i 59:")
    var segons=scan.nextInt()

    //calcular el +1 segons
    var resultat= (segons+1)%60

    //Imprimeix el resultat

    print(resultat)
}