package cyclesAndInitialisation;

public class Main {

	public static void main(String[] args) {
		Zalman z = new Zalman("CONSTRUCT1");
		try {
			System.out.println(10/0);
		} catch (Exception e) {
			System.out.println("Exception catched "+e.getLocalizedMessage());
		}
		Zalman.print(Zalman.a);
		Zalman z1 = new Zalman("CONSTRUCT2");
		Zalman.print(Zalman.a);
		String a = new String("aaa");
		String b = new String("bbb");
		a = b;
		b = "ccc";
		System.out.println(a + " " + b);
	    
/*	    BigDecimal a = new BigDecimal(3);
	    BigDecimal b = new BigDecimal(10);
	    BigDecimal c = new BigDecimal(1);
	    System.out.println((a.divide(b)).add(c));
		Boolean a = new Boolean(true);
		Boolean b = new Boolean(false);
		System.out.print(a^b);*/
		
//	    Приведение типов
/*  		float c = (float) 5.0/2d;
		long l = 455/1;
		System.out.print(c + " " + l);
*/	    
//		Тернарный оператор  
/*  		int a = 1;
		int b = 1;
		int c;
		c = (a==b) ? 4 : 5;
		System.err.println(c);
		boolean x = false;
		while (!x){
			System.err.println("HAHA");
		}
*/	    
//	    Переполнение переменной
	    int x = Integer.MAX_VALUE;
	    x = x * 100;
	    System.err.println(x);
	    
//	    if else
/*	    int a = 1;
	    int b = 1;
	    if (a < b)
	        System.out.println("a < b");
	    else if (a > b)
	        System.out.println("a > b");
	    else
	        System.out.println("a = b");
*/	    
//	    Цикл while
	    int i = 0;
	    while (i < 99){
	        System.out.println(i);
	        i += 2;
	        }
	    
//	    Цикл do-while
	    do
	        System.out.println("Хоть раз выполнился");
	    while (false);
	    
//	    Цикл for
/*        for (int i = 0, j = 15; i <= 100 && j < 20; i++, j++) {
            System.err.println("I равно " + i + " " + j);
        }
*/	    
//	    For & foreach
/*	    Random rand = new Random(50);
	    float f[] = new float[10];
	    for(int i = 0; i < f.length; i++){
	        f[i] = rand.nextFloat();
	    }
	    
	    for (float g : f) {
	        System.out.println(g);
        }
*/	    
//      Break из цикла & continue новая итерация	    
/*	    for(int i = 0; i < 10; i++){
	        if(i == 5) continue;
	        if (i == 8) break;
	        System.out.println(i);
	    }
*/	    
//	    Команда выбора switch
/*	    int i = 10;
	    switch(i){
	    case 2:
	    case 3:
	    case 10: System.out.println("10 совпало");
	    break;
	    default: System.out.println("Не совпадает");
	    }
*/	    
	}
	
}