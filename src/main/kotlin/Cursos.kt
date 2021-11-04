class Cursos (var nomeCurso : String?, var serie : Int){
    var professor : String? = null
    val listaEstudantesMatriculados = mutableListOf<Estudante>()


    fun matricularEstudante(estudante: Estudante){
        listaEstudantesMatriculados.add(estudante)
    }

    @Override
    fun matricularEstudante(listaDeEstudantes : Array<Estudante>){
        for (estudante in listaDeEstudantes ){
            listaEstudantesMatriculados.add(estudante)
        }


    }



    fun descadastrarAluno(estudante: Estudante){
        println("Você realmente deseja remover o estudante abaixo? Digite Sim para" +
                " remover ou Não para desistir da remoção")
        estudante.mostraInformacoesAluno()
        var confirmaRemocao = readLine()!!.uppercase()

        if(confirmaRemocao == "SIM"){
            listaEstudantesMatriculados.remove(estudante)
            println("Estudante removido com sucesso")
        }else{
            println("Estudante não removido")
        }




    }

    fun contaEstudantesCadastrados() : Int{
        return listaEstudantesMatriculados.size
    }

    fun retornaMaiorMediaDoCurso() : Double{
        var melhorMedia = 0.0

        for (estudante in listaEstudantesMatriculados){
            if (estudante.mediaAluno > melhorMedia){
                melhorMedia = estudante.mediaAluno
            }
        }
        return melhorMedia
    }


}