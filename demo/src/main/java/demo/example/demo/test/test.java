package demo.example.demo.test;

import java.sql.*;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.boot.context.properties.ConfigurationProperties;
// import org.springframework.boot.context.properties.EnableConfigurationProperties;
// import org.springframework.stereotype.Component;


public class test {
    
    // public String test(){
    //     String url;
    //     return url = rdbHandler.getUrl();
    // }
    @Autowired
    private RdbHandler rdbHandler;
 
     public static void main(String[]args){
        
        //String url = "jdbc:sqlserver://kirk\\sqlexpress;databaseName=master;encrypt=true;trustServerCertificate=true";
       
        ///System.out.println(url);
        
        // String url = rdbHandler.getUrl();
        // String user = "sa";
        // String password = "admin";
        // try{
        //     Connection connection = DriverManager.getConnection(url, user, password);
        // String sql = "SELECT TOP 10  * FROM author";
        // Statement statement = connection.createStatement();

        // ResultSet result = statement.executeQuery(sql);

        // while(result.next()){
        //     String name = result.getString("author_name");
        //     System.out.println(name);
        // }
        //     connection.close();
        // }catch(SQLException e) {
        //     System.out.println("ERROR");
        //     e.printStackTrace();
        // }

     }

}
