import java.util.Scanner

/**
 * Per poder fer un estudi de la ventilació d'una aula necessitem poder calcular la quantitat d'aire que hi cap en una habitació.
 * Llegeix les 3 dimensions de l'aula i imprimeix per pantalla quin volum té.
 * Demanar el diametre
 * calcular superficie
 * imprimir el resultar
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar les mides
    println("CALCULADOR D'AIRE")
    println("Introdueix les mides de l'habitacio!")
    print("Llargada:")
    var llargada=scan.nextDouble()
    print("Ampliada:")
    var ampliada=scan.nextDouble()
    print("Alçada:")
    var alçada=scan.nextDouble()

    //calcular volum
    var resultat= (llargada*alçada*ampliada)
    //Imprimeix el resultat
    print(resultat)
}
