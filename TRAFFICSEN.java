/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author User
 */
import java.util.Random;
public class TRAFFICSEN extends Thread implements Observer{
    
    private String index;
    private Waypoint location;
    private String trafficDetail;
    private TRAFFICCON con;
    String trafficLevel[]={"high","normal","low","No traffic"};// possible traffic levels
        
    
    public TRAFFICSEN(String index,Waypoint location,TRAFFICCON sys){
        this.index=index;
        this.location=location;
        this.con=sys;
        
    
    }
    
    public void setTrafficDetail(String detail){
        this.trafficDetail=detail;
    }
    public String updateTrafficCon(){
    
    return trafficDetail;
    }
    @Override
    public void run(){
        //this.setPriority(2);
        Random r=new Random();
        
        this.con.refreshTrafficMap(index,trafficLevel[r.nextInt(3)]);
        this.updateTrafficCon();
       
    
    }
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("a user has changed request");
        
        
    }
    
}
