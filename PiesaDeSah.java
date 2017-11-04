import java.util.Scanner;

/*Definiți o interfață PiesaDeSah, ce definește prototipul funcției muta().
 *  Creați clasele aferente tipurilor distincte de piese de sah și implementați metoda mutaautor
 *   lutschconform regulilor de mișcareraul a pieselor pe tabla de șah. Metoda are ca parametri de intrare 
 *   poziția curentă a piesei și direcția de deplasare dată prin
 *    coordonate geografice (N,S,E,V,NE,NV, SE,SV) și returnează poziția finală.
 *     Atenție la piesele ce pot să se deplaseze mai mult de o căsută pe tabla de șah.*/


public interface PiesaDeSah {
	public char[][] muta(int PosX, int PoxY, String dir, char matrix[][]);
}




class GenerateEmptyMatrix{
	
public static char[][] GenerateEmpty(){
		
	char tabla [][] = new char[8][8];
	
	for (int i = 0; i<8;i++)
	{
		for (int j = 0; j<8;j++)
		{
			tabla[i][j] = '*';
		}
	}
	return tabla;
}
}



class Rege  implements PiesaDeSah{
	


	@Override
	public char[][] muta(int PosX, int PosY, String dir,char tabla[][]) {
	
		
		int PosInitX = PosX;
		int PosInitY = PosY;
		
		tabla[7-PosInitX][PosInitY] = 'k';  //litera mica = pozitie initiala
		
		dir = dir.toUpperCase();
		
		switch(dir)
		{
		case "N":
			
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'K';	//litera mare = pozitie finala
			break;
			
		case "S":
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'K';
			break;
			
		case "E":
			PosY = PosY +1;
			tabla[7-PosX][PosY] = 'K';
			break;
			
		case "V":
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'K';
			break;
			
		case "NE":
			PosY = PosY + 1;
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'K';
			
			break;
			
		case "NV":
			PosX = PosX + 1;
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'K';
			
			break;
			
		case "SE":
			PosY = PosY + 1;
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'K';
			
			break;
			
		case "SV":
			PosY = PosY - 1;
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'K';
			break;
			
			default:
				System.out.println("Nu se poate!");
				break;
		}
		return tabla;
	}	
}


class Regina implements PiesaDeSah{
	
public char[][] muta(int PosX, int PosY, String dir,char tabla[][]) {
	int mutari;
	int i=0;
	Scanner nr_mut = new Scanner(System.in);
	
	System.out.println("Cate casute doriti sa mutati REGINA in directia -> " +dir);
	mutari = nr_mut.nextInt();
		
		int PosInitX = PosX;
		int PosInitY = PosY;
		
		tabla[7-PosInitX][PosInitY] = 'q';  //litera mica = pozitie initiala
		
		dir = dir.toUpperCase();
		
		while(i<mutari)
		{
			i++;
		switch(dir)
		{
		case "N":
			
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'Q';	//litera mare = pozitie finala
			break;
			
		case "S":
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'Q';
			break;
			
		case "E":
			PosY = PosY +1;
			tabla[7-PosX][PosY] = 'Q';
			break;
			
		case "V":
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'Q';
			break;
			
		case "NE":
			PosY = PosY + 1;
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'Q';
			
			break;
			
		case "NV":
			PosX = PosX + 1;
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'Q';
			
			break;
			
		case "SE":
			PosY = PosY + 1;
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'Q';
			
			break;
			
		case "SV":
			PosY = PosY - 1;
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'Q';
			break;
			
			default:
				System.out.println("Nu se poate!");
				break;
		}
		}
		return tabla;
	}	
}


class Nebun implements PiesaDeSah{
	
public char[][] muta(int PosX, int PosY, String dir,char tabla[][]) {
	int mutari;
	int i=0;
	Scanner nr_mut = new Scanner(System.in);
	
	System.out.println("Cate casute doriti sa mutati NEBUN in directia -> " +dir);
	mutari = nr_mut.nextInt();
		
		int PosInitX = PosX;
		int PosInitY = PosY;
		
		tabla[7-PosInitX][PosInitY] = 'b';  //litera mica = pozitie initiala
		
		dir = dir.toUpperCase();
		
		while(i<mutari)
		{
			i++;
		switch(dir)
		{		
		case "NE":
			PosY = PosY + 1;
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'B';
			
			break;
			
		case "NV":
			PosX = PosX + 1;
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'B';
			
			break;
			
		case "SE":
			PosY = PosY + 1;
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'B';
			
			break;
			
		case "SV":
			PosY = PosY - 1;
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'B';
			break;
			
		
			default:
				System.out.println("Nu se poate!");
				break;
		}
		}
		return tabla;
	}	
}

class Tura implements PiesaDeSah{
	
public char[][] muta(int PosX, int PosY, String dir,char tabla[][]) {
	int mutari;
	int i=0;
	Scanner nr_mut = new Scanner(System.in);
	
	System.out.println("Cate casute doriti sa mutati NEBUN in directia -> " +dir);
	mutari = nr_mut.nextInt();
		
		int PosInitX = PosX;
		int PosInitY = PosY;
		
		tabla[7-PosInitX][PosInitY] = 'r';  //litera mica = pozitie initiala
		
		dir = dir.toUpperCase();
		
		while(i<mutari)
		{
			i++;
		switch(dir)
		{		
		case "N":
			
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'R';	//litera mare = pozitie finala
			break;
			
		case "S":
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'R';
			break;
			
		case "E":
			PosY = PosY +1;
			tabla[7-PosX][PosY] = 'R';
			break;
			
		case "V":
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'R';
			break;
			
			default:
				System.out.println("Nu se poate!");
				break;
		}
		}
		return tabla;
	}	
}

class Pion implements PiesaDeSah{
	
public char[][] muta(int PosX, int PosY, String dir,char tabla[][]) {
	int mutari;
	int i=0;
	Scanner nr_mut = new Scanner(System.in);
	
	System.out.println("Cate casute doriti sa mutati PIONUL(maxim 2 daca e pe poz x=1 in directia) -> " +dir);
	mutari = nr_mut.nextInt();
		
		int PosInitX = PosX;
		int PosInitY = PosY;
		
		tabla[7-PosInitX][PosInitY] = 'p';  //litera mica = pozitie initiala
		
		dir = dir.toUpperCase();
		
		while(i<mutari)
		{
			i++;
		switch(dir)
		{
		case "N":
			
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'P';	//litera mare = pozitie finala
			break;
			
			
		case "NE":
			PosY = PosY + 1;
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'P';
			
			break;
			
		case "NV":
			PosX = PosX + 1;
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'P';
			
			break;
		
			
			default:
				System.out.println("Nu se poate!");
				break;
		}
		}
		return tabla;
	}	
}

class Cal implements PiesaDeSah{
	
public char[][] muta(int PosX, int PosY, String dir,char tabla[][]) {
	int mutari =3;
	int i=0;
	int j = -1;
		
		int PosInitX = PosX;
		int PosInitY = PosY;
		
		tabla[7-PosInitX][PosInitY] = 'h';  //litera mica = pozitie initiala
		
		
		dir = dir.toUpperCase();
		String tab[] = dir.split("-");
		
		while(i<mutari)
		{
			i++;
			j++;
		switch(tab[j])
		{
		case "N":
			
			PosX = PosX + 1;
			tabla[7-PosX][PosY] = 'H';	//litera mare = pozitie finala
			break;
			
		case "S":
			PosX = PosX - 1;
			tabla[7-PosX][PosY] = 'H';
			break;
			
		case "E":
			PosY = PosY +1;
			tabla[7-PosX][PosY] = 'H';
			break;
			
		case "V":
			PosY = PosY - 1;
			tabla[7-PosX][PosY] = 'H';
			break;
			
			default:
				System.out.println("Nu se poate!");
				break;
		}
		}
		return tabla;
	}	
}

	
	class Launch {	
		
		public static void AfisGame(char tabla[][]){
			
			System.out.println("Afisare tabla");
			for(int i = 0; i<8;i++)
				{	for(int j = 0; j<8; j++)
					{
						System.out.print("\t" +tabla[i][j]);
					}
				System.out.println();
				}
		
		}
		
		public static void main(String ...  args){
			
			int x;
			int y;
			String kind;
			String raspuns;
			
			String depl = new String();
		
			
			char tabla [][] = new char[8][8];
			
			for (int i = 0; i<8;i++)
			{
				for (int j = 0; j<8;j++)
				{
					tabla[i][j] = '*';
				}
			}
			
			AfisGame(tabla);
			
			PiesaDeSah rege = new Rege();
			PiesaDeSah regina = new Regina();
			PiesaDeSah nebun = new Nebun();
			PiesaDeSah tura = new Tura();
			PiesaDeSah pion = new Pion();
			PiesaDeSah cal = new Cal();
	
			
			Scanner pozitie = new Scanner(System.in);
			Scanner deplasare = new Scanner(System.in);
			
			
			boolean continua=false;
			do{
				
				
				System.out.println("Doriti sa mutati o piesa?");
				raspuns=deplasare.nextLine();
				
				raspuns = raspuns.toLowerCase();
				if(raspuns.equals("da"))
				{
					continua =true;
			
			
				
				System.out.println("What piece do you want to move?[K,Q,B,R,P,H]"); //King, Queen, Bishop, Rook, Pawn, Horse :))
				kind = deplasare.nextLine();
				
				kind = kind.toUpperCase();
				switch(kind)
				{
				case "K":
					
					System.out.println("Introduceti pozitia REGELUI: ");
					x = pozitie.nextInt();
					y = pozitie.nextInt();
					System.out.println("Introduceti directia REGELUI: ");
					depl=deplasare.nextLine();
					
					tabla= rege.muta(y, x, depl, tabla);
					AfisGame(tabla);
					break;
				
				case "Q":
					
						
					System.out.println("Introduceti pozitia REGINEI: ");
					x = pozitie.nextInt();
					y = pozitie.nextInt();
					System.out.println("Introduceti directia REGINEI: ");
					depl=deplasare.nextLine();
					
					
					tabla= regina.muta(y, x, depl, tabla);
					AfisGame(tabla);
					break;
					
				case "B":
					
					System.out.println("Introduceti pozitia NEBUNULUI: ");
					x = pozitie.nextInt();
					y = pozitie.nextInt();
					System.out.println("Introduceti directia NEBUNULUI: ");
					depl=deplasare.nextLine();
					
					
					tabla= nebun.muta(y, x, depl, tabla);
					AfisGame(tabla);
					break;
				
				case "R":
					
					System.out.println("Introduceti pozitia TUREI: ");
					x = pozitie.nextInt();
					y = pozitie.nextInt();
					System.out.println("Introduceti directia TUREI: ");
					depl=deplasare.nextLine();
					
					
					tabla= tura.muta(y, x, depl, tabla);
					AfisGame(tabla);
					break;
					
				case "P":
					
					System.out.println("Introduceti pozitia PIONULUI: ");
					x = pozitie.nextInt();
					y = pozitie.nextInt();
					System.out.println("Introduceti directia PIONULUI: ");
					depl=deplasare.nextLine();
					
					
					tabla= pion.muta(y, x, depl, tabla);
					AfisGame(tabla);
					break;
					
				case "H":
					
					System.out.println("Introduceti pozitia CALULUI: ");
					x = pozitie.nextInt();
					y = pozitie.nextInt();
					System.out.println("Introduceti directia CALULUI(ex: N-N-V): ");
					depl=deplasare.nextLine();
					
					
					tabla= cal.muta(y, x, depl, tabla);
					AfisGame(tabla);
					break;
					
				}
			}
				else
					continua =false;
			}while(continua);
			
//		
		}
	}

