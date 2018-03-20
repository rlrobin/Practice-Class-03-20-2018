import java.util.Scanner;
public class valuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("Key in a number ");
		int num=scan.nextInt();
		int total=num+(num*11)+(num*111);
		System.out.println(num+"+"+(num*11)+"+"+(num*111)+"="+total);
		
	}

}
