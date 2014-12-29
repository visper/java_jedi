import by.gsu.epamlab.BusinessTrip;
import java.util.ArrayList;

public class Runner {
	public static void main(String[] args) {
		BusinessTrip bt[] = new BusinessTrip[6];
		//bt = new BusinessTrip[6]; 
		bt[0] = new BusinessTrip("Ivan Ivanov", 30, 8);
		bt[1] = new BusinessTrip("Ivan Petrov", 500, 2);
		bt[2] = null;
		bt[3] = new BusinessTrip("Paulo Juanito", 15, 1);
		bt[4] = new BusinessTrip("Paulo Juanito", 150, 4);
		bt[5] = new BusinessTrip(); // default constructor
		
		//output result
		int mass_len = bt.length;
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null) continue;
			bt[i].show();
		}
		
		//change Transport expances in fourth index
		bt[mass_len-1].setTransport_expances(1000);

		//show duration
		int summa = 0;
		int times = 0;
		String name = null;  
		
		//create list for id
		ArrayList<String> employeer_id_list = new ArrayList<String>();

		//check that list is initialized
		assert employeer_id_list != null; 
		
		for (int i = 0; i < mass_len; i++) {
			
			if (mass_len <= 1) break; // if list of 1 person -> break
			if (bt[i] == null) continue;
			
			//add every employer in list and compare it with [i]element of massive
			employeer_id_list.add(bt[i].getEmployer_id());
			
			for (int j = 0; j < employeer_id_list.size(); j++) {
				if (i == j) continue;
				if (employeer_id_list.get(j) == bt[i].getEmployer_id()) {
					//if summa more then length of int
					//must be better solution
					if(summa + bt[i].getDay_num() <= -2147483648 ||
							summa + bt[i].getDay_num() >= 2147483647) {
						System.out.println("error of length of summ");
						System.exit(-1);
					}
						
					summa += bt[i].getDay_num();
					times += 1;
					name = employeer_id_list.get(j);
				}
			if (times == 2)
				break;
			}
		}
		
		//System.out.println("times = " + times);
		
		if (times == 2) {
			System.out.println("______print of travel duration for 1 personon of repeating id______");
			System.out.println("Employeer_id = " + name);
			System.out.println("Duration = " + summa);
		}

		System.out.println("______print to string__________");
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null) {
				continue;
			}
			String temp  = bt[i].toString();
			System.out.println(temp);
		}
	}
}