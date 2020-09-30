package br.com.estudos29_auto_un_boxing;

public class UsandoAntigamente {

	public static void main(String[] args) {
		int i = 10;
		Integer obj = new Integer(i);
		
		System.out.println("i = " + i);
		System.out.println("obj = " + obj);
		System.out.println();
		if(obj.intValue() == 10) {
			int i2 = obj.intValue() + 1;
			obj = new Integer(i2);
			System.out.println("i = " + i);
			System.out.println("obj = " + obj);
			System.out.println("i2= " + i2);
		}
	}

}
