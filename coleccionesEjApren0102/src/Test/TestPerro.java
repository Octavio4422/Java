package Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.*;

import Services.PerroService;


class TestPerro {

	PerroService sc = new PerroService();
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		sc.getListaPerritos().add("perro");
		sc.getListaPerritos().add("chihuhua");
		sc.getListaPerritos().add("caniche");
	}

	@AfterEach
	void tearDown() throws Exception {
	}

//	@Test
//	void testAgregarRaza() {
//		assertNotNull(sc.agregarRaza());
//	}
	
	@Test 
	void testEliminarRaza() {
		ArrayList<String> expected = new ArrayList<>();
		expected.add("caniche");
		expected.add("chihuhua");
		assertEquals(expected,sc.eliminarRaza("perro"));
		
	}

}
