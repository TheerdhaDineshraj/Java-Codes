#all pair shortest path
import java.util.Arrays;

public class AllPairsShortestPath {
    static final int INF = 99999;

    public static void main(String[] args) {
        int[][] graph = {
            {0, 4, INF, 2},
            {INF, 0, 6, INF},
            {INF, INF, 0, 3},
            {INF, INF, INF, 0}
        };
        
        int[][] shortestDistances = floydWarshall(graph);
        printSolution(shortestDistances);
    }

    public static int[][] floydWarshall(int[][] graph) {
        int V = graph.length;
        int[][] dist = new int[V][V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < V; j++) {
                dist[i][j] = graph[i][j];
            }
        }
        for (int k = 0; k < V; k++) {
            for (int i = 0; i < V; i++) {
                for (int j = 0; j < V; j++) {
                    if (dist[i][k] != INF && dist[k][j] != INF && dist[i][k] + dist[k][j] < dist[i][j]) {
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }
        return dist;
    }

    public static void printSolution(int[][] dist) {
        int V = dist.length;
        System.out.println("Shortest distance:");
        for (int i = 0; i < V; ++i) {
            for (int j = 0; j < V; ++j) {
                if (dist[i][j] == INF)
                    System.out.print("INF ");
                else
                    System.out.print(dist[i][j] + "   ");
            }
            System.out.println();
        }
    }
}
#Amstrong
public class amstrong {
    public static void main(String [] args){
        int n =220;
        int temp=n;
        int b;
        int c=0;

        while (n>0){
            b=n%10;
            c=c+(b*b*b);
            n=n/10;
        }
        if(c==temp){
            System.out.println("amstrong");
        }else{
            System.out.println("NO");
        }
    }
}
#Hamiltonion circuit
import java.util.*;

public class HamiltonianCircuit {
    private int numOfVertices;
    private int[] path;
    private int[][] adjacencyMatrix;

    public HamiltonianCircuit(int[][] graph) {
        numOfVertices = graph.length;
        adjacencyMatrix = graph;
        path = new int[numOfVertices];
        Arrays.fill(path, -1);
    }

    public boolean isValid(int v, int pos) {
        if (adjacencyMatrix[path[pos - 1]][v] == 0) {
            return false;
        }

        for (int i = 0; i < pos; i++) {
            if (path[i] == v) {
                return false;
            }
        }

        return true;
    }

    public boolean hamiltonianCircuitUtil(int pos) {
        if (pos == numOfVertices) {
            if (adjacencyMatrix[path[pos - 1]][path[0]] == 1) {
                return true;
            } else {
                return false;
            }
        }

        for (int v = 1; v < numOfVertices; v++) {
            if (isValid(v, pos)) {
                path[pos] = v;
                if (hamiltonianCircuitUtil(pos + 1)) {
                    return true;
                }
                path[pos] = -1; // Backtrack
            }
        }

        return false;
    }

    public void findHamiltonianCircuit() {
        path[0] = 0; // Start from the first vertex

        if (!hamiltonianCircuitUtil(1)) {
            System.out.println("No Hamiltonian Circuit exists in the graph.");
            return;
        }

        // Print the Hamiltonian Circuit
        System.out.println("Hamiltonian Circuit found:");
        for (int i = 0; i < numOfVertices; i++) {
            System.out.print(path[i] + " ");
        }
        System.out.println(path[0]);
    }

    public static void main(String[] args) {
        int[][] graph = {
            {0, 1, 0, 1, 0},
            {1, 0, 1, 1, 1},
            {0, 1, 0, 0, 1},
            {1, 1, 0, 0, 1},
            {0, 1, 1, 1, 0}
        };

        HamiltonianCircuit hamiltonian = new HamiltonianCircuit(graph);
        hamiltonian.findHamiltonianCircuit();
    }
}
#Factorial
public class factorial {
    public static void main(String []args){
        int n=3;
        int p=1;
        int m=n;
        while(m>0){
            
            p=p*(m);
            m--;
        }
        System.out.println(p);
    }
}
#Fibonacci
class fib{  
    public static void main(String args[])  
    {    
     int n1=0,n2=1,n3,i,count=10;    
     System.out.print(n1+" "+n2);
        
     for(i=2;i<count;++i)
     {    
      n3=n1+n2;    
      System.out.print(" "+n3);    
      n1=n2;    
      n2=n3;    
     }    
      
    }} 
#Reverse a string 
public class reverse{
    public static void main(String []arg){
        String [] name = {"welcome to college"};
        String str=name[0];
        String newstr="";
        for (int i=str.length()-1;i>0;i--){
            char c=str.charAt(i);
            newstr=newstr+c;
        }
        newstr=newstr+str.charAt(0);
        System.out.print(newstr);
    }

}
#check if a number is prime or not 
import java.util.*;
public class prime {
    public static void main (String [] args){
        System.out.println("enter the number ");
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int count =0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count>2){
            System.out.println("not prime");
        }else{
            System.out.println("prime");
        }
    }
}

