package Dec12;

import java.util.ArrayList;
import java.util.Scanner;
public class PrintTheLetterUsingNearNumber {
static void result(String input)
{
	ArrayList letter=new ArrayList();   //This arraylist is used to add numbers
	ArrayList number=new ArrayList();   //This arraylist is used to add strings
	ArrayList splitLetter=new ArrayList();   //This one is used to add splited letter for a input String

	for(int i=0;i<input.length();i++)
	{
	splitLetter.add(input.charAt(i));       //Split the letters
	} String s="";
	for(int i=0;i<splitLetter.size();i++)
	{
	if((char)splitLetter.get(i)>='a'&&(char)splitLetter.get(i)<='z'||(char)splitLetter.get(i)>='A'&&(char)splitLetter.get(i)<='Z')
	//Findout the letter
	{  s=s+splitLetter.get(i);       
	if(i<splitLetter.size()-1&&(char)splitLetter.get(i+1)>='a'&&(char)splitLetter.get(i+1)<='z'||(char)splitLetter.get(i+1)>='A'&&(char)splitLetter.get(i+1)<='Z')
	continue;    //Find out the next one is letter or number
	letter.add(s);
	s = "";
	}
	else if((char)splitLetter.get(i)>='0'&&(char)splitLetter.get(i)<='9')
	//Find out the numbers
	{ s=s+splitLetter.get(i);
	if(i<splitLetter.size()-1&&(char)splitLetter.get(i+1)>='0'&&(char)splitLetter.get(i+1)<='9')
	continue;  //Find out the next one is number or letter
	number.add(s);
	s = "";}
	}
	//Print the values
	for(int i=0;i<letter.size();i++)
	{int k=Integer.valueOf((String) number.get(i));
	for(int j=0;j<k;j++)
	{
	System.out.print(letter.get(i));
	}}}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scannerObject=new Scanner(System.in);
    	String input=scannerObject.next();
        result(input);
		//Output
		//a2b10cf4
		//aabbbbbbbbbbcfcfcfcf
	}
}
