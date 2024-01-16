class MotorEletrico : MotorImpl() {

    private var nivelBateria: Int = 1

    override fun gastando(){
        println("Gastando energia, nível agora é: $nivelBateria")
        nivelBateria--
    }

    override fun temAutonomia(): Boolean{
        return nivelBateria > 0
    }
}

