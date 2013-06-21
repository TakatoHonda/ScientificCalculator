package scientific_calculator.button;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;

public class OctalButton extends JButton implements MouseListener{
	private DisplayArea displayArea;
	
	public OctalButton(String operator, DisplayArea displayArea){
		this.displayArea = displayArea;
		addMouseListener(this);
	}
	
	public void mouseClicked(MouseEvent e) {
		try{
		System.out.println("OctalButton!");
		displayArea.setText("("+Integer.toOctalString(Integer.parseInt(displayArea.getText()))+")₈");
		}catch(Exception e1){
			System.out.println("double型は8進数に変換できません");
			displayArea.setText("error");
		}
		}
	public void mouseEntered(MouseEvent e) {}
	public void mouseExited(MouseEvent e) {}
	public void mousePressed(MouseEvent e) {}
	public void mouseReleased(MouseEvent e) {}

}

