package es.endes.iessoterohernandez.daw.PruebaJunit.Ejercicio4;

import org.junit.jupiter.api.DisplayName;
import org.junit.platform.suite.api.*;
import static org.hamcrest.MatcherAssert.*;

import org.hamcrest.CoreMatchers;
@SuppressWarnings("unused")
@Suite
@SelectClasses( { OperadorAritmeticoTest.class, PilaTest.class, SubscripcionTest.class} )
@DisplayName("Suite que ejecuta todos los test")
public class TestSuiteALL extends CoreMatchers{

}
