
public class HelpMenu {
	
	public void menu () {
		System.out.println("      ****** BIENVENIDO AL GENERADOR DE CONTRASE�AS 3000 ******\n "
				+ "Esta es la lista de opciones que usted puede utilizar para generar su contrase�a \n "
				+ "-A             Genera contrase�a con mayusculas, minusculas y numeros excluyendo caracteres amb�guos como (i, I, L, l, 1, o, O, 0)\n"
				+ " -U             Genera contrase�a con letras mayusculas \n"
				+ " -L             Genera contrase�a con letras minuscula \n"
				+ " -N             Genera contrase�a con numeros \n"
				+ " -S             Genera contrase�a con simbolos \n"
				+ " -T:            Establece la cantidad de contrase�as que desea generar. Ejemplo: -T:3 Genera un total de 3 contrase�as \n"
				+ " -E:            Excluir s�mbolos suministrados Ejemplo: -E:$% Genera contrase�a sin los caracteres $%  \n"
				+ "-Size:		Establece la cantidad de caracteres que tendra la contrase�a. Ejemplo -Size:8 Genera contrase�a con 8 caracteres. \n"
				+ "-Copy           La contrase�a generada queda copiada en el porta pateles, puede utilizar CTRL + V para pegar la contrase�a \n "
				+ "-? 		Muestra el menu de ayuda\n\n"
				+ "Recuerde puede hacer combinaciones, por ejemplo: Si desea contrase�a con n�meros, letras may�sculas, min�sculas y simbolos puede digitar  \n"
				+ "lo siguente: -N -U -L -S \n\n"
				+ "Si no ingresa alguna de estas opciones se genera una contrasesa -T:1 con 16 caracteres -Size:16 con letras mayusculas -U \n"
				+ "con letras minusculas -L y con numeros -N.\n\n"
				+ "      *************   GRACIAS POR UTILIZAR NUESTRO SERVICIO   *****************");
				
 
		
	}
}
