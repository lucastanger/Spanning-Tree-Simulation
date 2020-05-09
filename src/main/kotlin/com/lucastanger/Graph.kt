package com.lucastanger

import java.util.*

/**
 * com.lucastanger.Graph
 * This class represents the graph
 * @contains com.lucastanger.Node, com.lucastanger.NodeLink
 */
class Graph {

    var graph: LinkedHashMap<Node, ArrayList<NodeLink>> = LinkedHashMap()

    /**
     * CreateNode: Creates a com.lucastanger.Node inside the graph
     * @param name
     * @param nodeID
     * @return void
     * @author Luca Stanger
     */
    fun createNode(nodeID: Int, name: String) {
        graph[Node(name, nodeID)] = ArrayList()
    }

    /**
     * CreateNodeLink: Creates a com.lucastanger.NodeLink inside the graph
     * @param nodeName
     * @param weight
     * @param nodeLinkName
     * @return void
     * @author Luca Stanger
     */
    fun createNodeLink(nodeName: String, weight: Int, nodeLinkName: String) {
        graph[getNodeByName(nodeName)]?.add(
            NodeLink(
                weight,
                getNodeByName(nodeLinkName)
            )
        )
    }

    /**
     * getNodeByName: searches the graph for the first node containing the submitted name
     * @param name
     * @return com.lucastanger.Node
     * @author Luca Stanger
     */
    private fun getNodeByName(name: String): Node {
        return graph.entries.first { it.key.name == name }.key
    }

    /**
     * getNodeById: searches the graph for the first node containing the submitted id
     * @param nodeID
     * @return com.lucastanger.Node
     * @author Luca Stanger
     */
    fun getNodeByID(nodeID: Int): Node {
        return graph.entries.first { it.key.nodeID == nodeID }.key
    }

}