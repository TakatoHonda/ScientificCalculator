package scientific_calculator.button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;

public class HexButton extends JButton implements MouseListener{
	private DisplayArea displayArea;
	
	public HexButton(String operator, DisplayArea displayArea){
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		try{
		System.out.println("HexButton!");
		displayArea.setText("("+Integer.toHexString(Integer.parseInt(displayArea.getText()))+")₁₆");
		}catch(Exception e1){
			System.out.println("double型は16進数に変換できません");
			displayArea.setText("error");
		}
		}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

}