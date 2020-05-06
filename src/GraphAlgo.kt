import java.util.function.Consumer

/**
 * GraphAlgo
 *
 * This class contains the algorithm logic
 */
class GraphAlgo constructor(graph: Graph, pdu: Int){

    init {
        // Cycle amount
        for (i in 0..pdu) {
            println("Cycle Nr: $i")
            // Cycle through every node
            graph.graph.entries.forEach(
                Consumer {
                    println(it.key)
                    // Cycle NodeLinks
                    it.value.forEach(
                        Consumer {
                            println(it)
                            if (it.weight!! < it.node.weight!!) {
                                it.node.nodeID = it.weight
                            }
                        }

                    )
                }
            )
        }
    }
}