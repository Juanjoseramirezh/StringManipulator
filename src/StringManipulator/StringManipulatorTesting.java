package StringManipulator;

public class StringManipulatorTesting {

	public static void main(String[] args) {
		
		StringManipulator manipulator = new StringManipulator();
		
		String str = manipulator.trimAndConcat("   ELIMINA   " ,  "   ESPACIOS   ");
		System.out.println(str);
		
		
		char letter = 'n';
		int a = manipulator.getIndexOrNull("Coding", letter);
		int b = manipulator.getIndexOrNull("Juan Jose", letter);
		int c = manipulator.getIndexOrNull("hola", letter);
		
		System.out.println("El valor del número de la cadena a = " + a);
		System.out.println("El valor del número de la cadena b = " + b);
		System.out.println("El valor del número de la cadena c = " + c);
		
		String word = manipulator.concatSubstring("Hola", 1, 3, "Mundo");
		
		System.out.println("Este es el substring concatenado "+ word);
		
		
		
	}

}
