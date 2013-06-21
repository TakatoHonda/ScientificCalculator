package scientific_calculator;

import java.awt.Color;
import java.awt.Font;

import javax.print.attribute.standard.Finishings;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class DisplayArea extends JTextArea{

	private String displayContent = "";
	private boolean finishedFlag = true;

	DisplayArea(){
		setBackground(Color.white);
		setText("");
		setRows(1);
		Font font = new Font("Dialog", Font.PLAIN, 60);
		setFont(font);
	}

	public void addDisplayContent(String displayContent){
		if (getText().length() < 15){
			if (finishedFlag == true){
				this.displayContent = displayContent;
				finishedFlag = false;
			}else{
				this.displayContent = getText() + displayContent;
			}
			setText(this.displayContent);
		}
	}

	public void removeSingleDisplayContent(){
		if (displayContent.length() > 0){
			displayContent = displayContent.substring(0, displayContent.length() - 1);
			setText(displayContent);
		}
	}

	public void clear(){
		displayContent = "";
		setText("");
		finishedFlag = true;
	}

	public void finished(){
		finishedFlag = true;
	}

}
