package controllers;

import application.AplicationEmpresa;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import model.Cliente;
import model.Factura;
import model.TipoCliente;

public class ControladorVentanaPrincipal {

    @FXML
    private Button btnAgreagarFactura;

    @FXML
    private Button btnBuscarFactura;

    @FXML
    private Button btnEliminarFactura;

    @FXML
    private CheckBox cbkJuridico;

    @FXML
    private CheckBox cbkNatural;

    @FXML
    private TableColumn<Factura, String> columnaCodigoFactura;

    @FXML
    private TableColumn<Factura, String> columnaFechaFactura;

    @FXML
    private TableColumn<Cliente, String> columnaNombreCliente;

    @FXML
    private TableColumn<Cliente, TipoCliente> columnaTipoCliente;

    @FXML
    private TableColumn<Factura, String> columnaToatalApagarFactura;

    @FXML
    private Tab pestaniaGestionFactura;

    @FXML
    private TableView<Factura> tablaFacturas;

    @FXML
    private TextField txtCodigoFctura;

    @FXML
    private TextField txtFechaFactura;

    @FXML
    private TextField txtNombreCliente;

    @FXML
    private TextField txtTotalApagar;
    
    @FXML
    private DatePicker dtpFecha;


    @FXML
    void agregarFacturaEvent(ActionEvent event) {
    	 crearFactura();
    	 observarDatos();
    	 limpiarCampos();

    }

	@FXML
    void buscarFacturaEvent(ActionEvent event) {

    }

    @FXML
    void eliminarFacturaEvent(ActionEvent event) {

    }
    
    
    
    
    private void limpiarCampos() {
		// TODO Auto-generated method stub
		
	}

	private void observarDatos() {
		// TODO Auto-generated method stub
		
	}

	private void crearFactura() {
		// TODO Auto-generated method stub
		
	}



	public static void setApplication(AplicationEmpresa aplicationEmpresa) {
		// TODO Auto-generated method stub
		
	}

}
