import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;


public class Game extends JFrame{
	static int length = 4;
    static int count=1;
    static Client[] users=new Client[10];
    JLabel center = new JLabel();
 
    JLabel first=new JLabel();
    JTextField greet = new JTextField();
	JTextField nam = new JTextField();
	
	JLabel second=new JLabel();	
    JTextField correct=new JTextField();
    JTextField start = new JTextField();
    
    JLabel third = new JLabel();
    JTextField guess=new JTextField();
    JButton startguess = new JButton("开始猜");
    
    JLabel forth = new JLabel();
    JTextField scores = new JTextField();
    JTextArea note = new JTextArea();
    JScrollPane sc=new JScrollPane(note);
    
    Guess one = new Guess(length);
    int[] rnum = new int[length];
    String str="";
    public Game(){
    	super("猜数字");
    	setLayout(new BorderLayout());
		add(new ActMenu(), BorderLayout.NORTH);
    	
		add(center,BorderLayout.CENTER);
		center.setLayout(new GridLayout(4,1));
   
    	center.add(first);
    	first.setLayout(new GridLayout(1,2));
    	first.add(greet);
    	first.add(nam); 	
    	greet.setEditable(false);
    	greet.setText(Client.greetings(count));
    	
    	center.add(second);
    	second.setLayout(new GridLayout(1,2));
    	second.add(correct);
    	second.add(start);
    	correct.setEditable(false);
    	start.setEditable(false);
    	start.setText("请开始猜数字");
    	
    	center.add(third);
    	third.setLayout(new GridLayout(1,2));
    	third.add(guess);
    	third.add(startguess);
    	startguess.addActionListener(new ActLis());
    	
    	center.add(forth);
    	forth.setLayout(new GridLayout(1,2));
    	forth.add(scores);
    	forth.add(sc);
    	scores.setEditable(false);
    	note.setOpaque(false);
    
    	
    	
    	users[count-1]=new Client();
    	process();
    }
    
    
    public  void process() {
		
		
    	
		
		rnum= one.rand(rnum);
		correct.setText(one.correct(rnum));
		
	
	}
  


    
	private class ActLis implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == startguess) {
				int[] gnum = new int[length];
				String gstr=guess.getText();
				gnum=one.guess(gstr,gnum);
				str+=one.compare(rnum,gnum,users[count-1]);
				note.setText(str);
				users[count-1].name=nam.getText();	
				scores.setText("Scores of "+users[count-1].name+" :"+users[count-1].scores);
			}
		}
	}
}
