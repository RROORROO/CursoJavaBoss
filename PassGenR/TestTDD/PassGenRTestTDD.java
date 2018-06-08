import static org.junit.Assert.*;


import java.util.ArrayList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(value = Parameterized.class)
public class PassGenRTestTDD {
	
	@Parameters
	public static Iterable<Object[]> getData(){
		java.util.List<Object[]> obj = new ArrayList<>();
		obj.add(new Object[] {1,4,1});
		obj.add(new Object[] {2,4,2});
		obj.add(new Object[] {3,4,3});
		obj.add(new Object[] {4,4,4});
		obj.add(new Object[] {5,4,5});
		obj.add(new Object[] {6,4,6});
		obj.add(new Object[] {7,4,7});
		obj.add(new Object[] {8,4,8});
		obj.add(new Object[] {9,4,9});
		obj.add(new Object[] {10,4,10});
		return obj;
	}
	private int a,b,exp; 
	
	public PassGenRTestTDD(int a, int b, int exp) {
		
		this.a=a;
		this.b=b;
		this.exp=exp;
		// TODO Auto-generated constructor stub
	}
	
	@Test
	public void test() {
		PassGenR cr = new PassGenR();
		String pass="aqswderf";
		 String[] result = cr.passGenerateR(a, b, pass);
		assertEquals(exp, result.length);
	}

}
