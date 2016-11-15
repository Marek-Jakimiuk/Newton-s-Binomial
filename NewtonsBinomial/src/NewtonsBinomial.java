import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class NewtonsBinomial {

public static void main(String[] args) throws FileNotFoundException {
	int k, n, newton;
		
	n = 11;
	k = 7;
	
	String fileName = "../In0104.txt";
	File inputFile = new File(fileName);
	Scanner scanner = new Scanner(inputFile);
	n = scanner.nextInt();
	k = scanner.nextInt();

	newton = (int)  (factorial(n)  /  (factorial(k) * factorial(n - k)));  
	System.out.println("Newton: " + newton);
}
    
static long factorial(int n){  
	int factorial=1;
	for(int i = n; i > 1; i--){
		factorial = factorial * i;
		
    }
	System.out.println("Factorial result: " + factorial);
	return factorial;
}    

}
