package model.number.raw

import api.constants.Status
import model.raw.AnyGuestable
import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 11:30 AM
 */
abstract class NumberGuestable<T>(private val input: T) : AnyGuestable<T>(input) where T : Number, T : Comparable<T> {
    var correct: T = input
        private set

    override fun correct(): T {
        return input
    }

    override fun isCorrect(): Status {
        when {
            current == null -> return Status.INCORRECT
            correct == current!! -> return Status.CORRECT
            correct > current!! -> return Status.LESS_THAN
            correct < current!! -> return Status.MORE_THAN
            else -> return Status.INCORRECT
        }
    }

    override fun toString(): String {
        return String.format(Locale.ENGLISH, "current: %d, correct: %d = %s", current, correct, isCorrect())
    }
}