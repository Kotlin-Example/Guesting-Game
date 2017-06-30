package model.game

import api.constants.Status
import model.game.algorithm.GameAlgorithm
import model.game.api.Reader
import model.raw.AnyGuestable

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 3:33 PM
 */
class GameLogic<T : Any>(private val guestable: AnyGuestable<T>) {
    private var counter: Int = 0

    fun run(algorithm: GameAlgorithm<T>) {
        val reader = Reader()

        while (guestable.isCorrect() != Status.CORRECT) {
            algorithm.execute(reader, guestable)
            counter++
        }

        println(algorithm.winMessage(counter.toString()))
    }
}