package project_1;

public class Pyramid {
	
	
	public static void pyramid_1(int floor) {
		
		
		int star;
		int Null;
	
		for(int i =0; i<floor;i++) {
			
			for(Null = 0; Null<floor-i;Null++) {
				System.out.print(" ");}
			
			for(star = 0;star<i+1;star++) {
				System.out.print("*");}
				
			
				System.out.println();
			}	
	}	
	
	public static void pyramid_2(int floor) {
		
		int star;
		int Null;
		
		for(int i =0; i<floor; i++) {
			
			
			for(Null=0; Null<floor-i;Null++){
				System.out.print(" ");
			}
			
			for(star =0; star<(i*2)+1;star++ ){
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
	

	
	
	
}
