import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Start extends JFrame{

	JPanel panel =new JPanel();
	JLabel title = new JLabel("猜数字",JLabel.CENTER);
	JButton[] buttons = {
			new JButton("新的游戏"),
			new JButton ("查看排行"),
	        new JButton("退出") };
	JPanel[] panels = new JPanel[3];
	
	public Start() {
		super("猜数字");
		setLayout(new GridLayout(5,1));
		title.setFont(new Font("猜数字",Font.BOLD,150) );
	    
		add(title);
		add(new JPanel());
		for(int index=0;index<buttons.length;index++){
			buttons[index].addActionListener(new StartLis());
			panels[index]=new JPanel();
			panels[index].add(buttons[index]);
			add(panels[index]);
		}
	}
	
	 private class StartLis implements ActionListener {

		    public void actionPerformed(ActionEvent e) {
	            if(e.getSource()==buttons[0]){
	            	setVisible(false);
	            	run.frames[1].setVisible(true);
	            }
	            else if(e.getSource()==buttons[1]){
	            	setVisible(false);
	            	run.frames[2].setVisible(true);
	            }
	           
	            else if(e.getSource()==buttons[2]){
	            	System.exit(0);
	            }
			}

		}
}
