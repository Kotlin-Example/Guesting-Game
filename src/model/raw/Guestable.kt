package model.raw

import api.constants.Status

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 11:20 AM
 */
interface Guestable<out T> {
    fun correct(): T

    fun isCorrect(): Status
}