package controllers;

import application.AplicationEmpresa;
import co.uniquindio.edu.Empresa.model.TipoUsuario;
import co.uniquindio.edu.Empresa.model.Usuario;
import model.Cliente;
import model.ClienteNatural;
import model.Empresa;
import model.Factura;
import model.TipoCliente;

public class Singleton {

	Empresa empresa;
	Factura factura;
	private AplicationEmpresa aplicacion;
	public static  Singleton INSTANCE;
	
	
	private static class SingletonHolder{
		private final static Singleton eInstance = new Singleton();
	}
	
	public static Singleton getInstance(){
		return SingletonHolder.eInstance;
	}

	public Empresa getEmpresa() {
		return empresa;
	}

	public void setEmpresa(Empresa empresa) {
		this.empresa = empresa;
	}

	public AplicationEmpresa getAplicacion() {
		return aplicacion;
	}

	public void setAplicacion(AplicationEmpresa aplicacion) {
		this.aplicacion = aplicacion;
	}
	

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public void inicializarDatos(){
		empresa = new Empresa(null);	
		factura = new Factura();
		empresa.setNombre("Subastas Quindio");
		
		ClienteNatural clienteN= new ClienteNatural();
		Factura facturas = new Factura();
		
		clienteN.setNombre("camila");
		clienteN.setTipoCliente(TipoCliente.NATURAL);
		facturas.setCodigo("123");
		facturas.setFecha("03/03/03");
		facturas.setTotal("1000");
	
		this.empresa.getListaFactura().add(factura);

		System.out.println("Empresa Inicializada "+ empresa.getNombre());
	}
}
