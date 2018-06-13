
public class HelpMenu {
	
	public void menu () {
		System.out.println("      ****** BIENVENIDO AL GENERADOR DE CONTRASEÑAS 3000 ******\n "
				+ "Esta es la lista de opciones que usted puede utilizar para generar su contraseña \n "
				+ "-A             Genera contraseña con mayusculas, minusculas y numeros excluyendo caracteres ambíguos como (i, I, L, l, 1, o, O, 0)\n"
				+ " -U             Genera contraseña con letras mayusculas \n"
				+ " -L             Genera contraseña con letras minuscula \n"
				+ " -N             Genera contraseña con numeros \n"
				+ " -S             Genera contraseña con simbolos \n"
				+ " -T:            Establece la cantidad de contraseñas que desea generar. Ejemplo: -T:3 Genera un total de 3 contraseñas \n"
				+ " -E:            Excluir símbolos suministrados Ejemplo: -E:$% Genera contraseña sin los caracteres $%  \n"
				+ "-Size:		Establece la cantidad de caracteres que tendra la contraseña. Ejemplo -Size:8 Genera contraseña con 8 caracteres. \n"
				+ "-Copy           La contraseña generada queda copiada en el porta pateles, puede utilizar CTRL + V para pegar la contraseña \n "
				+ "-? 		Muestra el menu de ayuda\n\n"
				+ "Recuerde puede hacer combinaciones, por ejemplo: Si desea contraseña con números, letras mayúsculas, minúsculas y simbolos puede digitar  \n"
				+ "lo siguente: -N -U -L -S \n\n"
				+ "Si no ingresa alguna de estas opciones se genera una contrasesa -T:1 con 16 caracteres -Size:16 con letras mayusculas -U \n"
				+ "con letras minusculas -L y con numeros -N.\n\n"
				+ "      *************   GRACIAS POR UTILIZAR NUESTRO SERVICIO   *****************");
				
 
		
	}
}
