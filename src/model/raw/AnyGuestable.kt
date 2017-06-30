package model.raw

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 3:58 PM
 */
abstract class AnyGuestable<T>(private val input: T) : Guestable<T> {
    var current: T? = null
}