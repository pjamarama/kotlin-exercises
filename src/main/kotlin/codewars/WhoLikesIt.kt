/*
Implement a function likes :: [String] -> String, which must take in input array, containing the names
of people who like an item. It must return the display text as shown in the examples:

likes {} // must be "no one likes this"
likes {"Peter"} // must be "Peter likes this"
likes {"Jacob", "Alex"} // must be "Jacob and Alex like this"
likes {"Max", "John", "Mark"} // must be "Max, John and Mark like this"
likes {"Alex", "Jacob", "Mark", "Max"} // must be "Alex, Jacob and 2 others like this"
 */

package codewars

class WhoLikesIt {
}

fun main() {
    whoLikes(arrayOf(""))
    whoLikes(arrayOf("Peter"))
    whoLikes(arrayOf("Jacob", "Alex"))
    whoLikes(arrayOf("Max", "John", "Mark"))
    whoLikes(arrayOf("Alex", "Jacob", "Mark", "Max"))

}

fun whoLikes(names: Array<String>) {

    when  {
        (names.size == 1 && names[0].isEmpty()) -> println("no one likes this")

    }

    when (names.size) {
        1 -> println("${names[0]} likes this")
        2 -> println("${names[0]} and ${names[1]} like this")
        3 -> println("${names[0]}, ${names[1]} and ${names[2]} like this")
        else -> println("${names[0]}, ${names[2]} and ${names.size - 2} others like this")

    }
}
