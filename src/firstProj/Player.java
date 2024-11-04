package firstProj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;

class Player {
    private int jerseyNumber;
    private int runs;
    private int wickets;
    private int noOfMatchesPlayed;
    private String team;
    private String name;
    public Player(int jerseyNumber, int runs, int wickets, int noOfMatchesPlayed, String team, String name) {
        this.jerseyNumber = jerseyNumber;
        this.runs = runs;
        this.wickets = wickets;
        this.noOfMatchesPlayed = noOfMatchesPlayed;
        this.team = team;
        this.name = name;
    }
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    public int getRuns() {
        return runs;
    }
    public int getWickets() {
        return wickets;
    }
    public int getNoOfMatchesPlayed() {
        return noOfMatchesPlayed;
    }
    public String getName() {
        return name;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return jerseyNumber == player.jerseyNumber &&
               name.equals(player.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(jerseyNumber, name);
    }
    @Override
    public String toString() {
        return "Player{" +
               "name='" + name + '\'' +
               ", team='" + team + '\'' +
               ", jerseyNumber=" + jerseyNumber +
               ", runs=" + runs +
               ", wickets=" + wickets +
               ", noOfMatchesPlayed=" + noOfMatchesPlayed +
               '}';
    }
   
	
}
