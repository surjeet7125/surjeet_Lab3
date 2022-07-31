package com.gl.brackets;

import java.util.Stack;

public class BalancingBrackets {

	//	Here can be check input is balance or not balance by method.
		public static boolean checkingBracketsBalanced(String strBalancebracks)	{
			Stack<Character> Stack=new Stack<Character>();
			
		for(int i=0;i< strBalancebracks.length();i++)		{
				char Character=strBalancebracks.charAt(i);
		if(Character=='('|| Character=='['|| Character=='{')	{
			Stack.push(Character);
			continue;	}
		if(Stack.isEmpty())
				return false;
			char check;
			switch(Character)		
	{
			case ')':
				check=Stack.pop();
		if(check=='{'|| check=='[')
			return false;
			break;
			case '}':
				check=Stack.pop();
		if(check=='('||check=='[')
			return false;
			break;
			case ']':
				check=Stack.pop();
		if(check=='('||check=='{')
			return false;
			break;
	}
	}
//			check Empty Stack
		return (Stack.isEmpty());
	}



     
	public static void main(String[] args) 
	{
	
		String strBracketExpression="{[[]]}";
			Boolean result ;
			result = checkingBracketsBalanced(strBracketExpression);
			if(result)
		System.out.println("Entered, Brackets are Balanced : ");
	else
		System.out.println("Entered, Brackets are not Balanced : ");
}
}
