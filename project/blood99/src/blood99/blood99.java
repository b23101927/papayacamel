package blood99;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;


public class blood99 extends JFrame implements ActionListener{
	
	private static ArrayList cardbase = new ArrayList() ;//�P�w
	private int judge_ten_or_twenty;//�P�_10��20
	private int judge_times_of_card4=1;//�ݰj��δX��
	private int judge_whether_use_card5=0;//�ݦ��S���Ϋ��w
	private int judge_player=1;//�P�_���֥X�P
	private int counts_cards=5;//�o�P�Σx ������P��
	private int judge_pos_neg ;//�P�_���t �Φb+10-10
	private int total_number_int; //�Φb��ܾ��p��
	private String total_number_str="0";//��ܾ�
	private static String card_01;//BUTTON�W���r ��l��P
	private static String card_02;
	private static String card_03;
	private static String card_04;
	private static String card_05;
	private JLabel show_number; //��ܲ{�b�Ʀr�h��(�W�����`��
	private JLabel show_function;	// ��ܥΤF���ǥ\��P(�U����
	private JLabel show_player;	// ��ܴ���
	private JButton bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,bt10; 
	public static void main(String[] args) {

		///////////////////////////�o�P�~�P��(�H�U)
		  Final pk = new Final();
		  pk.createCard();
		  for (int i = 0; i < 13; i++) {
		   for (int j = 0; j < 4; j++) {
		    pk.createdetail(i, j);
		   }
		  }
		  //pk.printdetail();
		  for (int k=0;k<52;k++) {
			  cardbase.add(pk.cardList().get(k));
		  }
		  System.out.println(pk.cardList());		  
		  System.out.println(cardbase);
		  System.out.println(cardbase.get(0));
		  card_01=(String) cardbase.get(0);
		  card_02=(String) cardbase.get(1);
		  card_03=(String) cardbase.get(2);
		  card_04=(String) cardbase.get(3);
		  card_05=(String) cardbase.get(4);

		///////////////////////////�o�P�~�P��(�H�W)
		  
		  //�إ�FRAME
		  blood99 frame = new blood99();
			frame.setTitle("Player1");//��W�r
			frame.setVisible(true);
			frame.setResizable(false);
	}
	
	public blood99(){
		
		
		
		//frame�����Ѽ�
		setSize(800,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		//����`��
		show_number = new JLabel(total_number_str);
		show_number.setSize(200, 200);
		show_number.setLocation(350, 0);
		show_number.setFont(new java.awt.Font("Dialog", 1, 100));
		//��ܥ\��
		show_function = new JLabel("�}�l!");
		show_function.setSize(200, 200);
		show_function.setLocation(200, 200);
		show_function.setFont(new java.awt.Font("Dialog", 1, 30));
		//��ܴ���
		show_player = new JLabel("��Player"+judge_player);
		show_player.setSize(200, 200);
		show_player.setLocation(500, 200);
		show_player.setFont(new java.awt.Font("Dialog", 1, 30));
		//�]�m���s
		//���i���J�P
		bt1 = new JButton(card_01);
		bt2 = new JButton(card_02);
		bt3 = new JButton(card_03);
		bt4 = new JButton(card_04);
		bt5 = new JButton(card_05);
		bt1.setBounds(50,430,80,120);
		bt2.setBounds(150,430,80,120);
		bt3.setBounds(250,430,80,120);
		bt4.setBounds(350,430,80,120);
		bt5.setBounds(450,430,80,120);
		//�P�_+10or-10
		bt6 = new JButton("+");
		bt7 = new JButton("-");
		bt6.setBounds(565,430,50,50);
		bt7.setBounds(565,500,50,50);
		bt8 = new JButton("P1");
		bt9 = new JButton("P2");
		bt10= new JButton("P3");
		bt8.setBounds(650,430,50,30);
		bt9.setBounds(650,470,50,30);
		bt10.setBounds(650,510,50,30);
		
		//�p��PLAYER
		
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
		this.add(show_number);
		this.add(show_player);
		this.add(show_function);
		
	}
		//�ݴ���
		public void function_show_player() {
			function_check_card5();
			if (judge_player>=4) {
				judge_player=1;
			}
			else if (judge_player<=0) {
				judge_player=3;
			}
			show_player.setText("��Player"+judge_player);
			
		}
		//�ݦ��S���ιL5
		public void function_check_card5() {
			if(judge_whether_use_card5==0) {//�S���Ϋ��w
				function_check_card4();
			}
			else if(judge_whether_use_card5%2==1) {//���Ϋ��w
				judge_whether_use_card5--;

			}
		}
		//�ݦ��S���ιL4
		public void function_check_card4() {
				if(judge_times_of_card4%2==1) {//�ΤF���Ʀ��j��
					judge_player++;//���U�@�ӤH
				}
				else if(judge_times_of_card4%2==0) {//�ΤF�_�Ʀ��j��
					judge_player--;//���W�@�ӤH
				}
			
			}

		//�ˬd���S���W�L99
		public void function_check() {
			if (Integer.valueOf(show_number.getText())>99) {
				show_number.setText("99");
				total_number_str="99";
				total_number_int=99;
				show_function.setText("YOU LOSE");
		}
		}
		//�P�O�X���P�O���@�i
		public void function_A() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=1;
			show_function.setText("+1");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_2() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=2;
			show_function.setText("+2");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_3() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=3;
			show_function.setText("+3");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_4() {
			show_function.setText("�j��!");//�L�b��ܾ��W
			judge_times_of_card4++;
			function_check();
			function_show_player();
		}
		public void function_5() {
			show_function.setText("���w");
			judge_whether_use_card5++;
			function_check();
		}
		public void function_6() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=6;
			show_function.setText("+6");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_7() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=7;
			show_function.setText("+7");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_8() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=8;
			show_function.setText("+8");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_9() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=9;
			show_function.setText("+9");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_10() {
			judge_ten_or_twenty=10;
			show_function.setText("+-10");
		}
		public void function_J() {
			show_function.setText("PASS");
			function_check();
			function_show_player();
		}
		public void function_Q() {
			judge_ten_or_twenty=20;
			show_function.setText("+-20");
		}
		public void function_K() {
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int=99;
			show_function.setText("�h�B�h");
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		//�P�O�Υ[�Q�٬O��Q
		public void function_positive() {
			judge_pos_neg=1;
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=judge_ten_or_twenty*judge_pos_neg;
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		public void function_negetive() {
			judge_pos_neg=-1;
			total_number_int = Integer.valueOf(total_number_str); //����ܪ��Ʀr�ন��ư��p��
			total_number_int+=judge_ten_or_twenty*judge_pos_neg;
			total_number_str= String.valueOf(total_number_int);//�A��Ʀr�ন�r��
			show_number.setText(total_number_str);//�L�b��ܾ��W
			function_check();
			function_show_player();
		}
		
		// �P�_�X���P�O����
		public void actionPerformed (ActionEvent e) {
				
							
				//�P�_�X���@�i�P
				if ((e.getActionCommand().equals("����1"))||(e.getActionCommand().equals("���1"))||(e.getActionCommand().equals("����1"))||(e.getActionCommand().equals("�®�1"))){
					function_A();
				}
				else if ((e.getActionCommand().equals("����2"))||(e.getActionCommand().equals("���2"))||(e.getActionCommand().equals("����2"))||(e.getActionCommand().equals("�®�2"))){
					function_2();
				}
				else if ((e.getActionCommand().equals("����3"))||(e.getActionCommand().equals("���3"))||(e.getActionCommand().equals("����3"))||(e.getActionCommand().equals("�®�3"))){
					function_3();
				}
				else if ((e.getActionCommand().equals("����4"))||(e.getActionCommand().equals("���4"))||(e.getActionCommand().equals("����4"))||(e.getActionCommand().equals("�®�4"))){
					function_4();
				}
				else if ((e.getActionCommand().equals("����5"))||(e.getActionCommand().equals("���5"))||(e.getActionCommand().equals("����5"))||(e.getActionCommand().equals("�®�5"))){
					function_5();
				}
				else if ((e.getActionCommand().equals("����6"))||(e.getActionCommand().equals("���6"))||(e.getActionCommand().equals("����6"))||(e.getActionCommand().equals("�®�6"))){
					function_6();
				}
				else if ((e.getActionCommand().equals("����7"))||(e.getActionCommand().equals("���7"))||(e.getActionCommand().equals("����7"))||(e.getActionCommand().equals("�®�7"))){
					function_7();
				}
				else if ((e.getActionCommand().equals("����8"))||(e.getActionCommand().equals("���8"))||(e.getActionCommand().equals("����8"))||(e.getActionCommand().equals("�®�8"))){
					function_8();
				}
				else if ((e.getActionCommand().equals("����9"))||(e.getActionCommand().equals("���9"))||(e.getActionCommand().equals("����9"))||(e.getActionCommand().equals("�®�9"))){
					function_9();
				}
				else if ((e.getActionCommand().equals("����10"))||(e.getActionCommand().equals("���10"))||(e.getActionCommand().equals("����10"))||(e.getActionCommand().equals("�®�10"))){
					function_10();
				}
				else if ((e.getActionCommand().equals("����11"))||(e.getActionCommand().equals("���11"))||(e.getActionCommand().equals("����11"))||(e.getActionCommand().equals("�®�11"))){
					function_J();
				}
				else if ((e.getActionCommand().equals("����12"))||(e.getActionCommand().equals("���12"))||(e.getActionCommand().equals("����12"))||(e.getActionCommand().equals("�®�12"))){
					function_Q();
				}
				else if ( (e.getActionCommand().equals("����13"))||(e.getActionCommand().equals("���13"))||(e.getActionCommand().equals("����13"))||(e.getActionCommand().equals("�®�13"))){
					function_K();
				}
				else if ( e.getActionCommand().equals("+")){
					function_positive();
				}
				else if ( e.getActionCommand().equals("-")){
					function_negetive();
				}
				else if ( e.getActionCommand().equals("P1")){
					judge_player=1;
					function_show_player();
				}
				else if ( e.getActionCommand().equals("P2")){
					judge_player=2;
					function_show_player();
				}
				else if ( e.getActionCommand().equals("P3")){
					judge_player=3;
					function_show_player();
				}
				//�X�P��n��P
				if ((e.getSource().equals(bt1))){
					bt1.setText(String.valueOf(cardbase.get(counts_cards)));
					counts_cards++;
					
				}
				else if ((e.getSource().equals(bt2))){
					bt2.setText(String.valueOf(cardbase.get(counts_cards)));
					counts_cards++;
					
				}
				else if ((e.getSource().equals(bt3))){
					bt3.setText(String.valueOf(cardbase.get(counts_cards)));
					counts_cards++;
					
				}
				else if ((e.getSource().equals(bt4))){
					bt4.setText(String.valueOf(cardbase.get(counts_cards)));
					counts_cards++;
					
				}
				else if ((e.getSource().equals(bt5))){
					bt5.setText(String.valueOf(cardbase.get(counts_cards)));
					counts_cards++;
					
				}
			// implement button listener
		}
	
}

