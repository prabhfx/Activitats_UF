import java.util.Scanner

/**
* Escriu un programa que donat dos números retorni la suma d’aquests. *
 *
 * Demanar  dos numeros
 * sumar los
 * imprimir el resultat
 */


fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar un numero
    println("Introdueix els numeros que vol sumar!")
    print("Numero 1:")
    var numero1: Int=scan.nextInt()

    print("Numero 2:")
    var numero2: Int=scan.nextInt()

    //multiplicar
    var resultat= numero1 + numero2

    //Imprimeix el resultat
    println(resultat)

}