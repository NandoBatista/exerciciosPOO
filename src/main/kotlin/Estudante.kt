class Estudante (var primeiroNome :String?,  var ultimoNome: String?) {

    var codigoAluno = 0
    var mediaAluno = 0.0
    var ano = 0
    val foiAprovado : Boolean
        get(){
            if (mediaAluno >=60.0) {
                return true
            }else{
                return false
            }
        }

    constructor(primeiroNome: String?, ultimoNome: String?, condigoAluno : Int) :
            this(primeiroNome, ultimoNome){
        this.codigoAluno = condigoAluno
    }

    constructor(primeiroNome: String?, ultimoNome: String?, condigoAluno: Int,
                mediaAluno: Double, ano : Int )
            :this(primeiroNome, ultimoNome, condigoAluno){
        this.ano = ano
        this.mediaAluno = mediaAluno
    }



    fun nomeCompleto(){
        println("Nome completo aluno: $primeiroNome $ultimoNome.")
    }

    fun passouDeAno() : Int {
        if (foiAprovado){
            ano+=1
            println("Parabéns, você passou de ano $ano")
        }else{
            println("Reprovado")
        }

        return 0
    }
    fun mostraInformacoesAluno(){
        println("Nome: $primeiroNome $ultimoNome")
        println("Código: $codigoAluno")
        println("Média: $mediaAluno")
        println("Ano: $ano")
        println("Foi aprovado: $foiAprovado")
    }


}
