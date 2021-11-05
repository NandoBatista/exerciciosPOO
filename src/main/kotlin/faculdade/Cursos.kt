package faculdade

import alunos.Estudante
import java.lang.Exception

class Cursos (private var nomeCurso : String?, private var serie : Int){
    private var professor : String? = null
    private val listaEstudantesMatriculados = mutableListOf<Estudante>()


    fun matricularEstudante(estudante: Estudante){
        listaEstudantesMatriculados.add(estudante)
    }

    fun matricularEstudante(listaDeEstudantes : Array<Estudante>){
        for (estudante in listaDeEstudantes){
            listaEstudantesMatriculados.add(estudante)
        }


    }
        fun verificarAluno(estudante: Estudante) {
            if (listaEstudantesMatriculados.contains(estudante)) {
                println("Estudante existe na lista")
            } else {
                throw Exception("O estudante não existe")
            }
        }


    fun descadastrarAluno(estudante: Estudante){
        println("Você realmente deseja remover o estudante abaixo? Digite Sim para" +
                " remover ou Não para desistir da remoção")
        estudante.mostraInformacoesAluno()
        var confirmaRemocao = readLine()!!.uppercase()

        if(confirmaRemocao == "SIM"){
            listaEstudantesMatriculados.remove(estudante)
            println("alunos.Estudante removido com sucesso")
        }else{
            println("alunos.Estudante não removido")
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