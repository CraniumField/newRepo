import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;
public class MemoryGame extends JFrame{
    JPanel Canvas;
    JPanel Title;
    Label title;
    JPanel scoreBoard;
    Label scoreboard;
    ColorBox colors;
    static int x;
    public MemoryGame(String s){
        super("Memory");
        x = 0;
        Title = new JPanel();
        title = new Label("MEMORY GAME  You have 5 seconds to memorize the colors!"); // Title + Guideline
        scoreBoard = new JPanel();
        scoreboard = new Label("BRAINPOWER SCORE: "+x);
        
        colors = new ColorBox(s); // Initializing class ColorBox(s==Difficulty chosen in FirstFrame)


        setLayout(new BorderLayout());
        setExtendedState(JFrame.MAXIMIZED_BOTH); // FULLSCREEN
        setVisible(true);
        Title.add(title);
        add("North", Title);
        add("Center", colors);
        add("South", scoreBoard);
    }
}