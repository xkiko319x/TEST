import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class ShoppingCartTest {

	private static ShoppingCart carrito;
	private static Product p,p2;
	@BeforeAll
	static void init() {
		carrito=new ShoppingCart();
		p=new Product("Producto",2.45);
		p2=new Product("Producto2",6.89);
		
	}

	@AfterAll
	static void finish(){
		carrito=null;
	}

	@Test
	void testShoppingCart() {
		assertEquals(0, carrito.getItemCount());
	}

	@Test
	void testGetItemCount() {
		assertEquals(0,carrito.getItemCount());
	}

	@Test
	void testEmpty() {
		carrito.addItem(p);
		carrito.empty();
		assertEquals(0,carrito.getItemCount());
	}

}
