/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schoolidolbattle;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Joe
 */
public class CardLibrary 
{
    public ArrayList<Card> library;
    public CardLibrary()
    {
        library = new ArrayList();
    }
    public void initializeCardLibrary()
    {   
        String fileName = "cards.txt";
        String line = null;
        
        try
        {
            FileReader file = new FileReader(fileName);
            BufferedReader buffer = new BufferedReader(file);
            
            while((line = buffer.readLine()) != null)
            {
                String[] words = line.split(" ");
                addCardToLibrary(words[0], words[1], words[2], words[3],words[4],
                                 words[5],words[6]);
            }
            buffer.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Can't find file" + fileName);
        }
        catch(IOException i) 
        {
            System.out.println("Can't find file" + fileName);
        }
        
    }
    private void addCardToLibrary(String n, String r, String t, String u, String ti,
                                   String su, String y)
    {
        Card newCard = new Card(n, r, t, u,ti,su,y);
        
        library.add(newCard);
    }
    
    public Card getCard()
    {
        Card waifu = null;
        
        return waifu;
    }
}
