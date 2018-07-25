package forward;
import soccerplayer.SoccerPlayer;
import java.util.Date;

public class Forward extends SoccerPlayer
{
	protected int goalsScored;
	protected int numAssists;
	protected int shotsOnTarget;
	
	public Forward()
	{
		super();
		goalsScored=0;
		numAssists=0;
		shotsOnTarget=0;
		
	}
	
	public Forward(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int goalsScored,int numAssists, int shotsOnTarget)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed);
		this.goalsScored=goalsScored;
		this.numAssists=numAssists;
		this.shotsOnTarget=shotsOnTarget;
	}
	
	public Forward(Forward c)
	{
		super((SoccerPlayer) c);
		this.goalsScored=c.goalsScored;
		this.numAssists=c.numAssists;
		this.shotsOnTarget=c.shotsOnTarget;
	}
	
	//Accessors
	public int getGoalsScored() {return goalsScored;}
	public int getNumAssists() {return numAssists;}
	public int getShotsOnTarget() {return shotsOnTarget;}
	
	//Mutators
	public void setGoalsScored(int goalsScored) {this.goalsScored=goalsScored;}
	public void setNumAssists(int numAssists) {this.numAssists=numAssists;}
	public void setShotsOnTarget(int shotsOnTarget) { this.shotsOnTarget=shotsOnTarget;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Forward\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of Goals Scored: "+goalsScored+"\nNumber of Assists: "+numAssists+"\nNumber of shots on target: "+shotsOnTarget+"\n";
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
		
		if (!(o instanceof Forward))
		{
            return false;
        }
		Forward c =(Forward) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.goalsScored==c.goalsScored && this.numAssists==c.numAssists && this.shotsOnTarget==c.shotsOnTarget;
		
	}
	
	
}
