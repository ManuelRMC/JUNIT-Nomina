/**
 * 
 */
package controladores;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

/**
 * 
 */
class gestorNominaTest {

	@Test
	void test1() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(0, 0, 0);
		assertEquals(0, resultado);
	}
	@Test
	void test2a() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(-1, 0, 0);
		assertEquals(-1, resultado);
	}
	@Test
	void test2b() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(0, -1, 0);
		assertEquals(-1, resultado);
	}
	@Test
	void test2c() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(0, 0, -1);
		assertEquals(-1, resultado);
	}
	@Test
	void test3a() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(1200, 2, 4);
		assertEquals(1278, resultado); 
	}
	@Test
	void test3b() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(1200, 2, 12);
		assertEquals(1440, resultado);
	}
	@Test
	void test4() {
		gestorNomina ini = new gestorNomina();
		double resultado = ini.calcularSalarioNeto(3000, 0, 0);
		assertEquals(2550, resultado);
	}
}
