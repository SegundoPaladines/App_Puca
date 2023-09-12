import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.TextInputDialog;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Line;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.QuadCurve;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Scale;
import javafx.stage.Stage;

public class AppPucca2D extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Pane root= new Pane();
        root.getChildren().add(this.pucca2D());
        Scene escena= new Scene (root,700,700);
        primaryStage.setTitle("Pucca");
        primaryStage.setScene(escena);
        primaryStage.show();     
    }

    public Group pucca2D(){


        Group grupo_pucca= new Group();

        //zoom
        TextInputDialog td= new TextInputDialog();
        td.setTitle("Zoom A Pucca");
        td.setContentText("Ingrese El Valor De Zoom De Pucca");
        Optional<String> respuesta=td.showAndWait();
        int zoom=Integer.parseInt(respuesta.get());
        



        Ellipse cabeza_1=new Ellipse();
        cabeza_1.setCenterX(40.0);
        cabeza_1.setCenterY(18.5);
        cabeza_1.setRadiusX(23.8);
        cabeza_1.setRadiusY(18.5);
        cabeza_1.setFill(Color.BLACK);

        Ellipse cabeza_2=new Ellipse();
        cabeza_2.setCenterX(40.0);
        cabeza_2.setCenterY(20.8);
        cabeza_2.setRadiusX(20.2);
        cabeza_2.setRadiusY(14.5);
        cabeza_2.setFill(Color.rgb(245,222,179));


        Circle cachete_1 = new Circle (28,28,2.25);//X,Y, radio
        cachete_1.setFill(Color.rgb(251,125,102,0.5));//rojo, azul, verde, transparencia

        Circle cachete_2 = new Circle (52,28,2.25);
        cachete_2.setFill(Color.rgb(251,125,102,0.5));//rojo, azul, verde, transparencia

        Line ojo_1 = new Line();
        ojo_1.setStartX(22);
        ojo_1.setStartY(21.5);
        ojo_1.setEndX(33);
        ojo_1.setEndY(24.5);

        ojo_1.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        Line ojo_2 = new Line();
        ojo_2.setStartX(47);
        ojo_2.setStartY(24.5);
        ojo_2.setEndX(58.5);
        ojo_2.setEndY(21.5);

        ojo_2.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        //Curva Cuadratica para las cejas

        QuadCurve ceja_1=new QuadCurve();
        ceja_1.setStartX(30);
        ceja_1.setStartY(13);
        ceja_1.setControlX(25.5);
        ceja_1.setControlY(10);
        ceja_1.setEndX(20);
        ceja_1.setEndY(12);
        ceja_1.setFill(null);
        ceja_1.setStroke(Color.BLACK);
        ceja_1.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos
        

        QuadCurve ceja_2=new QuadCurve();
        ceja_2.setStartX(50);
        ceja_2.setStartY(13);
        ceja_2.setControlX(54.5);
        ceja_2.setControlY(10);
        ceja_2.setEndX(60);
        ceja_2.setEndY(12);
        ceja_2.setFill(null);
        ceja_2.setStroke(Color.BLACK);
        ceja_2.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos
        
        //ARCO PARA LA BOCA

        Arc boca = new Arc();
        boca.setCenterX(40);
        boca.setCenterY(28.5);
        boca.setRadiusX(2.5);
        boca.setRadiusY(2.5);
        boca.setStartAngle(180);
        boca.setLength(180);
        boca.setFill(null);
        boca.setStroke(Color.BLACK);
        boca.setStrokeLineCap(StrokeLineCap.ROUND);

        //los moños

        Circle moño_1= new Circle(13.5,9.5,9.2);
        moño_1.setFill(Color.BLACK);

        Circle moño_2= new Circle(66.5,9.5,9.2);

        //ribetes
        
        QuadCurve ribete_1=new QuadCurve(20.5,8.5, 16, 11.5, 16.5,17);
        ribete_1.setFill(Color.RED);
        //ribete_1.setStroke(Color.BLACK);
        //ribete_1.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos
        

        QuadCurve ribete_2=new QuadCurve(59.5,8.5, 64.5, 11.5, 64.5,17);
        ribete_2.setFill(Color.RED);
        //ribete_2.setStroke(Color.BLACK);
        //ribete_2.setStrokeLineCap(StrokeLineCap.ROUND);// final e inicio de la linea redondos

        //brazos

        Polygon brazo_1=new Polygon(30.5, 36, 21, 42, 28,48);
        brazo_1.setFill(Color.RED);
        brazo_1.setStroke(Color.BLACK);


        Polygon brazo_2=new Polygon(49.5,36,59,42,52,48);
        brazo_2.setFill(Color.RED);
        brazo_2.setStroke(Color.BLACK);

        //manos

        Arc mano_1=new Arc(24,45,3,3,138.5,180);
        mano_1.setStroke(Color.BLACK);
        mano_1.setFill(Color.rgb(245,222,179));

        Arc mano_2=new Arc(55.5,45,3,3,221.5,180);
        mano_2.setStroke(Color.BLACK);
        mano_2.setFill(Color.rgb(245,222,179));


        //cuerpo

        Polygon cuerpo_1=new Polygon(31.4, 34, 28, 48.3, 52,48.3, 49,34);
        cuerpo_1.setFill(Color.RED);

        QuadCurve falda=new QuadCurve(51.5, 48.3, 40,52,28.5,48); //iniciox, inicioy, controlx controly finx, fin y
        falda.setFill(Color.RED);
        falda.setStroke(Color.BLACK);

        //piernas

        Polygon pierna_1=new Polygon(30.5,45,31,59,39.2,59,40,45);

        Arc pie_1=new Arc(45.07,59,4.12,4.12,180,180);
        pie_1.setFill(Color.BLACK);

        Polygon pierna_2=new Polygon(40.5,50,41,59,49.2,59,50,45);
        
        Arc pie_2=new Arc(35.07,59,4.12,4.12,180,180);
        pie_2.setFill(Color.BLACK);

        Text titulo= new Text(20,70,"PUCCA 0");

        titulo.setFont(Font.loadFont(this.getClass().getResourceAsStream("/fonts/zen_Dots/Hack-Bold.ttf"),10));


        //añadir los objetos
        grupo_pucca.getChildren().addAll(titulo,pierna_2,pierna_1,cuerpo_1,mano_1,mano_2,brazo_2,brazo_1,moño_1,moño_2,cabeza_1,cabeza_2, cachete_1,cachete_2, ojo_1,ojo_2,ceja_1,ceja_2,boca, ribete_1,ribete_2,falda,pie_2,pie_1);
        

        
        //Cambiar el tamaño del grupo pucca
        grupo_pucca.getTransforms().add(new Scale(zoom,zoom,0,0));




        return grupo_pucca;
    }

    public static void main(String[] args) throws Exception {
        launch(args);
    }
}
