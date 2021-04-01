package pruebas;

public class Calculadora {
		
		private Integer a, b;
		
		public Calculadora (Integer a, Integer b)
		{
			this.a=a;
			this.b=b;
		}
			

		public Integer suma(){
				
			return a+b;
		}
		
		public Integer resta(){
			
			if (a<b)
			return b-a;
			else
				return a-b;
		}
	
		
		public Integer multiplica(){
			
			return a*b;
		}
		public Integer divide(){
			
			return a/b;
		
		}

		public Integer divide2(){
			if (a==0) {
				return null;
			}
			else {
				return a/b;
			}
		
		}

		public boolean mayor() {
			if (a>b) {
				return true;
			}
			else {
				return false;
			}
		}
		

	public static void main(String args[])
		{
			
			Calculadora oper = new Calculadora(20,10);
			
			
			Integer resultados= oper.suma();
			Integer resultador= oper.resta();
			Integer resultadom= oper.multiplica();
			Integer resultadod= oper.divide();
			System.out.println(resultados);
			System.out.println(resultadom);
			System.out.println(resultadod);
			System.out.println(resultador);
			
			
		}

}
