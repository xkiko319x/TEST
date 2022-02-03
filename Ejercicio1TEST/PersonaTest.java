package com.mycompany.pruebajunit1;

import static org.junit.jupiter.api.Assertions.*;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PersonaTest extends CoreMatchers{
	private static Persona p;
	@BeforeAll
	static void init() {
		 p=new Persona();
	}
	
	@Test
	void testCalcularIMC() {
		p.setAltura(1.90);
		p.setEdad(21);
		p.setNombre("Kiko");
		p.setPeso(51.8);
		
		assertEquals(1, p.calcularIMC());
	}

	@Test
	void testEsMayorDeEdad() {
		p.setEdad(17);
		assertFalse(p.esMayorDeEdad());
	}

	@Test
	void testToString() {
		p.setAltura(1.90);
		p.setEdad(21);
		p.setNombre("Kiko");
		p.setPeso(51.8);
		
		assertNotEquals(null,p);
	}

}
