import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Start extends JFrame{

	JPanel panel =new JPanel();
	JLabel title = new JLabel("������",JLabel.CENTER);
	JButton[] buttons = {
			new JButton("�µ���Ϸ"),
			new JButton ("�鿴����"),
	        new JButton("�˳�") };
	JPanel[] panels = new JPanel[3];
	
	public Start() {
		super("������");
		setLayout(new GridLayout(5,1));
		title.setFont(new Font("������",Font.BOLD,150) );
	    
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
