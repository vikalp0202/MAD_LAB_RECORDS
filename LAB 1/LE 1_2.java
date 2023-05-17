/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int x=3;
		for(int i=0; i<4; i++)
		{
		    for(int y=0; y<=x; y++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=0; j<=i; j++)
		    {
		        System.out.print("* ");
		    }
		    System.out.println();
		    x--;
	    }
	}
}
