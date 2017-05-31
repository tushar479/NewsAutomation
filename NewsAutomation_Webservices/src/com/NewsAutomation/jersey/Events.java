package com.NewsAutomation.jersey;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Events {
	private int EventID;
	private String EventName ;
	
	public String getEventName() {
		return EventName;
	}
	public void setEventName(String eventName) {
		EventName = eventName;
	}
	public int getEventID() {
		return EventID;
	}
	public void setEventID(int eventID) {
		EventID = eventID;
	}
	
	public Events(int EventID,String EventName)
	{
		super();
        this.EventID = EventID;
        this.EventName = EventName;
	}

	
	public Events() {
		super();
	}

}
