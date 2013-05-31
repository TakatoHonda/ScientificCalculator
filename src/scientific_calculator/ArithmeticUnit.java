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
			double result = (Double) engine.eval(/*getScript(displayArea.getText())*/"4");
			System.out.println(getScript(displayArea.getText()));
			System.out.println(result);
		}
		catch (ScriptException e1){
			throw new RuntimeException(e1);
		}
	}
	private String getScript(String displayNumber){
		String script="";
		for(int i=0;i<displayNumber.length()-4;i++){
			if(displayNumber.substring(i,i+3).equals("sin")){
				script = displayNumber.substring(0,i) + "Math.sin"+displayNumber.substring(i+3); 
			}
			if(displayNumber.substring(i,i+3).equals("cos")){
				script = displayNumber.substring(0,i) + "Math.cos"+displayNumber.substring(i+3); 
			}
		}
		return script;
	}

}
