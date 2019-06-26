package basics;

public class Cities {
	public static void main (String args[]) {
		String[] cities = {"New York", "San Francisco", "Miami", "Dallas"	};
		System.out.println(cities[0]);
		System.out.println(cities[1]);
		System.out.println(cities[2]);
		System.out.println(cities[3]);
		
		
		
		String[] countries;
		
		countries = new String[2];
		
		countries[0] = "USA";
		countries[1] = "Canada";
		
		System.out.println(countries[1]);

		
		String[] states = new String[5];
		states[0] = "California";
		states[1] = "Ohio";
		states[2] = "New Jersey";
		states[3] = "Texas";
		states[4] = "Utah";
		int i = 0;
		
		do {
		System.out.println("STATE: "+states[i]);
		i ++;
	}while (i<5);
		
		int n=0;
		boolean stateFound = false;
		while(!stateFound) {
			String state  = states[n];
			System.out.println(state);
			if (state == "Texas") {
			System.out.println("STATE at " + n + ": "+ states[n]);
			stateFound = true;
			}
			n++;
		}
		System.out.println("\nPrinting for loop");
		for (int x = 0; x<5; x++) {
			System.out.println(states[x]);
		}
		
}
}
