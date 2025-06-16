import java.util.Scanner;
class two{
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.println("Give the value Principal, Interest rate,Compounding frequency and Time");
		float p = sc.nextFloat();
		float r = sc.nextFloat();
		float n = sc.nextFloat();
		float t = sc.nextFloat();

		System.out.println("The compound interes is :"+p*Math.pow(1+(r/n)));
	}
}