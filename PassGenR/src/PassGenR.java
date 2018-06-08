import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;

public class PassGenR {

	public String[] passGenerateR(int quantity, int pass, String generate) {
		String pswd = "";
		String[] newPswd = new String[quantity];
		int numRan = 0;
		while (quantity > 0) {
			String[] arraygenerate = generate.split("");
			for (int i = 0; i < pass; i++) {
				numRan = ((int) (Math.random() * arraygenerate.length - 1) + 0);
				pswd = pswd + arraygenerate[numRan];
			}
			if (validatePass(pswd)) {
			}
			newPswd[quantity - 1] = pswd;
			pswd = "";
			quantity--;
		}
		return newPswd;
	}

	private boolean validatePass(String pswd) {
		if (pswd.matches("^(?=\\w*[0-9])(?=\\w*[A-Z])(?=\\w*[a-z])\\S{1,}$"))
			return true;
		return false;
	}//

	public void board(String Pass) {

		StringSelection selection = new StringSelection(Pass);
		Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
		clipboard.setContents(selection, selection);
	}

	private static int capture(String values) {
		String[] joined = values.split(":");
		return Integer.parseInt(joined[1]);
	}

	public static void main(String[] args) {
		PassGenR cr = new PassGenR();
		HelpMenu ls = new HelpMenu();
		String U = "ABCDEFGHIJKLNMOPQRSTUVWXYZ";
		String L = "abcdefghijklmnopqrstuvwxyz";
		String S = "|@#~$%()=^*+[]{}-_?¿";
		String N = "1234567890";
		String A = "ABCDEFGHJKNMPQRSTUVWXYZabcdefghjkmnpqrstuvwxyz23456789";
		boolean menu = false;
		int length = 16;
		int totalPass = 1;
		boolean itContains = false;
		String generating = "";
		for (int i = 0; i < args.length; i++) {
			if (args[i].indexOf("-Size:") != -1) {
				length = capture(args[i]);
			} else if (args[i].indexOf("-T:") != -1) {
				totalPass = capture(args[i]);
			} else if (args[i].indexOf("-Copy") != -1) {
				itContains = true;
			} else if (args[i].indexOf("-?") != -1) {
				ls.menu(null);
				menu = true;
			} else if (args[i].indexOf("-U") != -1) {
				generating += U;
			} else if (args[i].indexOf("-L") != -1) {
				generating += L;
			} else if (args[i].indexOf("-N") != -1) {
				generating += N;
			} else if (args[i].indexOf("-S") != -1) {
				generating += S;
			} else if (args[i].indexOf("-A") != -1) {
				generating += A;
			}
		} 
		if (menu== false ) {
			if (generating.length() == 0) {
				generating = N + U + L;
			}
			String[] newResultPass = cr.passGenerateR(totalPass, length, generating);
			for (int i = 0; i < newResultPass.length; i++) {
				System.out.println(newResultPass[i]);
				if (itContains == true) {
					cr.board(newResultPass[i]);
				
				}
			}
		}

	}
}