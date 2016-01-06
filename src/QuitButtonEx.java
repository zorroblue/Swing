import java.awt.Container;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;

public class QuitButtonEx extends JFrame
{
		private static int count=0;

		public QuitButtonEx()
		{
			initUI();
		}
		private void initUI()
		{
			JButton quitButton =new JButton("Quit");
			final JButton onemoreButton=new JButton("One more Quit");
			
			quitButton.addActionListener(new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent event) {
	                System.exit(0);
	            }
	        });
			
			onemoreButton.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					count++;
					if(count==1)
						onemoreButton.setText("You clicked me 1 time");
					else
						onemoreButton.setText("You clicke me "+count+" times");
					
				}
			});
			createLayout(quitButton,onemoreButton);
			setTitle("Quit Button");
			setSize(300,200);
			setLocationRelativeTo(null);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
		
		private void createLayout(JComponent...components )
		{
			Container pane=getContentPane();
			GroupLayout gl =new GroupLayout(pane);
			pane.setLayout(gl);
			
			gl.setAutoCreateContainerGaps(true);
			gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(components[0]).addComponent(components[1]));
			gl.setVerticalGroup(gl.createSequentialGroup().addComponent(components[0]).addComponent(components[1]));
		}
		
		public static void main(String[] args)
		{
			EventQueue.invokeLater(new Runnable(){
				@Override
				public void run()
				{
					QuitButtonEx ex=new QuitButtonEx();
					ex.setVisible(true);
				}
			});
		}
}