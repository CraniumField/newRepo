import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.border.*;
public class ColorChooser extends JFrame implements ActionListener{
    JTextArea a;
    int b = 1,x = 0,z;
    JPanel Q;
    JTextArea R;
    JPanel S;
    JLabel T;
    JPanel W;
    Color A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Y; // Creating Colors
    String Difficulty;
    JButton red,blue,cyan,green,pink,yellow,orange,next; // Creating JButtons
    JPanel one,two,three,four,five,six,seven,eight,nine,ten,eleven,twelve,thirteen,fourteen,fifteen,sixteen,seventeen; // Creating JPanels
    public ColorChooser() {
        super();
        z = 0;
        a = new JTextArea("What is the color of the highlighted box?");
        Q = new JPanel();
        S = new JPanel();
        W = new JPanel();
        T = new JLabel("Mistakes: ");
        R = new JTextArea(""+x+"");
        red = new JButton("Red");
        blue = new JButton("Blue");
        cyan = new JButton("Cyan");
        green = new JButton("Green");
        pink = new JButton("Pink");
        yellow = new JButton("Yellow");
        orange = new JButton("Orange");
        next = new JButton("Next");
        
        // Retrieving Colors from ColorBox and giving them to colorChooser's Colors
        
        A = ColorBox.A;
        B = ColorBox.B;
        C = ColorBox.C;
        D = ColorBox.D;
        E = ColorBox.E;
        F = ColorBox.F;
        G = ColorBox.G;
        H = ColorBox.H;
        I = ColorBox.I;
        J = ColorBox.J;
        K = ColorBox.K;
        L = ColorBox.L;
        M = ColorBox.M;
        N = ColorBox.N;
        O = ColorBox.O;
        P = ColorBox.P;
        Y = A;
        x = MemoryGame.x;
        b = ColorBox.b;
        Difficulty = ColorBox.Difficulty;
        
        // Ensuring that variable b corresponds to the difficulty
        
        if (Difficulty.equals("easy")){ b = 1;}
        if (Difficulty.equals("medium")){ b = 2;}
        if (Difficulty.equals("hard")){ b = 3;}
        if (Difficulty.equals("extreme")){ b = 4;}
        
        // Retrieving JPanel characterists from ColorBox and giving them to colorChooser's JPanels
        
        one = ColorBox.one;
        two = ColorBox.two;
        three = ColorBox.three;
        four = ColorBox.four;
        five = ColorBox.five;
        six = ColorBox.six;
        seven = ColorBox.seven;
        eight = ColorBox.eight;
        nine = ColorBox.nine;
        ten = ColorBox.ten;
        eleven = ColorBox.eleven;
        twelve = ColorBox.twelve;
        thirteen = ColorBox.thirteen;
        fourteen = ColorBox.fourteen;
        fifteen = ColorBox.fifteen;
        sixteen = ColorBox.sixteen;
        W = one; // Initial value of W, used to reColor JPanels as they are solved
        
        // Adding actionlisteners to JButtons
        
        red.addActionListener(this);
        blue.addActionListener(this);
        cyan.addActionListener(this);
        green.addActionListener(this);
        pink.addActionListener(this);
        yellow.addActionListener(this);
        orange.addActionListener(this);
        next.addActionListener(this);
        
        // Designing/Building GUI
        
        setLayout(new BorderLayout());
        setSize(500,200);
        setVisible(true);
        add("North",a);
        Q.add(red);
        Q.add(blue);
        Q.add(cyan);
        Q.add(green);
        Q.add(pink);
        Q.add(yellow);
        Q.add(orange);
        Q.add(next);
        add("Center", Q);
        S.add(T);
        S.add(R);
        add("South", S);
    }
    
    // Commands for each JButton (corresponding to a color, and "Next" with specifics for each difficulty
    
    public void actionPerformed(ActionEvent e){
        if(e.getActionCommand() == "Red"){
            if(Y == Color.red){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++; // Counting JPanels solved per level
                if(W == one){ one.setBackground(Color.red); }
                if(W == two){ two.setBackground(Color.red); }
                if(W == three){ three.setBackground(Color.red); }
                if(W == four){ four.setBackground(Color.red); }
                if(W == five){ five.setBackground(Color.red); }
                if(W == six){ six.setBackground(Color.red); }
                if(W == seven){ seven.setBackground(Color.red); }
                if(W == eight){ eight.setBackground(Color.red); }
                if(W == nine){ nine.setBackground(Color.red); }
                if(W == ten){ ten.setBackground(Color.red); }
                if(W == eleven){ eleven.setBackground(Color.red); }
                if(W == twelve){ twelve.setBackground(Color.red); }
                if(W == thirteen){ thirteen.setBackground(Color.red); }
                if(W == fourteen){ fourteen.setBackground(Color.red); }
                if(W == fifteen){ fifteen.setBackground(Color.red); }
                if(W == sixteen){ sixteen.setBackground(Color.red); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        if(e.getActionCommand() == "Blue"){
            if(Y == Color.blue){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++;
                if(W == one){ one.setBackground(Color.blue); }
                if(W == two){ two.setBackground(Color.blue); }
                if(W == three){ three.setBackground(Color.blue); }
                if(W == four){ four.setBackground(Color.blue); }
                if(W == five){ five.setBackground(Color.blue); }
                if(W == six){ six.setBackground(Color.blue); }
                if(W == seven){ seven.setBackground(Color.blue); }
                if(W == eight){ eight.setBackground(Color.blue); }
                if(W == nine){ nine.setBackground(Color.blue); }
                if(W == ten){ ten.setBackground(Color.blue); }
                if(W == eleven){ eleven.setBackground(Color.blue); }
                if(W == twelve){ twelve.setBackground(Color.blue); }
                if(W == thirteen){ thirteen.setBackground(Color.blue); }
                if(W == fourteen){ fourteen.setBackground(Color.blue); }
                if(W == fifteen){ fifteen.setBackground(Color.blue); }
                if(W == sixteen){ sixteen.setBackground(Color.blue); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        if(e.getActionCommand() == "Cyan"){
            if(Y == Color.cyan){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++;
                if(W == one){ one.setBackground(Color.cyan); }
                if(W == two){ two.setBackground(Color.cyan); }
                if(W == three){ three.setBackground(Color.cyan); }
                if(W == four){ four.setBackground(Color.cyan); }
                if(W == five){ five.setBackground(Color.cyan); }
                if(W == six){ six.setBackground(Color.cyan); }
                if(W == seven){ seven.setBackground(Color.cyan); }
                if(W == eight){ eight.setBackground(Color.cyan); }
                if(W == nine){ nine.setBackground(Color.cyan); }
                if(W == ten){ ten.setBackground(Color.cyan); }
                if(W == eleven){ eleven.setBackground(Color.cyan); }
                if(W == twelve){ twelve.setBackground(Color.cyan); }
                if(W == thirteen){ thirteen.setBackground(Color.cyan); }
                if(W == fourteen){ fourteen.setBackground(Color.cyan); }
                if(W == fifteen){ fifteen.setBackground(Color.cyan); }
                if(W == sixteen){ sixteen.setBackground(Color.cyan); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        if(e.getActionCommand() == "Green"){
            if(Y == Color.green){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++;
                if(W == one){ one.setBackground(Color.green); }
                if(W == two){ two.setBackground(Color.green); }
                if(W == three){ three.setBackground(Color.green); }
                if(W == four){ four.setBackground(Color.green); }
                if(W == five){ five.setBackground(Color.green); }
                if(W == six){ six.setBackground(Color.green); }
                if(W == seven){ seven.setBackground(Color.green); }
                if(W == eight){ eight.setBackground(Color.green); }
                if(W == nine){ nine.setBackground(Color.green); }
                if(W == ten){ ten.setBackground(Color.green); }
                if(W == eleven){ eleven.setBackground(Color.green); }
                if(W == twelve){ twelve.setBackground(Color.green); }
                if(W == thirteen){ thirteen.setBackground(Color.green); }
                if(W == fourteen){ fourteen.setBackground(Color.green); }
                if(W == fifteen){ fifteen.setBackground(Color.green); }
                if(W == sixteen){ sixteen.setBackground(Color.green); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        if(e.getActionCommand() == "Pink"){
            if(Y == Color.pink){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++;
                if(W == one){ one.setBackground(Color.pink); }
                if(W == two){ two.setBackground(Color.pink); }
                if(W == three){ three.setBackground(Color.pink); }
                if(W == four){ four.setBackground(Color.pink); }
                if(W == five){ five.setBackground(Color.pink); }
                if(W == six){ six.setBackground(Color.pink); }
                if(W == seven){ seven.setBackground(Color.pink); }
                if(W == eight){ eight.setBackground(Color.pink); }
                if(W == nine){ nine.setBackground(Color.pink); }
                if(W == ten){ ten.setBackground(Color.pink); }
                if(W == eleven){ eleven.setBackground(Color.pink); }
                if(W == twelve){ twelve.setBackground(Color.pink); }
                if(W == thirteen){ thirteen.setBackground(Color.pink); }
                if(W == fourteen){ fourteen.setBackground(Color.pink); }
                if(W == fifteen){ fifteen.setBackground(Color.pink); }
                if(W == sixteen){ sixteen.setBackground(Color.pink); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        if(e.getActionCommand() == "Yellow"){
            if(Y == Color.yellow){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++;
                if(W == one){ one.setBackground(Color.yellow); }
                if(W == two){ two.setBackground(Color.yellow); }
                if(W == three){ three.setBackground(Color.yellow); }
                if(W == four){ four.setBackground(Color.yellow); }
                if(W == five){ five.setBackground(Color.yellow); }
                if(W == six){ six.setBackground(Color.yellow); }
                if(W == seven){ seven.setBackground(Color.yellow); }
                if(W == eight){ eight.setBackground(Color.yellow); }
                if(W == nine){ nine.setBackground(Color.yellow); }
                if(W == ten){ ten.setBackground(Color.yellow); }
                if(W == eleven){ eleven.setBackground(Color.yellow); }
                if(W == twelve){ twelve.setBackground(Color.yellow); }
                if(W == thirteen){ thirteen.setBackground(Color.yellow); }
                if(W == fourteen){ fourteen.setBackground(Color.yellow); }
                if(W == fifteen){ fifteen.setBackground(Color.yellow); }
                if(W == sixteen){ sixteen.setBackground(Color.yellow); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        if(e.getActionCommand() == "Orange"){
            if(Y == Color.orange){
                a.setText("Exactly, that was the right color! Now for the next box.");
                z++;
                if(W == one){ one.setBackground(Color.orange); }
                if(W == two){ two.setBackground(Color.orange); }
                if(W == three){ three.setBackground(Color.orange); }
                if(W == four){ four.setBackground(Color.orange); }
                if(W == five){ five.setBackground(Color.orange); }
                if(W == six){ six.setBackground(Color.orange); }
                if(W == seven){ seven.setBackground(Color.orange); }
                if(W == eight){ eight.setBackground(Color.orange); }
                if(W == nine){ nine.setBackground(Color.orange); }
                if(W == ten){ ten.setBackground(Color.orange); }
                if(W == eleven){ eleven.setBackground(Color.orange); }
                if(W == twelve){ twelve.setBackground(Color.orange); }
                if(W == thirteen){ thirteen.setBackground(Color.orange); }
                if(W == fourteen){ fourteen.setBackground(Color.orange); }
                if(W == fifteen){ fifteen.setBackground(Color.orange); }
                if(W == sixteen){ sixteen.setBackground(Color.orange); }
                if(z == 4 & b == 1){
                    a.setText("Congratulations! You beat the MEMORY GAME on easy, Now try to beat it on medium!");
                     b = 2;
                    Difficulty.equals("medium");
                    new MemoryGame("medium");
                }
                if(z == 6 & b == 2){
                    a.setText("Congratulations! You beat the MEMORY GAME on medium, Now try to beat it on hard!");
                    b = 3;
                    Difficulty.equals("hard");
                    new MemoryGame("hard");
                }
                if(z == 9 & b == 3){
                    a.setText("Congratulations! You beat the MEMORY GAME on hard, Now try to beat it on extreme!");
                    b = 4;
                    Difficulty.equals("extreme");
                    new MemoryGame("extreme");
                }
                if(z == 16 & b == 4){
                    a.setText("Congratulations! You are a MEMORY MASTER!");
                }
            }
            else{
                R.setText(""+x+++""); // Counting mistakes made
                a.setText("Sorry, that was the wrong color, you lost a life! Keep going.");
            }
        }
        
        // Next allows user to navigate through the JPanels
        
        if(e.getActionCommand() == "Next"){
            if (z == 1){
                Y = B;
                W = two;
                two.setBorder(new LineBorder(Color.yellow, 4));
                one.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 2){
                Y = C;
                W = three;
                three.setBorder(new LineBorder(Color.yellow, 4));
                two.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 3){
                Y = D;
                W = four;
                four.setBorder(new LineBorder(Color.yellow, 4));
                three.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 4){
                Y = E;
                W = five;
                five.setBorder(new LineBorder(Color.yellow, 4));
                four.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 5){
                Y = F;
                W = six;
                six.setBorder(new LineBorder(Color.yellow, 4));
                five.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 6){
                Y = G;
                W = seven;
                seven.setBorder(new LineBorder(Color.yellow, 4));
                six.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 7){
                Y = H;
                W = eight;
                eight.setBorder(new LineBorder(Color.yellow, 4));
                seven.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 8){
                Y = I;
                W = nine;
                nine.setBorder(new LineBorder(Color.yellow, 4));
                eight.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 9){
                Y = J;
                W = ten;
                ten.setBorder(new LineBorder(Color.yellow, 4));
                nine.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 10){
                Y = K;
                W = eleven;
                eleven.setBorder(new LineBorder(Color.yellow, 4));
                ten.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 11){
                Y = L;
                W = twelve;
                twelve.setBorder(new LineBorder(Color.yellow, 4));
                eleven.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 12){
                Y = L;
                W = thirteen;
                thirteen.setBorder(new LineBorder(Color.yellow, 4));
                twelve.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 13){
                Y = N;
                W = fourteen;
                fourteen.setBorder(new LineBorder(Color.yellow, 4));
                thirteen.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 14){
                Y = O;
                W = fifteen;
                fifteen.setBorder(new LineBorder(Color.yellow, 4));
                fourteen.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 15){
                Y = P;
                W = sixteen;
                sixteen.setBorder(new LineBorder(Color.yellow, 4));
                fifteen.setBorder(new LineBorder(Color.black, 4));
            }
            if(z == 16){
                Y = P;
                seventeen.setBorder(new LineBorder(Color.yellow, 4));
                sixteen.setBorder(new LineBorder(Color.black, 4));
            }
        }
    }
}