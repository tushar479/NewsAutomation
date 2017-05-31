package com.NewsAutomation.jersey;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class NewsAutomation {
	private int EventID;
	private String EventName ;
	private String PGRaceURL;
	private String RaceIntro;
	private String RaceDate;
	private String Sponsor1;
	private String Sponsor2;
	private String State;
	private String City;
	private String Season;
	private String ResultsURL;
	private String Race_Page_URL;
	private String WebsiteURL;
	private Double Purse;
	private String Course1;
	private String Course1AgeGroups;
	private String Course1CraftTypes;
	private String Course2;
	private int Event;
	private String Wind;
	private String Sky;
	private int Temp;
	private String Surf;
	private int Participant;
	private String OverallMaleCourse1;
	private String Gender;
	private String OverallMaleCourse1Time;
	private String OverallMaleCourse1Craft;
	private String SecondndOverallMaleCourse1Craft;
	private String SecondOverallMaleCourse1;
	private String SecondOverallMaleCourse1Time;
	private String ThirdOverallMaleCourse1;
	private String OverallFemaleCourse1;
	private String OverallFemaleCourse1Time;
	private String OverallFemaleCourse1Craft;
	private String SecondOverallFemaleCourse1;
	private String SecondOverallFemaleCourse1Craft;
	private String ThirdOverallFemaleCourse1;
	private String ThirdOverallFemaleCourse1Craft;
	private String FourthOverallFemaleCourse1;
	private String PhotographerName;
	private String PhotoURL;
	private String ReplayURL;
	private String StreamURL;
	
	 int getEventID() {
		return EventID;
	}

	public void setEventID(int eventID) {
		EventID = eventID;
	}

	public String getEventName() {
		return EventName;
	}

	public void setEventName(String eventName) {
		EventName = eventName;
	}
	
	public String getPGRaceURL() {
		return PGRaceURL;
	}

	public void setPGRaceURL(String pGRaceURL) {
		PGRaceURL = pGRaceURL;
	}

	public String getRaceIntro() {
		return RaceIntro;
	}

	public void setRaceIntro(String raceIntro) {
		RaceIntro = raceIntro;
	}

	public String getRaceDate() {
		return RaceDate;
	}

	public void setRaceDate(String raceDate) {
		RaceDate = raceDate;
	}

	public String getSponsor1() {
		return Sponsor1;
	}

	public void setSponsor1(String sponsor1) {
		Sponsor1 = sponsor1;
	}

	public String getSponsor2() {
		return Sponsor2;
	}

	public void setSponsor2(String sponsor2) {
		Sponsor2 = sponsor2;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getSeason() {
		return Season;
	}

	public void setSeason(String season) {
		Season = season;
	}

	public String getResultsURL() {
		return ResultsURL;
	}

	public void setResultsURL(String resultsURL) {
		ResultsURL = resultsURL;
	}

	public String getRace_Page_URL() {
		return Race_Page_URL;
	}

	public void setRace_Page_URL(String race_Page_URL) {
		Race_Page_URL = race_Page_URL;
	}

	public String getWebsiteURL() {
		return WebsiteURL;
	}

	public void setWebsiteURL(String websiteURL) {
		WebsiteURL = websiteURL;
	}

	public Double getPurse() {
		return Purse;
	}

	public void setPurse(Double purse) {
		Purse = purse;
	}

	public String getCourse1() {
		return Course1;
	}

	public void setCourse1(String course1) {
		Course1 = course1;
	}

	public String getCourse1AgeGroups() {
		return Course1AgeGroups;
	}

	public void setCourse1AgeGroups(String course1AgeGroups) {
		Course1AgeGroups = course1AgeGroups;
	}

	public String getCourse1CraftTypes() {
		return Course1CraftTypes;
	}

	public void setCourse1CraftTypes(String course1CraftTypes) {
		Course1CraftTypes = course1CraftTypes;
	}

	public String getCourse2() {
		return Course2;
	}

	public void setCourse2(String course2) {
		Course2 = course2;
	}

	public int getEvent() {
		return Event;
	}

	public void setEvent(int event) {
		Event = event;
	}

	public String getWind() {
		return Wind;
	}

	public void setWind(String wind) {
		Wind = wind;
	}

	public String getSky() {
		return Sky;
	}

	public void setSky(String sky) {
		Sky = sky;
	}

	public int getTemp() {
		return Temp;
	}

	public void setTemp(int temp) {
		Temp = temp;
	}

	public String getSurf() {
		return Surf;
	}

	public void setSurf(String surf) {
		Surf = surf;
	}

	public int getParticipant() {
		return Participant;
	}

	public void setParticipant(int participant) {
		Participant = participant;
	}

	public String getOverallMaleCourse1() {
		return OverallMaleCourse1;
	}

	public void setOverallMaleCourse1(String overallMaleCourse1) {
		OverallMaleCourse1 = overallMaleCourse1;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getOverallMaleCourse1Time() {
		return OverallMaleCourse1Time;
	}

	public void setOverallMaleCourse1Time(String overallMaleCourse1Time) {
		OverallMaleCourse1Time = overallMaleCourse1Time;
	}

	public String getOverallMaleCourse1Craft() {
		return OverallMaleCourse1Craft;
	}

	public void setOverallMaleCourse1Craft(String overallMaleCourse1Craft) {
		OverallMaleCourse1Craft = overallMaleCourse1Craft;
	}

	public String getSecondndOverallMaleCourse1Craft() {
		return SecondndOverallMaleCourse1Craft;
	}

	public void setSecondndOverallMaleCourse1Craft(String secondndOverallMaleCourse1Craft) {
		SecondndOverallMaleCourse1Craft = secondndOverallMaleCourse1Craft;
	}

	public String getSecondOverallMaleCourse1() {
		return SecondOverallMaleCourse1;
	}

	public void setSecondOverallMaleCourse1(String secondOverallMaleCourse1) {
		SecondOverallMaleCourse1 = secondOverallMaleCourse1;
	}

	public String getSecondOverallMaleCourse1Time() {
		return SecondOverallMaleCourse1Time;
	}

	public void setSecondOverallMaleCourse1Time(String secondOverallMaleCourse1Time) {
		SecondOverallMaleCourse1Time = secondOverallMaleCourse1Time;
	}

	public String getThirdOverallMaleCourse1() {
		return ThirdOverallMaleCourse1;
	}

	public void setThirdOverallMaleCourse1(String thirdOverallMaleCourse1) {
		ThirdOverallMaleCourse1 = thirdOverallMaleCourse1;
	}

	public String getOverallFemaleCourse1() {
		return OverallFemaleCourse1;
	}

	public void setOverallFemaleCourse1(String overallFemaleCourse1) {
		OverallFemaleCourse1 = overallFemaleCourse1;
	}

	public String getOverallFemaleCourse1Time() {
		return OverallFemaleCourse1Time;
	}

	public void setOverallFemaleCourse1Time(String overallFemaleCourse1Time) {
		OverallFemaleCourse1Time = overallFemaleCourse1Time;
	}

	public String getOverallFemaleCourse1Craft() {
		return OverallFemaleCourse1Craft;
	}

	public void setOverallFemaleCourse1Craft(String overallFemaleCourse1Craft) {
		OverallFemaleCourse1Craft = overallFemaleCourse1Craft;
	}

	public String getSecondOverallFemaleCourse1() {
		return SecondOverallFemaleCourse1;
	}

	public void setSecondOverallFemaleCourse1(String secondOverallFemaleCourse1) {
		SecondOverallFemaleCourse1 = secondOverallFemaleCourse1;
	}

	public String getSecondOverallFemaleCourse1Craft() {
		return SecondOverallFemaleCourse1Craft;
	}

	public void setSecondOverallFemaleCourse1Craft(String secondOverallFemaleCourse1Craft) {
		SecondOverallFemaleCourse1Craft = secondOverallFemaleCourse1Craft;
	}

	public String getThirdOverallFemaleCourse1() {
		return ThirdOverallFemaleCourse1;
	}

	public void setThirdOverallFemaleCourse1(String thirdOverallFemaleCourse1) {
		ThirdOverallFemaleCourse1 = thirdOverallFemaleCourse1;
	}

	public String getThirdOverallFemaleCourse1Craft() {
		return ThirdOverallFemaleCourse1Craft;
	}

	public void setThirdOverallFemaleCourse1Craft(String thirdOverallFemaleCourse1Craft) {
		ThirdOverallFemaleCourse1Craft = thirdOverallFemaleCourse1Craft;
	}

	public String getFourthOverallFemaleCourse1() {
		return FourthOverallFemaleCourse1;
	}

	public void setFourthOverallFemaleCourse1(String fourthOverallFemaleCourse1) {
		FourthOverallFemaleCourse1 = fourthOverallFemaleCourse1;
	}

	public String getPhotographerName() {
		return PhotographerName;
	}

	public void setPhotographerName(String photographerName) {
		PhotographerName = photographerName;
	}

	public String getPhotoURL() {
		return PhotoURL;
	}

	public void setPhotoURL(String photoURL) {
		PhotoURL = photoURL;
	}

	public String getReplayURL() {
		return ReplayURL;
	}

	public void setReplayURL(String replayURL) {
		ReplayURL = replayURL;
	}

	public String getStreamURL() {
		return StreamURL;
	}

	public void setStreamURL(String streamURL) {
		StreamURL = streamURL;
	}
	
	public NewsAutomation(int EventID,String EventName,String PGRaceURL,String RaceIntro,String RaceDate,String Sponsor1,String Sponsor2
			,String State,String City,String Season,String ResultsURL,String Race_Page_URL,String WebsiteURL,Double Purse
			,String Course1,String Course1AgeGroups,String Course1CraftTypes,String Course2,int Event,String Wind,String Sky
			,int Temp,String Surf,int Participant,String OverallMaleCourse1,String Gender,String OverallMaleCourse1Time,String OverallMaleCourse1Craft
			, String SecondndOverallMaleCourse1Craft,String SecondOverallMaleCourse1,String SecondOverallMaleCourse1Time,String ThirdOverallMaleCourse1
			,String OverallFemaleCourse1,String OverallFemaleCourse1Time,String OverallFemaleCourse1Craft,String SecondOverallFemaleCourse1
			,String SecondOverallFemaleCourse1Craft,String ThirdOverallFemaleCourse1,String ThirdOverallFemaleCourse1Craft
			,String FourthOverallFemaleCourse1,String PhotographerName,String PhotoURL,String ReplayURL,String StreamURL) {
		super();
        this.EventID = EventID;
        this.EventName = EventName;
        this.PGRaceURL = PGRaceURL;
        this.RaceIntro = RaceIntro;
        this.RaceDate = RaceDate;
        this.Sponsor1 = Sponsor1;
        this.Sponsor2 = Sponsor2;
        this.State = State;
        this.City = City;
        this.Season = Season;
        this.ResultsURL = ResultsURL;
        this.Race_Page_URL = Race_Page_URL;
        this.WebsiteURL = WebsiteURL;
        this.Purse = Purse;
        this.Course1 = Course1;
        this.Course1AgeGroups = Course1AgeGroups;
        this.Course1CraftTypes = Course1CraftTypes;
        this.Course2 = Course2;
        this.Event = Event;
        this.Wind = Wind;
        this.Sky = Sky;
        this.Temp = Temp;
        this.Surf = Surf;
        this.Participant = Participant;
        this.OverallMaleCourse1 = OverallMaleCourse1;
        this.Gender = Gender;
        this.OverallMaleCourse1Time = OverallMaleCourse1Time;
        this.OverallMaleCourse1Craft = OverallMaleCourse1Craft;
        this.SecondndOverallMaleCourse1Craft = SecondndOverallMaleCourse1Craft;
        this.SecondOverallMaleCourse1 = SecondOverallMaleCourse1;
        this.SecondOverallMaleCourse1Time = SecondOverallMaleCourse1Time;
        this.ThirdOverallMaleCourse1 = ThirdOverallMaleCourse1;
        this.OverallFemaleCourse1 = OverallFemaleCourse1;
        this.OverallFemaleCourse1Time = OverallFemaleCourse1Time;
        this.OverallFemaleCourse1Craft = OverallFemaleCourse1Craft;
        this.SecondOverallFemaleCourse1 = SecondOverallFemaleCourse1;
        this.SecondOverallFemaleCourse1Craft = SecondOverallFemaleCourse1Craft;
        this.ThirdOverallFemaleCourse1 = ThirdOverallFemaleCourse1;
        this.ThirdOverallFemaleCourse1Craft = ThirdOverallFemaleCourse1Craft;
        this.FourthOverallFemaleCourse1 = FourthOverallFemaleCourse1;
        this.PhotographerName = PhotographerName;
        this.PhotoURL  = PhotoURL;
        this.ReplayURL = ReplayURL;
        this.StreamURL = StreamURL;    
	}
	
		public NewsAutomation() {
		super();
	}

	
}
