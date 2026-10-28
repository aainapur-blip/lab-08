
package com.example.lab_8

class Wizard(val name: String, var mana: Int, var spellPower: Int) {

    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else return 0 // not enough mana
            }

            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else return 0 // not enough mana
            }

            else -> {
                return 0 // invalid spell
            }
        }
    }

    // Skeleton for restoreMana - TDD failing stage
    fun restoreMana(amount: Int) {

    }

    // Completed train method
    fun train() {
        if (mana >= 5) {
            mana -= 5
            spellPower += 1
        }
    }
}
