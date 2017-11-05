import java.util.*;
import java.lang.Comparable;


/*Implementați o aplicație în cadrul căreia să aveți o clasă SetterGetter generică ce permite setarea și returnarea
valorilor atributelor pentru mai multe tipuri de obiecte. De exemplu, având clasele Copil, Adult și Pensionar, să se poată
seta și returna numele și vârsta acestora. Creați colecții cu intrări unice de obiecte de tip Copil, Adult, Pensionar pe care
să le populați cu date citite din consolă. Afișați datele preluate în diverite moduri.
*/

public class SetterGetter<T> {
	
	protected T name;
	protected T age;


	public String toString() {
		return name + " " + age;    //Suprascrisa
	}
	
//	
//	public void Set(Object o, String nume){
//		
//		if(o instanceof Copil)
//		{
//			
//			this.name = (T) nume;
//			//this.age = (T) varsta;
//		//	this.age=varsta;
//			
//		}
	
	public void Set(T nume, T varsta){
		
	
		
		this.name =nume;
		this.age = varsta;
		
			//this.age = (T) varsta;
		//	this.age=varsta;
			
		
			
//		if(nume instanceof Adult && varsta instanceof Adult)
//		{
//			
//			this.name = nume;
//			this.age=varsta;
//			
//		}
//		
//		if(nume instanceof Pensionar && varsta instanceof Pensionar)
//		{
//			
//			this.name = nume;
//			this.age=varsta;
//			
//		}
	}

	
public T GetName(Object o){
		
		if(o instanceof Copil)
		{
			return (T) this.name;
		}
			
//
//		if(clasa instanceof Adult)
//		{
//			return (T) ((Adult) clasa).name;
//		}
//
//		
//		if(clasa instanceof Pensionar)
//		{
//			return (T) ((Pensionar) clasa).name;
//		}
//	
//	
	return null;
//	
}

public T GetAge(Object o){
	
	if(o instanceof Copil)
	{
		return (T) this.age;
	}
		
//
//	if(clasa instanceof Adult)
//	{
//		return (T) ((Adult) clasa).name;
//	}
//
//	
//	if(clasa instanceof Pensionar)
//	{
//		return (T) ((Pensionar) clasa).name;
//	}
//
//
return null;
//
}

 }

class Copil<T> extends SetterGetter<T>{
	
//	String nume;
//	int varsta;
	
	Copil(T nume, T varsta)
	{
		this.name= nume;
		this.age=varsta;
	}
	
	Copil()
	{
	}
	
}
//class Adult<T> extends SetterGetter<T>{
//	
//	String nume;
//	int varsta;
//	
//	Adult(String nume, int varsta)
//	{
//		this.nume=nume;
//		this.varsta=varsta;
//	}
//	
//}
//class Pensionar<T> extends SetterGetter<T>{
//	
//	String nume;
//	int varsta;
//	
//	Pensionar(String nume, int varsta)
//	{
//		this.nume=nume;
//		this.varsta=varsta;
//	}
//	
//}




class ex3{
	public static void main(String[] args) {
		//Copil copil = new Copil("Andrei", 10);
		Copil copil = new Copil();
		SetterGetter clasa = new SetterGetter<>();
//		Adult adult = new Adult("Andrei", 10);
//		Pensionar pensionar = new Pensionar("Andrei", 10);
//		
		Scanner nmr = new Scanner(System.in);
		Scanner nume = new Scanner(System.in);
		int nr;
		
		
		System.out.println("Cati copii sunt in clasa?");
		nr = nmr.nextInt();
		
		String name[] = new String[nr];
		int[] age= new int[nr];
		
		List<Copil> list_copii = new ArrayList<Copil>();
		for(int i = 0; i <nr;i++)
		{
			System.out.print("Numele " +(i+1)+ " copil: ");
			name[i] = nume.nextLine();
			
			System.out.print("Varsta lui " + name[i]+": ");
			age[i] = nmr.nextInt();
			
			Copil cop = new Copil(name[i], age[i]);
			
			//copil.Set(name[i], age[i]);
			list_copii.add(cop);
		}
		
		System.out.println(list_copii);
		//System.out.println("Copil la indexul 1: " +list_copii.remove(1));
		System.out.println(list_copii);
		
		
//		Copil bandsArray[] = {
//				new Copil("Mircea", 10),
//				new Copil("Ana", 2),
//				new Copil("Dan", 21),
//				new Copil("Flaviu", 3)
//			};
			
				
		
			
		//	Arrays.sort(bandsArray);		//face sortare de tabloului
//			System.out.println(list_copii);
//		
//		System.out.println("Nume Copil: " +bandsArray[1].GetName(bandsArray[1]));
//		clasa.Set(bandsArray[1], "ssrcea", 12);
//		//System.out.println("Nume Copil: " +copil.GetName(copil));
//		System.out.println("Nume Copil: " +bandsArray[1].GetName(bandsArray[1]));
		
	}
}