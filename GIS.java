/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;


/**
 *
 * @author User
 */
public class GIS {

    
        public void setConnection(){
        
            try {
                Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost/trafficsystem?"+"user=root";
            try{
                Statement stmt=null;
                Connection con=DriverManager.getConnection(url);
                stmt=con.createStatement();
            }catch(Exception e){
                System.out.println(e.toString());
            }
            
                
            
        }catch(Exception a){
            System.out.println(a.toString());
        }
        }
        
        
    
    
    //create 3 new roads and give 3 waypoints each
    
//    public static void main(String[] args) {
//        
//    //Waypoint waypoint1=new Waypoint(0.20000,0.3321,"University");
//    Waypoint waypoint2=new Waypoint(6.43,4.53,7.32,"Katubedda");
//    //Waypoint waypoint3=new Waypoint(2.3,4.6,"Rathmalana");
//    //Waypoint waypoint4=new Waypoint(7.8,10.5,"Colombo");
//    //Waypoint waypoint5=new Waypoint(20.4,25.6,"Piliyandala");
//    Waypoint waypoint6=new Waypoint(3.42,4.32,3.42,"Kohuwala");
//    //Waypoint waypoint7=new Waypoint(30.4,48.0,"Havelock town");
//    Waypoint waypoint8=new Waypoint(7.54,9.34,2.53,"Dehiwala");
//    Waypoint waypoint9=new Waypoint(3.64,4.32,3.43,"Bambalapitiya");
//    
//    TRAFFICCON dataSystem=new TRAFFICCON();
//
//    
//    User user[]=new User[4];
//    for (int n=0;n<4;n++){
//        user[n]=new User(dataSystem);
//    }
//    
//    
//    user[0].setJunction(waypoint2);
//    user[1].setJunction(waypoint9);
//    user[2].setJunction(waypoint8);
//    user[3].setJunction(waypoint6);
//    
//    
//    
//    TRAFFICSEN sen1=new TRAFFICSEN("Katubedda",waypoint2,dataSystem);
//    TRAFFICSEN sen2=new TRAFFICSEN("Bambalapitiya",waypoint9,dataSystem);
//    TRAFFICSEN sen3=new TRAFFICSEN("Dehiwala",waypoint8,dataSystem);
//    TRAFFICSEN sen4=new TRAFFICSEN("Kohuwala",waypoint6,dataSystem);
//
//    
//   
//    dataSystem.setUsers(user);// subscribe users into the System
//    
//    user[0].addObserver(sen1);
//    user[1].addObserver(sen2);
//    user[2].addObserver(sen3);
//    user[3].addObserver(sen4);
//    
//    
//    
//    
//    
//    
//    sen1.start();
//    sen2.start();
//    sen3.start();
//    sen4.start();
//    
//    user[0].run();
//    user[1].run();
//    user[2].run();
//    user[3].run();
//    
//    
//    
////    List road1=new ArrayList();
////    List road2=new ArrayList();
////    
////    boolean success;
////        //Galle road
////        success=road1.add(waypoint2);
////        success=road1.add(waypoint3);
////        success=road1.add(waypoint8);
////        success=road1.add(waypoint9);
////                
////        //////////////
////        
////       //Piliyandala road 
////        success=road2.add(waypoint5);
////        success=road2.add(waypoint6);
////        success=road2.add(waypoint7);
////        
////        ////////////////
////       
////    
////        
////        Road galleRoad=new Road(waypoint1,waypoint4,road1,"Galle road","A2");
////        Road piliyandalaRoad=new Road(waypoint1,waypoint4,road2,"Piliyandala road","B25");
////        
////        List roadMap=new ArrayList() ;
////        roadMap.add(galleRoad);// two roads have been added to the map
////        roadMap.add(piliyandalaRoad);// "" ""
////        TypeA trackerA=new TypeA();
////        TypeB trackerB=new TypeB();
////        TypeC trackerC=new TypeC();
////        Traveler man=new Traveler();
////        man.setTraveler(waypoint1,waypoint4,trackerA,roadMap);// now he's at the university
////        // now we simulate the scenario where the traveler go to Katubedda and turn back, go to piliyandala and then to Colombo via Piliyandala.
////            // Type A
////        man.setCurrentLocation(waypoint1);// university 
////        man.setCurrentLocation(waypoint2);// Katubedda
////        man.setCurrentLocation(waypoint1);// University again
////        man.setCurrentLocation(waypoint5);// Piliyandala
////        man.setCurrentLocation(waypoint6);// Kohuwala
////        man.setCurrentLocation(waypoint7);// Havelock town
////        man.setCurrentLocation(waypoint4);// Colombo
////        boolean finish=man.sayFinish();
////        if(finish)
////            System.out.println("finished");
////        trackerA.setFinish(finish);
////       // trackerA.showPath();
////        
////            //Type B
////        trackerB.showPath();
////        
////         
//        
//    }
//    

    
}
