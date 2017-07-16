import java.awt.EventQueue;

import com.instisoft.user.views.MainFrame;

public class TestClass {

	public static void main(String[] args) {
		System.out.println("Application alive at console.....");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame frame = new MainFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
