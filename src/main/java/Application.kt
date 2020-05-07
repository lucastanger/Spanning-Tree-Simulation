/**
 * Main
 * Represents the entry point of the application
 */
fun main() {
    val repo: GraphRepository = GraphRepository()

    repo.computeFile("src/main/java/input.txt")

    GraphAlgorithm(repo.graph, 10)

    repo.printGraph()
}

