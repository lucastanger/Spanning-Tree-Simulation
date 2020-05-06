/**
 * Graph<T>
 *
 * This class represents the graph
 * @contains Node, NodeLink
 */
class Graph {

    var graph: HashMap<Node, ArrayList<NodeLink>> = HashMap()

    fun createNode(nodeID: Int, name: String) {
        graph[Node(name, nodeID)] = ArrayList()
    }

    fun createNodeLink(nodeName: String, weight: Int, nodeLinkName: String) {
        graph[getNodeByName(nodeName)]?.add(NodeLink(weight, getNodeByName(nodeLinkName)))
    }

    private fun getNodeByName(name: String): Node {
        return graph.entries.first { it.key.name == name }.key
    }

    fun getNodeByID(nodeID: Int): Node {
        return graph.entries.first { it.key.nodeID == nodeID }.key
    }

}