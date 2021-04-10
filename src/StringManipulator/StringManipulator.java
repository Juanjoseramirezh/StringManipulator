
package StringManipulator;

public class StringManipulator {

	public String trimAndConcat(String cadena1, String cadena2) {
		return cadena1.trim() + cadena2.trim();
	}

	public int getIndexOrNull(String cadena, char letter) {
		return cadena.indexOf(letter);
	}

	public String concatSubstring(String cadena1, int num1, int num2, String cadena2) {

		return cadena1.substring(num1, num2) + cadena2.substring(num1, num2);
	}

}
