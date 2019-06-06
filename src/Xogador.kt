class Xogador (var dorsal : Int, var demarcacion : String,  id : Int, nome : String, edade : Int): //constructor principal. Hereda de seleccion
    Seleccion (id , nome, edade) {



    //diversos metodos. Override para sobrescribir el metodo que heredado
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