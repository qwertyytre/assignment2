package midfielder;
import java.util.Date;
import soccerplayer.SoccerPlayer;

public class Midfielder extends SoccerPlayer
{
	protected int attacksStopped;
	public Midfielder()
	{
		super();
		attacksStopped=0;
	}
	
	public Midfielder(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int attacksStopped)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed);
		this.attacksStopped=attacksStopped;
	}
	
	public Midfielder(Midfielder c)
	{
		super((SoccerPlayer) c);
		this.attacksStopped=c.attacksStopped;
	}
	
	//Accessor
	public int getAttacksStopped() {return attacksStopped;}
	
	//Mutator
	public void setAttackStopped(int attacksStopped) {this.attacksStopped=attacksStopped;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Midfielder\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of attacks stopped: "+attacksStopped+"\n";
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
		
		if (!(o instanceof Midfielder))
		{
            return false;
        }
		Midfielder c =(Midfielder) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.attacksStopped==c.attacksStopped;
		
	}
}
