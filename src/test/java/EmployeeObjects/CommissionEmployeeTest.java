package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CommissionEmployeeTest {
    @Test
    public void testIncreaseSalesPositive() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.increaseSales(1000.0);
        assertEquals(1000.0, emp.getSales());
    }

    @Test
    public void testIncreaseSalesNegative() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.increaseSales(-500.0);
        assertEquals(0.0, emp.getSales());
    }

    @Test
    public void testHolidayBonus() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        double bonus = emp.holidayBonus();
        assertEquals(0.0, bonus);
    }
    @Test
    public void testAnnualRaise() {
        CommissionEmployee emp = new CommissionEmployee("Clint", "Barton", 6847, "Sales", "Customer Representative", .0265);
        emp.annualRaise();
        emp.annualRaise();
        assertEquals(0.0305, emp.getRate());
    }
}
