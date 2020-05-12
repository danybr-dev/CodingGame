import java.util.*;
import java.io.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
public class ChuckNorris {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();

        String binValue = "", tempString = "";
        
        // Convert chars in binary
        for (int i = 0; i < MESSAGE.length(); i++)
        {
            tempString = Integer.toBinaryString(MESSAGE.charAt(i));
            while(tempString.length() < 7) // check for 7 bit
                tempString = "0" + tempString;
            binValue += tempString;
        }
        
        // Encode to unary and build result
        String result = "";
        char currentSimbol = 0, previousChar = 0, currentChat = 0;
        int count = 1, binValueLength = binValue.length();
        
        for(int i = 0; i < binValueLength; i++)
        {
            currentChat = binValue.charAt(i);
            if (i == 0) // init
            {
                currentSimbol = currentChat;
            }
            else
            {
                if (previousChar != currentChat)
                {
                    result += currentSimbol == '1'? "0 " : "00 ";
                    for(int j = 0; j < count; j++)
                    {
                        result += "0"; // Adding number of zeros
                    }
                    count = 1;
                    currentSimbol = currentChat;
                    result += " ";
                }
                else
                {
                    count += 1;
                }
                
                if (i == binValueLength-1)
                {
                    result += currentSimbol == '1'? "0 " : "00 ";

                    for(int j = 0; j < count; j++)
                    {
                        result += "0"; // Adding number of zeros
                    }
                }

            }
            previousChar = currentChat;
        }
        System.out.println(result);
        in.close();
    }
}