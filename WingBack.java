package defender;
import java.util.Date;

public class WingBack extends Defender
{
	protected int throwIns;
	
	public WingBack()
	{
		super();
		throwIns=0;
	}
	
	public WingBack(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed,double numTackles, int throwIns)
	{
		super(name,dateOfBirth,clubName,countryName, numYellowCards, numRedCards, gamesPlayed,numTackles);
		this.throwIns=throwIns;
	}
	
	public WingBack(WingBack c)
	{
		super((Defender) c);
		this.throwIns=c.throwIns;
	}
	
	//Accessor
	public int getThrowIns() {return throwIns;}
	
	//Mutator
	public void setThrowIns(int throwIns) {this.throwIns=throwIns;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: Wing Back\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\nNumber of tackles: "+numTackles+"\nNumber of Throw-Ins"+throwIns+"\n";
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
		
		if (!(o instanceof WingBack))
		{
            return false;
        }
		WingBack c =(WingBack) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed && new Double(this.numTackles).compareTo(new Double(c.numTackles))==0 && this.throwIns==c.throwIns;
		
	}
	
}
