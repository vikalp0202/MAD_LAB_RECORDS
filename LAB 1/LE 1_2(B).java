/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int x=1;
		for(int i=0; i<=4; i++)
		{
		    if(i>=1 && x<=4)
		    {
		        for(int w=0; w<=x; w++)
		        {
		            System.out.print(" ");
		        }
		        for(int j=4; j>=i; j--)
		        {
		            System.out.print("* ");
		        }
		        System.out.println();
		        x++;
		    }
	    }
	}
}
