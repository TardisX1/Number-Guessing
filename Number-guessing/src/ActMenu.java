import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ActMenu extends JPanel{
	
	JButton buttons[] = {new JButton("新用户"),new JButton("猜新数"),new JButton("排名")};
	
	public ActMenu() {
		 
		setLayout(new FlowLayout());
		
		for (int index = 0; index < buttons.length; index++)
			buttons[index].addActionListener(new ActLis());

		for (int index = 0; index < buttons.length; index++)
			add(buttons[index]);
	}
	
	public void shutdown() {
		for (int index = 0; index < run.frames.length; index++)
			run.frames[index].setVisible(false);
	}
	
	private class ActLis implements ActionListener {

		public void actionPerformed(ActionEvent e) {
			if (e.getSource() == buttons[0]) {
				shutdown();
				run.frames[1].setVisible(true);
				Game.count++;
				run.game.greet.setText(Client.greetings(Game.count));
				resetuser();
				Game.users[Game.count-1]=new Client();
				run.game.process();
			} else if (e.getSource() == buttons[1]) {
				shutdown();
				run.frames[1].setVisible(true);
				resetnum();
				run.game.process();
			}
			 else if (e.getSource() == buttons[2]) {
					shutdown();
					run.frames[2].setVisible(true);
					run.rank.d.setText(run.rank.printRank());
				}
		}
	}
	
	public void resetnum(){
		run.game.guess.setText("");
        run.game.scores.setText("");
    	run.game.note.setText("");
    	run.game.str="";
    }
	
	public void resetuser(){
		run.game.nam.setText("");
		run.game.guess.setText("");
        run.game.scores.setText("");
    	run.game.note.setText("");
    	run.game.str="";
	}
}
