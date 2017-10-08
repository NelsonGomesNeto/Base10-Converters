package translator;

import java.util.ArrayList;
import java.util.List;

public class binaryTranslator implements TranslatorStrategy {
	
	public List<Character> translate(int input)
	{
		List<Character> answer = new ArrayList<>();
		int power;
		List<Integer> powers = new ArrayList<Integer>();
		
		int exponent = 0;
		
		power = (int) Math.pow(2, exponent);
		
		while(power <= input)
		{
			power = (int) Math.pow(2, exponent);
			if(power <= input)
			{
				powers.add(power);
			}
			exponent++;
		}
		
//		for(int i = 0; i <= 9; i++)
//		{
//			power = (int) Math.pow(2, i);
//			if(power <= input)
//			{
//				powers.add(power);
//			}
//			else
//			{
//				break;
//			}
//		}
//		
//		for(int i = 0; i <= powers.size() - 1; i++)
//		{
//			System.out.println(powers.get(i));
//		}
		
		for(int i = powers.size()-1; i >= 0; i--)
		{
			if(powers.get(i) > input)
			{
				answer.add('0');
			}
			else
			{
				input -= powers.get(i);
				answer.add('1');
			}
		}
		
		return answer;
	}
	
}
