import java.util.Scanner

/**
 * Una web d'habitatges de lloguer ens ha proposat una ampliació. Volen mostrar l'àrea de les habitacions per llogar. Fes un
 * programa que ens ajudi a calcular les dimensions d'una habitació. Llegeix l'amplada i la llargada en metres (enters) i mostra'n
 * l'àrea.
 *
 * *
 * Demanar l'amplada i llargada
 * multiicar los
 * imprimir l'area
 */


fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar un numero
    println("CALCULAR AREAS!")
    print("Ampliada:")
    var ampliada: Int=scan.nextInt()

    print("LLargada:")
    var llargada: Int=scan.nextInt()

    //multiplicar
    var resultat= ampliada * llargada

    //Imprimeix el resultat
    println("Area: $resultat")

}