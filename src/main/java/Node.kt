/**
 * Node
 *
 * This class represents a Node Object
 *
 * @param name the name of the node
 * @param nodeID the identifier of the node
 */
class Node constructor(name: String, nodeID: Int) {

    var name: String = name
        get() = field.toString()

    var nodeID: Int = nodeID
        get() = field.toInt()

    var weight: Int = 0
        get() = field.toInt()

    var predecessor: Node? = null

}