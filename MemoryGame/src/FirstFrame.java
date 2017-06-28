import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class FirstFrame extends JFrame implements ActionListener, FocusListener
{
    JLabel label;
    JLabel image;
    JTextField dif;
    JButton start;
    JButton instructions;
    JPanel Title;
    ImageIcon img;
    public FirstFrame()
    {
        super("");
        Title = new JPanel();
        JLabel label = new JLabel("Difficulty:");
        dif = new JTextField("");
        start = new JButton("Start Game");
        instructions = new JButton("Instructions");
        
        // Adding actionlisteners
        
        start.addActionListener(this);
        instructions.addActionListener(this);
        
        // FocusListener ensures that Start Game is unclickable unless focused on
        
        dif.addFocusListener(this);
        start.setEnabled(false);


        // Adding image
        
        image = new JLabel();
        img = new ImageIcon(getClass().getResource("Brain-stimulation2.jpg"));
        image.setIcon(img);
        
        // Defining and creating GUI
        
        setSize(1000,1000);
        setLayout(new BorderLayout());
        Title.setLayout(new GridLayout());
        Title.add(label);
        Title.add(dif);
        Title.add(start);
        Title.add(instructions);
        add("North", Title);
        add("Center", image);
        pack();
        setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand() == "Start Game"){
            createGame();
        }
        if(e.getActionCommand() == "Instructions"){
            showInstructions();
        }
        if(e.getActionCommand() == "dif"){
            start.setEnabled(true);
        }
    }
    
    // FocusListener ensures that Start Game is unclickable unless focused on
    
    public void focusGained(FocusEvent fe){
        if(fe.getSource()==dif)
            start.setEnabled(true);
    }
    public void focusLost(FocusEvent fe){
        if(fe.getSource()==dif)
            start.setEnabled(true);
    }
    public void createGame(){
        new MemoryGame(dif.getText()); // Initializes class MemoryGame(YourDifficulty)
    }
    public void showInstructions(){
        new Instructions(); // Initializes class Instructions
    }
    public static void main(String [] args){
        new FirstFrame();
    }
}