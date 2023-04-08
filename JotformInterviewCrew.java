//Brace your keyboard
//inzva community built algoleague for every algorithm enthusiast hungry for self-improvement and friendly competition. Have fun and good luck!

import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args) throws Exception {
        BufferedWriter	writer = new BufferedWriter(new OutputStreamWriter(System.out));
		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer	token = new StringTokenizer(reader.readLine());
		int	typeNum = 0, qNum = 0, question = 0, yprint = 1;
		int[]	kvmap = new int[200000];
		int[]	vkmap = new int[200000];

		typeNum = Integer.parseInt(token.nextToken());
		qNum = Integer.parseInt(token.nextToken());

		token = new StringTokenizer(reader.readLine());
		for (int i = 0; i < qNum; ++i) {
			question = Integer.parseInt(token.nextToken());

			++kvmap[question];
			++vkmap[kvmap[question]];

			if (vkmap[yprint] == typeNum) {
				writer.write('Y');
				++yprint;
			}
			else
				writer.write('N');
		}
		writer.flush();
    }
}
