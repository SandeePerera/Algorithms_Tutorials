
import java.util.*;
public class MaximumFlow {

        private int[] parent_17178;
        private Queue<Integer> queue_17178;
        private int noOfVertices_17178;
        private boolean[] visitedNode_17178;
        private static int noOfNodes_17178;


        public MaximumFlow(int noOfVertices17178) {
            this.noOfVertices_17178 = noOfVertices17178;
            this.queue_17178 = new LinkedList<>();
            parent_17178 = new int[noOfVertices17178];
            visitedNode_17178 = new boolean[noOfVertices17178];
        }

        /* Returns true if there is a path from source to sink
       't' in residual graph. Also fills the path  parent[] to store
       */
        public boolean breadthFirstSearch(int source, int sink, int graph[][]) {
            boolean pathFound = false;
            int destination, element;

            for (int vertex_17178 = 0; vertex_17178 < noOfVertices_17178; vertex_17178++) {
                parent_17178[vertex_17178] = -1;
                visitedNode_17178[vertex_17178] = false;
            }

            queue_17178.add(source);
            parent_17178[source] = -1;
            visitedNode_17178[source] = true;


            while (!queue_17178.isEmpty()) {
                element = queue_17178.poll();
                destination = 1;

                while (destination < noOfVertices_17178) {
                    if (graph[element][destination] > 0 && !visitedNode_17178[destination]) {
                        parent_17178[destination] = element;
                        queue_17178.add(destination);
                        visitedNode_17178[destination] = true;
                    }
                    destination++;
                }
            }
            if (visitedNode_17178[sink]) {
                pathFound = true;
            }
            return pathFound;
        }

        public int fordFulkerson(int graph[][], int source, int destination) {
            int u, v;
            int maxFlow = 0;
            int pathFlow;

            int[][] residualGraph = new int[noOfVertices_17178][noOfVertices_17178];
            for (int sourceVertex = 0; sourceVertex < noOfVertices_17178; sourceVertex++) {
                for (int destinationVertex = 0; destinationVertex < noOfVertices_17178; destinationVertex++) {
                    residualGraph[sourceVertex][destinationVertex] = graph[sourceVertex][destinationVertex];
                }
            }

            // update residual capacities of the edges and
            // reverse edges along the path
            while (breadthFirstSearch(source, destination, residualGraph)) {
                pathFlow = Integer.MAX_VALUE;
                for (v = destination; v != source; v = parent_17178[v]) {
                    u = parent_17178[v];
                    pathFlow = Math.min(pathFlow, residualGraph[u][v]);
                }
                for (v = destination; v != source; v = parent_17178[v]) {
                    u = parent_17178[v];
                    residualGraph[u][v] -= pathFlow;
                    residualGraph[v][u] += pathFlow;
                }
                //System.out.println(pathFlow);

                // Add path flow to overall flow
                maxFlow += pathFlow;
            }

            return maxFlow;
        }
// Converting Arrays into a matrix
    public static void print2D(int graph [][]) {
        for (int row = 0; row < graph.length; row++) {
            for (int col = 0; col < graph[row].length; col++) {
                System.out.printf("%4d", graph[row][col]);
            }
            System.out.println();
        }
    }



        public static void main(String... arg) {
            long startTime = System.nanoTime();

            int[][] graph;
            int source;
            int sink;
            int maxFlow;

            //Randomly generating no of nodes between 10 to 4

            noOfNodes_17178 = (int) (Math.random() * ((10 - 4) + 1)) + 4;
            System.out.println("No of nodes: " + noOfNodes_17178 + "\n");


            graph = new int[noOfNodes_17178][noOfNodes_17178];
            noOfNodes_17178 = graph.length;

            for (int sourceVertex_17178 = 1; sourceVertex_17178 <= noOfNodes_17178; sourceVertex_17178++) {
                for (int destinationVertex_17178 = 1; destinationVertex_17178 <= noOfNodes_17178; destinationVertex_17178++) {
                    if (sourceVertex_17178 == destinationVertex_17178) {
                        graph[sourceVertex_17178 - 1][destinationVertex_17178 - 1] = 0;

                    } else {
                        if (graph[sourceVertex_17178 - 1][destinationVertex_17178 - 1] != 0) {
                            graph[destinationVertex_17178 - 1][sourceVertex_17178 - 1] = 0;
                        } else {
                            graph[sourceVertex_17178 - 1][destinationVertex_17178 - 1] = (int) (Math.random() * ((20 - 5) + 1)) + 5;
                        }
                    }
                }
            }

            System.out.println("Adjacent matrix related to the generated flow network :\n " );
            print2D(graph);

            // prints the source node in console
            source = 0;
            System.out.println("\nSource is: " + source);

// prints the sink node in console
            sink = noOfNodes_17178 - 1;
            System.out.println("Sink is: " + sink);
            System.out.println();

            MaximumFlow fordFulkerson = new MaximumFlow(noOfNodes_17178);
            maxFlow = fordFulkerson.fordFulkerson(graph, source, sink);
            System.out.println("The Maximum Flow through the network is " + maxFlow);


            long endTime   = System.nanoTime();
            long totalTime = endTime - startTime;

            System.out.println("Total run time in Nano Seconds " + totalTime);

        }

}


    

