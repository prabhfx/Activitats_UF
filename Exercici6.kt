import java.util.Scanner

/**
 * En una escola tenim tres classes i volem saber quin és el nombre de taules que necessitarem tenir en total. Dependrà del
 * nombre d'alumnes per aula. Cal tenir en compte que a cada taula hi caben 2 alumnes.*
 * *
 * Demanar el numero de alumnes per classe
 * Calcular el total de alumnes
 * Dividir per 2
 * Imprimir el resultat
 *
 */


fun main() {
    //Declarar scanner
    var scan = Scanner(System.`in`)

    //Demanar quants alumnes hi han per aula
    println("Quants alumnes hi han?!")
    print("AULA 1:")
    var aula1: Int=scan.nextInt()

    print("AULA 2:")
    var aula2: Int=scan.nextInt()

    print("AULA 3:")
    var aula3: Int=scan.nextInt()

    var totalalumnes= aula1+aula2+aula3
    //calcular les meses juntes y per separat
    var resultat= (totalalumnes%2)+(totalalumnes/2)
    var mesa1= (aula1%2)+(aula1/2)
    var mesa2= (aula2%2)+(aula2/2)
    var mesa3= (aula3%2)+(aula3/2)


    //Imprimeix cada resultat
    println("""Es necessiten $resultat taules en Total!
        $mesa1 en la primera aula!
        $mesa2 en la segona aula!
        $mesa3 en la tercera aula!
    """.trimMargin())

}