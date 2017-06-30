package model.game.algorithm

import api.constants.Status
import model.game.api.Reader
import model.raw.AnyGuestable
import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 3:38 PM
 */
class Algorithm1 : GameAlgorithm<Int> {
    private var guestable: AnyGuestable<Int>? = null

    override fun execute(reader: Reader, guestable: AnyGuestable<Int>) {
        this.guestable = guestable

        print("What number that you want? ")
        val r = reader.readNL()
        guestable.current = r.toInt()
        val status = guestable.isCorrect()
        if (status != Status.CORRECT) println(String.format(Locale.ENGLISH, "you number is %s", status.name.toLowerCase(Locale.ENGLISH)))
    }

    override fun winMessage(counter: String): String {
        return String.format(Locale.ENGLISH, "True: guesting correctly in %s time(s).", counter)
    }
}