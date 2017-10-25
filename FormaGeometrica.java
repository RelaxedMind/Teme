import java.util.Scanner;

/*Definiți o interfață denumită FormăGeometrică și care are funcții ce returnează aria și perimetru l
 *  formei geometrice.
Implementați interfața pentru forme de tip pătrat, dreptunghi, cerc și triunghi echilateral și isoscel.
 De la tastatură se
preiau un număr N de forme geometrice specificate prin tipul lor și parametrii lor specifici
 (de ex. pt cerc se va prelua
raza). Să se calculeze aria și perimetru l total al formelor geometrice, ținând cont că acestea
 nu se suprapun.
*/
public interface FormaGeometrica {

	public double aria(int a, int b, int c);
	public double perimetru  (int a, int b, int c);
}

class Patrat implements FormaGeometrica{

	@Override
	public double aria(int a, int b, int c) {
		
		return a*a;
	}

	@Override
	public double perimetru (int a, int b, int c) {
		// TODO Auto-generated method stub
		return 4*a;
	}
	
}
	class Dreptunghi implements FormaGeometrica{

		@Override
		public double aria(int a, int b, int c) {
			
			return a*b;
		}

		@Override
		public double perimetru (int a, int b, int c) {
			// TODO Auto-generated method stub
			return 2*(a+b);
		}
	
	}	
		class Cerc implements FormaGeometrica{

			@Override
			public double aria(int a, int b, int c) {
				
				return  (Math.PI * a*a);
			}

			@Override
			public double perimetru (int a, int b, int c) {
				// TODO Auto-generated method stub
				return 2*Math.PI*a;
			}
			
		}
		
		class Echilateral implements FormaGeometrica{

			@Override
			public double aria(int a, int b, int c) {
				
				return a*Math.sqrt(3)/4;
			}

			@Override
			public double perimetru (int a, int b, int c) {
				// TODO Auto-generated method stub
				return a+a+a;
			}
		}	
			class Isoscel implements FormaGeometrica{

				@Override
				public double aria(int l, int b, int h) {
					
					return (b*h)/2; //Baza*inaltimea/2
				}

				@Override
				public double perimetru (int l, int b, int h) {
					// TODO Auto-generated method stub
					return l+l+b;
				}

	}
			
			class Test{
				
				public static void main(String...args){
				int a=0;
				int b=0;
				int c=0;
				int n;
				String nume;
				int i = 0;
				FormaGeometrica patrat = new Patrat();
				FormaGeometrica dreptunghi = new Dreptunghi();
				FormaGeometrica cerc = new Cerc();
				FormaGeometrica echilat = new Echilateral();
				FormaGeometrica isoscel = new Isoscel();
				
				Scanner rasp = new Scanner(System.in);
				
				
				System.out.println("Cate forme doriti sa generati?");
				n = rasp.nextInt();
				
				while(i < n)
				{
					System.out.println("\nNumele formei: ");
					Scanner numeforma = new Scanner(System.in);
					
					nume = numeforma.nextLine();
					
					switch(nume)
						{
					case "patrat":
						{
							System.out.println("Introduceti latura patratului");
							a = rasp.nextInt();
							System.out.println("Arie= = " +patrat.aria(a, b, c));
							
							System.out.println("Perimetru= " +patrat.perimetru (a, b, c));
							i++;
						}
						break;
						
					case "dreptunghi":
					{
						System.out.println("Introduceti latimea dreptunghiului: ");
						a = rasp.nextInt();
						System.out.println("Introduceti lungimea dreptunghiului: ");
						b = rasp.nextInt();
						
						System.out.println("Arie= " +dreptunghi.aria(a, b, c));
						
						System.out.println("Perimetru= " +dreptunghi.perimetru (a, b, c));
						
						i++;
					}
					break;
					
					case "cerc":
					{
						System.out.println("Introduceti raza cercului: ");
						a = rasp.nextInt();
						System.out.println("Arie= " +cerc.aria(a, b, c));
						
						System.out.println("Perimetru= " + cerc.perimetru (a, b, c));
					
					i++;
					}
					break;
					
					case "echilateral":
					{
						System.out.println("Introduceti latura triunghiului echilateral: ");
						a = rasp.nextInt();
						System.out.println("Arie= " +	echilat.aria(a, b, c));
					
						System.out.println("Perimetru=  " +echilat.perimetru(a, b, c));
						i++;
					}
					break;
					
					case "isoscel":
					{
						System.out.println("Introduceti valoarea lat congruente a triunghiului isoscel: ");
						a = rasp.nextInt();
						
						System.out.println("Introduceti baza triunghiului isoscel: ");
						b = rasp.nextInt();
						
						System.out.println("Introduceti inaltimea triunghiului isocel: ");
						c = rasp.nextInt();
						
						
						System.out.println("Arie=  " + isoscel.aria(a, b, c));
						
						System.out.println("Perimetru=  " +isoscel.perimetru(a, b, c));
						i++;
					}
					break;
					default:
						System.out.println("Forma specificata nu exista: ");
						break;
				}
		}	
				System.out.println("Final program! ");
	}		
}
