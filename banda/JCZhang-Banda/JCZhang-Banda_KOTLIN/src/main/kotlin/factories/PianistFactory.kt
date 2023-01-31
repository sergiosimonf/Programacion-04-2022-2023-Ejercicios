package factories

import models.Pianist

object PianistFactory {
    var pianistCounter = 0
    fun createRandomPianist(): Pianist {
        pianistCounter++
        val names = arrayOf(
            "Paquita",
            "Ernesto",
            "Antonio",
            "Alfonso",
            "Patricio",
            "BobEsponja",
            "Arenita",
            "DonCangrejo",
            "Calamardo",
            "Juan",
            "Laura",
            "Aitana",
            "Aitor",
            "Juanjo",
            "Paco"
        )
        val expYears = arrayOf(
            2,
            4,
            25,
            6,
            8,
            54,
            56,
            3,
            6,
            27,
            4,
            1,
            7,
            36,
            0,
            13
        )
        val keyNumber = arrayOf(
            49,
            61,
            88
        )
        val name = names[names.indices.random()]
        val yearsOfExperience = expYears[expYears.indices.random()]
        val numberOfKeys = keyNumber[keyNumber.indices.random()]

        return Pianist(name, yearsOfExperience, numberOfKeys)
    }
}