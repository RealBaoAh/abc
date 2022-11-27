
package Employee;

import junit.framework.TestCase;

public class EmployeeTest extends TestCase {
	public void testConstructor() {
		new Employee("Nam", 20);
		new Employee("Mai", 30);
		new Employee("Minh", 102);
	}
// This is a test of wage use to determines the wage of an employee	from the number of hours of work
//@return
//Examples:
//Employee Nam works 20 hours and earns $240
//Employee Mai works 30 hours and earns $360
//Employee Minh works 102 hours and earns $1224
public void testwage() {
	assertEquals(
			new Employee("Nam", 20).wage(), 240);
	assertEquals(
			new Employee("Mai", 30).wage(), 360);
	assertEquals(
			new Employee("Minh", 102).wage(), 1224);
	}
//This is a test of tax use to determine the tax on the gross pay
//@return
//Examples:
//Employee Nam gets $240 and has to pay $36 for tax
//Employee Mai gets $360 and has to pay $54 for tax
//Employee Minh gets $1224 and has to pay $183.6 for tax
public void testtax() {
	assertEquals(
			new Employee("Nam", 20).tax(), 36.0, 0.001);
	assertEquals(
			new Employee("Mai", 30).tax(), 54.0, 0.001);
	assertEquals(
			new Employee("Minh", 102).tax(), 183.6, 0.001);	
}
// This is a test of netpay use to determine netpay of an employee from the number of hours
//@return
//Examples:
//With salary $240, Nam just receives $204 of netpay
//With salary $360, Mai just receives $306 of netpay
//With salary $1224, Minh just receives $1020 of netpay
public void testnetpay() {
	assertEquals(
			new Employee("Nam", 20).netpay(), 204.0, 0.001);
	assertEquals(
			new Employee("Mai", 30).netpay(), 306.0, 0.001);
	assertEquals(
			new Employee("Minh", 102).netpay(), 1040.4, 0.001);
}
// This is a test of raisedWage use to determine the raise wage to 14$
// @return
// Examples:
//With basic salary $240, after getting bonus,
//total income of Nam is $254
//With basic salary $360, after getting bonus,
//total salary of Mai is $374
//With basic salary $1224, after getting bonus,
//total salary of Minh is $1238
public void testraisedWage() {
	assertEquals(
			new Employee("Nam", 20).raisedWage(), 254);
	assertEquals(
			new Employee("Mai", 30).raisedWage(), 374);
	assertEquals(
			new Employee("Minh", 102).raisedWage(), 1238);
}
//This is a test of checkOverTime use to check that the hours doesn�t exceed 100
//@return
//Examples:
//It is false that Nam and Mai work 20 and 30 hours per
//week
//It is true for Minh to work 102 hours per week
public void testcheckOverTime() {
	assertFalse(
			new Employee("Nam", 20).checkOverTime());
	assertFalse(
			new Employee("Mai", 30).checkOverTime());
	assertTrue(
			new Employee("Minh", 102).checkOverTime());
}
//This is a test of taxWithRate which consumes the gross
//pay and produces the amount of tax owed.
//For a gross pay of $240 or less, the tax is 0%;
//for over $240 and $480 or less, the tax rate is 15%;
//and for any pay over $480, the tax rate is 28%.
//Examples:
//Employee Nam works 20 hours, the tax is 0
//Employee Mai works 30 hours, the tax is 54$
//Employee Minh works 102 hours and earns 342.72$
public void testtaxWithRate() {
	assertEquals(
			new Employee("Nam", 20).taxWithRate(), 0.0, 0.001);
	assertEquals(
			new Employee("Mai", 30).taxWithRate(), 54.0, 0.001);
	assertEquals( 
			new Employee("Minh", 102).taxWithRate(), 342.72, 0.001);
}
//This is a test of netpayWithTax the net pay of an employee
//from the number of hours worked. The net pay is the
//gross pay minus the tax.
//Examples:
//With salary $240 and 0$ tax pay Nam receives $204 of netpay
//With salary $360 and 54$ tax pay Mai just receives $306 of netpay
//With salary $1224 and 342.72$ tax pay Minh just receives $881.28 of netpay
public void testnetpayWithTax() {
	assertEquals(
			new Employee("Nam",20).netpayWithRate(), 240.0, 0.001);
	assertEquals(
			new Employee("Mai", 30).netpayWithRate(), 306.0, 0.001);
	assertEquals(
			new Employee("Minh", 102).netpayWithRate(), 881.28, 0.001);	
}
}

