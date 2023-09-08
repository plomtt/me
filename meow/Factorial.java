package meow;
import java.util.Scanner;
public class Factorial {
public static void main(String args[]){
Scanner scanner = new Scanner(System.in);
System.out.println("Введите число:");
int num = scanner.nextInt();
int factorial = fact(num);
System.out.println("Факториал введеного числа: "+factorial);
}
static int fact(int n)
{
int output;
if(n==1){
return 1;
}
output = fact(n-1)* n;
return output;
}
}