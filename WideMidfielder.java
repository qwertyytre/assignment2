package midfielder;
import java.util.Date;

public class WideMidfielder extends Midfielder
{
	protected int chancesCreated;
	
	public WideMidfielder()
	{
		super();
		chancesCreated=0;
	}
	
	public WideMidfielder(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int attacksStopped, int chancesCreated)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,attacksStopped);
		this.chancesCreated=chancesCreated;
	}
	
	public WideMidfielder(WideMidfielder c)
	{
		super((Midfielder) c);
		this.chancesCreated=c.chancesCreated;
	}
	
	//Accessor
	public int getChancesCreated() {return chancesCreated;}
	
	//Mutator
	public void setChancesCreated(int chancesCreated) {this.chancesCreated=chancesCreated;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: WideMidfielder\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of attacks stopped: "+attacksStopped+"\nNumber of chances created: "+chancesCreated+"\n";
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
		
		if (!(o instanceof WideMidfielder))
		{
            return false;
        }
		WideMidfielder c =(WideMidfielder) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.attacksStopped==c.attacksStopped && this.chancesCreated==c.chancesCreated;
		
	}
}
