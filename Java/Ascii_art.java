import java.util.*;
import java.io.*;
import java.util.regex.Pattern;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int L = in.nextInt();
        int H = in.nextInt();
        if (in.hasNextLine()) {
            in.nextLine();
        }
        String T = in.nextLine();

        char temp = 0;
        HashMap<Integer, Character> art = new HashMap<Integer, Character>(); //<position, char>
        
        // Parsing input
        for (int i = 0; i < T.length(); i++)
        {
            temp = T.charAt(i);
            if(Character.toString(temp).matches("[a-zA-Z]"))
                art.put(i,Character.toUpperCase(temp));
            else
                art.put(i,'?');
            
        }
        
        // Collect ASCII art needed and print
        String ROW = "", rowToPrint = "";
        int distance = 0;
        
        for (int i = 0; i < H; i++) {
            ROW = in.nextLine();
            for (int j = 0; j < art.size(); j++)
            {
                if (art.get(j) == '?')
                {
                    rowToPrint += ROW.substring(ROW.length()-L,ROW.length());
                }
                else
                {
                    distance = art.get(j) - 'A';
                    rowToPrint += ROW.substring(distance*L,distance*L + L);
                }
            }
            System.out.println(rowToPrint);
            rowToPrint = "";
        }

        
    }
}