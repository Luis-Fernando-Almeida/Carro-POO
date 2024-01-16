abstract class MotorImpl : Motor {

    private var ligado: Boolean = false

    override fun ligar(){
        println("Ligando o motor...")
        ligado = true
    }

    override fun desligar(){
        println("Desligando o motor...")
        ligado = false
    }

    fun estaLigado(): Boolean{
        return ligado
    }

    abstract fun temAutonomia(): Boolean

    abstract fun gastando()
}