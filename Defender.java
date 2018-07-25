package defender;
import java.util.Date;
import soccerplayer.SoccerPlayer;

public class Defender extends SoccerPlayer
{
	protected double numTackles;
	
	public Defender()
	{
		super();
		numTackles=0.0;
	}
	
	public Defender(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed,double numTackles)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed);
		this.numTackles=numTackles;
	}
	
	public Defender(Defender c)
	{
		super((SoccerPlayer)c);
		this.numTackles=c.numTackles;
	}
	
	//Accessor
	public double getNumTackles() {return numTackles;}
	
	//Mutator
	public void setNumTackles(double numTackles) {this.numTackles=numTackles;}
	
	
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Defender\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of tackles: "+numTackles+"\n";
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
		
		if (!(o instanceof Defender))
		{
            return false;
        }
		Defender c =(Defender) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && new Double(this.numTackles).compareTo(new Double(c.numTackles))==0;
		
	}
}
