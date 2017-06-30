package model.game.algorithm

import model.game.api.Reader
import model.raw.AnyGuestable

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 3:38 PM
 */
interface GameAlgorithm<T : Any> {
    fun execute(reader: Reader, guestable: AnyGuestable<T>)

    fun winMessage(counter: String = "0"): String
}