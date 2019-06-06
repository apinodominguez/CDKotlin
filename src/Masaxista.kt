class Masaxista (var titulacion : String, var anosExperiencia : Int, id : Int, nome : String, edade : Int):
    Seleccion (id , nome, edade) {

    override fun concentrarse () : String{
        return "Concentrase o masaxista: $nome"
    }

    override fun viaxar(): String {
        return "Viaxa o masaxista: $nome"
    }

    override fun toString () : String{
        return "id: $id , nome: $nome , edade: $edade , titulacion: $titulacion, anosExperiencia: $anosExperiencia"
    }

}