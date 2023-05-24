package controllers;

import java.util.List;

import co.uniquindio.empresa.controllers.ModelFactoryController;
import co.uniquindio.empresa.controllers.ModelFactoryController.SingletonHolder;
import co.uniquindio.empresa.model.Empleado;
import co.uniquindio.empresa.model.Empresa;

public class ModelFactoryController {
	
Empresa empresa = null;
	
	private static class SingletonHolder { 
		// El constructor de Singleton puede ser llamado desde aquí al ser protected
		private final static ModelFactoryController eINSTANCE = new ModelFactoryController();
	}

	// Método para obtener la instancia de nuestra clase
	public static ModelFactoryController getInstance() {
		return SingletonHolder.eINSTANCE;
	}
	
	public ModelFactoryController() {
		System.out.println("invocación clase singleton");
		inicializarDatos();
	}

	private void inicializarDatos() {
		empresa = new Empresa("Uniquindio");
		Empleado empleado = new Empleado("Robinons","234567");
		empresa.getListaEmpleados().add(empleado);
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public Empleado crearEmpleado(Empleado empleado) {

		return empresa.crearEmpleado(empleado);
		
	}

	public List<Empleado> obtenerClientes() {
		// TODO Auto-generated method stub
		return empresa.getListaEmpleados();
	}
	

}
