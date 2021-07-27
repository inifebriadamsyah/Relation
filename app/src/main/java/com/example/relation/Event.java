package com.example.relation;

public class Event {

    private String eventName;
    private String eventHolder;
    private String eventTime;
    private String eventLocation;
    private String eventCategory;


    public Event(String eventName, String eventHolder, String eventTime, String eventLocation, String eventCategory){

        this. eventName = eventName;
        this. eventHolder = eventHolder;
        this. eventTime = eventTime;
        this. eventLocation = eventLocation;
        this. eventCategory = eventCategory;

    }

    public void setEventName(String eventName){
        this.eventName = eventName;
    }

    public String getEventName(){
        return eventName;
    }

    public void setEventHolder(String eventHolder){
        this.eventHolder = eventHolder;
    }

    public String getEventHolder(){
        return eventHolder;
    }

    public void setEventTime(String eventTime){
        this.eventTime = eventTime;
    }

    public String getEventTime(){
        return eventTime;
    }

    public void setEvenLocation(String eventLocation){
        this.eventLocation = eventLocation;
    }

    public String getEventLocation(){
        return eventLocation;
    }

    public void setEventCategory(String eventCategory){
        this.eventCategory = eventCategory;
    }

    public String getEventCategory(){
        return eventCategory;
    }
}
