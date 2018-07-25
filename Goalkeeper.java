package goalkeeper;
import java.util.Date;
import soccerplayer.SoccerPlayer;

public class Goalkeeper extends SoccerPlayer
{
	public static void main(String[] args)
	{}
	protected int goalsAllowed;
	protected int shotsOnGoal;
	protected int numSaves;
	
	public Goalkeeper()
	{
		super();
		goalsAllowed=0;
		shotsOnGoal=0;
		numSaves=0;
	}
	
	public Goalkeeper(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int goalsAllowed, int shotsOnGoal, int numSaves)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed);
		this.goalsAllowed=goalsAllowed;
		this.shotsOnGoal= shotsOnGoal;
		this.numSaves = numSaves;
		
	}
	
	public Goalkeeper(Goalkeeper c)
	{
		super((SoccerPlayer) c);
		this.goalsAllowed=c.goalsAllowed;
		this.shotsOnGoal= c.shotsOnGoal;
		this.numSaves = c.numSaves;
	}
	
	//Accessors
	public int getGoalsAllowed() {return goalsAllowed;}
	public int getShotsOnGoal() {return shotsOnGoal;}
	public int getNumSaves() {return numSaves;}
	
	//Mutators
	public void setGoalsAllowed(int goalsAllowed) {this.goalsAllowed=goalsAllowed;}
	public void setShotsOnGoal(int shotsOnGoal) {this.shotsOnGoal=shotsOnGoal;}
	public void setNumSaves(int numSaves) {this.numSaves=numSaves;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Gaolkeeper\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of GoalsAllowed: "+goalsAllowed+"\nNumber of shots on goal: "+shotsOnGoal+"\nNumber of Saves: "+numSaves+"\n";
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
		
		if (!(o instanceof Goalkeeper))
		{
            return false;
        }
		Goalkeeper c =(Goalkeeper) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.goalsAllowed==c.goalsAllowed && this.shotsOnGoal==c.shotsOnGoal && this.numSaves==c.numSaves;
		
	}
	
	
	
	
}