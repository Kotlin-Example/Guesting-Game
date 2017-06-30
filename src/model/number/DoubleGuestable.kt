package model.number

import model.number.raw.NumberGuestable
import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 3:19 PM
 */
class DoubleGuestable(correctNumber: Double) : NumberGuestable<Double>(correctNumber) {
    override fun toString(): String {
        if (current == null) return String.format(Locale.ENGLISH, "current: null, correct: %.2f = %s", correct, isCorrect())
        return String.format(Locale.ENGLISH, "current: %.2f, correct: %.2f = %s", current, correct, isCorrect())
    }
}