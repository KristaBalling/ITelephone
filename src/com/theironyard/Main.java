package com.theironyard;

public class Main {

    public static void main(String[] args) {

    ITelephone timsPhone;
    timsPhone = new DeskPhone(123456);
	timsPhone.powerOn();
	timsPhone.callPhone(123456);
	timsPhone.answer();

	timsPhone = new MobilePhone(235454);
	timsPhone.powerOn();
	timsPhone.callPhone(345346);
	timsPhone.answer();
	
    }
}
