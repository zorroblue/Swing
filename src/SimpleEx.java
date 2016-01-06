import javax.swing.*;
import java.awt.EventQueue;

public class SimpleEx extends JFrame{

	public SimpleEx()
	{
		initUI();
	}
	
	private void initUI()
	{
		setTitle("SimpleExample");
		setSize(300,200);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	
	}
	public static void main(String args[])
	{
		EventQueue.invokeLater(new Runnable(){

			@Override
			public void run() {
				SimpleEx ex=new SimpleEx();
				ex.setVisible(true);
				
			}
		});
			
	}
}
