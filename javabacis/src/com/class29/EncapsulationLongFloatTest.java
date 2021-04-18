package com.class29;

public class EncapsulationLongFloatTest {
	public static void main(String[] args) {

		EncapsulationLongFloat obj = new EncapsulationLongFloat();
		obj.setAcc_no(7560504000L);
		obj.setName("Sumair");
		obj.setEmail("sumair@syntaxsolutions.com");
		obj.setAmount(500000.0f);
		System.out.println(obj.getAcc_no()+" "+obj.getName()+" "+obj.getEmail()+" "+obj.getAmount());
	}

}
