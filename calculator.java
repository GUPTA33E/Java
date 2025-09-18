import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.ButtonGroup;

public class calculator {

	private JFrame frame;
	private JTextField textField;

	double first;
	double second;
	double result;
	String operation;
	String answer;
	private final ButtonGroup buttonGroup = new ButtonGroup();


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("SCIENTIFIC CALCULATOR");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblNewLabel.setBounds(40, 10, 313, 57);
		frame.getContentPane().add(lblNewLabel);

		textField = new JTextField();
		textField.setEnabled(false);
		textField.setFont(new Font("Tahoma", Font.BOLD, 21));
		textField.setBounds(10, 77, 366, 89);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnXy = new JButton("X^Y");
		btnXy.setEnabled(false);
		btnXy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="X^Y";
			}
		});
		btnXy.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnXy.setBounds(10, 298, 64, 37);
		frame.getContentPane().add(btnXy);

		JButton btnX = new JButton("X^3");
		btnX.setEnabled(false);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnX.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnX.setBounds(10, 343, 64, 37);
		frame.getContentPane().add(btnX);

		JButton bcc = new JButton("X^2");
		bcc.setEnabled(false);
		bcc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =(Double.parseDouble(textField.getText()));
				a=a*a;
				textField.setText("");
				textField.setText(textField.getText()+a);
			}

		});
		bcc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		bcc.setBounds(10, 390, 64, 37);
		frame.getContentPane().add(bcc);

		JButton btt = new JButton("n!");
		btt.setEnabled(false);
		btt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(textField.getText());
				double fact=1;
				while(a!=0)
				{
					fact=fact*a;
					a--;
				}
				textField.setText("");
				textField.setText(textField.getText()+fact);

			}
		});
		btt.setFont(new Font("Tahoma", Font.PLAIN, 21));
		btt.setBounds(10, 437, 64, 37);
		frame.getContentPane().add(btt);

		JButton btnPlusMinus = new JButton("+/-");
		btnPlusMinus.setEnabled(false);
		btnPlusMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a=Double.parseDouble(String.valueOf(textField.getText()));
				a=a*(-1);
				textField.setText(String.valueOf(a)); // String.valueOf gives integer value from string
			}
		});
		btnPlusMinus.setFont(new Font("Tahoma", Font.PLAIN, 19));
		btnPlusMinus.setBounds(10, 484, 64, 37);
		frame.getContentPane().add(btnPlusMinus);

		JButton btnEx = new JButton("e^x");
		btnEx.setEnabled(false);
		btnEx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.exp(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnEx.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnEx.setBounds(84, 209, 64, 37);
		frame.getContentPane().add(btnEx);

		JButton btnLog = new JButton("Log");
		btnLog.setEnabled(false);
		btnLog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.log(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnLog.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnLog.setBounds(84, 251, 64, 37);
		frame.getContentPane().add(btnLog);

		JButton btnPercent = new JButton("%");
		btnPercent.setEnabled(false);
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="%";          //holds the operation to be done
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnPercent.setBounds(84, 298, 64, 37);
		frame.getContentPane().add(btnPercent);

		JButton btn7 = new JButton("7");
		btn7.setEnabled(false);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn7.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn7.setBounds(84, 343, 64, 37);
		frame.getContentPane().add(btn7);

		JButton btn4 = new JButton("4");
		btn4.setEnabled(false);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn4.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn4.setBounds(84, 390, 64, 37);
		frame.getContentPane().add(btn4);

		JButton btn1 = new JButton("1");
		btn1.setEnabled(false);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn1.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn1.setBounds(84, 437, 64, 37);
		frame.getContentPane().add(btn1);

		JButton btn0 = new JButton("0");
		btn0.setEnabled(false);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btt.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn0.setBounds(84, 484, 138, 37);
		frame.getContentPane().add(btn0);

		JButton btnSin = new JButton("Sin");
		btnSin.setEnabled(false);
		btnSin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				double a =Math.sin(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSin.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnSin.setBounds(158, 209, 64, 37);
		frame.getContentPane().add(btnSin);

		JButton btnSinh = new JButton("Sinh");
		btnSinh.setEnabled(false);
		btnSinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sinh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnSinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnSinh.setBounds(158, 252, 64, 37);
		frame.getContentPane().add(btnSinh);

		JButton btnClear = new JButton("C");
		btnClear.setEnabled(false);
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(null);//we want our text field to be null when we select clear button
			}
		});
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnClear.setBounds(158, 298, 64, 37);
		frame.getContentPane().add(btnClear);

		JButton btn8 = new JButton("8");
		btn8.setEnabled(false);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn8.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn8.setBounds(158, 343, 64, 37);
		frame.getContentPane().add(btn8);

		JButton btn5 = new JButton("5");
		btn5.setEnabled(false);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn5.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn5.setBounds(158, 390, 64, 37);
		frame.getContentPane().add(btn5);

		JButton btn2 = new JButton("2");
		btn2.setEnabled(false);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn2.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn2.setBounds(158, 437, 64, 37);
		frame.getContentPane().add(btn2);

		JButton btnCos = new JButton("Cos");
		btnCos.setEnabled(false);
		btnCos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.cos(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCos.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnCos.setBounds(232, 209, 64, 37);
		frame.getContentPane().add(btnCos);

		JButton btnCosh = new JButton("Cosh");
		btnCosh.setEnabled(false);
		btnCosh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.cosh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnCosh.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCosh.setBounds(232, 252, 64, 37);
		frame.getContentPane().add(btnCosh);

		JButton btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setEnabled(false);
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String backSpace=null;

				if(textField.getText().length()>0)  //checking if length of input string is > than 0
				{
					StringBuilder str= new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);    //reducing string size by 1
					backSpace=str.toString();                            //display new string to text field
					textField.setText(backSpace);                        //change B to backspace symbol

				}
			}
		});
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 21));
		btnBackSpace.setBounds(232, 298, 64, 37);
		frame.getContentPane().add(btnBackSpace);

		JButton btn9 = new JButton("9");
		btn9.setEnabled(false);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn9.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn9.setBounds(232, 343, 64, 37);
		frame.getContentPane().add(btn9);

		JButton btn6 = new JButton("6");
		btn6.setEnabled(false);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn6.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn6.setBounds(232, 390, 64, 37);
		frame.getContentPane().add(btn6);

		JButton btn3 = new JButton("3");
		btn3.setEnabled(false);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btn3.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 21));
		btn3.setBounds(232, 437, 64, 37);
		frame.getContentPane().add(btn3);

		JButton btndot = new JButton(".");
		btndot.setEnabled(false);
		btndot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String number=textField.getText()+btndot.getText();//to get the number from the user
				textField.setText(number);//setting text to next field
			}
		});
		btndot.setFont(new Font("Tahoma", Font.BOLD, 24));
		btndot.setBounds(232, 484, 64, 37);
		frame.getContentPane().add(btndot);

		JButton btnTan = new JButton("Tan");
		btnTan.setEnabled(false);
		btnTan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.tan(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTan.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnTan.setBounds(306, 209, 64, 37);
		frame.getContentPane().add(btnTan);

		JButton btnTanh = new JButton("Tanh");
		btnTanh.setEnabled(false);
		btnTanh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.tanh(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnTanh.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnTanh.setBounds(306, 252, 64, 37);
		frame.getContentPane().add(btnTanh);

		JButton btnAdd = new JButton("+");
		btnAdd.setEnabled(false);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="+";              //holds operation to be done

			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnAdd.setBounds(306, 298, 64, 37);
		frame.getContentPane().add(btnAdd);

		JButton btnSub = new JButton("-");
		btnSub.setEnabled(false);
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			first=Double.parseDouble(textField.getText());
			textField.setText("");
			operation="-";                //holds operation to be done
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnSub.setBounds(306, 343, 64, 37);
		frame.getContentPane().add(btnSub);

		JButton btnDivide = new JButton("/");
		btnDivide.setEnabled(false);
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="/";            //holds operation to be done
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnDivide.setBounds(306, 437, 64, 37);
		frame.getContentPane().add(btnDivide);

		JButton btnequal = new JButton("=");
		btnequal.setEnabled(false);
		btnequal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				second=Double.parseDouble(textField.getText());
				if(operation=="+")
				{
					result=first+second;
					answer=String.format("%.2f", result);  //converting string storing result into answer
					textField.setText(answer);
				}
				else if(operation=="-")
				{
					result=first-second;
					answer=String.format("%.2f", result);   //converting string storing result into answer
					textField.setText(answer);
				}
				else if(operation=="*")
				{
					result=first*second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="/")
				{
					result=first/second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="%")
				{
					result=first%second;
					answer=String.format("%.2f", result);
					textField.setText(answer);
				}
				else if(operation=="X^Y")
				{
					double resultt=1;
					for(int i=0;i<second;i++)
					{
					resultt=first*resultt;
					}

					answer=String.format("%.2f", resultt);
					textField.setText(answer);

				}
			}
			});
		btnequal.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnequal.setBounds(306, 484, 64, 37);
		frame.getContentPane().add(btnequal);

		JButton btnMul = new JButton("*");
		btnMul.setEnabled(false);
		btnMul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				first=Double.parseDouble(textField.getText());
				textField.setText("");
				operation="*";                     //holds operation to be done
			}
		});
		btnMul.setFont(new Font("Tahoma", Font.BOLD, 21));
		btnMul.setBounds(306, 390, 64, 37);
		frame.getContentPane().add(btnMul);

		JButton btnRoot= new JButton("\u221A");
		btnRoot.setEnabled(false);
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =Math.sqrt(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btnRoot.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnRoot.setBounds(10, 209, 64, 37);
		frame.getContentPane().add(btnRoot);

		JButton btn1byx = new JButton("1/x");
		btn1byx.setEnabled(false);
		btn1byx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double a =1/(Double.parseDouble(textField.getText()));
				textField.setText("");
				textField.setText(textField.getText()+a);
			}
		});
		btn1byx.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btn1byx.setBounds(10, 251, 64, 37);
		frame.getContentPane().add(btn1byx);
		frame.setBounds(100, 100, 401, 580);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(true);
				btn2.setEnabled(true);
				btn3.setEnabled(true);
				btn4.setEnabled(true);
				btn5.setEnabled(true);
				btn6.setEnabled(true);
				btn7.setEnabled(true);
				btn8.setEnabled(true);
				btn9.setEnabled(true);
				btn0.setEnabled(true);

				btndot.setEnabled(true);
				btnAdd.setEnabled(true);
				btnSub.setEnabled(true);
				btnMul.setEnabled(true);
				btnDivide.setEnabled(true);
				btnequal.setEnabled(true);
				btnPercent.setEnabled(true);

				btnSin.setEnabled(true);
				btnSinh.setEnabled(true);
				btnCos.setEnabled(true);
				btnCosh.setEnabled(true);
				btnTan.setEnabled(true);
				btnTanh.setEnabled(true);

				btnBackSpace.setEnabled(true);
				btnClear.setEnabled(true);
				btnXy.setEnabled(true);
				btnX.setEnabled(true);
				btnEx.setEnabled(true);
				btnLog.setEnabled(true);
				bcc.setEnabled(true);
				btt.setEnabled(true);
				btnPlusMinus.setEnabled(true);

				btnRoot.setEnabled(true);
				btn1byx.setEnabled(true);
				textField.setEnabled(true);

			}
		});
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		rdbtnNewRadioButton.setBounds(6, 172, 57, 21);
		frame.getContentPane().add(rdbtnNewRadioButton);

		JRadioButton rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.setSelected(true);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				btn2.setEnabled(false);
				btn3.setEnabled(false);
				btn4.setEnabled(false);
				btn5.setEnabled(false);
				btn6.setEnabled(false);
				btn7.setEnabled(false);
				btn8.setEnabled(false);
				btn9.setEnabled(false);
				btn0.setEnabled(false);

				btndot.setEnabled(false);
				btnAdd.setEnabled(false);
				btnSub.setEnabled(false);
				btnMul.setEnabled(false);
				btnDivide.setEnabled(false);
				btnequal.setEnabled(false);
				btnPercent.setEnabled(false);

				btnSin.setEnabled(false);
				btnSinh.setEnabled(false);
				btnCos.setEnabled(false);
				btnCosh.setEnabled(false);
				btnTan.setEnabled(false);
				btnTanh.setEnabled(false);

				btnBackSpace.setEnabled(false);
				btnClear.setEnabled(false);
				btnXy.setEnabled(false);
				btnX.setEnabled(false);
				btnEx.setEnabled(false);
				btnLog.setEnabled(false);
				bcc.setEnabled(false);
				btt.setEnabled(false);
				btnPlusMinus.setEnabled(false);

				btnRoot.setEnabled(false);
				btn1byx.setEnabled(false);
				textField.setEnabled(false);

			}
		});
		buttonGroup.add(rdbtnOff);
		rdbtnOff.setFont(new Font("Tahoma", Font.BOLD, 16));
		rdbtnOff.setBounds(68, 172, 57, 21);
		frame.getContentPane().add(rdbtnOff);


	}
}
