import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Instructions extends JFrame {
    JTextArea instructions;
    public Instructions() {
        super();
        instructions = new JTextArea("Welcome to the Memory Game! \n Choose between difficulties easy, medium, hard and extreme \n You will have 5 seconds to memorize the colors of the boxes \n The amount of time you have will rise with the difficulty \n The colors will be erased when the time's up so pay attention! \n Using your memory, match the appropriate color to each box \n ~~~~~ Use Next to navigate through the Boxes ~~~~~ \n The Goal of the game is to beat as high a difficulty as you can \n Are you a MEMORY MASTER? GOOD LUCK!");
        setSize(370,200);
        setVisible(true);
        add(instructions);
    }
}