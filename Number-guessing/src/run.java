import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class run {
	static Start start=new Start();
	static Game game=new Game();
	static Rank rank=new Rank();
	static JFrame[] frames = { start,game,rank};

	public static void main(String args[]) throws InterruptedException {

		for (int index = 0; index < frames.length; index++) {
			frames[index].setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frames[index].setPreferredSize(new Dimension(1000,900));
            screencentre(frames[index]);

			frames[index].pack();
		}
		frames[0].setVisible(true);

	}
    //ʹ�����ʾ����Ļ����
	public static void screencentre(JFrame frame) {

		Toolkit kit = Toolkit.getDefaultToolkit(); // ���幤�߰�

		Dimension screenSize = kit.getScreenSize(); // ��ȡ��Ļ�ĳߴ�

		int screenWidth = screenSize.width; // ��ȡ��Ļ�Ŀ�

		int screenHeight = screenSize.height; // ��ȡ��Ļ�ĸ�

		
		frame.setLocation(screenWidth/4, screenHeight/15);// ���ô��ھ�����ʾ
	}
}
