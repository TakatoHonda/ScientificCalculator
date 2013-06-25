package scientific_calculator;

import java.io.IOException;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class ArithmeticUnit{
	DisplayArea displayArea;

	public ArithmeticUnit(DisplayArea displayArea){
		this.displayArea = displayArea;
	}

	public void operate(){
		try{
			ScriptEngineManager factory = new ScriptEngineManager();
			ScriptEngine engine = factory.getEngineByName("JavaScript");
			double result = (Double) engine.eval(getScript());
			result = Double.valueOf((Double.toString(result).format("%.10f", result)));
			displayArea.setText("" + result);
			Runtime r = Runtime.getRuntime();
			try{
				r.exec("say " + result);
			}
			catch (IOException e){
				e.printStackTrace();
			}
			displayArea.finished();
		}
		catch (ScriptException e1){
			System.out.println("式が間違っています");
			// throw new RuntimeException(e1);
		}
	}

	private String getScript(){
		String script = displayArea.getText();
		script = getTrigonometricFunction(script);
		script = getSpecialNumber(script);
		script = getLog(script);
		script = getLn(script);
		script = getPow(script);
		script = getFactorial(script);
		System.out.println(script);
		return script;
	}

	private String getTrigonometricFunction(String script){
		for (int i = 0; i < script.length() - 2; i++){
			if (script.substring(i, i + 3).equals("Sin")){
				script = script.substring(0, i) + "Math.sin" + script.substring(i + 3);
			}
			if (script.substring(i, i + 3).equals("Cos")){
				script = script.substring(0, i) + "Math.cos" + script.substring(i + 3);
			}
			if (script.substring(i, i + 3).equals("Tan")){
				script = script.substring(0, i) + "Math.tan" + script.substring(i + 3);
			}
		}
		return script;
	}

	private String getSpecialNumber(String script){
		for (int i = 0; i < script.length(); i++){
			if (script.substring(i, i + 1).equals("π")){
				script = script.substring(0, i) + "Math.PI" + script.substring(i + 1);
				System.out.println(script);
			}
			if (script.substring(i, i + 1).equals("e")){
				script = script.substring(0, i) + "Math.E" + script.substring(i + 1);
			}
		}
		return script;
	}

	private String getLn(String script){
		for (int i = 0; i < script.length() - 2; i++){
			if (script.substring(i, i + 2).equals("ln")){
				script = script.substring(0, i) + "Math.log(" + script.substring(i + 3);
			}
		}
		return script;

	}

	private String getLog(String script){
		for (int i = 0; i < script.length() - 2; i++){
			if (script.substring(i, i + 3).equals("Log")){
				script = script.substring(0, i) + "Math.LOG10E * Math.log" + script.substring(i + 3);
			}
		}
		return script;

	}

	private String getPow(String script){
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 2
		for (int i = 1; i < script.length(); i++){
			if (script.substring(i, i + 1).equals("²") && script.substring(i - 1, i).equals(")")){
				for (int j = i; j >= 0; j--){
					if (script.substring(j, j + 1).equals("(")){
						script = script.substring(0, j) + "Math.pow" + script.substring(j, i - 1) + ",2)" + script.substring(i + 1);
						return script;
					}
				}
			}else if (script.substring(i, i + 1).equals("²") && !script.substring(i - 1, i).equals(")")){
				for (int j = i; j > 0; j--){
					if (script.substring(j, j + 1).equals("+") || script.substring(j, j + 1).equals("/") || script.substring(j, j + 1).equals("*")
							|| script.substring(j, j + 1).equals("-")){
						script = script.substring(0, j + 1) + "Math.pow(" + script.substring(j + 1, i) + ",2)" + script.substring(i + 1);
						break;
					}
					if (j == 1){
						script = "Math.pow(" + script.substring(0, i) + ",2)" + script.substring(i + 1);
					}
				}
			}
		}
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ 3
		for (int i = 1; i < script.length(); i++){
			if (script.substring(i, i + 1).equals("³") && script.substring(i - 1, i).equals(")")){
				for (int j = i; j >= 0; j--){
					if (script.substring(j, j + 1).equals("(")){
						script = script.substring(0, j) + "Math.pow" + script.substring(j, i - 1) + ",3)" + script.substring(i + 1);
						return script;
					}
				}
			}else if (script.substring(i, i + 1).equals("³") && !script.substring(i - 1, i).equals(")")){
				for (int j = i; j > 0; j--){
					if (script.substring(j, j + 1).equals("+") || script.substring(j, j + 1).equals("/") || script.substring(j, j + 1).equals("*")
							|| script.substring(j, j + 1).equals("-")){
						script = script.substring(0, j + 1) + "Math.pow(" + script.substring(j + 1, i) + ",3)" + script.substring(i + 1);
						break;
					}
					if (j == 1){
						script = "Math.pow(" + script.substring(0, i) + ",3)" + script.substring(i + 1);
					}
				}
			}
		}
		// @@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ n
		// **********************************************************************************************
		// Begin of n
		// power******************************************************************************
		// **********************************************************************************************
		String scriptBefore = "";
		String scriptAfter = "";
		for (int i = 1; i < script.length(); i++){
			if (script.substring(i, i + 1).equals("^") && script.substring(i - 1, i).equals(")")){
				for (int j = i - 2; j >=0; j--){
					if (script.substring(j, j + 1).equals("(")){
						scriptBefore = script.substring(0, j) + "Math.pow" + script.substring(j, i - 1) + ",";

						System.out.println("before = " + scriptBefore);
					}
				}
				if (script.substring(i + 1, i + 2).equals("(")){
					for (int p = i; p < script.length(); p++){
						if (script.substring(p, p + 1).equals(")")){
							scriptAfter = script.substring(i + 1, p + 1) + ")" + script.substring(p + 1);
							System.out.println("after = " + scriptAfter);
							script = scriptBefore + scriptAfter;
							System.out.println("before and after = " + script);
							return script;

						}
					}
				}
			}
		}
		// **********************************************************************************************
		// End of n
		// power******************************************************************************
		// **********************************************************************************************

		return script;
	}

	private String getFactorial(String script){
		for (int i = 1; i < script.length(); i++){
			System.out.println("にゃ");
			if (script.substring(i, i + 1).equals("!") && script.substring(i - 1, i).equals(")")){
				System.out.println("ん");
				for (int j = i - 1; j >= 0; j--){
					System.out.println("こ");
					if (script.substring(j, j + 1).equals("(")){
						System.out.println("だよ");
						int num = Integer.valueOf(script.substring(j + 1, i - 1));
						script = script.substring(0, j) + fact(num) + script.substring(i + 1);
						break;
					}
				}

				System.out.println(script);
			}
		}
		return script;
	}

	private String fact(int num){
		double result = num;
		if (num < 0){
			System.err.println("error");
			return "error";
		}
		if (num > 1){
			for (int i = num - 1; i > 0; i--){
				result *= i;
			}
		}
		return Double.toString(result);
	}

}
