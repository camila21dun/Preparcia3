package model;

   public abstract class Cliente {

	   private String nombre ;
	   private TipoCliente tipoCliente;
	   private Factura factura;
		
	
	   


	public Cliente() {
		super();
	}





	public Cliente(String nombre, TipoCliente tipoCliente, Factura factura) {
		super();
		this.nombre = nombre;
		this.tipoCliente = tipoCliente;
		this.factura = factura;
	}





	public String getNombre() {
		return nombre;
	}





	public void setNombre(String nombre) {
		this.nombre = nombre;
	}





	public TipoCliente getTipoCliente() {
		return tipoCliente;
	}





	public void setTipoCliente(TipoCliente tipoCliente) {
		this.tipoCliente = tipoCliente;
	}





	public Factura getFactura() {
		return factura;
	}





	public void setFactura(Factura factura) {
		this.factura = factura;
	}





	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", tipoCliente=" + tipoCliente + ", factura=" + factura + "]";
	}

	


}
