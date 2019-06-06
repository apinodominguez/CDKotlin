class Xogador (var dorsal : Int, var demarcacion : String,  id : Int, nome : String, edade : Int):
    Seleccion (id , nome, edade) {

    override fun concentrarse () : String{
        return "Concentrase o xogador: $nome"
    }

    override fun viaxar(): String {
        return "Viaxa o xogador: $nome"
    }

    override fun toString () : String{
        return "id: $id , nome: $nome , edade: $edade , dorsal: $dorsal, demarcacion: $demarcacion"
    }

}