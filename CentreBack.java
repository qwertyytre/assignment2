package defender;

import java.util.Date;

public class CentreBack extends Defender
{
	protected int shotsBlocked;
	
	public CentreBack()
	{
		super();
		shotsBlocked=0;
	}
	public CentreBack(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed,double numTackles, int shotsBlocked)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed, numTackles);
		this.shotsBlocked= shotsBlocked;
	}
	
	public CentreBack(CentreBack c)
	{
		super((Defender)c);
		this.shotsBlocked=c.shotsBlocked;
	}
	
	//Accessor
	public int getShotsBlocked() {return shotsBlocked;}
	
	//Mutator
	public void setShotsBlocked(int shotsBlocked) {this.shotsBlocked=shotsBlocked;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Centre Back\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of tackles: "+numTackles+"\nNumber of shots blocked: "+shotsBlocked+"\n";
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
		
		if (!(o instanceof CentreBack))
		{
            return false;
        }
		CentreBack c =(CentreBack) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && new Double(this.numTackles).compareTo(new Double(c.numTackles))==0 && this.shotsBlocked==c.shotsBlocked;
		
	}
}
