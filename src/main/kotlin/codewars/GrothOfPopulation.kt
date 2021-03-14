/*
In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases
by 2 per cent per year and moreover 50 new inhabitants per year come to live in the town. How many years
does the town need to see its population greater or equal to p = 1200 inhabitants?
 */

package codewars

class GrothOfPopulation {
}

fun main() {
    println(groth());
}

fun groth(): Int {
    var numberOfYears = 0
    var population = 1000.0

    while (population < 1200) {
        numberOfYears += 1
        population = population * 1.02 + 50
    }

    return numberOfYears
}