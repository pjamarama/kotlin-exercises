/*
In a small town the population is p0 = 1000 at the beginning of a year. The population regularly increases
by 2 per cent per year and moreover 50 new inhabitants per year come to live in the town. How many years
does the town need to see its population greater or equal to p = 1200 inhabitants?
 */

package codewars

class GrothOfPopulation {
}

fun main() {
    println(groth(pp0 = 1000, percent = 2.0, aug = 50, p = 1200));
    println(groth(pp0 = 1500, percent = 5.0, aug = 100, p = 5000));
    println(5.0 / 100 + 1)
}

fun groth(pp0: Int, percent: Double, aug: Int, p: Int): Int {
    var numberOfYears = 0
    var count: Double = pp0.toDouble()

    do {
        numberOfYears += 1
        count = count * (percent / 100 + 1) + aug
    } while (count < p)

    return numberOfYears
}