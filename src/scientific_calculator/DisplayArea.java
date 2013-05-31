package scientific_calculator;

import java.awt.Color;

import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class DisplayArea extends JTextArea{
	
	public String DisplayContent;
	
	DisplayArea (){
		super(5,10);
		this.setBackground(Color.pink);
		this.setText(DisplayContent);
	}
	
	public void SetDisplayCotent(String content){
		this.DisplayContent = this.getText() + content;
		this.setText(DisplayContent);
	}
}
