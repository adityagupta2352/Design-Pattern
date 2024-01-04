package com.design.pattern.AssignmentForCDP2.Receiver;

import lombok.Data;

@Data
public class Operation {

    private int initialTime;

    public void initiateOrder(){
        System.out.println("Order Initiates");
    }

    public void processOrder(){
        System.out.println("Order Processed");
    }

    public void cancleOrder(){
        System.out.println("Order Cancle");
    }

    public void refundPayment(){
        System.out.println("Payment is getting refund");
    }

    public void updateOrderStatus(String callingClass){

        switch (callingClass) {
            case "InitiateOrderCommand":
                System.out.println("Initiates");
                break;
            case "ProcessOrderCommand":
                System.out.println("Process");
                break;
            default:
                System.out.println("Completed");
                break;
        }
    }

}
