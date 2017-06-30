package model.game.api

import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 3:43 PM
 */
class Reader() {
    private val scanner = Scanner(System.`in`)

    /**
     * separate by new line
     */
    fun readNL(): String {
        return scanner.nextLine().trim().replace("\n", "")
    }

    /**
     * separate by space bar
     */
    fun read(): String {
        return scanner.next()
    }
}