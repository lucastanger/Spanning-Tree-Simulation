class Application {

}

fun main(args: Array<String>) {
    val repo: GraphRepository = GraphRepository()

    repo.computeFile("src/input.txt")

    GraphAlgo(repo.graph, 10)
}

