package com.NewsAutomation.jersey;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
//http://localhost:8080/NewsAutomation/NewsAutomation/NewsAutomationService/news1
@Path("/NewsAutomationService")
public class NewsAutomationService {
	@GET
	@Path("/news")
    @Produces(MediaType.APPLICATION_JSON)
	public List getNewsInJSON(@QueryParam("EventID") int EventID) throws SQLException {
		List listNews = new ArrayList();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsAutomation", "root", "tushar");  
					//here sonoo is database name, root is username and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select * from news where EventID = " +EventID+ "");  
					while(rs.next())  
					{
						NewsAutomation NAuto = new NewsAutomation();
						NAuto.setEventID(rs.getInt(1));
						NAuto.setEventName(rs.getString(2));
						NAuto.setPGRaceURL(rs.getString(3));
						NAuto.setRaceIntro(rs.getString(4));
						NAuto.setRaceDate(rs.getString(5));
						NAuto.setSponsor1(rs.getString(6));
						NAuto.setSponsor2(rs.getString(7));
						NAuto.setState(rs.getString(8));
						NAuto.setCity(rs.getString(9));
						NAuto.setSeason(rs.getString(10));
						NAuto.setResultsURL(rs.getString(11));
						NAuto.setRace_Page_URL(rs.getString(12));
						NAuto.setWebsiteURL(rs.getString(13));
						NAuto.setPurse(rs.getDouble(14));
						NAuto.setCourse1(rs.getString(15));
						NAuto.setCourse1AgeGroups(rs.getString(16));
						NAuto.setCourse1CraftTypes(rs.getString(17));
						NAuto.setCourse2(rs.getString(18));
						NAuto.setEvent(rs.getInt(19));
						NAuto.setWind(rs.getString(20));
						NAuto.setSky(rs.getString(21));
						NAuto.setTemp(rs.getInt(22));
						NAuto.setSurf(rs.getString(23));
						NAuto.setParticipant(rs.getInt(24));
						NAuto.setOverallMaleCourse1(rs.getString(25));
						NAuto.setGender(rs.getString(26));
						NAuto.setOverallMaleCourse1Time(rs.getString(27));
						NAuto.setOverallMaleCourse1Craft(rs.getString(28));
						NAuto.setSecondOverallMaleCourse1(rs.getString(29));
						NAuto.setSecondOverallMaleCourse1Time(rs.getString(30));
						NAuto.setThirdOverallMaleCourse1(rs.getString(31));
						NAuto.setOverallFemaleCourse1(rs.getString(32));
						NAuto.setOverallFemaleCourse1Time(rs.getString(33));
						NAuto.setOverallFemaleCourse1Craft(rs.getString(34));
						NAuto.setSecondOverallFemaleCourse1(rs.getString(35));
						NAuto.setSecondOverallFemaleCourse1Craft(rs.getString(36));
						NAuto.setThirdOverallFemaleCourse1(rs.getString(37));
						NAuto.setThirdOverallFemaleCourse1Craft(rs.getString(38));
						NAuto.setFourthOverallFemaleCourse1(rs.getString(39));
						NAuto.setPhotographerName(rs.getString(40));
						NAuto.setPhotoURL(rs.getString(41));
						NAuto.setReplayURL(rs.getString(42));
						NAuto.setStreamURL(rs.getString(43));
						
						listNews.add(NAuto);
					}
					//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
					con.close();  

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNews;
	}

	@GET
	@Path("/Events")
	@Produces(MediaType.APPLICATION_JSON)
	public List getEvents() throws SQLException {
		List listNews = new ArrayList();
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/NewsAutomation", "root", "tushar");  
					//here sonoo is database name, root is username and password  
					Statement stmt=con.createStatement();  
					ResultSet rs=stmt.executeQuery("select distinct EventID,EventName from news");  
					while(rs.next())  
					{
						Events NAuto = new Events();
						NAuto.setEventID(rs.getInt(1));
						NAuto.setEventName(rs.getString(2));
						listNews.add(NAuto);
					}
					//System.out.println(rs.getInt(1)+"  "+rs.getString(2)+"  "+rs.getString(3));  
					con.close();  

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return listNews;
	}


}
