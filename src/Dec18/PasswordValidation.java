package Dec18;


	import java.util.Scanner;
	/*Output
	 * Subash@123
	 *Normal
	 *valid password
	 */
	public class PasswordValidation {
	static void passwordcheck(String pass)
	{
		if(pass.length()>=8)
		{
			int i=0;int a=0,b=0,c=0,d=0;
			while(i<pass.length())
			{
				if(pass.charAt(i)>='a'&&pass.charAt(i)<='z')
				{
				a++;	
				}
				else if(pass.charAt(i)>='A'&&pass.charAt(i)<='Z')
				{
					b++;
				}
				else if(pass.charAt(i)>='0'&&pass.charAt(i)<='9')
				{
					c++;
				}
				else {d++;}
				i++;
					}
			if(a>0&&b>0&&c>0&&d>0)
			{
				if(pass.length()==8)
					System.out.println("Weak");
				if(pass.length()<=10)
					System.out.println("Normal");
				if(pass.length()>10)
					{System.out.println("Strong");}
				System.out.println("valid password");
			}
			else 
			System.out.println("Invalid password");
		}
	}
		public static void main(String[] args) {
			Scanner scannerObject=new Scanner(System.in);
			
	passwordcheck(scannerObject.next());
		}

	}