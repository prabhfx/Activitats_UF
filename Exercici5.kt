import java.util.Scanner

/**
 * L'usuari escriu 4 enters i s'imprimeix el valor de sumar el primer amb el segon, multiplicat per el mòdul del tercer amb el quart. *
 *
 * *
 * Demanar els 4 numeros
 * sumar els primers dos
 * calcular el modul dels ultims dos
 * multiplicar els resultats
 * imprimir el resultat final
 */


fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar un numero
    println("ESCRIU 4 NUMEROS!")
    print("Numero 1:")
    var num1: Int=scan.nextInt()

    print("Numero 2:")
    var num2: Int=scan.nextInt()

    print("Numero 3:")
    var num3: Int=scan.nextInt()

    print("Numero 4:")
    var num4: Int=scan.nextInt()

    //multiplicar
    var resultat= (num1 + num2) * (num3%num4)

    //Imprimeix el resultat
    println(resultat)

}