package sample;

import javafx.scene.control.Label;
import javafx.scene.shape.Shape;

public class Edge
{
    public Node source;
    public Node target;
    public double weight;
    public Shape line;
    public Label weightLabel;

    public Shape getLine()
    {
        return line;
    }

    public Edge(Node startarg,Node endarg)
    {
        source=startarg;
        target=endarg;
        weight=0;
    }
    public Edge(Node startArg, Node endArg, double weight, Shape line, Label weiglabel)
    {
        source=startArg;
        target=endArg;
        this.weight=weight;
        this.line=line;
        this.weightLabel=weiglabel;
    }
}
