package Dec13;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheAnagrams {
	static int count(char []c)
	{int count=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]==' ')         //This method is used to declare length of local char Array
				count++;
		}
		return count;
	}
	static String[] splitvalues(char[] c)  //This method is used to separately split the strings to words String
	{
		int m=0;int l=0,n=0;
		String splitString[]=new String[count(c)+1];
		for (int j=0;j<c.length;j++)
		{n=l;
			for(;l<c.length;l++)
			{
				if(c[l]==' '||l==c.length-1)
				{ m=l;
					l++;
					if(c.length==l)
						++m;
					break;                   
				}}
			char d[]=new char[m-n];  //create local char array using this for loop
		for(int i=0,k=n;i<c.length;i++,k++)
		{ 
			if(i==d.length)
				break;
				else
				d[i]=c[k];	
				}
		splitString[j]=String.valueOf(d);
		if(m==c.length)
			break;}
		return splitString;}
	static void result(char[] splitToChar)
	{
		String []splitedwords=splitvalues(splitToChar);
		for(int i=0;i<splitedwords.length-1;i++)    //First loop is constant first set
		{  int count=0;
			char[]firstSet=splitedwords[i].toCharArray();
			Arrays.parallelSort(firstSet);
			for(int k=i+1;k<splitedwords.length;k++)    //second for loop is set a dynamic second set
			{
			char[]secondSet=splitedwords[k].toCharArray();
			Arrays.parallelSort(secondSet);
			if(firstSet.length==secondSet.length)    //this condition is used to check the length of the words
			{
			for(int j=0;j<firstSet.length;j++)    //this loop is deeply check the char are same or not
			{
				if(firstSet[j]==secondSet[j])
				count++;
			}}}
			if(count==firstSet.length)             //count is same to the any one of the compared set is anagram 
				System.out.println("Anagram -"+splitedwords[i]);	
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scannerObject=new Scanner(System.in);
char []splitToChar=scannerObject.nextLine().toCharArray();
result(splitToChar);
}}
