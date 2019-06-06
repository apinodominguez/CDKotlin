fun main (args : Array<String>) { // clase Main del proyecyo

    // inicialización de los proyectos
    var objS = Seleccion(1, nome = "Paco", edade = 25)
    var objX = Xogador(dorsal = 11, demarcacion = "delantero", id = 2, nome = "Paco", edade = 25)
    var objA = Adestrador(idFederacion = "24532", id = 3, nome = "paquita salas", edade = 50)
    var objM = Masaxista(titulacion = "fisio", anosExperiencia = 2, id = 4, nome = "Fernando", edade = 24)

    // Ejecución de los diversos métodos
    println(objS.concentrarse())
    println(objS.viaxar())
    println(objS.toString())
    println(objX.concentrarse())
    println(objX.viaxar())
    println(objX.toString())
    println(objA.concentrarse())
    println(objA.viaxar())
    println(objA.toString())
    println(objM.concentrarse())
    println(objM.viaxar())
    println(objM.toString())


}