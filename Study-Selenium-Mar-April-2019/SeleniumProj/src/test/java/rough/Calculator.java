package rough;

public class Calculator {
	
	
	public int add(int i1, int i2){

		return(i1+i2);

		}

		public int sub(int i1, int i2){

		return(i1-i2);



		}

		public int mult(int i1, int i2){

		return(i1*i2);

		}

		public int div(int i1, int i2){

		return(i1/i2);

		}

	public static void main(String[] args) {


		Calculator calc = new Calculator();

		int i = calc.add(10,5);
		
		System.out.println(i);

	}

}
