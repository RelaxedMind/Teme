/*Creați un joc de tip Minesweeper. Toate funcționalitățile jocului vor fi implementate în clasa GameMinesweeper. 
 * Constructorul va avea ca și elemente de inițializare dimensiunea tablei de joc și numărul de mine ascunse.
 *  Numărul de mine nu poate să fie mai mare decât o treime din numărul total de căsuțe de pe tabla de joc.
Poziția minelor va fi generată aleator. 
Fiecare căsuță de pe tabla de joc va conține 0 pentru o căsuță neminată, 1 – pentru o căsuță minată 
și valoarea ‘x’ pentru căsuțele neverificate încă. Utilizatorul poate introduce de la tastatură poziția de pe tabla de joc 
pe care dorește să o verifice, sub forma (a,b), unde a este linia și b este coloana. La fiecare pas, aplicația va afișa tabla
 de joc actualizată și numărul de căsuțe neminate rămase în joc.
*/

import java.util.Random;
import java.util.Scanner;


public class GameMinesweeper {

	int dimensiune;
	int nr_mines;
	
	public GameMinesweeper(int dim, int mines) {

		this.dimensiune = dim;
		this.nr_mines = mines;
	}
	
	public static char[][] GenerateEmptyGame(int dim)
	{
		char game[][] = new char[dim][dim];
		for (int i = 0; i <dim;i++)
		{
			for (int j = 0; j <dim;j++)
			{
				game[i][j] = 'x';
			}
		}
		
		
		
			return game;
		
	}
	
	public static char [][] RezolvedGame(int dim, int mines)
	{

		char rezolved[][] = new char[dim][dim];
		int cont = 0;
		Random rand = new Random();
		
		int Mx = rand.nextInt(dim);  //pozitie mina pe x
		int My = rand.nextInt(dim); // pozitie mina pe y
		
		while(cont < mines)
		{
			Mx = rand.nextInt(dim);
			My = rand.nextInt(dim);
			if(rezolved [Mx][My] != '1')			//Generare Mine
			{
				rezolved[Mx][My] = '1';
				cont++;
			}
		}
		
		for (int i = 0; i <dim;i++)
		{											//Generare spatii neminate
			for (int j = 0; j <dim;j++)
			{

				Mx = rand.nextInt(dim);
				My = rand.nextInt(dim);
				
				if(rezolved [i][j] != '1')
				{
					rezolved[i][j] = '0';
					
				}
				
								
				
				
			}
		}
		
		return rezolved;
		
	}
	
	
		public static void PrintMatrix(char matrix[][], int dim)
		{
			for (int i = 0; i <dim;i++)
			{	
				System.out.println("");
				for (int j = 0; j <dim;j++)
				{
					System.out.print("\t" +matrix[i][j]);
				}
			}
			
		System.out.println("\n");
		}
		
		
		public  void Verify(char [][]RezolvedGame,int  dim)
		{		
				int i = 0;
				int x;
				int y;
				Scanner decizie = new Scanner (System.in);		
				char matrix [][] = new char [dim][dim];
				
				PrintMatrix(RezolvedGame, dim);

				while(i < dim*dim)
				{
				System.out.println("Introduceti pozitia de forma [x][y]: ");
				x = decizie.nextInt();
				y= decizie.nextInt();
				matrix[x][y] = RezolvedGame[x][y];
				PrintMatrix(matrix, dim);
				if (matrix[x][y] == '1')
					{
					System.out.println("BOOOM!!! ");
						break;
					}
				
				i++;
				}
				
										
					
				
				
		}	
	
	public static void main(String[] args) {
		
		Scanner decizie = new Scanner (System.in);		
		int mines;
		int dim;
		int x;
		int y;
		int i = 0;
		
		System.out.println("Introduceti dimensiunea jocului[Matrice patratica]: ");
		dim = decizie.nextInt();
		
		
		System.out.println("Introduceti nr mine[< 1/3 din dim jocului]: ");
		mines = decizie.nextInt();
		
		while(mines > (dim*dim)/3)
		{
			System.out.println("Sunt prea multe mine!: ");
			System.out.println("Introduceti nr mine[< 1/3 din dim jocului]: ");
			mines = decizie.nextInt();
			
		}
	
		
		GameMinesweeper ob1 = new GameMinesweeper(dim, mines);
		GenerateEmptyGame(dim);
		ob1.PrintMatrix(GenerateEmptyGame(dim), dim);
		RezolvedGame(dim, mines);
	//	ob1.PrintMatrix(RezolvedGame(dim,mines), dim);
		
		ob1.Verify(RezolvedGame(dim,mines), dim);
		
	
		System.out.println("Game over!!! ");
	
		
	}

}
