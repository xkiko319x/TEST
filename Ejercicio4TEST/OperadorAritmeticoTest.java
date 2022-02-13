package es.endes.iessoterohernandez.daw.PruebaJunit.Ejercicio4;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.*;
import static org.junit.jupiter.api.Assertions.*;
import org.hamcrest.CoreMatchers;


class OperadorAritmeticoTest extends CoreMatchers{

	private static OperadorAritmetico operacion;
	
	@BeforeAll
	static void init () {
		operacion= new OperadorAritmetico();
	}

	@AfterAll
	static void finish () {
		operacion=null;
	}

	@Test
	void testSuma() {
		assertThat("Error", operacion.suma(2, 2),is(4));
	}
	
	
	@Test
	void testDivision() {
		int resul=-1;
		resul=operacion.division(10,2);
		assertThat("Error", resul, is(5));
	}

}
