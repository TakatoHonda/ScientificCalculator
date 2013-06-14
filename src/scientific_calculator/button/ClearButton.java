package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;

@SuppressWarnings("serial")
public class ClearButton extends JButton implements MouseListener {
	private DisplayArea displayArea;
	public ClearButton(DisplayArea displayArea) {
		super("C");
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		displayArea.clear();
	}
	
	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}