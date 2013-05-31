package scientific_calculator;

import java.awt.Color;

import javax.print.attribute.standard.Finishings;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class DisplayArea extends JTextArea{
	
	private String displayContent = "";
	private boolean finishedFlag=true;
	DisplayArea (){
		super(5,10);
		this.setBackground(Color.white);
		this.setText("");
	}
	
	public void addDisplayContent(String displayContent){
		if(finishedFlag==true){
			this.displayContent = displayContent;
			finishedFlag = false;
		}else{
		this.displayContent = getText() + displayContent;
		}		
		setText(this.displayContent);
	}
	public void removeSingleDisplayContent(){
		if(displayContent.length()>0){
		displayContent = displayContent.substring(0, displayContent.length()-1);
		setText(displayContent);
		}
	}
	public void clear(){
		displayContent = "";
		setText("");
		finishedFlag =true;
	}
		public void finished(){
		finishedFlag = true;
	}
	
}
