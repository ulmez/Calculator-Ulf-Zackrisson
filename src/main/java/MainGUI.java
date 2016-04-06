
public class MainGUI {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		
		System.out.println(calc.addition(4.2, 2.2));
		System.out.println(calc.subtraction(4.3, 3.8));
		System.out.println(calc.multiplication(3.5, 2));
		System.out.println(calc.division(22, 2.2));
	}

}
