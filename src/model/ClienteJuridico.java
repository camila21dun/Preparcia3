package model;

public class ClienteJuridico extends Cliente{


	private String nit;
	private String telefono ;
	private TipoEmpresa tipo;
	//private String tipoEmpresa;
	private String tipoCliente;

	public ClienteJuridico() {
		super();
	}


	public ClienteJuridico(String nit, String telefono, TipoEmpresa tipo, String tipoCliente) {
		super();
		this.nit = nit;
		this.telefono = telefono;
		this.tipo = tipo ;
	}


	public String getNit() {
		return nit;
	}


	public void setNit(String nit) {
		this.nit = nit;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}


	public TipoEmpresa getTipoEmpresa() {
		return tipo;
	}


	public void setTipoEmpresa(TipoEmpresa tipo) {
		this.tipo= tipo;
	}





	public String getTipoCliente() {
		return tipoCliente;
	}


	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nit == null) ? 0 : nit.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ClienteJuridico other = (ClienteJuridico) obj;
		if (nit == null) {
			if (other.nit != null)
				return false;
		} else if (!nit.equals(other.nit))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ClienteJuridico [nit=" + nit + ", telefono=" + telefono + ", tipoEmpresa= ]";
	}









}
