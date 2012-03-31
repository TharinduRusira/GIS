/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;


/**
 *
 * @author User
 */
public abstract class Tracker {
    private Waypoint currentLocation;
    protected CopyOnWriteArrayList history=new CopyOnWriteArrayList();
    
    protected boolean isFinished=false;
    Iterator i;
    
    public void addLocation(Waypoint Location){
        this.currentLocation=Location;
        
        history.add(currentLocation);
        
    }
    public void removeLocation(Waypoint point){
        history.remove(point);
    }
    public abstract void showPath();
        
    
    public void setFinish(boolean isFinished){
        this.isFinished=isFinished;
    }
    
}
