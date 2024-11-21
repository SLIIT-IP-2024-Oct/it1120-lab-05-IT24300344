public class IT24300344Lab5Q3 {
public static void main(String[] args) {
final int ROOM_CHARGE_PER_DAY = 48000;
final int DAYS_FOR_10_PERCENT_DISCOUNT = 3;
final int DAYS_FOR_20_PERCENT_DISCOUNT = 5;
final int  MAX_DAYS_IN_MONTH = 31;
int startDate = 12;
int endDate = 15;
if (startDate < 1 || startDate > MAX_DAYS_IN_MONTH || endDate < 1|| endDate > MAX_DAYS_IN_MONTH) {
System.out.println("Error: Days must be between 1 and " + MAX_DAYS_IN_MONTH);
return;}
if (startDate >=endDate) {
System.out.println("Error: Start Date must be less than End Date");
return;}
int daysReserved = endDate - startDate;
double discountRate = 0;
if (daysReserved >= DAYS_FOR_20_PERCENT_DISCOUNT) {
discountRate = 0.2; }
else if (daysReserved >= DAYS_FOR_10_PERCENT_DISCOUNT) {
discountRate = 0.1; }
double totalamount = ROOM_CHARGE_PER_DAY * daysReserved * (1 - discountRate);
System.out.println("Room Charge Per Day : Rs. " + ROOM_CHARGE_PER_DAY + "/=");
System.out.println("Number of Days Reserved: " + daysReserved);
System.out.println("Total Amount to be paid: " + totalamount); 
}
}

