package scientific_calculator;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ArithmeticUnit{
	DisplayArea displayArea;
	public ArithmeticUnit(DisplayArea displayArea){
		this.displayArea = displayArea;
	}

	void operate(){
		try{
			ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine engine = factory.getEngineByName("JavaScript");
			double result = (Double) engine.eval(getScript());
			displayArea.setText(""+result);
			displayArea.finished();
		}
		catch (ScriptException e1){
			System.out.println("Ž®‚ªŠÔˆá‚Á‚Ä‚¢‚Ü‚·");
			//throw new RuntimeException(e1);
		}
	}
	private String getScript(){
		String script=displayArea.getText();
		for(int i=0;i<script.length()-2;i++){
			if(script.substring(i,i+3).equals("Sin")){
				script = script.substring(0,i) + "Math.sin"+script.substring(i+3); 
			}
			if(script.substring(i,i+3).equals("Cos")){
				script = script.substring(0,i) + "Math.cos"+script.substring(i+3); 
			}
			if(script.substring(i,i+3).equals("Tan")){
				script = script.substring(0,i) + "Math.tan"+script.substring(i+3); 
			}
			if(script.substring(i,i+3).equals("Log")){
				script = script.substring(0,i) + "Math.log"+script.substring(i+3); 
			}	
		}
		for(int i=0;i<script.length();i++){
			if(script.substring(i,i+1).equals("ƒÎ")){
				script = script.substring(0,i) + "Math.PI" + script.substring(i+1);
				System.out.println(script);
			}
			if(script.substring(i,i+1).equals("e")){
				script = script.substring(0,i) + "Math.E" + script.substring(i+1);
			}
		}
		System.out.println(script);
		return script;
	}

}
