/*Create class TestScoreAnalyzer with a main method. 
•       Create an object of ScoreAnalyzer
•       Use Scanner to get the runs scored and use addRuns method to store the runs
•       Display the runs scored by all players
•       Display the runrate
•       Display the lowest runs scored
•       Display the count of player who did batting

Sample input
Enter Runs
20 30 150 50 2

Sample Output
Runs Scored : 1-20 2-30 3-150 4-50 5-2
Runrate : 5.04
Lowest Runs : 2
Count of player who batted: 5 */
package CollectionsPractice;
import java.util.Scanner;
public class TestScoreAnalyzer
{
	public static void main(String[] args) 
	{
		ScoreAnalyzer sa=new ScoreAnalyzer();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Runs");
		String s=sc.nextLine();
		String a[]=s.split(" ");
		for(int i=0;i<a.length;i++)
			sa.addRunsToList(Integer.parseInt(a[i]));
		sc.close();
		System.out.print("Runs Scored : ");
		sa.displayRuns();
		System.out.println("\nRunrate : "+sa.calcRunRate());
		System.out.println("Lowest Runs : "+sa.lowestRunsScored());
		System.out.println("Count of player who batted: "+a.length);
	}
}
