import by.gsu.epamlab.BusinessTrip;
import java.util.ArrayList;

public class Runner {
	//main is decomposed into few methods like in task
	
	//Create  an  array  of  5 objects  (the  element  with  index  2  should  be  empty;  the 
	//last  element  of  the  array  should  be  created  by  default  constructor;  other  elements 
	//should be created by general­purpose constructor).
	public static void task_1(BusinessTrip bt[])
	{
		bt[0] = new BusinessTrip("Ivan Ivanov", 30, 8);
		bt[1] = new BusinessTrip("Ivan Petrov", 500, 2);
		bt[2] = null;
		bt[3] = new BusinessTrip("Paulo Rodriges", 15, 1);
		bt[4] = new BusinessTrip("Paulo Rodriges", 150, 4);
		bt[5] = new BusinessTrip(); // default constructor
	}
	
	
	//* Print the array content to the console, using show( ) method.
	public static void task_2(BusinessTrip bt[], int mass_len)
	{ 
		//output result
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null) continue;
			bt[i].show();
		}		
	}
	
	//Print the total duration of two initial business trips by the single operator.
	public static void task_4(BusinessTrip bt[], int mass_len)
	{
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
	}

	//Print  the  array  content  to  the  console  (one  element  per  line),  using  toString( ) 
	//method implicitly. 
	public static void task_5(BusinessTrip bt[], int mass_len)
	{
		System.out.println("______print to string__________");
		for (int i = 0; i < mass_len; i++) {
			if (bt[i] == null) {
				continue;
			}
			String temp = bt[i].toString();
			System.out.println(temp);
		}
	}
	
	public static void main(String[] args) {
		//first task is:
		BusinessTrip bt[] = new BusinessTrip[6];
		task_1(bt);

		//second task is:
		int mass_len = bt.length;
		task_2(bt, mass_len);
		
		//third task is:
		//Change the employee`s transportaion expenses for the last object of the array. 
		bt[mass_len-1].setTransport_expances(1000);

		//forth task is:
		//show duration
		task_4(bt, mass_len);
		
		//fifth task is:
		task_5(bt, mass_len);
	}
}