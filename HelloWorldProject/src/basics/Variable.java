package basics;

public class Variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 1 bit - wahr oder falsch / 0 oder 1
		boolean boolVar;
		boolVar = true;
		System.out.println(boolVar);
		//
		boolVar = false;
		System.out.println(boolVar);
		//
		// short 16bit
		short shortVar;
		System.out.println(Short.MIN_VALUE);
		System.out.println(Short.MAX_VALUE);
		shortVar = 24673;
		System.out.println(shortVar);
		//
		shortVar = 2+5;
		System.out.println(shortVar);
		//
		shortVar = 9-5;
		System.out.println(shortVar);
		//
		shortVar = 5*4;
		System.out.println(shortVar);
		//
		shortVar = 6/3;
		System.out.println(shortVar);
		//
		System.out.println(9/4.0);
     	//
		//
		int intVar;
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		intVar = -23456;
		System.out.println(intVar);
		//
		//
		long longVar;
		System.out.println(Long.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		longVar = 1000*1000*1000*1000;
		System.out.println(LongVar);
		//
		System.out.println(System.currentTimeMillis());
	}

}
