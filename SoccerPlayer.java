package soccerplayer;
import java.util.Date;


public class SoccerPlayer
{
	
	protected String name;
	protected Date dateOfBirth;
	protected String clubName;
	protected String countryName;
	protected int numYellowCards;
	protected int numRedCards;
	protected int gamesPlayed;
	
	public SoccerPlayer()
	{
		name="";
		dateOfBirth =null;
		clubName="";
		countryName="";
		numYellowCards=0;
		numRedCards=0;
		gamesPlayed=0;
	}
	
	public SoccerPlayer(SoccerPlayer c)
	{
		this.name=c.name;
		this.dateOfBirth=c.dateOfBirth;
		this.clubName=c.clubName;
		this.countryName=c.countryName;
		this.numYellowCards= c.numYellowCards;
		this.numRedCards= c.numRedCards;
		this.gamesPlayed=c.gamesPlayed;
		
	}
	
	public SoccerPlayer(String name,Date dateOfBirth,String clubName,String countryName, int numYellowCards, int numRedCards,int gamesPlayed)
	{
		this.name=name;
		this.dateOfBirth=dateOfBirth;
		this.clubName=clubName;
		this.countryName=countryName;
		this.numYellowCards= numYellowCards;
		this.numRedCards= numRedCards;
		this.gamesPlayed=gamesPlayed;
	}
	
	//Accessors
	public String getName(){return name;}
	public Date getDateOfBirth(){return dateOfBirth;}
	public String getClubName(){return clubName;}
	public String getCountryName(){return countryName;}
	public int getNumYellowCards(){return numYellowCards;}
	public int getNumRedCards(){return numRedCards;}
	public int getGamesPlayed(){return gamesPlayed;}
	
	
	//Mutators
	public void setName(String name){this.name=name;}
	public void setDateOfBirth(Date dateOfBirth){this.dateOfBirth=dateOfBirth;}
	public void setClubName(String clubName){this.clubName=clubName;}
	public void setCountryName(String countryName){this.countryName=countryName;}
	public void setNumYellowCards(int numYellowCards){this.numYellowCards=numYellowCards;}
	public void setNumRedCards(int numRedCards){this.numRedCards=numRedCards;}
	public void setNumGamesPlayed(int gamesPlayed){this.gamesPlayed=gamesPlayed;}
	
	public String toString()
	{
		return "\nName: "+name+"\nPosition: General Soccer Player\nDate of Birth: "+ dateOfBirth.toString()+"\nClub Name: "+clubName+"\nCountryName: "+countryName+"\nNumber Of Yellow Cards: "+numYellowCards+"\n Number Of Red Cards: "+numRedCards+"\n Number of Games Played: "+gamesPlayed+"\n";
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
		
		if (!(o instanceof SoccerPlayer))
		{
            return false;
        }
		SoccerPlayer c =(SoccerPlayer) o;
		return this.name.equals(c.name) && this.dateOfBirth.compareTo(c.dateOfBirth)==0 && this.clubName.equals(c.clubName) && this.countryName.equals(c.countryName) && this.numYellowCards==c.numYellowCards && this.numRedCards==c.numRedCards && this.gamesPlayed==c.gamesPlayed;
		
	}
	
	

}