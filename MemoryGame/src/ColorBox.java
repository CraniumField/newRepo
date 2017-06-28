import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.util.Random;
import java.lang.Object;
import java.awt.event.*;
import java.util.ArrayList;
public class ColorBox extends JPanel implements ActionListener{
    JPanel [] boxes = {};
    static JPanel one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen; // Creating an array of static JPanels
    Random randColor = new Random();
    Color [] colors = { Color.red, Color.blue, Color.cyan, Color.green, Color.pink, Color.yellow, Color.orange }; // Creating an array of colors
    Color c;
    static Color A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P; // Creating an array of static Colors
    int a;
    static int b;
    static String Difficulty;
    
    // Creating Timers
    
    Timer easytimer;
    Timer mediumtimer;
    Timer hardtimer;
    Timer extremetimer;
    public void actionPerformed(ActionEvent e){
         int x = 0;
    }
    public ColorBox(String s){
        super();
        a = 0;
        
        // Creating timer for each difficulty with specific details and actions, mainly modifying the GUI's appearance
        
        easytimer = new Timer(5000,new ActionListener(){ public void actionPerformed(ActionEvent e){ a = 0; one.setBackground(Color.white); two.setBackground(Color.white); three.setBackground(Color.white); four.setBackground(Color.white); one.setBorder(new LineBorder(Color.yellow, 4)); createChooser(); a++; easytimer.stop(); }});
        mediumtimer = new Timer(7000,new ActionListener(){ public void actionPerformed(ActionEvent e){ a = 0; one.setBackground(Color.white); two.setBackground(Color.white); three.setBackground(Color.white); four.setBackground(Color.white); five.setBackground(Color.white); six.setBackground(Color.white); one.setBorder(new LineBorder(Color.yellow, 4)); createChooser(); mediumtimer.stop(); }});
        hardtimer = new Timer(7000,new ActionListener(){ public void actionPerformed(ActionEvent e){ a = 0; one.setBackground(Color.white); two.setBackground(Color.white); three.setBackground(Color.white); four.setBackground(Color.white); five.setBackground(Color.white); six.setBackground(Color.white); seven.setBackground(Color.white); eight.setBackground(Color.white); nine.setBackground(Color.white); one.setBorder(new LineBorder(Color.yellow, 4)); createChooser(); hardtimer.stop(); }});
        extremetimer = new Timer(10000,new ActionListener(){ public void actionPerformed(ActionEvent e){ a = 0; one.setBackground(Color.white); two.setBackground(Color.white); three.setBackground(Color.white); four.setBackground(Color.white); five.setBackground(Color.white); six.setBackground(Color.white); seven.setBackground(Color.white); eight.setBackground(Color.white); nine.setBackground(Color.white); ten.setBackground(Color.white); eleven.setBackground(Color.white); twelve.setBackground(Color.white); thirteen.setBackground(Color.white); fourteen.setBackground(Color.white); fifteen.setBackground(Color.white); sixteen.setBackground(Color.white); one.setBorder(new LineBorder(Color.yellow, 4)); createChooser(); extremetimer.stop(); }});
        
        // Designing JFrame for easy difficulty
        
        if (s.equals("easy")){
            Difficulty = "easy";
            b = 1;
            setLayout(new GridLayout(2,2));
            one = new JPanel();
            A = genColor();
            one.setBackground(A);
            one.setBorder(new LineBorder(Color.black, 4));
            two = new JPanel();
            B = genColor();
            two.setBackground(B);
            two.setBorder(new LineBorder(Color.black, 4));
            three = new JPanel();
            C = genColor();
            three.setBackground(C);
            three.setBorder(new LineBorder(Color.black, 4));
            four = new JPanel();
            D = genColor();
            four.setBackground(D);
            four.setBorder(new LineBorder(Color.black, 4));
            add(one);
            add(two);
            add(three);
            add(four);
            easytimer.start();
        }
        
        // Designing JFrame for medium difficulty
        
        if (s.equals("medium")){
            Difficulty = "medium";
            b = 2;
            setLayout(new GridLayout(3,2));
            one = new JPanel();
            A = genColorM();
            one.setBackground(A);
            one.setBorder(new LineBorder(Color.black, 4));
            two = new JPanel();
            B = genColorM();
            two.setBackground(B);
            two.setBorder(new LineBorder(Color.black, 4));
            three = new JPanel();
            C = genColorM();
            three.setBackground(C);
            three.setBorder(new LineBorder(Color.black, 4));
            four = new JPanel();
            D = genColorM();
            four.setBackground(D);
            four.setBorder(new LineBorder(Color.black, 4));
            five = new JPanel();
            E = genColorM();
            five.setBackground(E);
            five.setBorder(new LineBorder(Color.black, 4));
            six = new JPanel();
            F = genColorM();
            six.setBackground(F);
            six.setBorder(new LineBorder(Color.black, 4));
            add(one);
            add(two);
            add(three);
            add(four);
            add(five);
            add(six);
            mediumtimer.start();
        }
        
        // Designing JFrame for hard difficulty
        
        if (s.equals("hard")){
            Difficulty = "hard";
            b = 3;
            setLayout(new GridLayout(3,3));
            one = new JPanel();
            A = genColorH();
            one.setBackground(A);
            one.setBorder(new LineBorder(Color.black, 4));
            two = new JPanel();
            B = genColorH();
            two.setBackground(B);
            two.setBorder(new LineBorder(Color.black, 4));
            three = new JPanel();
            C = genColorH();
            three.setBackground(C);
            three.setBorder(new LineBorder(Color.black, 4));
            four = new JPanel();
            D = genColorH();
            four.setBackground(D);
            four.setBorder(new LineBorder(Color.black, 4));
            five = new JPanel();
            E = genColorH();
            five.setBackground(E);
            five.setBorder(new LineBorder(Color.black, 4));
            six = new JPanel();
            F = genColorH();
            six.setBackground(F);
            six.setBorder(new LineBorder(Color.black, 4));
            seven = new JPanel();
            G = genColorH();
            seven.setBackground(G);
            seven.setBorder(new LineBorder(Color.black, 4));
            eight = new JPanel();
            H = genColorH();
            eight.setBackground(H);
            eight.setBorder(new LineBorder(Color.black, 4));
            nine = new JPanel();
            I = genColorH();
            nine.setBackground(I);
            nine.setBorder(new LineBorder(Color.black, 4));
            add(one);
            add(two);
            add(three);
            add(four);
            add(five);
            add(six);
            add(seven);
            add(eight);
            add(nine);
            hardtimer.start();
        }
        
        // Designing JFrame for extreme difficulty
        
        if (s.equals("extreme")){
            Difficulty = "extreme";
            b = 4;
            setLayout(new GridLayout(4,4));
            one = new JPanel();
            A = genColorXT();
            one.setBackground(A);
            one.setBorder(new LineBorder(Color.black, 4));
            two = new JPanel();
            B = genColorXT();
            two.setBackground(B);
            two.setBorder(new LineBorder(Color.black, 4));
            three = new JPanel();
            C = genColorXT();
            three.setBackground(C);
            three.setBorder(new LineBorder(Color.black, 4));
            four = new JPanel();
            D = genColorXT();
            four.setBackground(D);
            four.setBorder(new LineBorder(Color.black, 4));
            five = new JPanel();
            E = genColorXT();
            five.setBackground(E);
            five.setBorder(new LineBorder(Color.black, 4));
            six = new JPanel();
            F = genColorXT();
            six.setBackground(F);
            six.setBorder(new LineBorder(Color.black, 4));
            seven = new JPanel();
            G = genColorXT();
            seven.setBackground(G);
            seven.setBorder(new LineBorder(Color.black, 4));
            eight = new JPanel();
            H = genColorXT();
            eight.setBackground(H);
            eight.setBorder(new LineBorder(Color.black, 4));
            nine = new JPanel();
            I = genColorXT();
            nine.setBackground(I);
            nine.setBorder(new LineBorder(Color.black, 4));
            ten = new JPanel();
            J = genColorXT();
            ten.setBackground(J);
            ten.setBorder(new LineBorder(Color.black, 4));
            eleven = new JPanel();
            K = genColorXT();
            eleven.setBackground(K);
            eleven.setBorder(new LineBorder(Color.black, 4));
            twelve = new JPanel();
            L = genColorXT();
            twelve.setBackground(L);
            twelve.setBorder(new LineBorder(Color.black, 4));
            thirteen = new JPanel();
            M = genColorXT();
            thirteen.setBackground(M);
            thirteen.setBorder(new LineBorder(Color.black, 4));
            fourteen = new JPanel();
            N = genColorXT();
            fourteen.setBackground(N);
            fourteen.setBorder(new LineBorder(Color.black, 4));
            fifteen = new JPanel();
            O = genColorXT();
            fifteen.setBackground(O);
            fifteen.setBorder(new LineBorder(Color.black, 4));
            sixteen = new JPanel();
            P = genColorXT();
            sixteen.setBackground(P);
            sixteen.setBorder(new LineBorder(Color.black, 4));
            add(one);
            add(two);
            add(three);
            add(four);
            add(five);
            add(six);
            add(seven);
            add(eight);
            add(nine);
            add(ten);
            add(eleven);
            add(twelve);
            add(thirteen);
            add(fourteen);
            add(fifteen);
            add(sixteen);
            extremetimer.start();
        }
    }
    
    // Creating 4 Color generators for each difficulty, rising in complexity
    
    public Color genColor(){
        c = colors[randColor.nextInt(3)];
        return c;
    }
    public Color genColorM(){
        c = colors[randColor.nextInt(4)];
        return c;
    }
    public Color genColorH(){
        c = colors[randColor.nextInt(5)];
        return c;
    }
    public Color genColorXT(){
        c = colors[randColor.nextInt(6)];
        return c;
    }
    public Color createChooser(){
        new colorChooser();
        return A;
    }
}