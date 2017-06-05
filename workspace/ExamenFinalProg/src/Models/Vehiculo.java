package Models;

import java.util.ArrayList;

public  class Vehiculo implements Comparable{
	
	
	private String Matricula;
	private int hora;
	private int minuto;
	protected ArrayList<Vehiculo> listav = new ArrayList<Vehiculo>();
	



	public Vehiculo(String matricula, int hora, int minuto) {
		super();
		Matricula = matricula;
		this.hora = hora;
		this.minuto = minuto;
		this.listav = listav;
	}


	public ArrayList<Vehiculo> getListav() {
		return listav;
	}


	public void setListav(ArrayList<Vehiculo> listav) {
		this.listav = listav;
	}


	public String getMatricula() {
		return Matricula;
	}


	public void setMatricula(String matricula) {
		Matricula = matricula;
	}


	public int getHora() {
		return hora;
	}


	public void setHora(int hora) {
		this.hora = hora;
	}


	public int getMinuto() {
		return minuto;
	}


	public void setMinuto(int minuto) {
		this.minuto = minuto;
	}

public int compareTo(Vehiculo o) {
		
			int p = (int) ((int) getHora()-(o.getHora()));
			
			return p == 0 ? getMinuto()-(o.getMinuto()) : p;
		
	}


@Override
public int compareTo(Object o) {
	// TODO Auto-generated method stub
	return 0;
}


	

}
