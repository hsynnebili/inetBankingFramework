package com.class28;

public class VehicleInterfaceTest {
public static void main(String[] args) {
	
	Carr vec=new Carr();
	vec.changeGear(2);
	vec.speedUp(3);
	vec.applyBrakes(1);
	vec.display();
	
	System.out.println("------------");
	
	Bus vec1=new Bus();
	vec1.changeGear(1);
	vec1.speedUp(4);
	vec1.applyBrakes(3);
	vec1.display();
}
}
