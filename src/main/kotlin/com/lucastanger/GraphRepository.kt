package com.lucastanger

import java.io.File
import java.util.regex.Pattern

/**
 * com.lucastanger.GraphRepository
 * This class reads the input files and converts them into a HashMap
 */
class GraphRepository {

    lateinit var graph: Graph

    /**
     * Computes the file
     * @param filename
     * @return void
     * @author Luca Stanger
     */
    fun computeFile(filename: String) {
        graph = Graph()

        readFile(filename)

    }

    /**
     * Reads the input file
     * @param filename
     * @return void
     * @author Luca Stanger
     */
    private fun readFile(filename: String) {
        File(filename).forEachLine {
            if (Pattern.matches("\\s*[A-Z]\\s=\\s\\d;", it)) {
                getWeight(it)?.let { weight -> getChar(it)?.let { name -> graph.createNode(weight, name) } }
            }
            else if (Pattern.matches("\\s*[A-Z]\\s-\\s[A-Z]\\s:\\s\\d*;", it)) {
                val c: CharArray? = getChar(it)?.toCharArray()
                getWeight(it)?.let { weight -> graph.createNodeLink(c?.first().toString(), weight, c?.last().toString()) }
                getWeight(it)?.let { weight -> graph.createNodeLink(c?.last().toString(), weight, c?.first().toString()) }
            }
        }
    }

    /**
     * Returns the weight of the submitted string
     * @param st
     * @return Int?
     * @author Luca Stanger
     */
    private fun getWeight(st: String): Int? {
        val weight = st.replace("[\\D+]".toRegex(),"")
        return if (weight.isEmpty()) null else Integer.parseInt(weight)
    }

    /**
     * Returns a char of the submitted string
     * @param st
     * @return String?
     * @author Luca Stanger
     */
    private fun getChar(st: String): String? {
        val char = st.replace("[^A-Z]+".toRegex(), "")
        return if (char.isEmpty()) null else char
    }

    /**
     * PrintGraph: Prints the com.lucastanger.Graph to the console
     * @return void
     * @author Luca Stanger
     */
    fun printGraph() {
        graph.graph.forEach { node -> if ((node.key.predecessor == null)) {
            println("Root: ${node.key.name}")
        } else {
            println("${node.key.name} - ${node.key.predecessor!!.name}")
        }}
    }
}