package test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.InputMismatchException;

import javax.swing.JOptionPane;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import model.Funcionario;

class FuncionarioTest {
	static Funcionario funcionario;
	int a;
	int b;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		JOptionPane.showMessageDialog(null, "INICIALIZANDO FUNCIONARIO DEL TEST");
		funcionario = new Funcionario();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		JOptionPane.showMessageDialog(null, "FINALIZANDO EL TEST");
	}

	@BeforeEach
	void setUp() throws Exception {
		a = 0;
		b = 0;
	}

	@AfterEach
	void tearDown() throws Exception {
		JOptionPane.showMessageDialog(null, "El valor de a es : " + a);
		JOptionPane.showMessageDialog(null, "El valor de b es : " + b);

	}

	@Test
	void testMayor() {
		try {
			JOptionPane.showMessageDialog(null, "Test para saber si es mayor");
			a = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para a"));
			b = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para b"));
			assertTrue(funcionario.esMayor(a, b), "a es menor o igual que b");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}

	@Test
	void testIgual() {
		JOptionPane.showMessageDialog(null, "Test para saber si son iguales");
		a = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para b"));
		assertTrue(funcionario.esIgual(a, b), "a es diferente de b");

	}

	@Test
	void testMenor() {
		JOptionPane.showMessageDialog(null, "Test para saber si son menores");
		a = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para b"));
		assertTrue(funcionario.esMenor(a, b), "a es mayor o igual que b");

	}

	@Test
	void test() {
		JOptionPane.showMessageDialog(null, "Test resta");
		a = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para a"));
		b = Integer.parseInt(JOptionPane.showInputDialog("indique un valor numerico para b"));
		JOptionPane.showMessageDialog(null, "La resta es igual a: " + (a - b));
	}

}
