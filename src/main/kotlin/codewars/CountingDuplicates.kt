/*
Write a function that will return the count of distinct case-insensitive alphabetic characters
and numeric digits that occur more than once in the input string. The input string can be assumed
to contain only alphabets (both uppercase and lowercase) and numeric digits.

Example

"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice
 */

package codewars

import java.util.*

class CountingDuplicates {
}

fun main() {
    println(countDup("abcde"))
    println(countDup("aabbcde"))
    println(countDup("aabBcde"))
    println(countDup("indivisibility"))
    println(countDup("Indivisibilities"))
    println(countDup("aA11"))
    println(countDup("ABBA"))
}

fun countDup(word: String): Int {
    var result = 0
    val map = TreeMap<Char, Int>()

    for (c in word.toUpperCase()) {
        map.putIfAbsent(c, 0)
        map[c] = map[c]!! + 1
    }

    for ((k, v) in map) {
        if (v > 1) {
            result += 1
        }
    }

    return result
}

// fun duplicateCount(text: String) = text.groupBy(Char::toLowerCase).count { it.value.count() > 1 }