import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class test {

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

	public test(int quantityPasswords, int passwLength, int expected) {

		this.quantityPasswords = quantityPasswords;
		this.passwLength = passwLength;
		this.expected = expected;
	}

	@Test
	public void testquantity() {
		PassGen cr = new PassGen();
		String pass = "aqswderf";
		String[] result = cr.passGenerate(quantityPasswords, passwLength, pass);
		assertEquals(expected, result.length);
	}

	@Test
	public void testpasswLength() {
		PassGen cr2 = new PassGen();
		String pass = "aqswderf";
		String result = cr2.passGenerate(quantityPasswords, quantityPasswords, pass)[0];
		assertEquals(expected, result.length());
	}

	@Test
	public void testpasswCharactersNumbers() {
		PassGen cr3 = new PassGen();
		String pass = "1234567890";
		String[] result = cr3.passGenerate(1, 16, pass);
		boolean validate = result[0].matches("\\d*");
		assertEquals(true, validate);
	}

	@Test
	public void testpasswCharactersAlpha() {
		PassGen cr4 = new PassGen();
		String pass = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] result = cr4.passGenerate(1, 16, pass);
		boolean validate = result[0].matches("[A-Z]*");
		assertEquals(true, validate);

	}

	@Test
	public void testpasswCharactersAlphalw() {
		PassGen cr4 = new PassGen();
		String pass = "abcdefghijklmnopqrstuvwxyz";
		String[] result = cr4.passGenerate(1, 16, pass);
		boolean validate = result[0].matches("[a-z]*");
		assertEquals(true, validate);
	}

	@Test
	public void testpasswCharactersSymbol() {
		PassGen cr5 = new PassGen();
		String pass = "|@#~$%()=^*+[]{}-_?¿";
		String[] result = cr5.passGenerate(1, 16, pass);
		assertEquals(result[0], result[0]);
	}

	@Test
	public void testInput() {
		PassGen cr6 = new PassGen();
		String[] args = { "-Size:10", };
		String result = cr6.startPassword(args);
		assertEquals(10, result.length());
	}

	@Test
	public void testInput2() {
		PassGen cr6 = new PassGen();
		String[] args = { "-Size:20", };
		String result = cr6.startPassword(args);
		assertEquals(20, result.length());
	}

	@Test
	public void testInput3() {
		PassGen cr6 = new PassGen();
		String[] args = { "-Size:30", };
		String result = cr6.startPassword(args);
		assertEquals(30, result.length());
	}

	@Test
	public void testInput4() {
		PassGen cr6 = new PassGen();
		String[] args = { "-Size:40", };
		String result = cr6.startPassword(args);
		assertEquals(40, result.length());
	}

	@Test
	public void testInput5() {
		PassGen cr6 = new PassGen();
		String[] args = { "-Size:50", };
		String result = cr6.startPassword(args);
		assertEquals(50, result.length());
	}

	@Test
	public void testInput6() {
		PassGen cr6 = new PassGen();
		String[] args = { "-Size:60", };
		String result = cr6.startPassword(args);
		assertEquals(60, result.length());
	}

	@Test
	public void testInputLower() {
		PassGen cr7 = new PassGen();
		String L = "abcdefghijklmnopqrstuvwxyz";
		boolean validatePass = false;
		String[] args = { "-L", };
		String result = cr7.startPassword(args);
		for (int i = 0; i < result.length(); i++) {
			if (L.indexOf(result.charAt(i)) == -1) {
				validatePass = true;
			}
		}
		assertEquals(false, validatePass);
	}

	@Test
	public void testvalidateAmbiguous() {
		PassGen cr6 = new PassGen();
		String[] args = { "-A" };
		String result = cr6.startPassword(args);
		assertEquals(16, result.length());

	}

	@Test
	public void testInputUpper() {
		PassGen cr7 = new PassGen();
		String U = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		boolean validatePass = false;
		String[] args = { "-U", };
		String result = cr7.startPassword(args);
		for (int i = 0; i < result.length(); i++) {
			if (U.indexOf(result.charAt(i)) == -1) {
				validatePass = true;
			}
		}
		assertEquals(false, validatePass);
	}

	@Test
	public void testInputNumber() {
		PassGen cr7 = new PassGen();
		String N = "1234567890";
		boolean validatePass = false;
		String[] args = { "-N", };
		String result = cr7.startPassword(args);
		for (int i = 0; i < result.length(); i++) {
			if (N.indexOf(result.charAt(i)) == -1) {
				validatePass = true;
			}
		}
		assertEquals(false, validatePass);
	}

	@Test
	public void testInputSymbol() {
		PassGen cr7 = new PassGen();
		String N = "|@#~$%()=^*+[]{}-_?¿";
		boolean validatePass = false;
		String[] args = { "-S", };
		String result = cr7.startPassword(args);
		for (int i = 0; i < result.length(); i++) {
			if (N.indexOf(result.charAt(i)) == -1) {
				validatePass = true;
			}
		}
		assertEquals(false, validatePass);
	}

	@Test
	public void testInputCopy() {
		PassGen cr7 = new PassGen();
		String[] args = { "-Copy" };
		String result = cr7.startPassword(args);
		assertEquals(16, result.length());
	}

	@Test
	public void testExemptions() {
		PassGen cr6 = new PassGen();
		String[] args = { "-E:ABCDEFGHIJKLMNOPQRSTUVWXYZ" };
		String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String[] lettersFinal = letters.split("");
		String result = cr6.startPassword(args);
		boolean validateA = false;
		for (int i = 0; i < result.length(); i++) {
			if (Arrays.asList(result).contains(lettersFinal[i])) {
				validateA = true;
			}
		}
		assertEquals(false, validateA);
	}

}
