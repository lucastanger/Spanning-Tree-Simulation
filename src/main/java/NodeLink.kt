/**
 * NodeLink
 * This class represents a NodeLink Object
 * @param weight the weight of the NodeLink
 * @param node the nodes that build the link
 */
class NodeLink constructor(weight: Int, node: Node) {

    var weight: Int = weight
        get() = field.toInt()

    var node: Node = node
}