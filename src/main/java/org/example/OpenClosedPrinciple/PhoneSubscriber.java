package org.example.OpenClosedPrinciple;

import java.util.List;


/**
 * Here problem with this code is we are introducing address subscriberId and phone number for each services(i.e. ISP,Phone,Internet etc)
 * Now when I add any other like voice session then again I have to add the these three items again .
 * Duplicate data maintained. --> issue.
 * Plan is to make a class that contains common params and lock it, we can extend it and we can not modify it.
 *
 * Formal Definition : Software entities (Method,Modules, Classes etc) should be open for extension but closed for modification.
 *
 * */


public class PhoneSubscriber extends Subscriber {

    /**
     * Now this class is open for extension.
     * */

    @Override
    public double calculateBill()
    {
        List<CallHistory.Call> sessions = CallHistory.getCurrentCalls(subscriberId);

        long totalDuration = sessions.stream().mapToLong(CallHistory.Call::getDuration).sum();

        return totalDuration*baseRate/100;
    }

}