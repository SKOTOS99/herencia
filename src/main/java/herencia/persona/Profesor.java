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
	
	public Profesor(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public Profesor(String nombre, String apellido, String asignatura) {
		super(nombre, apellido);
		this.asignatura = asignatura;
	}
	
	@Override
	public String saludar() {
		String saludar = super.saludar();
		return saludar + " soy profesor " +getNombre();
	}

}
