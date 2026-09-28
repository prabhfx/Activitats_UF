import java.util.Scanner

/**
 * Fes un programa on, introduit el número de començals i el preu d'un sopar (que pot contenir cèntims), imprimeixi quan haurà de
 * pagar cada començal.
 * Demanar tempratura en Celsius
 * calcular temperatura en Fahrenheit
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar numero de conçals
    print("Quants conçals hi han?")
    var conçals=scan.nextDouble()
    print("Quin es el cost total del sopar?")
    var cost_sopar=scan.nextDouble()

    //calcular cost per persona
    var resultat= cost_sopar/conçals
    //Imprimeix el resultat
    print("Cadascu ha da pagar $resultat€!")
}