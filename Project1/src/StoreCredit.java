import java.util.Scanner;
import java.io.File;

public class StoreCredit { 
	
	private static Scanner sc;
	
	public static void main(String[] args) throws Exception {
		sc = new Scanner(new File("input.txt"));
		sc.nextLine();
		while(sc.hasNextLine()){
			int creditAmount = Integer.parseInt(sc.nextLine()),
    	        	    numItems = Integer.parseInt(sc.nextLine());
			String prices = sc.nextLine();
			int numCase = 1;
			
			Items[] item = new Items [numItems];
			
			String[] p = prices.split(" ");
			for(int x = 0; x < numItems; x++)  
				item[x] = new Items(Integer.parseInt(p[x]));
				
			
			for(int x = 0; x < numItems-1; x++){
				for(int y = x+1; y < numItems; y++){
					if(item[x].price + item[y].price == creditAmount){
						System.out.printf("Case #%d: %d %d\n",numCase, x+1, y+1);
						numCase++;
						break;
					}
				}
			}
		}
  
		sc.close();
 		}
}

class Items{
	int price;
	Items(int price){ this.price = price;}
} 
