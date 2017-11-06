/*Creați o clasă Calculator ce are implementate metode de adunare, scădere, înmulțire și împărțire. 
 * Metodele vor avea la intrare tipuri de date generice și vor returna rezultatul conform acestor date. 
 * De exemplu, suma a doi întregi va returna tot un întreg, pentru două numere de tip float se 
 * va returna tot un float. Aplicarea metodelor de adunare și
scădere este permisă și pe variabile de tip String, restul operațiilor fiind interzise pt. acest tip de date (mesaj de eroare).
Scrieți aceeași clasă folosind supraîncărcarea metodelor.
*/

public class Calculator {

	public <T> T adunare(T a, T b)
	{	T suma = null;
		if(a instanceof Integer &&  b instanceof Integer)
		{
		
		suma =(T)new Integer(((Integer) a).intValue() + ((Integer) b).intValue()); 
		}
		
		if(a instanceof Float &&  b instanceof Float)
		{
		
		suma =(T)new Float(((Float) a).floatValue() + ((Float) b).floatValue()); 
		}
		
		
		if(a instanceof String &&  b instanceof String)
		{
		
		suma =(T)new String(((String) a).toString() + "+"  +((String) b).toString()); 
		}
		
		
		return suma;
	}
	
	
		@SuppressWarnings("unchecked")
		public <T> T scadere(T a, T b)
		{	T dif = null;
		if(a instanceof Integer &&  b instanceof Integer)
		{
			
			dif =(T)new Integer(((Integer) a).intValue() - ((Integer) b).intValue()); 
		}
		
		if(a instanceof Float &&  b instanceof Float)
		{
			
			dif =(T)new Float(((Float) a).floatValue() - ((Float) b).floatValue()); 
		}
		
		
		if(a instanceof String &&  b instanceof String)
		{
			String str1 = (((String) a).toString());
			String str2 = ((String) b).toString();
			
			int j=0;
			int mare;
			int rez[]= new int[100];
			char car[] = new char[100];
			String tot = new String();
			
			if(str2.length()> str1.length())
				System.out.println("Sirul al doilea nu poate fi mai amre decat primul");
			
			for(int i = 0; i<str1.length();i++)
			{
				if (j < str2.length())
				{
					
				rez[i] = ((int)str1.charAt(i)-(int)str2.charAt(j)); //afiseaza codul ascii
				j++;
				
				}	
				else
					rez[i] = (int)str1.charAt(i);
			
																		//zzzzaAddzzee", "ABCDzz"
				if(rez[i] >31 && rez[i] < 126) //coduri ascii vizibile
			
				{
					car[i] = (char)rez[i];
					tot =tot+"|"+car[i];
					
				}
				
				else
				{	
					rez[i] = ((int)str1.charAt(i));			//toate caracterele vizibile
					tot =tot+"|"+rez[i];
					
				}
				
																//am pus sa se vada codul ascii in int deoarece in char nu sunt
										
			
		}														
			
			
			dif =(T)new String(tot); 		//Fac scadere string
		}
		
		
		return dif;
		
		
	}
		
		
		public <T> T inmultire(T a, T b)
		{	T inm = null;
			if(a instanceof Integer &&  b instanceof Integer)
			{
			
			inm =(T)new Integer(((Integer) a).intValue() * ((Integer) b).intValue()); 
			}
			
			if(a instanceof Float &&  b instanceof Float)
			{
			
			inm =(T)new Float(((Float) a).floatValue() * ((Float) b).floatValue()); 
			}
			
			
			if(a instanceof String &&  b instanceof String)
			{
			
			System.out.println("Imposibil sa inmultesti 2 stringuri!!!");
			}
			
			
			return inm;
		}
		
		
		public <T> T impartire(T a, T b)
		{	T imp = null;
			if(a instanceof Integer &&  b instanceof Integer)
			{
			
			imp =(T)new Integer(((Integer) a).intValue() / ((Integer) b).intValue()); 
			}
			
			if(a instanceof Float &&  b instanceof Float)
			{
			
			imp =(T)new Float(((Float) a).floatValue() / ((Float) b).floatValue()); 
			}
			
			
			if(a instanceof String &&  b instanceof String)
			{
			
			System.out.println("Imposibil sa imparti 2 stringuri!!!");
			}
			
			
			return imp;
		}
		
	
}


class Ex02{
		public static void main(String...args)
		{
			
			Calculator calc = new Calculator();
			System.out.println("Adunare Int: " +calc.adunare(3, 4));
			System.out.println("Adunare Float: " +calc.adunare((float)3.14,(float)2.24));
			System.out.println("Adunare String: " +calc.adunare("Ana", "Maria"));
			
			System.out.println("\nScadere Int: " +calc.scadere(3, 4));
			System.out.println("Scadere Float: " +calc.scadere((float)3.14,(float)2.24));
			System.out.println("Scadere String(Intregi): " +calc.scadere("zazza321escS", "ABCDzz")); //stringul 2 trebuie sa fie mai mare decat 1
																						//nu exista caractere ascii negative
			
			System.out.println("\nImpartire Int: " +calc.impartire(4, 4));
			System.out.println("Impartire Float: " +calc.impartire((float)3.14,(float)2.24));
			System.out.println("Impartire String: " +calc.impartire("Ana", "Maria"));
			
			System.out.println("\nInmultire Int: " +calc.inmultire(3, 4));
			System.out.println("Inmultire Float: " +calc.inmultire((float)3.14,(float)2.24));
			System.out.println("Inmultire String: " +calc.inmultire("Ana", "Maria"));
		}
}
