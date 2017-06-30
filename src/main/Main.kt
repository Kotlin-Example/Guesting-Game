package main

import model.game.GameLogic
import model.game.algorithm.Algorithm1
import model.number.IntGuestable
import model.raw.AnyGuestable
import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 1:03 PM
 */
fun main(args: Array<String>) {
    println("Welcome to Guesting Game.")
    print("To play the game, you should choose your number interval ? ")
    val rang = (model.game.api.Reader().read().toIntOrNull() ?: 50)
    println("you length is 1 - $rang")

    val rand = Random().nextInt(rang)
    val guestable: AnyGuestable<Int> = IntGuestable(rand)
    val g: GameLogic<Int> = GameLogic<Int>(guestable)
    g.run(Algorithm1())
}