package model;

public class ClienteNatural extends Cliente {


	private String apellidos;
	private String cedula;
	private String  estrato;


	public ClienteNatural() {
		super();
	}


	public ClienteNatural(String apellidos, String cedula, String estrato) {
		super();
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.estrato = estrato;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getEstrato() {
		return estrato;
	}


	public void setEstrato(String estrato) {
		this.estrato = estrato;
	}




	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedula == null) ? 0 : cedula.hashCode());
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
		ClienteNatural other = (ClienteNatural) obj;
		if (cedula == null) {
			if (other.cedula != null)
				return false;
		} else if (!cedula.equals(other.cedula))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "ClienteNatural [apellidos=" + apellidos + ", cedula=" + cedula + ", estrato=" + estrato + "]";
	}






}
