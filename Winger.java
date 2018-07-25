package forward;
import java.util.Date;

public class Winger extends Forward
{
	protected int numCrosses;
	
	public Winger()
	{
		super();
		numCrosses=0;
	}
	
	public Winger(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int goalsScored,int numAssists, int shotsOnTarget, int numCrosses)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,goalsScored,numAssists,shotsOnTarget);
		this.numCrosses=numCrosses;
	}
	
	public Winger(Winger c)
	{
		super((Forward) c);
		this.numCrosses=c.numCrosses;
	}
	
	//Accessor
	public int getNumCrosses() {return numCrosses;}
	
	//Mutator
	public void setNumCrosses(int numCrosses) {this.numCrosses=numCrosses;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Winger\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of Goals Scored: "+goalsScored+"\nNumber of Assists: "+numAssists+"\nNumber of shots on target: "+shotsOnTarget+"\nNumber of Crosses: "+numCrosses+"\n";
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
		
		if (!(o instanceof Winger))
		{
            return false;
        }
		Winger c =(Winger) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.goalsScored==c.goalsScored && this.numAssists==c.numAssists && this.shotsOnTarget==c.shotsOnTarget && this.numCrosses==c.numCrosses;
		
	}
}
