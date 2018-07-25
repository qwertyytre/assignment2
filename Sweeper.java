package defender;
import java.util.Date;

public class Sweeper extends Defender
{
	protected int sweepUps;
	
	public Sweeper()
	{
		super();
		sweepUps=0;
	}
	
	public Sweeper(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed,double numTackles, int sweepUps)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,numTackles);
		this.sweepUps=sweepUps;
	}
	
	public Sweeper(Sweeper c)
	{
		super((Defender)c);
		this.sweepUps=c.sweepUps;
	}
	
	//Accessors
	public int getSweepUps() {return sweepUps;}
	
	//Mutators
	public void setSweepUps(int sweepUps) {this.sweepUps=sweepUps;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Sweeper\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of tackles: "+numTackles+"\nNumber of Sweep Ups: "+sweepUps+"\n";
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
		
		if (!(o instanceof Sweeper))
		{
            return false;
        }
		Sweeper c =(Sweeper) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && new Double(this.numTackles).compareTo(new Double(c.numTackles))==0 && this.sweepUps==c.sweepUps;
		
	}
}
