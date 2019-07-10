import java.util.Scanner;

public class Switch {
	
	public static void main(String[] args) {
		String month;
		System.out.println("Enter the month u wanth to know which season it is:");
		Scanner Ab=new Scanner(System.in);
		month=Ab.nextLine();
		month.toLowerCase();
		 
		 switch(month){
		 
		 case month.compareTo("boishakh")==0 || month.compareTo("joishtho")==0:
			 System.out.println("The month is included in Greeshshokal/Summer");
			 break;
		 
		 case month.compareTo("ashar")==0 || month.compareTo("srabon")==0:
			 System.out.println("The month is included in Borshakal/Rainy season");
		 break;
		 case month.compareTo("vadro")==0 || month.compareTo("ashshin")==0:
			 System.out.println("The month is included in Shorotkal/Autumn");
		 break;
		 case month.compareTo("karthik")==0 || month.compareTo("ogrohayon")==0:
			 System.out.println("The month is inbcluded in Hemontokal/Fall");
		 break;
		 
		 case month.compareTo("Poush")==0 || month.compareTo("magh")==0:
			 System.out.println("The month is included in Sheetkal/Winter");
		 break;
		 case month.compareTo("falgun")==0 || month.compareTo("choitro")==0:
				 System.out.println("The month is included in Boshontokal/Spring");
		 break;
		 
		 default:
			 System.out.println("Please correct your pronunciation");
		 break;
		 
		 
		 
		 
		 }
	}

}
