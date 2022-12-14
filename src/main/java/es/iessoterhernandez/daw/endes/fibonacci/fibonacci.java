package es.iessoterhernandez.daw.endes.fibonacci;


public class fibonacci 

{
	
	private int numero;
	
	public fibonacci (int numero) {
		this.numero=numero;
	}
	
	public void calcularFibonacci() {
		
		int num1=1, num2=1;
		
		System.out.print(num1+ " ");
		
		for(int i=2; i<=numero; i++) {
			
			System.out.print(num2 + " ");
			
			num2=num1+num2;
			num1=num2-num1;
			
		}
	}
   
}
