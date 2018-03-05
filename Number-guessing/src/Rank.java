import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.*;

public class Rank extends JFrame{
	JTextArea d = new JTextArea();
	public Rank(){
		super("²ÂÊý×Ö");
		setLayout(new BorderLayout());
		add(new ActMenu(), BorderLayout.NORTH);
		add(d,BorderLayout.CENTER);
    	d.setEditable(false);
		d.setOpaque(false);
		d.setLineWrap(true);
    	d.setFont(new Font("",0,25));
    	
    	
	}
	
	public Client[] rank(){
		Client[] cli=new Client[Game.count];
		for(int i=0;i<cli.length;i++)
		    cli[i]=Game.users[i];
		for(int i=0;i<Game.count;i++){
			Client temp=cli[i];
			int n=i;
			for(int j=i+1;j<Game.count;j++){
				if(cli[j].scores>temp.scores){
					temp=cli[j];
				    n=j;
				}
			}
		    cli[n]=cli[i];
		    cli[i]=temp;
		}
		
		return cli;
	}
	
	public String printRank(){
		Client[] cli=rank();
		String str="\t    Rank            Name            Scores\n\n";
		for(int i=0;i<Game.count;i++)
		    str+="\t    "+(i+1)+"                      "+cli[i].name+"                "+cli[i].scores+"\n\n";
		return str;
	}
}
