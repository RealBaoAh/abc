
package Employee;

public class Employee {
	String name;
	int hours;
 
	Employee(String name, int hours) {
		this.name = name;
		this.hours = hours;
	}
//	This is a method use to determines the wage of an employee	from the number of hours of work 
int wage() {
	return this.hours * 12;
	}
// This is a method use to determine the tax on the gross pay
double tax() {
	return this.hours * 12 * 0.15;  
}
// This is a method use to determine netpay of an employee from the number of hours
double netpay() {
	return this.hours * 12 - this.hours * 12 * 0.15;
}
// This is a method use to determine the raised wage to $14
int raisedWage() {
	return this.hours * 12 + 14;
}
//This is a method use to check that the hours doesn�t exceed 100
boolean checkOverTime() {
	return this.hours > 100;
}
double taxWithRate() {
	double grossPay = this.wage();
	if (grossPay <= 240)
	return 0.0;
	if (grossPay <= 480)
	return grossPay * 0.15;
	if (grossPay > 480);
	return grossPay * 0.28;
}
double netpayWithRate() {
	return this.wage() - this.taxWithRate();
}
}
	