/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolidolbattle;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Joe
 */
public class Scouter 
{   
    //public LoadResources loader = new LoadResources();
    String muse[] = {"Maki Nishikino", "Rin Hoshizora", "Maki Nishikino",
        "Honoka Kousaka", "Kotori Minami", "Umi Sonoda", "Eli Ayase", "Nico Yazawa",
        "Nozomi Tojo"};
    String aqours[] = {"Ruby Kurosawa", "Hanamaru Kunikida", "Yoshiko Tsushima",
        "Chika Takami", "You Watanabe", "Riko Sakurauchi", "Dia Kurosawa", 
        "Mari Ohara", "Kanan Matsuura"};

    private int scoutChoice;
    Scanner scan = new Scanner(System.in);
    Settings settings  = new Settings();
    private double luck;
    private int randomAQGirl;
    private int randomMGirl;
    
    
    public Scouter()
    {
        //loader.loadResources();
    }
    private void randomAqours()
    {
        Random r = new Random();
        randomAQGirl = r.nextInt(9);
    }
    private void randomMuse()
    {
        Random r = new Random();
        randomMGirl = r.nextInt(9);
    }
    public void soloScoutAqours() // return card to gui
    {      
       getLuck();
       displayScoutAqours();
       System.out.println();
    }
    private void getLuck()
    {
        luck = Math.random(); 
    }

    private void displayScoutAqours() 
    {
        randomAqours();
        if (luck > 0.99)
            System.out.println("You got a " + aqours[randomAQGirl] + " UR. "); 
        else if(luck > .95 && luck < .98)
            System.out.println("You got a " + aqours[randomAQGirl] + " SSR");
        else if ( luck > .81 && luck < .949)
            System.out.println("You got a " + aqours[randomAQGirl] + " SR");        
        else
            System.out.println("You got a " + aqours[randomAQGirl] + " R");

    }
    public void tenPlusOneScoutAqours() // return Card type to GUI???
    {
        settings.guaranteedSR();
        if(settings.SR_GUARENTEED == true)
        {
            luck = .82;
            displayScoutAqours();
            for(int i = 0; i < 10; i++)
            {
                getLuck();
                displayScoutAqours();
            }
            System.out.println();
        }
        else
        {
            for(int i = 0; i < 11; i++)
            {
                getLuck();
                displayScoutAqours();
            }          
            System.out.println();
        }
    }
    public void displayScoutMuse()
    {
        randomMuse();
        if (luck > 0.99)
            System.out.println("You got a " + muse[randomMGirl] + " UR. "); 
        else if(luck > .95 && luck < .98)
            System.out.println("You got a " + muse[randomMGirl] + " SSR");
        else if ( luck > .81 && luck < .949)
            System.out.println("You got a " + muse[randomMGirl] + " SR");        
        else
            System.out.println("You got a " + muse[randomMGirl] + " R");
    }
    public void soloScoutMuse()
    {
        getLuck();     
        displayScoutMuse();
        System.out.println();
    }
    public void tenPlusOneScoutMuse() // return Card type to GUI???
    {
        settings.guaranteedSR();
        if(settings.SR_GUARENTEED == true)
        {
            luck = .82;
            displayScoutMuse();
            for(int i = 0; i < 10; i++)
            {
                getLuck();
                displayScoutMuse();
            }
            System.out.println();
        }
        else
        {
            for(int i = 0; i < 11; i++)
            {
                getLuck();
                displayScoutMuse();
            }  
            System.out.println();
        }
    }
}

