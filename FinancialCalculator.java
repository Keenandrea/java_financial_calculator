package financial_calculator;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class FinancialCalculator extends Application 
{

public static void main(String[] args) 
{
	Application.launch(args);
}

public void start(Stage appie) throws Exception 
{

//sets layout of the application
GridPane gPane = new GridPane(); 
gPane.setAlignment(Pos.CENTER);
gPane.setHgap(2);
gPane.setVgap(4);

	
	//unit of column 1, row 1 
	Label label1 = new Label
	("Investment Amount: "); 
	gPane.add(label1, 0, 0);
	//unit of column 2, row 1
	TextField tf1 = new TextField();
	tf1.setPrefWidth(150);
	tf1.setAlignment(Pos.CENTER_RIGHT);
	gPane.add(tf1, 1, 0);
	
	
		//unit of column 1, row 2 
		Label label2 = new Label
		("Number of Years: "); 
		gPane.add(label2, 0, 1);
		//unit of column 2, row 2
		TextField tf2 = new TextField();
		tf2.setPrefWidth(150);
		tf2.setAlignment(Pos.CENTER_RIGHT);
		gPane.add(tf2, 1, 1);
	
			
			//unit of column 1, row 3 
			Label label3 = new Label
			("Annual Interest Rate: "); 
			gPane.add(label3, 0, 2);
			//unit of column 2, row 3
			TextField tf3 = new TextField();
			tf3.setPrefWidth(150);
			tf3.setAlignment(Pos.CENTER_RIGHT);
			gPane.add(tf3, 1, 2);
	
				
				//unit of column 1, row 4 
				Label label4 = new Label
				("Future Value: "); 
				gPane.add(label4, 0, 3);
				//unit of column 2, row 4
				TextField tf4 = new TextField();
				tf4.setPrefWidth(150);
				tf4.setAlignment(Pos.CENTER_RIGHT);
				gPane.add(tf4, 1, 3);
				//user cannot edit val
				tf4.setEditable(false);
				
				
					//unit of column 2, row 5
					VBox vbox = new VBox();
					Button btCalc = new Button("Calculate");
					vbox.getChildren().addAll(btCalc);
					vbox.setAlignment(Pos.CENTER_RIGHT);
					gPane.add(vbox, 1, 4); 
	

//builds a window for the application					
Scene scene = new Scene(gPane, 350, 350);
appie.setTitle("Financial Calculator");
appie.setScene(scene);
appie.show();
	
//button functionality
btCalc.setOnAction(e -> 
{
tf4.setText(Double.parseDouble(tf1.getText()) 
		* Math.pow((1 + Double.parseDouble(tf3.getText()) / 1200)
		, Double.parseDouble(tf2.getText()) * 12) + "");
});
	
	
	
}
}
