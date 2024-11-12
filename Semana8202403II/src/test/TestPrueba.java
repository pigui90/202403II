package test;

import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestPrueba {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo que se ejecuta una sola vez de primero");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo que se ejecuta una sola vez de ultimo");
		JOptionPane.showMessageDialog(null, "Fin");
	}

	@BeforeEach
	void setUp() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo que se ejecuta antes de cada test/prueba");

	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "Metodo que se ejecutas despues de cada test/prueba");
	}

	@Test
	void test() {
		JOptionPane.showMessageDialog(null, "Prueba del metodo llamado test");
		fail("No se ha implementado");
	}
	
	@Test
	void prueba2() {
		JOptionPane.showMessageDialog(null, "Prueba del metodo llamado prueba2");
		fail("Fallo de nuevo");
	}

}
