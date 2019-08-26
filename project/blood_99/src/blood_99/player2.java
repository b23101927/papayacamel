package blood_99;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;


import blood_99.Final;

public class player2 extends JFrame implements ActionListener {
	// �P�w
	private static ArrayList cardbase = new ArrayList();
	private int counts_cards = 5;// 5 �i��P
	// bottom �W��5 �i��P
	private static String card_01;
	private static String card_02;
	private static String card_03;
	private static String card_04;
	private static String card_05;
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10; 
	private int judge_ten_or_twenty;// �P�_10��20
	Socket connectionSock;// �s�u
	DataOutputStream serverOutput;// �s�u

	public static void main(String[] args) throws UnknownHostException, IOException {
		/////////////////////////// �o�P�~�P��(�H�U)
		Final pk = new Final();
		pk.createCard();
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				pk.createdetail(i, j);
			}
		}
		// pk.printdetail();
		for (int k = 0; k < 52; k++) {
			cardbase.add(pk.cardList().get(k));
		}

		System.out.println(pk.cardList());
		System.out.println(cardbase);
		System.out.println(cardbase.get(0));
		card_01 = (String) cardbase.get(0);
		card_02 = (String) cardbase.get(1);
		card_03 = (String) cardbase.get(2);
		card_04 = (String) cardbase.get(3);
		card_05 = (String) cardbase.get(4);
		// �إ�FRAME
		player2 frame = new player2();
		frame.setTitle("Player1");// ��W�r
		frame.setVisible(true);
		frame.setResizable(false);
	}

	public player2() {
//�s�u
		try {
			connectionSock = new Socket("127.0.0.1", 8000);
			serverOutput = new DataOutputStream(connectionSock.getOutputStream());
//			serverOutput.writeBytes("1");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// frame�����Ѽ�
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);

		// �]�m���s
		// ���i���J�P
		// ���i���J�P
		bt1 = new JButton(card_01);
		bt2 = new JButton(card_02);
		bt3 = new JButton(card_03);
		bt4 = new JButton(card_04);
		bt5 = new JButton(card_05);
		bt1.setBounds(50, 430, 80, 120);
		bt2.setBounds(150, 430, 80, 120);
		bt3.setBounds(250, 430, 80, 120);
		bt4.setBounds(350, 430, 80, 120);
		bt5.setBounds(450, 430, 80, 120);
		// �P�_+10or-10
		bt6 = new JButton("+");
		bt7 = new JButton("-");
		bt6.setBounds(565, 430, 50, 50);
		bt7.setBounds(565, 500, 50, 50);
		bt8 = new JButton("P1");
		bt9 = new JButton("P2");
		bt10 = new JButton("P3");
		bt8.setBounds(650, 430, 50, 30);
		bt9.setBounds(650, 470, 50, 30);
		bt10.setBounds(650, 510, 50, 30);

		
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		bt7.addActionListener(this);
		bt8.addActionListener(this);
		bt9.addActionListener(this);
		bt10.addActionListener(this);
		// ��F��[��frame�̭�
		// ��F��[��frame�̭�
				this.add(bt1);
				this.add(bt2);
				this.add(bt3);
				this.add(bt4);
				this.add(bt5);
				this.add(bt6);
				this.add(bt7);
				this.add(bt8);
				this.add(bt9);
				this.add(bt10);
	}

	public void function_A() {
		try {
			serverOutput.writeBytes("1\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_2() {
		try {
			serverOutput.writeBytes("2\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_3() {
		try {
			serverOutput.writeBytes("3\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_4() {
		try {
			serverOutput.writeBytes("4\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_5() {
		try {
			serverOutput.writeBytes("5\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_6() {
		try {
			serverOutput.writeBytes("6\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_7() {
		try {
			serverOutput.writeBytes("7\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_8() {
		try {
			serverOutput.writeBytes("8\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_9() {
		try {
			serverOutput.writeBytes("9\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_10() {
		try {
			serverOutput.writeBytes("10\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_J() {
		try {
			serverOutput.writeBytes("11\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_Q() {
		try {
			serverOutput.writeBytes("12\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_K() {
		try {
			serverOutput.writeBytes("13\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void function_positive() {
		try {
			serverOutput.writeBytes("+\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void function_negetive() {
		try {
			serverOutput.writeBytes("-\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void function_p1(){
		try {
			serverOutput.writeBytes("P1\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void function_p2(){
		try {
			serverOutput.writeBytes("P2\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void function_p3(){
		try {
			serverOutput.writeBytes("P3\n");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// �P�_�X���P�O����
	public void actionPerformed(ActionEvent e) {
		if ((e.getActionCommand().equals("����1")) || (e.getActionCommand().equals("���A"))
				|| (e.getActionCommand().equals("����1")) || (e.getActionCommand().equals("�®�A"))) {
			function_A();
		} else if ((e.getActionCommand().equals("����2")) || (e.getActionCommand().equals("���2"))
				|| (e.getActionCommand().equals("����2")) || (e.getActionCommand().equals("�®�2"))) {
			function_2();
		} else if ((e.getActionCommand().equals("����3")) || (e.getActionCommand().equals("���3"))
				|| (e.getActionCommand().equals("����3")) || (e.getActionCommand().equals("�®�3"))) {
			function_3();
		} else if ((e.getActionCommand().equals("����4")) || (e.getActionCommand().equals("���4"))
				|| (e.getActionCommand().equals("����4")) || (e.getActionCommand().equals("�®�4"))) {
			function_4();
		} else if ((e.getActionCommand().equals("����5")) || (e.getActionCommand().equals("���5"))
				|| (e.getActionCommand().equals("����5")) || (e.getActionCommand().equals("�®�5"))) {
			function_5();
		} else if ((e.getActionCommand().equals("����6")) || (e.getActionCommand().equals("���6"))
				|| (e.getActionCommand().equals("����6")) || (e.getActionCommand().equals("�®�6"))) {
			function_6();
		} else if ((e.getActionCommand().equals("����7")) || (e.getActionCommand().equals("���7"))
				|| (e.getActionCommand().equals("����7")) || (e.getActionCommand().equals("�®�7"))) {
			function_7();
		} else if ((e.getActionCommand().equals("����8")) || (e.getActionCommand().equals("���8"))
				|| (e.getActionCommand().equals("����8")) || (e.getActionCommand().equals("�®�8"))) {
			function_8();
		} else if ((e.getActionCommand().equals("����9")) || (e.getActionCommand().equals("���9"))
				|| (e.getActionCommand().equals("����9")) || (e.getActionCommand().equals("�®�9"))) {
			function_9();
		} else if ((e.getActionCommand().equals("����10")) || (e.getActionCommand().equals("���10"))
				|| (e.getActionCommand().equals("����10")) || (e.getActionCommand().equals("�®�10"))) {
			function_10();
		} else if ((e.getActionCommand().equals("����11")) || (e.getActionCommand().equals("���J"))
				|| (e.getActionCommand().equals("����11")) || (e.getActionCommand().equals("�®�J"))) {
			function_J();
		} else if ((e.getActionCommand().equals("����12")) || (e.getActionCommand().equals("���Q"))
				|| (e.getActionCommand().equals("����12")) || (e.getActionCommand().equals("�®�Q"))) {
			function_Q();
		} else if ((e.getActionCommand().equals("����13")) || (e.getActionCommand().equals("���K"))
				|| (e.getActionCommand().equals("����13")) || (e.getActionCommand().equals("�®�K"))) {
			function_K();
		} else if (e.getActionCommand().equals("+")) {
			function_positive();
		} else if (e.getActionCommand().equals("-")) {
			function_negetive();
		}
		else if ( e.getActionCommand().equals("P1")){
			function_p1();
		}
		else if ( e.getActionCommand().equals("P2")){
			function_p2();
		}
		else if ( e.getActionCommand().equals("P3")){
			function_p3();
		}
		if ((e.getSource().equals(bt1))) {
			bt1.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
		} else if ((e.getSource().equals(bt2))) {
			bt2.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
		} else if ((e.getSource().equals(bt3))) {
			bt3.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
		} else if ((e.getSource().equals(bt4))) {
			bt4.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
		} else if ((e.getSource().equals(bt5))) {
			bt5.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
		}
		// implement button listener
	}

}