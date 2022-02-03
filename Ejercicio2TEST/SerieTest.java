package PruebaJunit2;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SerieTest {
	private static Serie s,s2;
	
	@BeforeAll
	static void init() {
		s=new Serie();
		s2=new Serie();
	}

	@AfterAll
	static void finish(){
		s=null;
		s2=null;
	}

	@Test
	void testIsEntregado() {
		s.entregar();
		assertTrue(s.isEntregado());
	}

	@Test
	void testCompareTo() {
		s.setnumeroTemporadas(3);
		s2.setnumeroTemporadas(6);
		
		assertEquals(1, s.compareTo(s2));
	}

	

	@Test
	void testEqualsSerie() {
		s.setTitulo("Yo,robot");
		s.setcreador("Will Smith");
		s2.setTitulo("Matrix");
		s2.setcreador("Keanu Reeves");
		
		assertTrue(s.equals(s2));
		
	}

}
