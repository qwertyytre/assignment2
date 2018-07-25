package forward;
import java.util.Date;

public class CentreForward extends Forward
{
	protected int longBallsReceived;
	
	public CentreForward()
	{
		super();
		longBallsReceived=0;
	}
	
	public CentreForward(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int goalsScored,int numAssists, int shotsOnTarget, int longBallsReceived)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, goalsScored,numAssists,shotsOnTarget);
		this.longBallsReceived= longBallsReceived;
	}
	
	public CentreForward(CentreForward c)
	{
		super((Forward) c);
		this.longBallsReceived= c.longBallsReceived;
	}
	
	//Accessor
	public int getLongBallsReceived() {return longBallsReceived;}
	
	//Mutator
	public void setLongBallsReceived(int longBallsReceived) {this.longBallsReceived= longBallsReceived;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: CentreForward\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of Goals Scored: "+goalsScored+"\nNumber of Assists: "+numAssists+"\nNumber of shots on target: "+shotsOnTarget+"\nLong Balls Received: "+longBallsReceived+"\n";
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
		
		if (!(o instanceof CentreForward))
		{
            return false;
        }
		CentreForward c =(CentreForward) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.goalsScored==c.goalsScored && this.numAssists==c.numAssists && this.shotsOnTarget==c.shotsOnTarget && this.longBallsReceived== c.longBallsReceived;
		
	}
}
