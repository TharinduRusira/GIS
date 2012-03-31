/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gis;

/**
 *
 * @author User
 */
//import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TRAFFICCON {
//    private HashMap currentTrafficMap=new HashMap();// junctionName is the key, and trafficLevel ara data.
 private User[] user=new User[4];// 5 users are subscribed to the system
    
    public void setUsers(User[] arr){
        System.arraycopy(arr, 0, this.user, 0, arr.length);
    }
    synchronized public void refreshTrafficMap(String key,String trLevel){
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/trafficsystem?"+"user=root";
            try{
                Statement stmt=null;
                Connection con=DriverManager.getConnection(url);
                stmt=con.createStatement();
                
                
                //SQL query code
                String SQL="UPDATE traffictable SET trafficLevel=\""+trLevel+"\" WHERE pointName= \""+key+"\";";
                int rowsAffected=stmt.executeUpdate(SQL);
                System.out.println("TRAFFICCON updated traffic details for junction "+key);
                
            }catch(Exception e){
                System.out.println(e.toString());
            }
        
        
        }catch(Exception e){
            System.out.println(e.toString());
        }
        
//        if(currentTrafficMap.containsKey(key)){
//            currentTrafficMap.remove(key);
//            System.out.println("TRAFFICON updated for junction--"+key);
//            currentTrafficMap.put(key, trLevel);
//            
//        }
//        else{
//            currentTrafficMap.put(key,trLevel);
//            System.out.println("TRAFFICCON added a new junction--"+key);
//        
//        }
//        
    }
    
    synchronized public void getCurrentTraffic(String junctionName){// connect to the remote data base and read data
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String url="jdbc:mysql://localhost/trafficsystem?"+"user=root";
            try{
                Statement stmt=null;
                Connection con=DriverManager.getConnection(url);
                stmt=con.createStatement();
                // SQL query command
                String SQL="SELECT*FROM traffictable where pointName='"+junctionName+"'";
                
                try{
                    ResultSet res=null;
                    res=stmt.executeQuery(SQL);
                    while(res.next()){
                        System.out.println("traffic level at "+res.getString("pointName") +" : "+ res.getString("trafficLevel"));
                    }
                
                }catch(Exception a){
                    System.out.println(a.toString());
                }
            }catch(Exception e){
                System.out.println(e.toString());
            }

        }catch(Exception e){
            System.out.println(e.toString());
        }    

//        String temp = (String) currentTrafficMap.get(junctionName);
//        int i=0;
//        while( i!=3){
//            if(temp!=null){
//            System.out.println("traffic level at "+ junctionName +" is "+ temp);
//                    break;
//            }
//            else{
//                this.refreshTrafficMap(junctionName, temp);
//            }
//            i++;
//        }
    }
    
//    public void createDB(){
//        Connection con = null;
//  try{
//  Class.forName("com.mysql.jdbc.Driver");
//  con = DriverManager.getConnection("jdbc:mysql://localhost:3307/trafficsystem","root","");
//  try{
//  Statement st = con.createStatement();
//  BufferedReader bf = new BufferedReader
//(new InputStreamReader(System.in));
//  System.out.println("Enter Database name:");
//  String database = bf.readLine();
//  st.executeUpdate("CREATE DATABASE "+database);
//  System.out.println("1 row(s) affacted");
//  }
//  catch (SQLException s){
//  System.out.println("SQL statement is not executed!");
//  }
//  }
//  catch (Exception e){
//      System.out.println(e.toString());
//  }
//    
//    
//    
//    }
//    
//    
//    public void feedDB(){
//    
//    
//    
//    }
//    
}
