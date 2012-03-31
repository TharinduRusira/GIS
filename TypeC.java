/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 *
 * @author User
 */
public final class TypeC extends Tracker{
    private CopyOnWriteArrayList tempList=new CopyOnWriteArrayList();

    @Override
    public void showPath() {
        i=history.iterator();
        System.out.println("Type C tracker shows path");
        
        if(!isFinished){
            while(i.hasNext()){
            Waypoint temp=(Waypoint) i.next();
            temp.getWaypoint();
            
        }
               
        }
        else{
            while(i.hasNext()){
            Waypoint temp=(Waypoint) i.next();
            boolean add = tempList.add(temp);
            boolean contains=tempList.contains(temp);
            if(contains){
                tempList.remove(temp);
            }
    
            temp.getWaypoint();
            
        }
        
        }
        System.out.println("end of list\n");
    }
    
}
