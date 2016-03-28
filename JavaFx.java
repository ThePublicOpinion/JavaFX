import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;

public class JavaFx extends Application{

	@Override
	public void start(Stage primaryStage) {
		String UsernameTrue = "Jonathan";
		String PasswordTrue = "Margulies";
		primaryStage.setTitle("User Authentication");
		primaryStage.show();
		Label UsernameLabel = new Label("Username");
		Label PasswordLabel = new Label("Password");
		TextField UsernameTxtFld = new TextField();
		PasswordField PasswordTxtFld = new PasswordField();

		Button LoginButton = new Button("Log in");
		LoginButton.setOnAction(new EventHandler<ActionEvent>() {
			String UsernameInput = "";
			String PasswordInput = "";

			@Override
			public void handle(ActionEvent arg0) {
				UsernameInput = UsernameTxtFld.getText();
				PasswordInput = PasswordTxtFld.getText();
				String[] AccountTypes = {"Administrator", "Guest"};
				if(UsernameTrue.equals(UsernameInput) && PasswordTrue.equals(PasswordInput)) {
					int Selection = {int}JOptionPane.showInputDialog(null, "Please choose an account type", "Account Type Options", JOptionPane.PLAIN_MESSAGE, null, AccountTypes, AccountTypes[1]);		
				} else {
					JOptionPane.showMessageDialog(null, "Invalid Username or Password!");
				}

			}
		});

		GridPane Grid = new GridPane();
		Grid.setAlignment(Pos.CENTER);
		Grid.setVgap(10);
		Grid.setHgap(10);
		Grid.add(UsernameLabel,0,0);
		Grid.add(PasswordLabel,0,1);
		Grid.add(UsernameTxtFld,1,0);
		Grid.add(PasswordTxtFld,1,1);
		Grid.add(LoginButton,1,2);
	}
}
		
