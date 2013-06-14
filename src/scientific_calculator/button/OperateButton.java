package scientific_calculator.button;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import scientific_calculator.DisplayArea;

public class OperateButton extends JButton implements MouseListener {
	
	private DisplayArea displayArea;
	final String operator;
	public OperateButton(String operator, DisplayArea displayArea) {
		super(operator);
		setOpaque(true);
		this.displayArea = displayArea;
		this.operator=setOperator(operator);
		addMouseListener(this);
	}
	private String setOperator(String operator){
		if(operator.equals("x²")){
			return "²";
		}
		else if(operator.equals("x³")){
			return "³";
		}
		else if(operator.equals("xⁿ")){
			return "^";
		}
		return operator;
		
	}

	public void mouseClicked(MouseEvent e) {
		System.out.println("OperationButton!");
		displayArea.addDisplayContent(operator);
	}

	public void mouseEntered(MouseEvent e) {}

	public void mouseExited(MouseEvent e) {}

	public void mousePressed(MouseEvent e) {}

	public void mouseReleased(MouseEvent e) {}
}
