/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

/**
 *
 * @author User
 */
public final class TypeA extends Tracker  {

    @Override
    public void showPath() {
        i=history.iterator();
        System.out.println("Type A tracker shows path");
        
        while(i.hasNext()){
            Waypoint temp=(Waypoint) i.next();
            temp.getWaypoint();
            
        }
        System.out.println("end of list\n");
              
    }
    
    
    
}
