/* Q4. 
Cricket Score Analyzer
Create a Class ScoreAnalyzer with a private instance variable 'runsData' of type LinkedList.
The linkedlist will store runs scored by individual players in One Day Cricket match.
Create a constructor and initialize runsData variable.

•       Create a method addRunsToList which accepts runs scored by a player as parameter and stores it in the List.
•       Create a method calcRunRate which returns the runRate (Consider all 50 overs were played by a team).
•       Create a method lowestRunsScored to return the lowest runs scored by a player.
•       Create a method displayRuns to display the runs scored by all players.(use for each loop)

Create class TestScoreAnalyzer with a main method. 
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

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;


public class ScoreAnalyzer 
{
	private LinkedList<Integer> runsData=new LinkedList<>();
	void addRunsToList(int r) 
	{
		runsData.add(r);
	}
	float calcRunRate() 
	{
		int sum=0;
		Iterator<Integer> itr=runsData.iterator();
		while(itr.hasNext())
			sum+=itr.next();
		return 6*((float)sum/300);
	}
	int lowestRunsScored()
	{
		return Collections.min(runsData);
	}
	void displayRuns() 
	{
		int j=1;
		for(int i:runsData)
		{
			System.out.print(j+"-"+i+" ");
			j++;
		}
	}
}