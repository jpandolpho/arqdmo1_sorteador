package br.edu.ifsp.dmo1.sorteador.model

class DefinedLlimit(private val border: Int): SorteioStrategy() {

    override fun nextNumber(): Int {
        return random.nextInt(1, border+1)
    }

    override fun getLowBorder(): Int {
        return 1
    }

    override fun getHigBorder(): Int {
        return border
    }
}