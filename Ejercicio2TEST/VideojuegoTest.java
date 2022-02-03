package PruebaJunit2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VideojuegoTest {

	private static Videojuego j,j2;
	@BeforeAll
	static void init() {
		j=new Videojuego();
		j2=new Videojuego();
	}

	@AfterAll
	static void finish() {
		j=null;
		j2=null;
	}

	@Test
	void testIsEntregado() {
		j.entregar();
		assertTrue(j.isEntregado());
	}

	@Test
	void testCompareTo() {
		j.setHorasEstimadas(23);
		j2.setHorasEstimadas(23);
		
		equals(j.equals(j2));
	}

	@Test
	void testEqualsVideojuego() {
		j.setcompañia("EA");
		j2.setcompañia("EA");
		j.setTitulo("FIFA");
		j2.setTitulo("FIFA");
		
		assertTrue(j.equals(j2));
	}

}
