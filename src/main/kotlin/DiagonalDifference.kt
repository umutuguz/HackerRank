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
import kotlin.math.abs
import kotlin.ranges.*
import kotlin.sequences.*
import kotlin.text.*

/*
 * Complete the 'diagonalDifference' function below.
 *
 * The function is expected to return an INTEGER.
 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
 */

fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var result: Int
    val lenght = arr.size - 1
    var sumLeftToRight = 0
    var sumRightToLeft = 0

    for (i in 0..lenght) {
        sumLeftToRight += arr[i][i]
        sumRightToLeft += arr[i][lenght - i]
    }

    result = abs(sumLeftToRight - sumRightToLeft)
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readln().trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}
