public class IT24300344Lab5Q1 {
public static void main(String[] args) {
int num1 = 36;
int num2 = 14;
int num3 = 85;
System.out.println("User entered numbers are: 36 14 85 ");
int smallest = Math.min(num1, Math.min(num2, num3));
int largest = Math.max(num1, Math.max(num2, num3));
System.out.println("The Smallest number is: " + smallest);
System.out.println("The Largest number is: " + largest);
}
}