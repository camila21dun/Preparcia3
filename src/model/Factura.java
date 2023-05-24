package model;

import java.util.Date;

public class Factura {


    private String codigo;
    private Date fecha;
    private String total;
    private ClienteNatural clienteNatural;
    private ClienteJuridico clienteJudidico;



	public Factura() {
		super();
	}



	public Factura(String codigo, Date fecha, String total, ClienteNatural clienteNatural,
			ClienteJuridico clienteJudidico) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.total = total;
		this.clienteNatural = clienteNatural;
		this.clienteJudidico = clienteJudidico;
	}



	public String getCodigo() {
		return codigo;
	}



	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}



	public Date getFecha() {
		return fecha;
	}



	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}



	public String getTotal() {
		return total;
	}



	public void setTotal(String string) {
		this.total = string;
	}



	public ClienteNatural getClienteNatural() {
		return clienteNatural;
	}



	public void setClienteNatural(ClienteNatural clienteNatural) {
		this.clienteNatural = clienteNatural;
	}



	public ClienteJuridico getClienteJudidico() {
		return clienteJudidico;
	}



	public void setClienteJudidico(ClienteJuridico clienteJudidico) {
		this.clienteJudidico = clienteJudidico;
	}



	public void setFecha(String string) {
		// TODO Auto-generated method stub
		
	}





}
