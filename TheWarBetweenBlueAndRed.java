//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

public class Main
{
	public static void main(String[] args) throws IOException
	{
		long score= 0;
		// Creating object of class inside main() method
		BufferedWriter printf = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader scanf = new BufferedReader(new InputStreamReader(System.in));

		int numberCastle= Integer.parseInt(scanf.readLine());
		int numberCannon= Integer.parseInt(scanf.readLine());
		String stringCastleStrength= scanf.readLine();
		String stringCastleImportance= scanf.readLine();
		String stringCannonStrength= scanf.readLine();

		// int numberCastle= 5;
		// int numberCannon= 4;
		// String stringCastleStrength= "2 4 6 8 10";
		// String stringCastleImportance= "10 20 30 40 50";
		// String stringCannonStrength= "4 5 6 7";
		
		String arrayCastleImportance[] = new String[numberCastle];
		String arrayCastleStrength[] = new String[numberCastle];
		String arrayCannon[] = new String[numberCannon];

		arrayCastleStrength= stringCastleStrength.split(" ", numberCastle);
		arrayCastleImportance= stringCastleImportance.split(" ", numberCastle);
		arrayCannon= stringCannonStrength.split(" ", numberCannon);
	

		int Castle[][] = new int [numberCastle][2];
		int Cannon[] = new int [numberCannon];

		for(int i= 0; i < numberCannon; ++i)
			Cannon[i]= Integer.parseInt(arrayCannon[i]);

		for(int i= 0; i < numberCastle; ++i)
		{
			Castle[i][0]= Integer.parseInt(arrayCastleStrength[i]);
			Castle[i][1]= Integer.parseInt(arrayCastleImportance[i]);
		}


		Arrays.sort(Castle, new Comparator<int[]>() {
			@Override
			public int compare(int[] o1, int[] o2) {
				return Integer.compare(o2[1], o1[1]);
			}
		});
		

		// Arrays.sort(Cannon);

		// System.out.print("\nCastle importance: ");

		// for(int i= 0; i < numberCastle; ++i)
		// {
		// 	System.out.printf("%d, ", Castle[i][1]);
		// }
		// System.out.print("\b \n");

		
		for(int i= 0; i < numberCannon; ++i)
		{
			for(int o= 0; o <numberCastle; ++o)
			{
				if(Cannon[i] >= Castle[o][0])
				{
					score += Castle[o][1];
					break;
				}
			}
		}

		// System.out.printf("\nScore: %d\n\n", score);

		// while()
		printf.write(String.valueOf(score));

		scanf.close();
		printf.close();
	}

}
