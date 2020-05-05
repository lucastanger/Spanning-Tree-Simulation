import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.util.regex.Pattern

/**
 * GraphRepository
 *
 * This class reads the input files and converts them into a HashMap
 */
class GraphRepository {

    private lateinit var graph: Graph
    private lateinit var file: File
    private lateinit var fr: FileReader
    private lateinit var br: BufferedReader

    fun computeFile(filename: String) {
        graph = Graph()

        readFile(filename)

    }

    fun readFile(filename: String)
        = File(filename).forEachLine {
        if (Pattern.matches("\\s*[A-Z]\\s=\\s\\d;", it)) {

        }

        else if (Pattern.matches("\\s*[A-Z]\\s-\\s[A-Z]\\s:\\s\\d*;", it)) {

        }
    }

    fun getWeight(st: String): Int? {
        val weight = st.replace("[\\D+]".toRegex(),"")
        return if (weight.isEmpty()) null else Integer.parseInt(weight)
    }

    fun getChar(st: String): String? {
        val char = st.replace("[^A-Z]+".toRegex(), "")
        return if (char.isEmpty()) null else char
    }
}