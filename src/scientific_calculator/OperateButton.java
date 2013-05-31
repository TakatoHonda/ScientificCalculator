package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class OperateButton extends JButton implements MouseListener {
	
	private final int OperationKind;

	OperateButton(String display, int OperationKind) {
		super(display);
		this.OperationKind = OperationKind;
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("OperationButton!");
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
}
