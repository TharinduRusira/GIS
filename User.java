/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

/**
 *
 * @author User
 */
import java.util.*;
public class User extends Observable implements Runnable{
    private Waypoint waypoint;
    private TRAFFICCON sys;
    
    public User(TRAFFICCON s){
        this.sys=s;
    }
    public void setJunction(Waypoint junction){
        this.waypoint=junction;
        setChanged();
        notifyObservers("waypoint");
        
    }
    public Waypoint accessTrafficCon(){
        System.out.println(this.toString()+" has made a request to check "+waypoint.sayName());
        return waypoint;
    }
    @Override
    public void run() {
        
            
            Waypoint temp=this.accessTrafficCon();
            String a=temp.sayName();
            sys.getCurrentTraffic(a);
        
                
        
    }
    
    
}
