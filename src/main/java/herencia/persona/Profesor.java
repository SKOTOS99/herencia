package herencia.persona;

public class Profesor extends Persona{
	
	private String asignatura;

	public String getAsignatura() {
		return asignatura;
	}

	public void setAsignatura(String asignatura) {
		this.asignatura = asignatura;
	}
	
	public Profesor() 
	{
		System.out.println("iniciando profesor constructor...");
	}

}
