import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class GeoCalculate extends JFrame {
	private Circle cir = new Circle();
	private Square squ = new Square();
	private RagularTriangle RTri = new RagularTriangle();
	
	
	public GeoCalculate(){
		setLayout(new GridLayout(3,1));
		add(cir);
		add(squ);
		add(RTri);
	}
	public static void main(String[] args) {
		JFrame frame = new GeoCalculate();
		frame.setTitle("GeoCalculate");
		frame.setSize(420, 350);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}	
}
