import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    private char DB;
    private char nilai;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    private final String url = "/Users/Muhammad Faisal A/Downloads/mysql/mysql-connector-java-8.0.29";
    private String dBase = "jdbc:mysql://localhost/";
    private String username;
    private String password;
    private Connection con;
    private Statement stmt;
    private String db = "greenfootuasdb";
    
    
    public void database(String username, String password)
    {
        dBase = dBase + db;
        username = username;
        password = password;
        
    }
    
     
    public void act() 
    {
         
    }
    
    public void cek()
    {
        try {
            
            Class.forName(url);
            
            con = DriverManager.getConnection(dBase,  username, password);
            
            stmt =  con.createStatement();
        }
        catch (ClassNotFoundException  cnf) {
            System.out.println(cnf.toString());
        }
        catch (SQLException sql) {
            System.out.println(sql.toString());
        }
    }
     
    public void pengecekan()
    {
        try {
            stmt.close();
            con.close();
        }
        catch (SQLException sql) {
            System.out.println(sql.toString());
        }
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        tampilan();

        prepare();
    }
    public void DB()
    {
        
    }

    public void updatenilai(char point)
    {
        
    }
    public void tampilan()
    {
        showText("Nilai dari database:"+DB,400,30);
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        bee bee = new bee();
        addObject(bee,164,197);
        bee.setLocation(164,196);
        bee.setLocation(164,196);
        bee.setLocation(164,195);
        bee.setLocation(164,196);
    }
}
