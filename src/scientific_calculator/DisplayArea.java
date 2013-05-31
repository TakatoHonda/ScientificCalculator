package scientific_calculator;

import java.awt.Color;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class DisplayArea extends JTextArea{
	
	private String displayContent;
	private String script = "";
	private boolean finishedFlag=true;
	DisplayArea (){
		super(5,10);
		this.setBackground(Color.pink);
		this.setText("0");
	}
	
	public void SetDisplayContent(String content){
		if(finishedFlag==true){
			displayContent = content;
			finishedFlag = false;
		}else{
		displayContent = getText() + content;
		}		
		setText(displayContent);
	}
	
}
