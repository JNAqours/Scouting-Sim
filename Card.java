/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolidolbattle;

/**
 *
 * @author Joe
 */
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Card 
{
    private String name;
    private String rarity;
    private String type;
    private String imageURL;
    private String title;
    private String subunit;
    private String year;
    
    public Card (String n, String r, String t, String u, String ti, String su,
                 String y)
    {
        name = n;
        rarity = r;
        type = t;
        imageURL = u;
        title = ti;
        subunit = su;
        year = y;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getRarity()
    {
        return rarity;
    }
    public String getType()
    {
        return type;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getImageURL()
    {
        return imageURL;
    }
    public String getSubUnit()
    {
        return subunit;
    }
    public String getYearGroup()
    {
        return year;
    }
    
    
}
