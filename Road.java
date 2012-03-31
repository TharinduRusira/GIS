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
public class Road {
    private String roadName;
    private String roadIdentifier;
    private Waypoint startingWaypoint;
    private Waypoint endingWaypoint;
    private CopyOnWriteArrayList waypointList=new CopyOnWriteArrayList() ;
    
    
    public Road(Waypoint start,Waypoint end,List waypointList,String name,String id){
        this.startingWaypoint=start;
        this.endingWaypoint=end;
        this.waypointList.addAll(waypointList);
        this.roadName=name;
        this.roadIdentifier=id;
    
    }
    
    public void getRoad(){
           Iterator it=waypointList.iterator();
           startingWaypoint.getWaypoint();
           
           while(it.hasNext()){
               Waypoint temp=(Waypoint) it.next();
               temp.getWaypoint();
           }
           endingWaypoint.getWaypoint();
    }

    
    
    
}
