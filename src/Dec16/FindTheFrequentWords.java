package Dec16;
import java.util.Map;
//Output
//A paragraph is a self-contained unit of a discourse in writing dealing with a particular point or idea. A paragraph consists of one or more sentences. Though not required by the syntax of any language, paragraphs are usually an expected part of formal writing, used to organize longer prose.
//a- is accured in :5
//of- is accured in :4
//or- is accured in :2
//paragraph- is accured in :2
//writing- is accured in :2

import java.util.Scanner;
import java.util.TreeMap;

public class FindTheFrequentWords {
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
				if(c[l]=='.')
					continue;
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
	static void find(String paragraph)
	{
		char []splitToChar=paragraph.replaceAll("[-+.^:,]","").toLowerCase().toCharArray();
		String []splitedwords=splitvalues(splitToChar);
		int []frequency=new int[splitedwords.length];
		for(int i=0;i<splitedwords.length-1;i++)
			{int count=1;
		    String temporary=splitedwords[i];
			for(int j=i+1;j<splitedwords.length;j++)
			{
			if(temporary.equals(splitedwords[j]))
			{
				count++;
				frequency[j]=-1;
			}                         //to avoid the repeated words
			}
			if(frequency[i]!=-1)
			{
				frequency[i]=count;
			}
		}
		//if the -1 is the repeated words is avoid and remaining words are put into words map
		Map<String, Integer>words = new TreeMap<>();
		for(int i=0;i<splitedwords.length;i++)
		{
			if(frequency[i]!=-1)
				words.put(splitedwords[i],frequency[i]);
		}
	//Find the max value in map values
		int max = words.values().stream().max(Integer::compare).get();
		int count=1;
		//compare the value and if the value matched print the key and value
		//continuously decrease the max value and repeatly do the itration
		while(count!=5)
		{
		for(String a:words.keySet())
		{if(max==words.get(a))
			System.out.println(a +"- is accured in :"+words.get(a));
		}
		if(count==5)break;
		count++;max--;
		}	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scannerObject=new Scanner(System.in);
		String paragraph=scannerObject.nextLine();
		find(paragraph);
	}
	}

