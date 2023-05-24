package application;

import java.io.IOException;


import controllers.ControladorVentanaPrincipal;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Empresa;

public class AplicationEmpresa extends Application {

	private Empresa miEmpresa = new Empresa("MI EMPRESA");
	private Stage primaryStage;

	@Override
	public void start(Stage primaryStage) {

		this.primaryStage = primaryStage;
		this.primaryStage.setTitle("Prestamo de Objetos");
		mostrarVentanaPrincipal();

	}

	private void mostrarVentanaPrincipal() {

		try {
			FXMLLoader loader = new FXMLLoader();
			loader.setLocation(Application.class.getResource("/co/uniquindio/empresa/views/GestionEmpleados.fxml"));

			AnchorPane rootLayout = (AnchorPane)loader.load();

			ControladorVentanaPrincipal ventanaPrincipal = loader.getController();
			ControladorVentanaPrincipal.setApplication(this);


			Scene scene = new Scene(rootLayout);
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		launch(args);
	}
}


