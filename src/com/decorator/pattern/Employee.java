package com.decorator.pattern;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

/**
 * Created by wyr on 2015/6/9.
 */
public class Employee {
    List timecards = new ArrayList();
    List payPeriod = new ArrayList();
    Date date = new Date();
    private Double payRate;
    private Dispatcher payDispatcher;

    public void pay() {
        Money amount = new Money();
        for (Iterator it = timecards.iterator(); it.hasNext(); ) {
            Timecard card = (Timecard)it.next();
            if (payPeriod.contains(date)) {
                amount.add(card.getHours() * payRate);
            }
        }
        payDispatcher.pay(this, date, amount);
    }

}
