package model;

import java.util.ArrayList;
import java.util.Date;



public class Empresa {

	public String nombre;
	private ArrayList<ClienteNatural >listaClienteNatural = new ArrayList<ClienteNatural>();
	private ArrayList<ClienteJuridico >listaClienteJuridico= new ArrayList<ClienteJuridico>();
	private ArrayList<Factura >listaFactura = new ArrayList<Factura>();
	//private ArrayList<Cliente >listaClientes = new ArrayList<Cliente>();


	public Empresa(String nombre) {
		super();
	}




	 public Empresa(String nombre, ArrayList<ClienteNatural> listaClienteNatural,
			ArrayList<ClienteJuridico> listaClienteJuridico, ArrayList<Factura> listaFactura) {
		super();
		this.nombre = nombre;
		this.listaClienteNatural = listaClienteNatural;
		this.listaClienteJuridico = listaClienteJuridico;
		this.listaFactura = listaFactura;
	}




	public String getNombre() {
		return nombre;
	}




	public void setNombre(String nombre) {
		this.nombre = nombre;
	}




	public ArrayList<ClienteNatural> getListaClienteNatural() {
		return listaClienteNatural;
	}




	public void setListaClienteNatural(ArrayList<ClienteNatural> listaClienteNatural) {
		this.listaClienteNatural = listaClienteNatural;
	}




	public ArrayList<ClienteJuridico> getListaClienteJuridico() {
		return listaClienteJuridico;
	}




	public void setListaClienteJuridico(ArrayList<ClienteJuridico> listaClienteJuridico) {
		this.listaClienteJuridico = listaClienteJuridico;
	}




	public ArrayList<Factura> getListaFactura() {
		return listaFactura;
	}




	public void setListaFactura(ArrayList<Factura> listaFactura) {
		this.listaFactura = listaFactura;
	}




	public void agregarClienteNatural(ClienteNatural cliente) {
	        this.listaClienteNatural.add(cliente);
	    }

	 public void agregarClienteJuridico(ClienteJuridico cliente) {
	        this.listaClienteJuridico.add(cliente);
	    }

	    public Cliente buscarClienteNatural(String cedula) {
	        for (ClienteNatural cliente : listaClienteNatural) {
	            if (cliente.getCedula().equals(cedula)) {
	                return cliente;
	            }
	        }
	        return null;
	    }

	    public Cliente buscarClienteJuridico (String nit) {
	        for (ClienteJuridico cliente : listaClienteJuridico) {
	            if (cliente.getNit().equals(nit)) {
	                return cliente;
	            }
	        }
	        return null;
	    }

	    public void registrarFactura(Factura factura) {
	        this.listaFactura.add(factura);
	    }

	    public boolean existeFacturaNatural(String cedula, Date fecha) {
	        for (Factura factura : listaFactura) {
	            if (factura.getClienteNatural().getCedula().equals(cedula) && factura.getFecha().equals(fecha)) {
	                return true;
	            }
	        }
	        return false;
	    }


	    public boolean existeFacturaJuridico(String nit, Date fecha) {
	        for (Factura factura : listaFactura) {
	            if (factura.getClienteJudidico().getNit().equals(nit) && factura.getFecha().equals(fecha)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public Factura obtenerFactura(String codigo){

	    	Factura factura=null;
	    	for (Factura facturaAux : listaFactura) {
				if (facturaAux.getCodigo().equals(codigo)){
					factura=facturaAux;
				}

			}
	    	if (factura == null){
	    		System.out.println("factura no encontrada");
	    	}
	    	return factura;

	    }




}
