package com.decorator.pattern;

/**
 * Created by wyr on 2015/6/9.
 */
public class LoggingEmployee extends Employee {
    private Employee employee;

    public LoggingEmployee(Employee employee) {
        this.employee = employee;
    }

    @Override
    public void pay() {
        logPayment();
        employee.pay();
    }

    private void logPayment() {
    }
}
