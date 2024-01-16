class Carro constructor(
    private val motor: MotorImpl
) : Motor by motor {

    fun andar() {
        when {
            !motor.estaLigado() -> println("Ligue o carro primeiro")
            !motor.temAutonomia() ->{
                when(motor){
                    is MotorEletrico -> println("Carregue a bateria")
                    is MotorCombustao -> println("Coloque combustível")
                }

            }
            else -> {
                motor.gastando()
                when(motor){
                    is MotorEletrico -> println("Carro Andando")
                    is MotorCombustao -> println("Carro andando: vrun vrun")
                }
            }
        }
    }

        fun freia() {
            println("Freiando o carro")
        }

        fun buzina() {
            println("Beep beep")
        }
    }
