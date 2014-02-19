import java.util.Scanner;
public class Boolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Scanner scn= new Scanner (System.in);
		int x= scn.nextInt();
if (x<=100 && x>=0){
	System.out.println("Entre 0 y 100");
	
}else {
	System.out.println("Esta fuera de Rango");
}*/
		//____--------------
		
		Scanner s= new Scanner (System.in);
		int var=0;
		do {
			System.out.print("Ingrese var:");
			var = s.nextInt();
		}while(var!=1 && var!=2 && var!=3);
		
	}

}
