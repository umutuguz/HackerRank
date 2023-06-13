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
 * Complete the 'timeConversion' function below.
 *
 * The function is expected to return a STRING.
 * The function accepts STRING s as parameter.
 */

fun timeConversion(s: String): String {
    // Write your code here
//    val amPm = s.takeLast(2)
    var pm: String = "00:00:00"
    var am: String = "00.00.00"
    var hours = 0
    if (s.takeLast(2) == "PM") {
        if (s.take(2) != "12"){
            hours = 12 + (s.take(2).toInt())
            pm = s.replaceRange(0,2,"$hours").take(8)
        }else {
            pm = s.replaceRange(0,2,"12").take(8)
        }
        return pm
    }else {
        if (s.take(2) == "12") {
            am = s.replaceRange(0,2,"00").take(8)
        }else {
            am = s.take(8)
        }
        return am
    }

}

fun main(args: Array<String>) {
    val s = "07:05:45PM"

    val result = timeConversion(s)

    println(result)
}
