package cdt.bean;


import java.util.ArrayList;

import cdt.modelo.Cliente;
import cdt.modelo.ClienteDAO;
import jakarta.enterprise.context.RequestScoped;
import jakarta.inject.Named;

@Named("cdt")
@RequestScoped

public class CDTBean {

	private Cliente dto = new Cliente();
	private ArrayList<Cliente> listaCli = ClienteDAO.lista_C;
	
	public CDTBean() {
		
	}

	public Cliente getDto() {
		return dto;
	}

	public void setDto(Cliente dto) {
		this.dto = dto;
	}

	public ArrayList<Cliente> getListaCli() {
		return listaCli;
	}

	public void setListaAs(ArrayList<Cliente> listaCli) {
		this.listaCli = listaCli;
	}
	
	public void registrar() {

	    dto.setGanancia(dto.getInversion()*(dto.getInteres()*(dto.getPlazo()/dto.getAnio())));
	    dto.setValorFuturo(dto.getInversion()+dto.getGanancia());
	    dto.setImpuesto(dto.getGanancia()*0.04);

	    
	    Cliente nuevo = new Cliente();

	    nuevo.setNombres(dto.getNombres());
	    nuevo.setApellidos(dto.getApellidos());
	    nuevo.setTelefono(dto.getTelefono());
	    nuevo.setCorreo(dto.getCorreo());
	    nuevo.setGanancia(dto.getGanancia());
	    nuevo.setValorFuturo(dto.getValorFuturo());
	    nuevo.setImpuesto(dto.getImpuesto());

	    listaCli.add(nuevo);

	    System.out.println("Se registro: " + nuevo.toString());

	   
	    dto = new Cliente();
	}
	
}
