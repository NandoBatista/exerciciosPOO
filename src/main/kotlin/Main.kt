fun main() {
    //val alunoTeste = Estudante("Julio", "Cesar", 1212)
    val alunoTeste = Estudante("Julio", "Cesar", 1212, 70.0, 7)
    val daniel = Estudante("Daniel", "Pereira", 1212, 90.0, 7)
    val alunoTerceiro = Estudante("Daniel", "Pereira", 1212, 50.0, 7)


    val cursoTeste = Cursos("Filosofia", 9)

        alunoTeste.mostraInformacoesAluno()

        cursoTeste.matricularEstudante(alunoTeste)
        cursoTeste.matricularEstudante(daniel)
        cursoTeste.matricularEstudante(alunoTeste)


    val listaEstudantesCriados = arrayOf(alunoTerceiro, daniel, alunoTeste)
    cursoTeste.matricularEstudante(listaEstudantesCriados)

    cursoTeste.descadastrarAluno(alunoTeste)

    println(cursoTeste.contaEstudantesCadastrados())

}