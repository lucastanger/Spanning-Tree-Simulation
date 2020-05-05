/**
 * NodeLink
 *
 * This class represents a NodeLink Object
 *
 * @param weight the weight of the NodeLink
 * @param nodes the nodes that build the link
 */
class NodeLink constructor(weight: Int, nodes: Node) {

    var weight: Int? = weight
        get() = field?.toInt()

    var nodes: Node = nodes
}