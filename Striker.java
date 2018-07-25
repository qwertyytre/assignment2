package forward;
import java.util.Date;

public class Striker extends Forward
{
	protected double goalsToShotsRatio;
	
	public Striker()
	{
		super();
		goalsToShotsRatio=0.0;
	}
	
	public Striker(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int goalsScored,int numAssists, int shotsOnTarget, double goalsToShotsRatio)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,goalsScored,numAssists,shotsOnTarget);
		this.goalsToShotsRatio=goalsToShotsRatio;
	}
	
	public Striker(Striker c)
	{
		super((Forward) c);
		this.goalsToShotsRatio=c.goalsToShotsRatio;
	}
	
	//Accessor
	public double getGoalsToShotsRatio() {return goalsToShotsRatio;}
	
	//Mutator
	public void setGoalsToShotsRatio(double goalsToShotsRatio) {this.goalsToShotsRatio=goalsToShotsRatio;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Striker\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of Goals Scored: "+goalsScored+"\nNumber of Assists: "+numAssists+"\nNumber of shots on target: "+shotsOnTarget+"\nGoals To Shots Ratio: "+goalsToShotsRatio+"\n";
	}
	
	public boolean equals(Object o)
	{
		if (o == this)
		{
            return true;
        }
		if (o==null)
		{
			return false;
		}
		
		if (!(o instanceof Striker))
		{
            return false;
        }
		Striker c =(Striker) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.goalsScored==c.goalsScored && this.numAssists==c.numAssists && this.shotsOnTarget==c.shotsOnTarget && new Double(this.goalsToShotsRatio).compareTo(new Double(c.goalsToShotsRatio))==0;
		
	}
}
