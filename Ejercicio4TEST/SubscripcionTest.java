package es.endes.iessoterohernandez.daw.PruebaJunit.Ejercicio4;

import org.hamcrest.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;

class SubscripcionTest extends CoreMatchers {

	private static Subscripcion sub;
	@BeforeAll
	static void init () {
		sub= new Subscripcion(30, 10);
	}

	@AfterAll
	static void finish () {
		sub= null;
	}

	@Test
	void testSubscripcion() {
		assertThat("Error", sub, notNullValue());
	}

	@Test
	void testPrecioPorMes() {
		double precio=-1;
		precio=Math.round(sub.precioPorMes());
		double esperado=10;
		assertThat("Error", precio, is(esperado));
	}

	@Test
	void testCancel() {
		sub.cancel();
		double esperado =0;
		assertThat("Error", sub.precioPorMes(), is(esperado));

	}

}
