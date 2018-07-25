package midfielder;
import java.util.Date;

public class CentreMidfielder extends Midfielder
{
	protected int numPasses;
	
	public CentreMidfielder()
	{
		super();
		numPasses=0;
	}
	
	public CentreMidfielder(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int attacksStopped, int numPasses)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,attacksStopped);
		this.numPasses=numPasses;
	}
	
	public CentreMidfielder(CentreMidfielder c)
	{
		super((Midfielder) c);
		this.numPasses=c.numPasses;
	}
	
	//Accessor
	public int getNumPasses() {return numPasses;}
	
	//Mutator
	public void setNumPasses(int numPasses) {this.numPasses=numPasses;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: CentreMidfielder\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of attacks stopped: "+attacksStopped+"\nNumber of Passes: "+numPasses+"\n";
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
		
		if (!(o instanceof CentreMidfielder))
		{
            return false;
        }
		CentreMidfielder c =(CentreMidfielder) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.attacksStopped==c.attacksStopped && this.numPasses==c.numPasses;
		
	}
}
