/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

/**
 *
 * @author User
 */
public class Waypoint {
    private int x,y;
    double height;
    private String pointName;
    
    
    public Waypoint(int x,int y,double height, String name){
        this.x=x;
        this.y=y;
        this.height=height;
        this.pointName=name;
    }
    
    public void getWaypoint(){
        System.out.println(pointName+ " (x,y,height) = "+"("+x+","+y+" ,"+height+")"+"\n");
        
    
    }
    public String sayName(){
        return pointName;
    }
    public int X(){
        return x;
    }
    public int Y(){
        return y;
    }
    
}
