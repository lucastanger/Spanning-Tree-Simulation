package com.lucastanger

/**
 * Main
 * Represents the entry point of the application
 */
class Application {
    companion object {
        @JvmStatic fun main(args: Array<String>) {
            val repo: GraphRepository = GraphRepository()

            repo.computeFile("../resources/main/input.txt")

            GraphAlgorithm(repo.graph, 10)

            repo.printGraph()
        }
    }
}
