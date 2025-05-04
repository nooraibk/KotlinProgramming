package functions.extensions

import variance.Candy
import variance.Sandwich
import variance.Snack
import java.util.*

fun Snack.Companion.random() : Snack {
    val snacks = listOf(Candy(), Sandwich())
    return snacks[Random().nextInt(snacks.size)]
}