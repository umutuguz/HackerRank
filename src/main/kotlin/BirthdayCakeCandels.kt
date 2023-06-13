import java.io.*
import java.math.*
import java.security.*
import java.text.*
import java.util.*
import java.util.concurrent.*
import java.util.function.*
import java.util.regex.*
import java.util.stream.*
import kotlin.collections.*
import kotlin.comparisons.*
import kotlin.io.*
import kotlin.jvm.*
import kotlin.jvm.functions.*
import kotlin.jvm.internal.*
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'birthdayCakeCandles' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts INTEGER_ARRAY candles as parameter.
 */

fun birthdayCakeCandles(candles: Array<Int>): Int {
    // Write your code here
    var counter = 0
    for (element in candles) {
        if (element == candles.max()) {
            counter++
        }
    }
    return counter
}

fun main(args: Array<String>) {
    val candlesCount = readln().trim().toInt()

    val candles = arrayOf(3,4,5,6,7,7,7,7,7,4,2,1,5,33)

    val result = birthdayCakeCandles(candles)

    println(result)
}
