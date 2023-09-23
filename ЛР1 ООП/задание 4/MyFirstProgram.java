import myfirstpackage.*;

class MyFirstClass {
	public static void main(String[] s) {
MySecondClass myClass = new MySecondClass(15,25);
System.out.println(myClass.Bit());
for (int i = 1; i <= 8; i++) {
	for (int j = 1; j <= 8; j++) {
		myClass.setNum1(i);
		myClass.setNum2(j);
		System.out.print(myClass.Bit());
		System.out.print(" ");
	}
	System.out.println();
}

		
}

}



