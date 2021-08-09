package sample;

import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import sample.CanvasController.NodeFX;
import javafx.scene.control.ContextMenu;

public class RightClickMenu
{
    ContextMenu menu;
    NodeFX sourceNode;
    Edge sourceEdge;
    MenuItem delete, changeId;

    public RightClickMenu(){
        menu=new ContextMenu();
        delete=new MenuItem("Delete");
        changeId=new MenuItem("Change Id");

        Image openIcon=new Image(getClass().getResourceAsStream("delete_img.png"));
        ImageView openView=new ImageView(openIcon);
        delete.setGraphic(openView);

        Image textIcon=new Image(getClass().getResourceAsStream("rename_img.png"));
        ImageView textIconView=new ImageView(textIcon);
        delete.setGraphic(textIconView);

        menu.getItems().addAll(delete,changeId);
        menu.setOpacity(0.9);
    }//This add images in menu

    public RightClickMenu(NodeFX node){
        this();
        sourceNode=node;
        delete.setOnAction(e->{
            Panel1Controller.cref.deleteNode(sourceNode);
        });
        changeId.setOnAction(e->{
            Panel1Controller.cref.changeID(node);
        });
    }// if we delete node

    public RightClickMenu(Edge edge) {
        this();
        sourceEdge = edge;
        delete.setOnAction(e -> {
            Panel1Controller.cref.deleteEdge(sourceEdge);
        });
        changeId.setOnAction(e -> {
            Panel1Controller.cref.changeWeight(sourceEdge);
        });
    }// if we delete edge

    public ContextMenu getMenu()
    {
        return menu;
    }
}
