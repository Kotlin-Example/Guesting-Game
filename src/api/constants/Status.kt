package api.constants

import java.util.*

/**
 * @author kamontat
 * @version 1.0
 * @since Thu 29/Jun/2017 - 11:41 AM
 */
enum class Status {
    CORRECT, LESS_THAN, MORE_THAN, INCORRECT;

    override fun toString(): String {
        return String.format(Locale.ENGLISH, "Status.%s", name)
    }
}