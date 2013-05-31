package scientific_calculator;

import java.awt.Color;

import javax.swing.JFrame;

import button.RemoveButton;

@SuppressWarnings("serial")
public class Calculator extends JFrame{

	private DisplayArea displayArea;
	private ArithmeticUnit arithmeticUnit;

	private NumberButton[] numberButton;
	private NumberButton piButton;
	private NumberButton napierButton;

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
	private OperateButton nTimesPowerButton;
	private OperateButton cubeRootButton;
	private OperateButton nTimesRootButton;
	private OperateButton leftBracketButton;
	private OperateButton rightBracketButton;
	private OperateButton radixPointButton;
	private OperateButton deleteButton;
	private ClearButton clearButton;
	private EqualButton equalButton;
	private RemoveButton removeButton;

	public static void main(String[] args){
		Calculator calculator = new Calculator();
		calculator.setVisible(true);
	}

	Calculator(){
		initFields();
		initGUI();
	}

	public void initFields(){
		displayArea = new DisplayArea();
		numberButton = new NumberButton[10];
		for (int i = 0; i < 10; i++){
			numberButton[i] = new NumberButton(""+i, displayArea);
			add(numberButton[i]);
		}
		piButton = new NumberButton("π", displayArea);
		napierButton = new NumberButton("e", displayArea);
		clearButton = new ClearButton(displayArea);
		// new arithmeticUnit
		arithmeticUnit = new ArithmeticUnit(displayArea);
		equalButton = new EqualButton("=", arithmeticUnit);
		plusButton = new OperateButton("+", displayArea);
		minusButton = new OperateButton("-", displayArea);
		multiplyButton = new OperateButton("*", displayArea);
		divideButton = new OperateButton("/", displayArea);
		
		factorialButton = new OperateButton("!", displayArea);
		logarithmsButton = new OperateButton("Log", displayArea);
		logarithmsNaturalButton = new OperateButton("ln", displayArea);
		sinButton = new OperateButton("Sin", displayArea);
		cosButton = new OperateButton("Cos", displayArea);
		tanButton = new OperateButton("Tan", displayArea);
		
		squareButton = new OperateButton("x²", displayArea);
		cubeButton = new OperateButton("x³", displayArea);
		nTimesPowerButton = new OperateButton("xⁿ", displayArea);
		squareRootButton = new OperateButton("²√x", displayArea);
		cubeRootButton = new OperateButton("³√x", displayArea);
		nTimesRootButton = new OperateButton("ⁿ√x", displayArea);
		leftBracketButton = new OperateButton("(", displayArea);
		rightBracketButton = new OperateButton(")", displayArea);
		radixPointButton = new OperateButton(".", displayArea);
		removeButton = new RemoveButton(displayArea);
		
	}

	public void initGUI(){
		// initialize
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 370);
		setLocation(100, 100);
		setBackground(Color.magenta);
		setLayout(null);

		// new and add DisplayArea.
		displayArea.setBounds(10, 10, 580, 80);
		add(displayArea);

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

		// new and add NumberButtons. pi and e
		piButton.setBounds(190, 220, 60, 60);
		add(piButton);
		napierButton.setBounds(190, 280, 60, 60);
		add(napierButton);

		// new and add ClearButton.
		clearButton.setBounds(530, 160, 60, 60);
		add(clearButton);

		// new and add EqualButton.
		equalButton.setBounds(530, 220, 60, 120);
		add(equalButton);

		// new and add OperateButtons.
		plusButton.setBounds(250, 100, 60, 60);
		add(plusButton);

		minusButton.setBounds(250, 160, 60, 60);
		add(minusButton);

		multiplyButton.setBounds(250, 220, 60, 60);
		add(multiplyButton);

		divideButton.setBounds(250, 280, 60, 60);
		add(divideButton);

		factorialButton.setBounds(130, 100, 60, 60);
		add(factorialButton);

		logarithmsButton.setBounds(70, 100, 60, 60);
		add(logarithmsButton);

		logarithmsNaturalButton.setBounds(10, 100, 60, 60);
		add(logarithmsNaturalButton);

		sinButton.setBounds(10, 160, 60, 60);
		add(sinButton);

		cosButton.setBounds(70, 160, 60, 60);
		add(cosButton);

		tanButton.setBounds(130, 160, 60, 60);
		add(tanButton);

		squareButton.setBounds(10, 220, 60, 60);
		add(squareButton);

		cubeButton.setBounds(70, 220, 60, 60);
		add(cubeButton);

		nTimesPowerButton.setBounds(130, 220, 60, 60);
		add(nTimesPowerButton);

		squareRootButton.setBounds(10, 280, 60, 60);
		add(squareRootButton);

		cubeRootButton.setBounds(70, 280, 60, 60);
		add(cubeRootButton);

		nTimesRootButton.setBounds(130, 280, 60, 60);
		add(nTimesRootButton);

		leftBracketButton.setBounds(190, 100, 60, 60);
		add(leftBracketButton);

		rightBracketButton.setBounds(190, 160, 60, 60);
		add(rightBracketButton);

		radixPointButton.setBounds(470, 280, 60, 60);
		add(radixPointButton);

		removeButton.setBounds(530, 100, 60, 60);
		add(removeButton);

	}

}
