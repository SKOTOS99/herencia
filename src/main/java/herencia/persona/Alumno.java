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
	

}
