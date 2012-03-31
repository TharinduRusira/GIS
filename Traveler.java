/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.util.List;

/**
 *
 * @author User
 */
public class Traveler {
    private Waypoint currentLocation;
    private List map;// traveler's road map,all possible roads
    private Waypoint start,end;
    private Tracker tracker;
    
    public void setTraveler(Waypoint start,Waypoint end,Tracker tracker,List map ){
        this.start=start;
        this.end=end;
        this.tracker=tracker;
        this.map=map;
    }
    public void setCurrentLocation(Waypoint location){
        this.currentLocation=location;
        tracker.addLocation(location);
    }
    
    public Waypoint getCurrentLocation(){
        return currentLocation;
    }
    
    public boolean sayFinish(){
        if(currentLocation==end)
            return true;
        else
            return false;
    }
    
    
    
}
