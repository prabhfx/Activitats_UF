import java.util.Scanner

/**
 * L'usuari escriu un enter amb la seva edat i s'imprimeix true si és major d'edat, i false en qualsevol altre cas.
 * Demanar un numero
 *
 * imprimir el resultar amb un boolean
 */

fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar enter
    print("Introdueix un numero enter:")
    var segons=scan.nextInt()

    //Imprimeix el resultat

    print(18 <= segons )
}