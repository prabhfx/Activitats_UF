import java.util.Scanner

/**
 * Escriu un programa que llegeixi un una temperatura i un augment d’aquest, el programa ha d’imprimir per pantalla quina és la
 * temperatura amb l’augment aplicat.
 * Demanar tempratura en Celsius
 * calcular temperatura en Fahrenheit
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar temperatura original
    print("Quina era la temperatura abans?")
    var temp_original=scan.nextDouble()
    //Demanar el valor del augment de temperatura
    print("Quan s'ha augmentat la temperatura?")
    var temp_augment=scan.nextDouble()

    //calcular temp actual
    var resultat= temp_original+temp_augment
    //Imprimeix el resultat
    print("La temperatura actual es $resultat!")
}