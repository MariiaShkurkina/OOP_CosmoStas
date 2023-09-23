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



class MySecondClass{

private int Num1;
private int Num2;

public int getNum1(){
return Num1;
}

public int getNum2(){
return Num2;
}

public void setNum1(int Num1){
this.Num1=Num1;
}

public void setNum2(int Num2){
this.Num2=Num2;
}
 
public MySecondClass(int Num1,int Num2){
this.Num1=Num1;
this.Num2=Num2;
}

public int Bit()
{
return getNum1()&getNum2();
}

}