package com.lucastanger

/**
 * com.lucastanger.NodeLink
 * This class represents a com.lucastanger.NodeLink Object
 * @param weight the weight of the com.lucastanger.NodeLink
 * @param node the nodes that build the link
 */
class NodeLink constructor(weight: Int, node: Node) {

    var weight: Int = weight
        get() = field.toInt()

    var node: Node = node
}