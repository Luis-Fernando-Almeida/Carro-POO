class MotorCombustao : MotorImpl() {

    private var nivelCombustivel: Int = 2

    override fun gastando(){
        println("Gastando combustívvel, nivel agora é: $nivelCombustivel")
        nivelCombustivel --
    }

    override fun temAutonomia(): Boolean{
        return nivelCombustivel > 0
    }
}
