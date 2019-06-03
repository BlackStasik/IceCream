import com.sun.org.apache.xpath.internal.SourceTree;
import com.sun.org.apache.xpath.internal.operations.Or;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableArray;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application{

    static Scene scene;

    IceCream iceCream;
    Factory1 factory = new Factory1();

    Stage window, windowHist;
    private static TableView<Order> table = new TableView<Order>();
    double price = 0;
    int num = 1;
    String t1,t2,t3,t4;
    private ObservableList<Order> products = FXCollections.observableArrayList();
    ChoiceBox cb;


    int c = 0;
    int c2 = 0;
    int c3 = 0;
    int c4 = 0;
    int c5 = 0;
    int c6 = 0;
    int st = 0;


    public void history(Stage primaryStage1){
        windowHist = primaryStage1;

        TableColumn type = new TableColumn("Вид морозива");
        type.setCellValueFactory(new PropertyValueFactory<Order,String>("type"));
        TableColumn adds = new TableColumn("Добавка");
        adds.setCellValueFactory(new PropertyValueFactory<Order,String>("adds"));
        TableColumn form = new TableColumn("Форма");
        form.setCellValueFactory(new PropertyValueFactory<Order,String>("form"));
        TableColumn price = new TableColumn("Ціна");
        price.setCellValueFactory(new PropertyValueFactory<Order,String>("price"));

        Order order = new Order();
        order.setType("Шоколадне");
        order.setAdds(" Горішки");
        order.setForm("Ріжок");
        order.setPrice("6.5");
        table.getItems().add(order);
        Order order1 = new Order();
        order1.setType("Шоколадне");
        order1.setAdds("Джем");
        order1.setForm("Брикет");
        order1.setPrice("6");
        table.getItems().add(order1);


        table.getColumns().addAll(type, adds, form, price);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(table);
        windowHist.setTitle("Історія замовлень");
        windowHist.setScene(new Scene(borderPane,400,300));

    }

    public void addTable(){
    Order order = new Order();
    order.setType(t1);
    order.setAdds(t2);
    order.setForm(t3);
    order.setPrice(t4);
    table.getItems().add(order);

    table = new TableView<Order>();
    table.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
    table.setItems(getProduct());
}
    public ObservableList<Order> getProduct(){
        products.add(new Order(t1,t2,t3,t4));
        return products;
    }

    public void show(){
        windowHist.show();
    }


    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Ice Cream");


        history(new Stage());
        MenuBar menuBar = new MenuBar();
        final Menu file = new Menu("Головна");
        final MenuItem history = new MenuItem("Історія");
        history.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                show();
            }
        });
        MenuItem exit = new MenuItem("Вихід");
        exit.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent t) {
                System.exit(0);
            }
        });
        file.getItems().addAll(history,exit);

        Menu help = new Menu("Допомога");
        menuBar.getMenus().addAll(file,help);


        cb = new ChoiceBox(FXCollections.observableArrayList(
                "Пломбір", "Ванільне", "Шоколадне")
        );
        cb.setMinWidth(160);
        cb.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                t1 = (String) cb.getValue();
                price = 5;
                System.out.println(price);
            }
        });


        VBox vBox = new VBox();
        CheckBox cb1 = new CheckBox("Шоколад");
        cb1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                c++;
                if(c%2 == 0){
                    price -= 0.5;
                    t2 = "";
                }
                else {
                    price += 0.5;
                    t2 = "Шоколад";
                }
                System.out.println(price);
            }
        });
        CheckBox cb2 = new CheckBox("Горішки");
        cb2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                c2++;
                if(c2%2 == 0){
                    price -= 0.5;
                    t2 = "";
                }
                else {
                    price += 0.5;
                    t2 = "Горішки";
                }
                System.out.println(price);

            }
        });
        CheckBox cb3 = new CheckBox("Джем");
        cb3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                c3++;
                if(c3%2 == 0){
                    price -= 0.5;
                    t2 = "";
                }
                else {
                    price += 0.5;
                    t2 = "Джем";
                }
                System.out.println(price);

            }
        });
        vBox.getChildren().addAll(cb1,cb2,cb3);
        vBox.setSpacing(10);


        VBox vBox1 = new VBox();
        CheckBox cb4 = new CheckBox("Ріжок");
        cb4.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                c4++;
                if(c4%2 == 0){
                    price -= 1;
                    t3 = "";
                }
                else {
                    price += 1;
                    t3 = "Ріжок";
                }
                System.out.println(price);

            }
        });
        CheckBox cb5 = new CheckBox("Стаканчик");
        cb5.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                c5++;
                if(c5%2 == 0){
                    price -= 0.5;
                    t3 = "";
                }
                else {
                    price += 0.5;
                    t3 = "Ріжок";
                }
                System.out.println(price);
            }
        });
        CheckBox cb6 = new CheckBox("Брикет");
        cb6.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                c6++;
                if(c6%2 == 0){
                    price -= 0.5;
                    t3 = "";
                }
                else {
                    price += 0.5;
                    t3 = "Брикет";
                }
                System.out.println(price);
            }
        });

        vBox1.getChildren().addAll(cb4,cb5,cb6);
        vBox1.setSpacing(10);

        HBox hBox = new HBox();
        hBox.setSpacing(10);
        hBox.getChildren().addAll(vBox,vBox1);
        VBox v = new VBox();
        v.setSpacing(10);
        v.setAlignment(Pos.TOP_CENTER);
        v.setPadding(new Insets(10,10,10,10));

        ChoiceBox choiceBox = new ChoiceBox(FXCollections.observableArrayList(
                "2.5-5%", "7-10%", "до 15%")
        );
        choiceBox.setMinWidth(160);

        final Label label = new Label();
        label.setText("Кількість порцій: " + num);
        Button button1 = new Button();
        button1.setText("+");
        button1.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                num++;
                label.setText("Кількість порцій: " + num);
            }
        });
        button1.setMinWidth(25);
        Button button2 = new Button();
        button2.setText("-");
        button2.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                num--;
                label.setText("Кількість порцій: " + num);
            }
        });
        button2.setMinWidth(25);
        HBox buttons = new HBox();
        buttons.setSpacing(10);
        buttons.getChildren().addAll(button1,button2);
        buttons.setAlignment(Pos.CENTER);

//        CheckBox stand = new CheckBox("Стандартне.");
//        stand.setOnAction(new EventHandler<ActionEvent>() {
//            public void handle(ActionEvent event) {
//                st++;
//                if(st%2 == 0){
//                    t2 = "";
//                    t3 = "";;
//                    price = 5;
//                }
//                else {
//                    iceCream = factory.createIce(t1);
//                    t1 = iceCream.description;
//                    t2 = iceCream.adds;
//                    t3 = iceCream.form;
//                    price = iceCream.cost;
//                }
//                System.out.println(price);
//
//            }
//        });

        Button button = new Button();
        button.setText("Замовити");
        button.setMinWidth(160);
        button.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                price = price * num;
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
                alert.setTitle("Підтвердіть замовлення!");
                alert.setHeaderText("Кількість порцій: " + num );
                alert.setContentText("Замовлення на суму: "  + price + "грн.");
                alert.showAndWait();
                t4 = "" + price;
                price = price / num;
                addTable();
                num = 0;
                price = 0;
                t1 = t2 = t3 = t4 = "";

            }
        });



        v.getChildren().addAll(cb,hBox,choiceBox,label,buttons,button);




        //Layout
        BorderPane layout = new BorderPane();
        layout.setPadding(new Insets(0,0,0,0));
        layout.setTop(menuBar);
        layout.setCenter(v);
        layout.setStyle("-fx-background-color: green;");
        scene = new Scene(layout, 230, 350);
        window.setScene(scene);
        String styleFile = "Style.css";
        scene.getStylesheets().add(Main.class.getResource(styleFile).toExternalForm());
        window.show();
    }

}
