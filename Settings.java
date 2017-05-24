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

public class Settings 
{
    public boolean BIBI;
    public boolean PRINTEMPS;
    public boolean LILY_WHITE;
    public boolean FIRST_YEARS;
    public boolean SECOND_YEARS;
    public boolean THIRD_YEARS;
    public boolean SR_GUARENTEED;
    public final static boolean ON = true;
    public final static boolean OFF = false;
    public boolean CYARON;
    public boolean GUILTY_KISS;
    public boolean AZALEA;
    
    public Settings()
    {
        BIBI = false;
        PRINTEMPS = false;
        LILY_WHITE = false;
        FIRST_YEARS = false;
        SECOND_YEARS = false;
        THIRD_YEARS = false;
        SR_GUARENTEED = false;
        CYARON = false;
        GUILTY_KISS = false;
        AZALEA = false;
    }
    public void guaranteedSR()
    {
        SR_GUARENTEED = true;
    }
    public void adjustSettings(int i)
    {
        if( i == 1)
        {
            if(BIBI == false)
            {
                BIBI = true;
                PRINTEMPS = false;
                LILY_WHITE = false;
                FIRST_YEARS = false;
                SECOND_YEARS = false;
                THIRD_YEARS = false;
            }
            else
            {
                BIBI = false;
            }
        }
        else if(i == 2)
        {
            if(PRINTEMPS == false)
            {
                BIBI = false;
                PRINTEMPS = true;
                LILY_WHITE = false;
                FIRST_YEARS = false;
                SECOND_YEARS = false;
                THIRD_YEARS = false;
            }
            else
                PRINTEMPS = false;
        }
        else if(i == 3)
        {
            if(LILY_WHITE == false)
            {
                BIBI = false;
                PRINTEMPS = false;
                LILY_WHITE = true;
                FIRST_YEARS = false;
                SECOND_YEARS = false;
                THIRD_YEARS = false;
            }
            else
                LILY_WHITE = false;
        }
        else if(i == 4)
        {
            if(FIRST_YEARS == false)
            {
                BIBI = false;
                PRINTEMPS = false;
                LILY_WHITE = false;
                FIRST_YEARS = true;
                SECOND_YEARS = false;
                THIRD_YEARS = false;
            }
            else
                FIRST_YEARS = false;
        }
        else if(i == 5)
        {
            if(SECOND_YEARS == false)
            {
                BIBI = false;
                PRINTEMPS = false;
                LILY_WHITE = false;
                FIRST_YEARS = false;
                SECOND_YEARS = true;
                THIRD_YEARS = false;
            }
            else
                SECOND_YEARS = false;
        }
        else if( i == 6) 
        {
            if(THIRD_YEARS == false)
            {
                BIBI = false;
                PRINTEMPS = false;
                LILY_WHITE = false;
                FIRST_YEARS = false;
                SECOND_YEARS = false;
                THIRD_YEARS = true;
            }
            else
                THIRD_YEARS = false;
        }
        else if( i == 7)
        {
            if(SR_GUARENTEED == false)
                SR_GUARENTEED = true;
            else
                SR_GUARENTEED = false;
        }
    }
    public String checkSettings(boolean b)
    {
        String s;
        if(b)
            return String.format("On\n");
        else
            return String.format("Off\n");
        
    }
}

