import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Circle extends JPanel {
	private JTextField radius = new JTextField(15);
	private JTextField area = new JTextField(15);
	private JTextField perimeter = new JTextField(15);
	
	double radiusNum,areaNum,perimeterNum;
	
	public Circle(){
		JButton setRadius = new JButton("Calculate");
		JButton clean = new JButton("Clean");
		
		JLabel Lradius = new JLabel("Radius: ");
		JLabel Larea = new JLabel("Area: ");
		JLabel Lperimeter = new JLabel("perimeter: ");
		
		setLayout(new GridLayout(2,4));
		
		add(Lradius);
		add(radius);
		add(Larea);
		add(area);
		add(Lperimeter);
		add(perimeter);
		add(setRadius);
		setRadius.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				radiusNum = Double.parseDouble(radius.getText());
				areaNum = radiusNum*radiusNum*3.1415926;
				perimeterNum = radiusNum*2*3.1415926;
				area.setText(String.valueOf(areaNum));
				perimeter.setText(String.valueOf(perimeterNum));
				
			}
		});
		add(clean);
		clean.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e){
				radius.setText(null);
				area.setText(null);
				perimeter.setText(null);
			}
		});
		
		
	}
	
}
