package herencia.crear;

import herencia.persona.Alumno;
import herencia.persona.AlumnoInternacional;
import herencia.persona.Profesor;

public class EjemploHerencia {
	
	public static void main(String[] args) {
		System.out.println("**********************************");
		Alumno alumno = new Alumno();
		alumno.setNombre("Elias");
		alumno.setApellido("Gomez");
		alumno.setEdad(15);
		alumno.setEmail("eligo@gmail.com");
		alumno.setEscuela("Vazconcelos");
		alumno.setEspañol(7.89);
		alumno.setMatematicas(9.0);
		alumno.setMatricula("123dego");
		System.out.println("**********************************");

		Profesor profesor = new Profesor();
		profesor.setApellido("mendez");
		profesor.setNombre("plutarco");
		profesor.setAsignatura("Matematicas");
		System.out.println("**********************************");

		AlumnoInternacional extra = new AlumnoInternacional();
		extra.setNombre("amir");
		extra.setPais("Belgica");
		System.out.println("**********************************");

		System.out.println(alumno.getNombre());
		System.out.println(profesor.getNombre());
		System.out.println(extra.getPais());
		
		Class clase = extra.getClass();
		while(clase.getSuperclass() != null) {
			String hija = clase.getName();
			String padre = clase.getSuperclass().getName();
			System.out.println(hija + " es una clase hija del padre "+ padre);
			clase = clase.getSuperclass();
			
		}
		
	}

}
