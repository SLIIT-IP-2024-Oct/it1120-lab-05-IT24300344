public class IT24300344Lab5Q2 {
public static void main(String[] args) {
int numMembers = 3;
if (numMembers < 0) {
System.out.println("Input must be a number 0 or greater");}
else { 
switch (numMembers) {
case 0:
System.out.println("No Prize"); 
break;
case 1:
System.out.println("Prize is a : Pen"); 
break;
case 2:
System.out.println("Prize is an : Umbrella "); 
break;
case 3:
System.out.println("Prize is a : Bag"); 
break;
case 4:
System.out.println("Prize is a : Travelling Chair"); 
break;
default:
System.out.println("Prize is a : Headphone");
}
}
}
}