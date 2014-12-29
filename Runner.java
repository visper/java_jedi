import by.gsu.epamlab.BusinessTrip;
import java.util.ArrayList;

public class Runner {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BusinessTrip bt[] = new BusinessTrip[5];
		//bt = new BusinessTrip[5]; 
		bt[0] = new BusinessTrip("Ivan Ivanov", 30, 8);
		bt[1] = new BusinessTrip("Ivan Petrov", 500, 2);
		//bt[2] - element with index #2 is empty
		bt[2] = null;
		//bt[2] = new BusinessTrip("Paulo pppp", 150, 4);
		bt[3] = new BusinessTrip("Paulo Juanito", 150, 4);
		bt[4] = new BusinessTrip(); // default constructor

		//output result
		int mass_len = bt.length;
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null)
				continue;
			bt[i].show();
		}
		
		//change Transport expances in fourth index
		bt[mass_len-1].setTransport_expances(1000);

		System.out.println("________________");
		//show duration
		int summa = 0;
		int times = 0;
		ArrayList<String> employeer_id_list = new ArrayList<String>();
		assert employeer_id_list != null; //check that list is initialized
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null)
				continue;
			//add every employer in list and compare it with [i]element of massive
			employeer_id_list.add(bt[i].getEmployer_id());
			for (int j = 0; j < employeer_id_list.size(); j++) {
				if (i == j) continue;
				if (employeer_id_list.get(j) == bt[i].getEmployer_id());
				summa += bt[i].getDay_num();
				times += 1;
			}
			if (times == 2)
				break;
		}
		//test. list must be equal to range of massive  
		if(employeer_id_list.size() != mass_len)
			System.out.println("____________error of length of list!");
		
		
		if (times == 2) 
			System.out.println("Duration = " + summa);
		//~duration
		
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null) {
				continue;
			}
			String temp  = bt[i].toString();
			System.out.println(temp);
		}
	}
}
