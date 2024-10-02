import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.reduce
import kotlin.system.measureTimeMillis

suspend fun main() {

    val time = measureTimeMillis {
        val numArray = arrayOf(1,2,3,4,5,6,7,8,9,10).asFlow().map { it->it*it }.reduce{a,b -> a + b}
        println(numArray)

    }
    println("Времени затрачено $time")

}

