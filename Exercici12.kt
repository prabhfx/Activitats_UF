import java.util.Scanner

/**
 * Feu un programa que rebi una temperatura en graus Celsius i la converteixi en graus Fahrenheit
 * Demanar tempratura en Celsius
 * calcular temperatura en Fahrenheit
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar temperatura
    println("Cº -> Fº")
    print("Introdueix una temperatura en Celsius:")
    var temp_celsius=scan.nextDouble()

    //calcular temp en Fahrenheit
    var resultat= (temp_celsius*9)/5
    //Imprimeix el resultat
    print("En Fahrenheit: $resultat")
}