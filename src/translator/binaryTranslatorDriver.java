package translator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class binaryTranslatorDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		binaryTranslator bt = new binaryTranslator();
		
		Scanner s = new Scanner(System.in);
		System.out.print("Give me a number : ");
		
		int input = s.nextInt();
		
		List<Character> answer = bt.translate(input);
		
		for(int i = 0; i < answer.size(); i++)
		{
			System.out.print(answer.get(i) + " ");
		}

	}

}
