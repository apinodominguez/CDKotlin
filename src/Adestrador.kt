class Adestrador (var idFederacion : String, id : Int, nome : String, edade : Int):
    Seleccion (id , nome, edade) {

    override fun concentrarse () : String{
        return "Concentrase o adestrador: $nome"
    }

    override fun viaxar(): String {
        return "Viaxa o adestrador: $nome"
    }

    override fun toString () : String{
        return "id: $id , nome: $nome , edade: $edade , idFederacion: $idFederacion"
    }

}