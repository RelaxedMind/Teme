import java.util.Scanner;

/*Scrieți o aplicație Java care definește o cheie de autentificare de tipul: XXXXX-XXXXX-XXXXX-XXXXX, unde X reprezintă un caracter ce poate 
 * fi cifră sau literă. Scrieți un program care verifică dacă această cheie are exact 4 grupuri de caractere a câte 5 caractere fiecare și 
 * separate prin caracterul ‘-‘. De asemenea, calculați numărul de cifre și litere din cheia de autentificare. Numărul de cifre trebuie să
 *  fie mai mare decât numărul de litere, iar numărul de litere nu poate să fie 0.
În cazul în care nu este îndeplinită cel puțin o condiție din cele menționate anterior, afișați mesajul: ”Cheie de autentificare incorectă!”*/

public class Authentificator {


		public static int nr_lit(String x)
		{
			
			int nr_lit = 0;
			
			for(int i =0; i < x.length();i++)
			{
				if (x.charAt(i) >= 'A' && x.charAt(i) <= 'z')
					nr_lit++;
			}
			
			return nr_lit;
		}
		
		public static int nr_cif(String x)
		{
			
			int nr_cif = 0;
			
			for(int i =0; i < x.length();i++)
			{
				if (x.charAt(i) >= '0' && x.charAt(i) <= '9')
					nr_cif++;
			}
			
			return nr_cif;
		}
	
		public static int verify_group(String x)
		{
			int cont = 1;
			for(int i =0; i <x.length();i++)
			{
				if (x.charAt(i) == '-')
					cont++;
			}
			return cont;
		}
		
		public static boolean verify_char(String x)
		{
		
			boolean OK=true;
			String tab[]=x.split("-");

			for(int i =0; i <tab.length;i++) //split, string tokenizer
			{
				
				if (tab[i].length() != 5)
				{
					OK=false;
					break;
				}
			}
			return OK;
				
		}
		

		
		public static void main(String[] args) {
		//	String test = "ab212-xy112-225rt-x1it6";
			
			Scanner scanner = new Scanner(System.in);
			String key = null;
			
			
			System.out.println("Introduceti cheia: ");
			//System.out.println(scanner.nextLine());
			key = scanner.nextLine();
		
			System.out.println("Verify group: " +verify_group(key));
			System.out.println("Verify char: " +verify_char(key));
			System.out.println("Numar litere: " +nr_lit(key));
			System.out.println("Numar cifre: " +nr_cif(key));
			
				if(nr_lit(key) == 0)
					System.out.println("Cheie de autentificare incorectă! Nr litere = 0!");
				if(nr_cif(key) <= nr_lit(key))
					System.out.println("Cheie de autentificare incorectă! Nr cifre >= nr litere!");
				if(verify_group(key) != 4)
					System.out.println("Cheie de autentificare incorectă! Grupul e diferit de 4");
				if(verify_char(key) == false)
					System.out.println("Cheie de autentificare incorectă! Sunt mai mult/putin de 5 caractere intr-un grup");
		

		}

	}

