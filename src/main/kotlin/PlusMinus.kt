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
 * Complete the 'plusMinus' function below.
 *
 * The function accepts INTEGER_ARRAY arr as parameter.
 */

fun plusMinus(arr: Array<Int>): Unit {
    // Write your code here
    val n = arr.size.toFloat()
    var posValues = 0F
    var negValues = 0F
    var zeroValues = 0F
    val df = DecimalFormat("0.000000")
    df.roundingMode = RoundingMode.HALF_EVEN

    //Yine alternatif cozum olarak
//    val positives = arr.count { it > 0 }
//    val negatives = arr.count { it < 0 }
//    val zeros = arr.count { it == 0 }

    for (element in arr) {
        if (element > 0) {
            posValues++
        }else if (element == 0) {
            zeroValues++
        }else {
            negValues++
        }
    }

    println(df.format(posValues / n))
    println(df.format(negValues / n))
    println(df.format(zeroValues / n))

//      Diger bir cozum olarak
//    println(String.format("%.6f", posValues / n))
//    println(String.format("%.6f", negValues / n))
//    println(String.format("%.6f", zeroValues / n))
}

fun main(args: Array<String>) {

    val arr = arrayOf(1,1,0,-1,-1)

    plusMinus(arr)
}
