package scientific_calculator;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

@SuppressWarnings("serial")
public class NumberButton extends JButton implements MouseListener {
	
	private final double value;
	private DisplayArea display_area;
	private String display;

	NumberButton(String display, double value, DisplayArea display_area) {
		super(display);
		this.display = display;
		this.value = value;
		this.display_area = display_area;
		addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("NumberButton!");
		display_area.SetDisplayCotent("" + display);
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
	
}
