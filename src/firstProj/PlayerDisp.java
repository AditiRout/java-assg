package firstProj;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
public class PlayerDisp {
	public static void main(String[] args) {
		
		Set <Player> players=new LinkedHashSet<>();
		
		
		players.add(new Player(7, 1500, 20, 50, "India", "Virat Kohli"));
        players.add(new Player(10, 8000, 50, 100, "Australia", "Steve Smith"));
        players.add(new Player(18, 6000, 30, 90, "England", "Joe Root"));
        players.add(new Player(33, 2000, 10, 30, "South Africa", "AB de Villiers"));
        players.add(new Player(5, 4000, 40, 60, "New Zealand", "Kane Williamson"));
        players.add(new Player(11, 3500, 15, 40, "Pakistan", "Babar Azam"));
        players.add(new Player(23, 9000, 70, 120, "West Indies", "Chris Gayle"));
        players.add(new Player(8, 1000, 5, 20, "Sri Lanka", "Kusal Perera"));
        players.add(new Player(14, 5000, 25, 70, "Bangladesh", "Shakib Al Hasan"));
        players.add(new Player(21, 1200, 8, 35, "Afghanistan", "Rashid Khan"));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Senior Most Player: ");
        //lambda expression used
        Player senior=Collections.max(players,Comparator.comparingInt(player->player.getNoOfMatchesPlayed()));
        System.out.println(senior);
        System.out.println("Sort players based on: ");
        System.out.println("1) Highest Run 2)Highest Wicket 3)Most number of matches");
       int input=scanner.nextInt();
       switch (input) {
 		case 1: {
			Set<Player> highestRun=new TreeSet<>(new HighestRunsSort());
			highestRun.addAll(players);
			 for(Player player:highestRun) {
				System.out.println(player);
			}
			 return ;
			
		}
		case 2: {
			Set<Player> highestWicket=new TreeSet<>(new HighestWicketSort());
			highestWicket.addAll(players);
			for(Player player:highestWicket) {
				System.out.println(player);
			}
			return;
			
		}
		case 3: {
			Set<Player> noOfMatches=new TreeSet<>(new NoOfMatchesSort());
			noOfMatches.addAll(players);
			for(Player matches:noOfMatches) {
				System.out.println(matches);
			}
			return;
			
		}
		default:
			System.out.println("Default: ");
			for(Player player: players) {
				System.out.println(player);
			}
			
			return;
		} 
	}
}
class HighestRunsSort implements Comparator<Player>{
	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o2.getRuns()-o1.getRuns();
	}
}
class HighestWicketSort implements Comparator<Player>{
	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o2.getWickets()-o1.getWickets();
	}
}
class NoOfMatchesSort implements Comparator<Player>{
	@Override
	public int compare(Player o1, Player o2) {
		// TODO Auto-generated method stub
		return o2.getNoOfMatchesPlayed()-o1.getNoOfMatchesPlayed();
	}
}









