open class Seleccion(var id : Int, var nome : String, var edade : Int) {

    open fun concentrarse (): String{
        return " Concentrase a seleccion"
    }

    open fun viaxar () : String{
        return "viaxa a Seleccion"
    }

    override fun toString() : String{
        return "id: $id , nome: $nome , edade: $edade"
    }


}