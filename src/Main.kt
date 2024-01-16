fun main(){

    val motorCombustao = MotorCombustao()
    val fusca = Carro(motorCombustao)
    fusca.ligar()
    fusca.andar()
    fusca.andar()
    fusca.andar()
    fusca.andar()

    val motorEletrico = MotorEletrico()
    val tesla = Carro(motorEletrico)
    tesla.ligar()
    tesla.andar()
    tesla.andar()
    tesla.andar()
    tesla.andar()

}
