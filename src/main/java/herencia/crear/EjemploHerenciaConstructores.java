package herencia.crear;

import herencia.persona.Alumno;
import herencia.persona.AlumnoInternacional;
import herencia.persona.Persona;
import herencia.persona.Profesor;

public class EjemploHerenciaConstructores {
	
	public static void main(String[] args) {
	
		
		Alumno alumno = new Alumno("Juan", "Mendez", 12, "tenochtitlan");
		alumno.setEmail("eligo@gmail.com");
		alumno.setEspañol(7.89);
		alumno.setMatematicas(9.0);
		alumno.setMatricula("123dego");
		imprimir(alumno);
		
		Profesor profesor = new Profesor("Octavio", "lama", "Historia");
		profesor.setEdad(34);
		imprimir(profesor);
		AlumnoInternacional alumInter = new AlumnoInternacional("Georgio", "turilli", "Italia");
		alumInter.setEdad(23);
		imprimir(alumInter);
		
	}
	
	public static void imprimir(Persona persona) {
		StringBuilder st = new StringBuilder();
		st.append("Nombre: ").append(persona.getNombre())
				.append("\n")
				.append("Apellido: ").append(persona.getApellido())
				.append("\n").append("Edad: ").append(persona.getEdad())
				.append("\n");
				
		if(persona instanceof Alumno) {
			st.append("Escuela: ").append(((Alumno) persona).getEscuela()).append("\n");
		}
		if(persona instanceof AlumnoInternacional) {
			st.append("Pais: ").append(((AlumnoInternacional) persona).getPais()).append("\n")
			.append("Idioma: ").append(((AlumnoInternacional) persona).getIdioma()).append("\n");
		}
		if(persona instanceof Profesor) {
			st.append("Asignatura: ").append( ((Profesor) persona).getAsignatura()).append("\n");
		}
		st.append("\n")
		.append("****************");		
		System.out.println(st.toString());
	}
	

}
