import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Square extends JPanel{
	private JTextField length = new JTextField(15);
	private JTextField area = new JTextField(15);
	private JTextField perimeter = new JTextField(15);
	
	double lengthNum,areaNum,perimeterNum;
	
	public Square(){
		JButton setlength = new JButton("Calculate");
		JButton clean = new JButton("Clean");
		
		JLabel Llength = new JLabel("Length: ");
		JLabel Larea = new JLabel("Area: ");
		JLabel Lperimeter = new JLabel("perimeter: ");
		
		setLayout(new GridLayout(2,4));
		
		add(Llength);
		add(length);
		add(Larea);
		add(area);
		add(Lperimeter);
		add(perimeter);
		add(setlength);
		setlength.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				lengthNum = Double.parseDouble(length.getText());
				areaNum = lengthNum*lengthNum;
				perimeterNum = lengthNum*4;
				area.setText(String.valueOf(areaNum));
				perimeter.setText(String.valueOf(perimeterNum));
				
			}
		});
		add(clean);
		clean.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				length.setText(null);
				area.setText(null);
				perimeter.setText(null);
			}
		});
		
		
	}
	
}
