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
			int rez[]= new int[10];
			char car[] = new char[10];
			boolean vizible = false; //daca caracterul ascii e vizibil il afiseaza, daca nu il afiseaza in zecimal
			String tot = new String();
			
			if(str1.length() >= str2.length())
				
				mare =str1.length();
			else
				mare = str2.length();
			
			for(int i = 0; i<mare;i++)
			{
				if (j < str2.length())
				{
					
				rez[i] = ((int)str1.charAt(i)-(int)str2.charAt(j)); //afiseaza codul ascii
				j++;
				}
				if(rez[i] >31 && rez[i] < 126) //coduri ascii vizibile
					vizible = true;
				
				else
				{	
					rez[i] = ((int)str1.charAt(i));
					
				}
				
				if(vizible)
				{
					
					car[i] = (char)rez[i];
						
		
				}														//am pus sa se vada codul ascii in int deoarece in char nu sunt
																		//toate caracterele vizibile
				tot =tot+"|"+rez[i];
			
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
			
			imp =(T)new Integer(((Integer) a).intValue() * ((Integer) b).intValue()); 
			}
			
			if(a instanceof Float &&  b instanceof Float)
			{
			
			imp =(T)new Float(((Float) a).floatValue() * ((Float) b).floatValue()); 
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
			
			System.out.println("Scadere Int: " +calc.scadere(3, 4));
			System.out.println("Scadere Float: " +calc.scadere((float)3.14,(float)2.24));
			System.out.println("Scadere String(Intregi): " +calc.scadere("AAsAzzyz", "fdss")); //stringul 2 trebuie sa fie mai mare decat 1
																						//nu exista caractere ascii negative
			
			
		}
}