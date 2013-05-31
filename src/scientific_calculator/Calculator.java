package scientific_calculator;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Calculator extends JFrame {
	
	private DisplayArea displayArea;
	
	private NumberButton[] numberButton;
	private NumberButton piButton;
	private NumberButton naturalButton;
	
	private OperateButton plusButton;
	private OperateButton squareRootButton;
	private OperateButton minusButton;
	private OperateButton multiplyButton;
	private OperateButton divideButton;
	private OperateButton factorialButton;
	private OperateButton logarithmsButton;
	private OperateButton logarithmsNaturalButton;
	private OperateButton sinButton;
	private OperateButton cosButton;
	private OperateButton tanButton;
	private OperateButton squareButton;
	private OperateButton cubeButton;
	private OperateButton operate_button_n_th_power;
	private OperateButton cubeRootButton;
	private OperateButton nTimesRootButton;
	private OperateButton leftBracketButton;
	private OperateButton rightBracketButton;
	private OperateButton radixPointButton;
	private OperateButton negativeButton;
	private ClearButton clearButton;
	private EqualButton equalButton;
	
	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.setVisible(true);
	}
	Calculator(){
		
		// initialize
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 370);
		setLocation(100, 100);
		setLayout(null);
		
		//new and add DisplayArea.
		displayArea = new DisplayArea();
		displayArea.setBounds(10, 10, 580, 80);
		add(displayArea);

		numberButton = new NumberButton[10];
		for (int i = 0; i < 10; i++) {
			numberButton[i] = new NumberButton(""+i, i, displayArea);
			add(numberButton[i]);
		}
		numberButton[0].setBounds(350, 280, 120, 60);
		numberButton[1].setBounds(350, 220, 60, 60);
		numberButton[2].setBounds(410, 220, 60, 60);
		numberButton[3].setBounds(470, 220, 60, 60);
		numberButton[4].setBounds(350, 160, 60, 60);
		numberButton[5].setBounds(410, 160, 60, 60);
		numberButton[6].setBounds(470, 160, 60, 60);
		numberButton[7].setBounds(350, 100, 60, 60);
		numberButton[8].setBounds(410, 100, 60, 60);
		numberButton[9].setBounds(470, 100, 60, 60);
		
		
		// new and add NumberButtons. Ï?and e
		piButton = new NumberButton("ƒÎ", 3.14159265358979, displayArea);
		piButton.setBounds(190, 220, 60, 60);
		add(piButton);
		naturalButton = new NumberButton("e", 2.718281828, displayArea);
		naturalButton.setBounds(190, 280, 60, 60);
		add(naturalButton);
		
		// new and add ClearButton.
		clearButton = new ClearButton("C");
		clearButton.setBounds(530, 160, 60, 60);
		add(clearButton);
		
		// new and add EqualButton.
		equalButton = new EqualButton("=");
		equalButton.setBounds(530, 220, 60, 120);
		add(equalButton);
		
		// new and add OperateButtons.
		plusButton = new OperateButton("+", 1);
		plusButton.setBounds(250, 100, 60, 60);
		add(plusButton);
		
		minusButton = new OperateButton("-", 2);
		minusButton.setBounds(250, 160, 60, 60);
		add(minusButton);
		
		multiplyButton = new OperateButton("~", 3);
		multiplyButton.setBounds(250, 220, 60, 60);
		add(multiplyButton);
		
		divideButton = new OperateButton("€", 4);
		divideButton.setBounds(250, 280, 60, 60);
		add(divideButton);
		
		factorialButton = new OperateButton("!", 5);
		factorialButton.setBounds(130, 100, 60, 60);
		add(factorialButton);
		
		logarithmsButton = new OperateButton("log", 6);
		logarithmsButton.setBounds(70, 100, 60, 60);
		add(logarithmsButton);
		
		logarithmsNaturalButton = new OperateButton("ln", 7);
		logarithmsNaturalButton.setBounds(10, 100, 60, 60);
		add(logarithmsNaturalButton);
		
		sinButton = new OperateButton("sin", 8);
		sinButton.setBounds(10, 160, 60, 60);
		add(sinButton);
		
		cosButton = new OperateButton("cos", 9);
		cosButton.setBounds(70, 160, 60, 60);
		add(cosButton);
		
		tanButton = new OperateButton("tan", 10);
		tanButton.setBounds(130, 160, 60, 60);
		add(tanButton);
		
		squareButton = new OperateButton("xÂ²", 11);
		squareButton.setBounds(10, 220, 60, 60);
		add(squareButton);
		
		cubeButton = new OperateButton("xÂ³", 12);
		cubeButton.setBounds(70, 220, 60, 60);
		add(cubeButton);
		
		operate_button_n_th_power = new OperateButton("xâ¿", 13);
		operate_button_n_th_power.setBounds(130, 220, 60, 60);
		add(operate_button_n_th_power);
		
		squareRootButton = new OperateButton("Â²âˆšx", 14);
		squareRootButton.setBounds(10, 280, 60, 60);
		add(squareRootButton);
		
		cubeRootButton = new OperateButton("Â³âˆšx", 14);
		cubeRootButton.setBounds(70, 280, 60, 60);
		add(cubeRootButton);
		
		nTimesRootButton = new OperateButton("â¿âˆšx",16);
		nTimesRootButton.setBounds(130, 280, 60, 60);
		add(nTimesRootButton);
		
		leftBracketButton = new OperateButton("(",17);
		leftBracketButton.setBounds(190, 100, 60, 60);
		add(leftBracketButton);
		
		rightBracketButton = new OperateButton(")",18);
		rightBracketButton.setBounds(190, 160, 60, 60);
		add(rightBracketButton);
		
		radixPointButton = new OperateButton(".",19);
		radixPointButton.setBounds(470, 280, 60, 60);
		add(radixPointButton);
		
		negativeButton  = new OperateButton("-",19);
		negativeButton.setBounds(530, 100, 60, 60);
		add(negativeButton);
		
	}
	
	
}
