import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class PassGenRTestTDD {

	@Parameters
	public static Iterable<Object[]> getData() {

		java.util.List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] { 1, 4, 1 });
		obj.add(new Object[] { 2, 4, 2 });
		obj.add(new Object[] { 3, 4, 3 });
		obj.add(new Object[] { 4, 4, 4 });
		obj.add(new Object[] { 10, 4, 10 });
		obj.add(new Object[] { 20, 4, 20 });
		obj.add(new Object[] { 30, 4, 30 });
		obj.add(new Object[] { 40, 4, 40 });
		obj.add(new Object[] { 50, 4, 50 });
		obj.add(new Object[] { 100, 4, 100 });
		obj.add(new Object[] { 200, 4, 200 });
		obj.add(new Object[] { 300, 4, 300 });
		obj.add(new Object[] { 400, 4, 400 });
		obj.add(new Object[] { 500, 4, 500 });
		obj.add(new Object[] { 600, 4, 600 });
		obj.add(new Object[] { 700, 4, 700 });
		obj.add(new Object[] { 800, 4, 800 });
		obj.add(new Object[] { 900, 4, 900 });
	
		return obj;
	}

	private int quantityPasswords, passwLength, expected; 
	public PassGenRTestTDD(int quantityPasswords, int passwLength, int expected) {

		this.quantityPasswords = quantityPasswords;
		this.passwLength = passwLength;
		this.expected = expected;
	}

	@Test
	public void testquantity() {
		PassGenR cr = new PassGenR();
		String pass = "aqswderf";
		String[] result = cr.passGenerateR(quantityPasswords, passwLength, pass);
		assertEquals(expected, result.length);
	}
	@Test
	public void testpasswLength() {
		PassGenR cr2 = new PassGenR();
		String pass = "aqswderf";
		String result = cr2.passGenerateR(quantityPasswords, quantityPasswords, pass)[0];
		assertEquals(expected, result.length());
	}
	@Test
	public void testpasswCharactersNumbers() {
		PassGenR cr3 = new PassGenR();
		String pass = "1234567890";
		String[] result = cr3.passGenerateR(1, 16, pass);
		boolean validate = result[0].matches("\\d*");
		assertEquals(true, validate );
	}
	@Test
	public void testpasswCharactersAlpha() {
		PassGenR cr4 = new PassGenR();
		String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] result = cr4.passGenerateR(1, 16, pass);
		boolean validate = result[0].matches("[A-Z]*");
		assertEquals(true, validate );

	}
	@Test
	public void testpasswCharactersAlphalw() {
		PassGenR cr4 = new PassGenR();
		String pass = "abcdefghijklmnopqrstuvwxyz";
		String[] result = cr4.passGenerateR(1, 16, pass);
		boolean validate = result[0].matches("[a-z]*");
		assertEquals(true, validate );
	}
	@Test
	public void testpasswCharactersSymbol() {
		PassGenR cr5 = new PassGenR();
		String pass = "|@#~$%()=^*+[]{}-_?¿";
		String[] result = cr5.passGenerateR(1, 16, pass);
		assertEquals(result[0], result[0]);
	}
}
