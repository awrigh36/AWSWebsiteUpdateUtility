import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class UpdateGUI {
	
	private JFrame frame;
	private JPanel controlPanel;
	private JLabel cap_label1;
	private JTextField dates;
	private JButton b1;
	private JLabel cap_label3;
	
	private JLabel mon;
	private JLabel tue;
	private JLabel wed;
	private JLabel thu;
	private JLabel fri;
	private JLabel sat;
	
	private JTextField name1;
	private JTextField name2;
	private JTextField name3;
	private JTextField name4;
	private JTextField name5;
	private JTextField name6;
	

	private JTextField desc1;
	private JTextField desc2;
	private JTextField desc3;
	private JTextField desc4;
	private JTextField desc5;
	private JTextField desc6;
	
	private JPanel panel;
	private JButton b2;
	private JLabel previewText1;
	private JLabel previewText2;
	private JLabel previewText3;
	private JLabel previewText4;
	private JLabel previewText5;
	private JLabel previewText6;

	private JPanel panel2;
	private JPanel panel3;
	private JPanel panel4;
	private JButton b3;

	public static void main(String[] args) {
		UpdateGUI gui = new UpdateGUI();
		gui.showGUI();
	}

	public UpdateGUI() {
		showGUI();
	}

	private void showGUI() {
		frame = new JFrame("Baristas Website Update Utility");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 400);
		frame.setLayout(new FlowLayout());
	
		cap_label1 = new JLabel("Week of ");
		dates = new JTextField("", 16);
		cap_label3 = new JLabel("");
		
		frame.add(cap_label1);
		frame.add(dates);

		mon = new JLabel("Monday");
		name1 = new JTextField("", 8);
		tue = new JLabel("Tuesday");
		name2 = new JTextField("", 8);
		wed = new JLabel("Wednesday");
		name3 = new JTextField("", 8);
		thu = new JLabel("Thursday");
		name4 = new JTextField("", 8);
		fri = new JLabel("Friday");
		name5 = new JTextField("", 8);
		sat = new JLabel("Saturday");
		name6 = new JTextField("", 8);
		
		desc1 = new JTextField("", 8);
		desc2 = new JTextField("", 8);
		desc3 = new JTextField("", 8);
		desc4 = new JTextField("", 8);
		desc5 = new JTextField("", 8);
		desc6 = new JTextField("", 8);
		
		controlPanel = new JPanel();
		controlPanel.setLayout(new FlowLayout());
		
		frame.add(controlPanel);
		
		controlPanel.add(cap_label3);	

		panel = new JPanel();
		panel.setLayout(new GridLayout(6, 1));
		
		panel.add(mon);
		panel.add(name1);
		panel.add(desc1);
		panel.add(tue);
		panel.add(name2);
		panel.add(desc2);
		panel.add(wed);
		panel.add(name3);
		panel.add(desc3);
		panel.add(thu);
		panel.add(name4);
		panel.add(desc4);
		panel.add(fri);
		panel.add(name5);	
		panel.add(desc5);
		panel.add(sat);
		panel.add(name6);
		panel.add(desc6);
	
		b2 = new JButton("Preview");
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				previewText1.setText("Monday: " +
				name1.getText().toString() + "  " + desc1.getText().toString());
				previewText2.setText("Tuesday: " +
				name2.getText().toString() + "  " + desc2.getText().toString());
				previewText3.setText("Wednesday: " +
				name3.getText().toString() + "  " + desc3.getText().toString());
				previewText4.setText("Thursday: " +
				name4.getText().toString() + "  " + desc4.getText().toString());
				previewText5.setText("Friday: " +
				name5.getText().toString() + "  " + desc5.getText().toString());
				previewText6.setText("Saturday: " +
				name6.getText().toString() + "  " + desc6.getText().toString());
			}
		});
		panel3 = new JPanel(new FlowLayout());
		panel2 = new JPanel(new GridLayout(6, 1));
		previewText1 = new JLabel();
		previewText2 = new JLabel();
		previewText3 = new JLabel();
		previewText4 = new JLabel();
		previewText5 = new JLabel();
		previewText6 = new JLabel();

		panel3.add(b2);
		panel2.add(previewText1);
		panel2.add(previewText2);
		panel2.add(previewText3);
		panel2.add(previewText4);
		panel2.add(previewText5);
		panel2.add(previewText6);
		
		panel4 = new JPanel(new FlowLayout());
		b3 = new JButton("Done");
		b3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {
				try {			    	
					cap_label3.setText("" + cap_label1.getText().toString() + "" + dates.getText().toString());
							
					previewText1.setText("Monday: " +
							name1.getText().toString() + "  " + desc1.getText().toString());
							previewText2.setText("Tuesday: " +
							name2.getText().toString() + "  " + desc2.getText().toString());
							previewText3.setText("Wednesday: " +
							name3.getText().toString() + "  " + desc3.getText().toString());
							previewText4.setText("Thursday: " +
							name4.getText().toString() + "  " + desc4.getText().toString());
							previewText5.setText("Friday: " +
							name5.getText().toString() + "  " + desc5.getText().toString());
							previewText6.setText("Saturday: " +
							name6.getText().toString() + "  " + desc6.getText().toString());
							
			    	final String[] dataArray = new String[19];
					dataArray[0] = cap_label3.getText().toString();
					dataArray[1] = "Monday";
					dataArray[2] = name1.getText().toString();
					dataArray[3] = desc1.getText().toString();
					dataArray[4] = "Tuesday";
					dataArray[5] = name2.getText().toString();
					dataArray[6] = desc2.getText().toString();
					dataArray[7] = "Wednesday";
					dataArray[8] = name3.getText().toString();
					dataArray[9] = desc3.getText().toString();
					dataArray[10] = "Thursday";
					dataArray[11] = name4.getText().toString();
					dataArray[12] = desc4.getText().toString();
					dataArray[13] = "Friday";
					dataArray[14] = name5.getText().toString();
					dataArray[15] = desc5.getText().toString();
					dataArray[16] = "Saturday";
					dataArray[17] = name6.getText().toString();
					dataArray[18] = desc6.getText().toString();

					AWS_Uploader.run(dataArray);

					
				} catch (IOException e) {
					e.printStackTrace();
					System.out.println(e);
				}
				
		        JOptionPane.showMessageDialog(frame, "Changes completed successfully");	
				System.exit(0);
			}
			
		});
		panel4.add(b3);
		frame.add(panel);
		frame.add(panel3);
		frame.add(panel2);
		frame.add(panel4);
		frame.setVisible(true);
	}
}

