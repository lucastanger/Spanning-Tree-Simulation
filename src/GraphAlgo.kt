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
            // Cycle through every node
            graph.graph.entries.forEach(
                Consumer { node ->
                    // Cycle NodeLinks
                    node.value.forEach(
                        Consumer {nodeLink ->
                            if (node.key.nodeID < nodeLink.node.nodeID) {
                                nodeLink.node.nodeID = node.key.nodeID
                                nodeLink.node.weight = (node.key.weight.plus(nodeLink.weight))
                                nodeLink.node.predecessor = node.key
                            } else if (node.key.nodeID == nodeLink.node.nodeID) {
                                if ((node.key.weight.plus(nodeLink.weight)) < nodeLink.weight) {
                                    nodeLink.weight = node.key.weight + nodeLink.weight
                                    nodeLink.node.predecessor = node.key
                                }
                            }
                        }
                    )
                }
            )
        }
    }
}