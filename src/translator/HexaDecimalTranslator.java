package translator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class HexaDecimalTranslator implements TranslatorStrategy
{
	public List<Character> translate(int input)
	{
		List<Character> answer = new ArrayList<>();
		ArrayList<Integer> powers = new ArrayList<Integer>();
		int power;
		int exponent = 0;
		power = (int) Math.pow(16,  exponent);
		
		HashMap<Integer, Character> digits = new HashMap<>();
		
		digits.put(10, 'A');
		digits.put(11,  'B');
		digits.put(12,  'C');
		digits.put(13,  'D');
		digits.put(14,  'E');
		digits.put(15,  'F');
		
		while(power <= input)
		{
			power = (int) Math.pow(16,  exponent);
			if(power <= input)
			{
				powers.add(power);
			}
			exponent++;
		}
		
		int digit;
		
		thisloop : for(int i = powers.size()-1; i >= 0; i--)
		{
			if(powers.get(i) > input)
			{
				//System.out.print(0 + " ");
				answer.add('0');
			}
			else
			{
				digit = input/powers.get(i);
				
				for(int key : digits.keySet())
				{
					if(digit == key)
					{
						//Character newDigit = Integer.toString(digit);
						//newDigit = (Character) digits.get(digit);
						//System.out.print(newDigit + " ");
						answer.add(digits.get(digit));
						input -= powers.get(i) * digit;
						continue thisloop;
					}
				}
				
				//System.out.print(digit + " ");
				answer.add((char) (digit + '0'));
				input -= powers.get(i)*digit;
			}
		}
		return answer;
	}
}
