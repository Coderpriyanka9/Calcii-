import java.util.Scanner;
class Calcii{
	public static void main(String[] args){
		int operator, a, b, res=0;
		System.out.println("1-Add\n 2-Subtract\n 3-Multiply\n 4-Division\n 5-Modulo");
		System.out.println("Choose the operator: ");
		Scanner sc= new Scanner(System.in);
		operator= sc.nextInt();
		System.out.println("Enter first number: ");
		a = sc.nextInt();
		System.out.println("Enter second number: ");
		b = sc.nextInt();
		switch(operator){
			case 1:
				res=a+b;
				break;
			case 2:
				res=a-b;
				if(a>b){
				 System.out.println(+res + " \n a is bigger than b");
				}else{
				 System.out.println(+res + " \n b is bigger than a");
				}
				break;
			case 3:
				res=a*b;
				break;
			case 4:
				if(b>0){
				res=a/b;
				}else{
				 System.out.println("Invalid number");
				}
				break;
			case 5:
				res=a%b;
				break;
			default:
				System.out.println("Invalid Operator");

		}
	   System.out.println("Result is: " +res);

	}
}
