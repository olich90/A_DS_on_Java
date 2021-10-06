package lesson7;

public class Main {
    public static void main(String[] args) {

        // 1.1 Реализовать программу, в которой задается граф из 10 вершин
        Graph graph = new Graph(10);

        //1.2 Задать ребра
        graph.addEdge(1, 2);
        graph.addEdge(0, 4);
        graph.addEdge(1, 4);
        graph.addEdge(1, 3);
        graph.addEdge(4, 5);
        graph.addEdge(4, 6);
        graph.addEdge(6, 9);
        graph.addEdge(8, 5);
        graph.addEdge(7, 9);
        graph.addEdge(9, 8);
        graph.addEdge(5, 7);

//        System.out.println(graph.getVertexCount());
//        System.out.println(graph.getEdgeCount());
//        System.out.println(graph.getAdjList(4));

//        DepthFirstPath dfp = new DepthFirstPath(graph, 2);
//        System.out.println(dfp.hasPathTo(0));
//        System.out.println(dfp.pathTo(0));

        //1.3  Найти кратчайший путь с помощью поиска в ширину.
        BreadthFirstPath bfp = new BreadthFirstPath(graph, 0);
        System.out.println(bfp.hasPathTo(5));
        System.out.println(bfp.pathTo(9));

    }
}
