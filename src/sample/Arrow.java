package sample;

import javafx.scene.paint.Color;
import javafx.scene.shape.LineTo;
import javafx.scene.shape.MoveTo;
import javafx.scene.shape.Path;

public class Arrow extends Path {    //used to draw a line (path function)
    private static final double defaultArrowHeadSize = 7;
    private double startX, startY, endX, endY;
    public Arrow(double startX,double startY,double endX,double endY,double arrowHeadSize) {
        super();//this creates an empty instance of line

        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;

        //colour of arrow
        strokeProperty().bind(fillProperty());
        setFill(Color.BLACK);

        //Line
        getElements().add(new MoveTo(startX, startY));//starting from given points
        getElements().add(new LineTo(endX, endY));//form curr position to given points
        //Arrowhead
        double angle = Math.atan2((endY - startY), (endX - startX)) - Math.PI / 2.0;//it returns slope between two points
        double sin = Math.sin(angle);
        double cos = Math.cos(angle);
        //point1
        double x1 = (- 1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + endX;
        double y1 = (- 1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + endY;
        //point2
        double x2 = (1.0 / 2.0 * cos + Math.sqrt(3) / 2 * sin) * arrowHeadSize + endX;
        double y2 = (1.0 / 2.0 * sin - Math.sqrt(3) / 2 * cos) * arrowHeadSize + endY;

        getElements().add(new LineTo(x1, y1));
        getElements().add(new LineTo(x2, y2));
        getElements().add(new LineTo(endX, endY));
    }

    public Arrow(double startX, double startY, double endX, double endY){
        this(startX, startY, endX, endY, defaultArrowHeadSize);
    }
}
