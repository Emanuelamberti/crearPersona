package com.example.Persona;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PersonaApplication {

	public static void main(String[] args) {

		Persona persona = new Persona();
		
		persona.setEdad(20);
		persona.setNombre("Ezequiel");
		persona.setTelefono(7894456);
		
		persona.edad = 20;
		persona.nombre = "Ezequiel";
		persona.telefono = 7894456;
		
		System.out.println(
				"La persona es: " + persona.nombre + 
				", su edad es: " + persona.edad + 
				", su telefono es: " + persona.telefono);
	}
	
	static class Persona {
		private int edad;
		private String nombre;
		private int telefono;

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		public int edad() {
			return edad;
		}
		
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		
		public String nombre() {
			return nombre;
		}
		
		public void setTelefono(int telefono) {
			this.telefono = telefono;
		}
		
		public int telefono() {
			return telefono;
		}
	}

}
