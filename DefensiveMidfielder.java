package midfielder;
import java.util.Date;

public class DefensiveMidfielder extends Midfielder
{
	protected int intercepts;
	
	public DefensiveMidfielder()
	{
		super();
		intercepts=0;
	}
	
	public DefensiveMidfielder(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed, int attacksStopped, int intercepts)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,attacksStopped);
		this.intercepts=intercepts;
	}
	
	public DefensiveMidfielder(DefensiveMidfielder c)
	{
		super((Midfielder) c);
		this.intercepts=c.intercepts;
	}
	
	//Accessor
	public int getIntercepts() {return intercepts;}
	
	//Mutator
	public void setIntercepts(int intercepts) {this.intercepts=intercepts;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: DefensiveMidfielder\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of attacks stopped: "+attacksStopped+"\nNumber of intercepts :"+intercepts+"\n";
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
		
		if (!(o instanceof DefensiveMidfielder))
		{
            return false;
        }
		DefensiveMidfielder c =(DefensiveMidfielder) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && this.attacksStopped==c.attacksStopped && this.intercepts==c.intercepts;
		
	}
}
