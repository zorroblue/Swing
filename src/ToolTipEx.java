import java.awt.EventQueue;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class ToolTipEx extends JFrame{
	
	public ToolTipEx()
	{
		initUI();
	}
	private void initUI()
	{
		JButton btn = new JButton("Button");
		btn.setToolTipText("A button component");
		createLayout(btn);
		setTitle("Tooltip");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	private void createLayout(JComponent... arg)
	{
		JPanel pane=(JPanel)getContentPane();
		GroupLayout gl=new GroupLayout(pane);
		pane.setLayout(gl);;
		pane.setToolTipText("Content pane");
		gl.setAutoCreateGaps(true);
		gl.setHorizontalGroup(gl.createSequentialGroup().addComponent(arg[0]));
		gl.setVerticalGroup(gl.createSequentialGroup().addComponent(arg[0]).addGap(120));
		pack();
	}

	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable() {
			
			@Override
			public void run() {
					ToolTipEx ex=new ToolTipEx();
					ex.setVisible(true);
				
			}
		});
	}
}

