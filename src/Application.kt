fun main(args: Array<String>) {
    val repo: GraphRepository = GraphRepository()

    repo.computeFile("src/input.txt")

    GraphAlgorithm(repo.graph, 10)

    repo.printGraph()
}

