package junitEjApren03;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


class TestPassword {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	PasswordValidator pv = new PasswordValidator();
	
	@Test
	void testLongitudMinima() {
		assertTrue(pv.longitudMinima("holaaaaaaaaaaaa"));
	}
	
	@Test
	void testNotLongiud() {
		assertFalse(pv.longitudMinima("holaaaa"));
	}
		
	@Test
	void testCaracExpe() {
		assertTrue(pv.caracExpe("!!!!!!!aasasa!!!!!"));
	}
	
	@Test
	void testNotCaracExpe() {
		assertFalse(pv.caracExpe("aasasa"));
	}
	
	@Test
	void testMayus() {
		assertTrue(pv.mayusculas("HOLAAAAAAAAAAAA"));
	}
	
	@Test
	void testNotMayus() {
		assertFalse(pv.mayusculas("holaaaaaaa"));
	}

}
