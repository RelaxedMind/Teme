/*Implementați jocul X-0 naiv ca și joc automat. Programul va selecta aleator la fiecare pas o poziție pe care o va
completa fie cu X, fie cu 0 în mod alternativ. Poziția selectată nu poate fi una completată deja. Jocul se termină atunci
când nu mai există casuțe libere sau când unul dintre jucători a obținut o linie, coloană sau diagonală completă. Afișați
pe ecran fiecare pas al algoritmului sub forma unei matrici, caracterul * va reprezenta o casuță necompletată. De ex:
X * *
* * *
* * *
--
X * *
* 0 *
* * *
--
X * *
* 0 *
X * *
--
X * 0
* 0 *
X * *
--
X * 0
X 0 *
X * *
Joc terminat!
--------
*Extindeți aplicația astfel încât dimensiunile tablei de joc să poată fi variabile.
=================================================================================
*/
import java.util.Random;
public class TicTacToe {

	public static void ShowMatrix(char matrix[][]){
		
		for(int i =0; i<3;i++)
		{	System.out.println();
			for(int j =0; j<3;j++)		
			{	
				System.out.print("\t" +matrix[i][j]);
			
			}
		}
		
		System.out.println("");
		
	}
	
	
	public static int PosX(char matrix[][]){
		
		int first[] = new int [9];
		int cont=0;
		
	for(int i =0; i<3;i++)
	{
		for(int j =0; j<3;j++)
			{
				if (matrix[i][j] == '*')
					{
						first[cont] = i;
						cont++;
					}	
			
			}	
	}
	Random rand = new Random();
int x =	rand.nextInt(first.length);
	
	return first[x];
	
	
}
	public static int PosY(char matrix[][]){
		
		int second[] = new int [9];
		int cont=0;
		
	for(int i =0; i<3;i++)
	{
		for(int j =0; j<3;j++)
			{
				if (matrix[i][j] == '*')
					{
						second[cont] = j;
						cont++;
					}	
			
			}	
	}
	Random rand = new Random();
	int y =	rand.nextInt(second.length);
	
	return second[y];
	
	
}
	
	public static boolean MatrixHasSpace(char matrix[][])	{ //Verifica daca mai sunt elemente in matrice
		
		boolean verif = false;
		
		for(int i =0; i<3;i++)
		{
			
			for(int j =0; j<3;j++)
				{
					if (matrix[i][j] == '*')
						{
							verif = true;
							break;
						}	
				
				}	
		}
		return verif;
	}
	

	
public static char[][] EditMatrix_X(char matrix[][], int PosX, int PosY){
		
		matrix[PosX][PosY] = 'X';
		return matrix;
	
	
	}
	
public static char[][] EditMatrix_Y(char matrix[][], int PosX, int PosY){
	
	matrix[PosX][PosY] = '0';
	return matrix;


}
	public static void main(String[] args) {
		char matrix[][] = new char [3][3];
		
		for(int i =0; i<3;i++)
		{
			
			for(int j =0; j<3;j++)
				matrix[i][j] = '*';
		}
		//Generate matrix
		
		ShowMatrix(matrix);
	
		
		while (MatrixHasSpace(matrix) == true)
		{
				EditMatrix_X(matrix,  PosX(matrix), PosY(matrix));
				ShowMatrix(matrix);
				EditMatrix_Y(matrix,  PosX(matrix), PosY(matrix));
				ShowMatrix(matrix);
		}
			
			
		
		if(MatrixHasSpace(matrix) == false)
			System.out.println("Nu mai sunt elemente vide in matrice!!!");
		
		
		

	}
}
