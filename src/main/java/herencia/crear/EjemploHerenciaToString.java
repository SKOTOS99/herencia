package herencia.crear;

import herencia.persona.Alumno;
import herencia.persona.AlumnoInternacional;
import herencia.persona.Persona;
import herencia.persona.Profesor;

public class EjemploHerenciaToString {
	
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
		System.out.println(persona);
	}
	
	
	

}
