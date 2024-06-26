package herencia.persona;

public class AlumnoInternacional extends Alumno{
	
	private String pais;
	private double idioma;
	
	
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public double getIdioma() {
		return idioma;
	}
	public void setIdioma(double idioma) {
		this.idioma = idioma;
	}
	
	public AlumnoInternacional() {
		System.out.println("iniciando alumno extrangero...");
	}
	
	public AlumnoInternacional(String nombre, String apellido) {
		super(nombre, apellido);
	}
	
	public AlumnoInternacional(String nombre, String apellido, String pais) {
		super(nombre, apellido);
		this.pais = pais;
	}
	
	@Override
	public String saludar() {
		String saludar = super.saludar();
		return saludar + " soy alumno de "+ getPais();
	}
	@Override
	public String toString() {
		return super.toString()+"\npais= " + pais + "\nidioma= " + idioma + "\n";
	}
	
	
	

}
