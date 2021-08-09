package sample;


import java.util.ArrayList;
import java.util.List;

public class Node implements Comparable<Node>       //it contains compare function helps in single element sorting
{
    public String name;
    public Node previous;
    public double minDistance=Double.POSITIVE_INFINITY;
    public boolean visited,isArticulationPoint;
    public CanvasController.NodeFX circle; //Helps in providing circle shape to node through Nodefx class
    public int lowTime=0,visitTime=0;
    public int DAGColor;
    public List<Edge> adjacents=new ArrayList<Edge>();
    public List<Edge> revadjacents=new ArrayList<Edge>();
    public Node(String argname)
    {
        name=argname;
        visited=false;
    }
    public Node(String argname,CanvasController.NodeFX c)
    {
        name=argname;
        visited=false;
        circle=c;
    }
    @Override
    public int compareTo(Node o) {
        return Double.compare(minDistance, o.minDistance);
    }
}
