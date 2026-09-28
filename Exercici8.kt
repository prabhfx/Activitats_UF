import java.util.Locale
import java.util.Scanner

/**
 * Llegeix un valor amb decimals i imprimeix el doble.
 * Demanar el numero decimal
 * multiplicar per 2
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`).useLocale(Locale.UK) //PARA UTILIZAR OTRO FORMATO DE TECLA

    //Demanar el decimal
    println("Escriu un numero decimal:")
    var decimal=scan.nextDouble()
    //Multiplicar per 2
    var resultat= decimal * 2


    //Imprimeix el resultat
    print(resultat)
}