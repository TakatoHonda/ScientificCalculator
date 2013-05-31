package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class OperateButton extends JButton implements MouseListener {
	
	private DisplayArea displayArea;
	final String operator;
	OperateButton(String operator, DisplayArea displayArea) {
		super(operator);
		this.displayArea = displayArea;
		this.operator = operator;
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("OperationButton!");
		displayArea.SetDisplayContent(operator);
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
}
