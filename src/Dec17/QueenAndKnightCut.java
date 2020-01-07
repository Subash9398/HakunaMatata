package Dec17;


	//output
	//Enter Queens row value
	//3
	//Enter Queens column value
	//3
	//Enter knight row value
	//2
	//Enter knight column value
	//4
	//Queens cut's knight
	import java.util.Scanner;

	public class QueenAndKnightCut {
		static void result(int queenrow,int queencolumn,int knightrow, int knightcolumn)
		{
			int count=0;
			if(queenrow>=0&&queenrow<=7&&queencolumn>=0&&queencolumn<=7&&knightrow>=0&&knightrow<=7&&knightcolumn>=0&&knightcolumn<=7)
			{
				if(queenrow==knightrow)
				{count++;
					System.out.println("Queens cut's knight");}
				else if(queencolumn==knightcolumn)
				{count++;
					System.out.println("Queens cut's knight");}
				else if((queenrow==queencolumn&&knightrow==knightcolumn)&&(queenrow>knightrow)){
				for(;queenrow>=0&&queencolumn>=0;queenrow--,queencolumn--) {
						 if((queenrow==knightrow)&&(queencolumn==knightcolumn))
				{count++;
							 System.out.println("Queens cut's knight");break;}}}
				else if((queenrow==queencolumn&&knightrow==knightcolumn)&&(queenrow<knightrow)) {
					for(;queenrow<=7&&queencolumn<=7;queenrow++,queencolumn++) {
					 if((queenrow==knightrow)&&(queencolumn==knightcolumn))
					{count++;
						 System.out.println("Queens cut's knight");break;}}}
				else if(queenrow<knightrow&&queencolumn>knightcolumn)
				{
				for(;queenrow<8;queenrow++,queencolumn--) {
					if(queencolumn>=0) {
				 if((queenrow==knightrow)&&(queencolumn==knightcolumn))
				{count++;
					 System.out.println("Queens cut's knight");break;}}}}
				else if(queenrow>knightrow&&queenrow<knightcolumn) {
				for(;queenrow>0;queenrow--,queencolumn++) {
					if(queencolumn<=7) {
				 if((queenrow==knightrow)&&(queencolumn==knightcolumn))
				{count++;
					 System.out.println("Queens cut's knight");break;}}}}
				if(count==0)
					System.out.println("Queens did not cut's knight");
			}
			else 
				System.out.println("input values 0 to 7");	
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Scanner scannerObject=new Scanner(System.in);
	System.out.println("Enter Queens row value");
	int queenrow=scannerObject.nextInt();
	System.out.println("Enter Queens column value");
	int queencolumn=scannerObject.nextInt();
	System.out.println("Enter knight row value");
	int knightrow=scannerObject.nextInt();
	System.out.println("Enter knight column value");
	int knightcolumn=scannerObject.nextInt();
	result(queenrow, queencolumn, knightrow, knightcolumn);

	}

	}
