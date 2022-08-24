package by.tc.task01.main;

import java.util.List;

import by.tc.task01.entity.Appliance;

public class PrintApplianceInfo {
	
	public static void print(List<Appliance> appliance) {
		for (Appliance app : appliance) {
			System.out.println(app);
		}
		
	}


}
