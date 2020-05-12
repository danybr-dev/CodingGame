import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 * ---
 * Hint: You can use the debug stream to print initialTX and initialTY, if Thor seems not follow your orders.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int lightX = in.nextInt(); // the X position of the light of power
        int lightY = in.nextInt(); // the Y position of the light of power
        int initialTx = in.nextInt(); // Thor's starting X position
        int initialTy = in.nextInt(); // Thor's starting Y position
        int distX = 0;
        int distY = 0;
        String direction = "";
        int positionX = initialTx, positionY = initialTy;
            
        // game loop
        while (true) {
            int remainingTurns = in.nextInt(); // The remaining amount of turns Thor can move. Do not remove this line.
            
            distX = positionX - lightX;
            distY = positionY - lightY;
        
            if (distY > 0)
            {
                //To up
                direction += "N";
                positionY -= 1;
            }
            else if (distY < 0)
            {
                // To down
                direction += "S";
                positionY += 1;
                
            }
            else
            {
                // No Y moves
                direction += "";
            }
            
            if (distX > 0)
            {
                //To left
                direction += "W";
                positionX -= 1;
            }
            else if (distX < 0)
            {
                // To right
                direction += "E";
                positionX += 1;
                
            }
            else
            {
                // No X moves
                direction += "";
            }
            
            System.out.println(direction);
            direction = "";
            
        }
    }
}