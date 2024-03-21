package EmployeeObjects;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HourlyEmployeeTest {
    @Test
    void increaseHoursIsPositive(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(10);
        emp.increaseHours(-5);
        assertEquals(10, emp.getHoursWorked());
    }

    @Test
    void annualRaiseIncrease(){
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.annualRaise(); //simple check
        assertEquals(34.49, emp.getWage());
    }

    @Test
    public void testCalculateWeeklyPayNormalHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(35); //increase hours
        double weeklyPay = emp.calculateWeeklyPay();
        assertEquals(1149.75, weeklyPay);
    }

    @Test
    public void testCalculateWeeklyPayOvertimeHours() {
        HourlyEmployee emp = new HourlyEmployee("Tony", "Stark", 5749, "Service", "Lead Service Manager", 32.85);
        emp.increaseHours(45); //increase hours after fixing function and making it round
        double weeklyPay = emp.calculateWeeklyPay();
        assertEquals(1560.38, weeklyPay);
    }
}