package es.endes.iessoterohernandez.daw.PruebaJunit.Ejercicio4;

import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.Test;

class PilaTest extends CoreMatchers{



	@Test
	void testPush() {
		Pila pila =new Pila();
		pila.push(10);
		assertThat("Error",pila.top(), nullValue());
	}

	@Test
	void testPop() {
		Pila pila =new Pila();
		pila.push(10);
		assertThat("Error", pila.pop(),is(10));
		assertThat("Error", pila.isEmpty(), is(true));
	}

	@Test
	void testIsEmpty() {
		Pila pila =new Pila();
		pila.push(50);
		assertThat("Error", pila.isEmpty(), is(true));
	}

	@Test
	void testTop() {
		Pila pila =new Pila();
		pila.push(3);
		pila.push(2);
		pila.push(10);
		pila.push(7);
		assertThat("Error", pila.top(), is(10));
		
	}

}
