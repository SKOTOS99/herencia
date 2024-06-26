package herencia.persona;

public class Alumno extends Persona{
	
	private String escuela;
	private String matricula;
	private Double matematicas;
	private Double español;
	
	
	public String getEscuela() {
		return escuela;
	}
	public void setEscuela(String escuela) {
		this.escuela = escuela;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public Double getMatematicas() {
		return matematicas;
	}
	public void setMatematicas(Double matematicas) {
		this.matematicas = matematicas;
	}
	public Double getEspañol() {
		return español;
	}
	public void setEspañol(Double español) {
		this.español = español;
	}
	
	public Alumno() {
		System.out.println("init alumno constructor ...");
	}
	
	public Alumno(String nombre, String apellido) {
		super(nombre, apellido);//con super instaciamos el constructor del padre
	}
	
	public Alumno(String nombre, String apellido, int edad) {
		super(nombre, apellido, edad);//con super instaciamos el constructor del padre
	}
	
	public Alumno(String nombre, String apellido, int edad, String escuela) {
		super(nombre, apellido, edad);//con super instaciamos el constructor del padre
		this.escuela = escuela;
	}
	public Alumno(String nombre, String apellido, int edad,String escuela, String matricula, Double matematicas, Double español) {
		this(nombre, apellido, edad,escuela);
		this.matricula = matricula;
		this.matematicas = matematicas;
		this.español = español;
	}
	
	@Override
	public String saludar() {
		String saludar = super.saludar();
		return saludar + " soy alumno "+ getNombre();
	}
	@Override
	public String toString() {
		return super.toString() + "\nescuela= " + escuela + "\nmatricula=" + matricula + " \nmatematicas=" + matematicas + " \nespañol="
				+ español + this.saludar() + "\n";
	}
	

}
