package project_1;

public  class GuGudan {

	public static void e_gugudan(int e) {
	
			for(int hag=1;hag<10;hag++) {
				System.out.println(e+"*"+hag+"="+e*hag);
			}
		}
	
	public static void even() {
		
		
		int dan=1;
		int hag=1;
		for(dan=1;dan<10;dan++) {
			if(dan %2 == 0)	{
				for(hag=1;hag<10;hag++)
					System.out.println(dan+"*"+hag+"="+dan*hag);		
			}	
			else continue;
		}			
	}
	
	
	public static void odd() {
		int dan=1;
		int hag=1;
	
		for(dan=1;dan<10;dan++) {
			if(dan %2 != 0)	{
				for(hag=1;hag<10;hag++)
					System.out.println(dan+"*"+hag+"="+dan*hag);		
			}	
			else continue;
		}			
		
		
	}
	
	
	
	
	
