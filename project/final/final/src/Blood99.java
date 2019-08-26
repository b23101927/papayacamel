
import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class Blood99 extends JFrame implements ActionListener {

	private static ArrayList cardbase = new ArrayList();// ��澈
	private int judge_ten_or_twenty;// ��10���20
	private int judge_times_of_card4 = 1;// ��艘頧撟暹活
	private int judge_whether_use_card5 = 0;// ���������
	private int judge_player_when_use = 1;
	private int judge_player = 1;// ����狐����
	private int counts_cards = 5;// ������ �摰����

	private int judge_pos_neg;// ��甇�鞎� ��+10-10
	private int total_number_int; // ��憿舐內�閮��
	private static ArrayList win_or_lose = new ArrayList();

	private String total_number_str = "0";// 憿舐內�

	private static String card_01;
	private static String card_02;
	private static String card_03;
	private static String card_04;
	private static String card_05;
	private static String url;
	private JLabel show_number; // 憿舐內���摮���
	private JLabel show_function; // 憿舐內�鈭鈭����
	private JLabel show_player; // 憿舐內��狐
	private JLabel show_card;// 憿舐內�����
	private JButton bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, bt10, bt11; // ��down
	private ImageIcon give_card;
	private ImageIcon give_card2;
	private ImageIcon give_card3;
	private ImageIcon give_card4;
	private ImageIcon give_card5;
	
	
	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub
///////////////////////////�����(隞乩��)
		Final pk = new Final();
		pk.createCard();
		for (int i = 0; i < 13; i++) {
			for (int j = 0; j < 4; j++) {
				pk.createdetail(i, j);
			}
		}
		pk.printdetail();
		pk.cardList();
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
		/////////////////////////// �����(隞乩��)
		Blood99 frame = new Blood99();
		frame.setTitle("Player1");// �����
		frame.setVisible(true);
		frame.setResizable(false);
		/////////////////////////// panel背景
		JLabel bgLabel = null;
		ImageIcon background = null;
		// 3.�JFrame銝剛身蝵株�����

		// background = new
		// ImageIcon("http://img01.1sucai.com/150609/330710-15060915091937.jpg"); //
		// ������

		bgLabel = new JLabel(background); // �����＊蝷箏Label銝�
		bgLabel.setBounds(0, 0, background.getIconWidth(), background.getIconHeight()); // ��������abel雿蔭閮剔蔭�����末憛怠���
		// 2���捆閬��JPanel嚗���雿輻setOpaque()靘蝙閬������

		frame.getLayeredPane().add(bgLabel, Integer.MIN_VALUE);
		///////////

	}

	public Blood99() throws MalformedURLException {
		// ��頛貉����
		win_or_lose.add(null);
		win_or_lose.add(null);
		win_or_lose.add(null);

		// frame����
		setSize(800, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(null);
		// 憿舐內蝮賣
		show_number = new JLabel(total_number_str);
		show_number.setSize(200, 200);
		show_number.setLocation(350, 0);
		show_number.setFont(new java.awt.Font("Dialog", 1, 100));
		// 憿舐內��
		show_function = new JLabel("��蝡�");
		show_function.setSize(200, 200);
		show_function.setLocation(350, 200);
		show_function.setFont(new java.awt.Font("Dialog", 1, 30));
		// 憿舐內��狐
		show_player = new JLabel("��layer" + judge_player);
		show_player.setSize(200, 200);
		show_player.setLocation(500, 200);
		show_player.setFont(new java.awt.Font("Dialog", 1, 30));
		// 憿舐內�����
		show_card = new JLabel("�摰嗅���");
		show_card.setSize(200, 200);
		show_card.setLocation(120, 250);
		show_card.setFont(new java.awt.Font("Dialog", 1, 20));
		
		bt11 = new JButton();
		bt11.setBounds(120, 200, 80, 120);
		bt11.setIcon(give_card);
		bt11.setVerticalTextPosition(SwingConstants.BOTTOM);
		bt11.setHorizontalTextPosition(SwingConstants.CENTER);

		
		// 鈭撐�����
		bt1 = new JButton(card_01);
		bt1.setVerticalTextPosition(SwingConstants.CENTER);
		bt1.setHorizontalTextPosition(SwingConstants.CENTER);
		addicon();
		bt1.setForeground(Color.WHITE);

		bt2 = new JButton(card_02);
		bt2.setVerticalTextPosition(SwingConstants.CENTER);
		bt2.setHorizontalTextPosition(SwingConstants.CENTER);
		addicon2();
		bt2.setForeground(Color.WHITE);
		
		
		bt3 = new JButton(card_03);
		bt3.setVerticalTextPosition(SwingConstants.CENTER);
		bt3.setHorizontalTextPosition(SwingConstants.CENTER);
		addicon3();
		bt3.setForeground(Color.WHITE);
		
		
		bt4 = new JButton(card_04);
		bt4.setVerticalTextPosition(SwingConstants.CENTER);
		bt4.setHorizontalTextPosition(SwingConstants.CENTER);
		addicon4();
		bt4.setForeground(Color.WHITE);
		
		bt5 = new JButton(card_05);
		bt5.setVerticalTextPosition(SwingConstants.CENTER);
		bt5.setHorizontalTextPosition(SwingConstants.CENTER);
		addicon5();
		bt5.setForeground(Color.WHITE);
		
		
		bt1.setBounds(50, 430, 80, 120);
		bt2.setBounds(150, 430, 80, 120);
		bt3.setBounds(250, 430, 80, 120);
		bt4.setBounds(350, 430, 80, 120);
		bt5.setBounds(450, 430, 80, 120);
		// ��+10or-10
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

//閮�layer
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
		// ��镼踹�frame鋆⊿
		JPanel panel = new JPanel();
		panel.setSize(800, 600);
		panel.setOpaque(false);
		panel.setLayout(null);
		panel.add(bt1);
		panel.add(bt2);
		panel.add(bt3);
		panel.add(bt4);
		panel.add(bt5);
		panel.add(bt6);
		panel.add(bt7);
		panel.add(bt8);
		panel.add(bt9);
		panel.add(bt10);
		panel.add(bt11);
		panel.add(show_number);
		panel.add(show_function);
		panel.add(show_player);
		panel.add(show_card);
		this.getLayeredPane().add(panel, 1);

		// Add ActionListener with {YOURBUTTONNAME}.addActionListener(this)

	}

	// 憒���振
	public void function_check_winner() {
		if (judge_times_of_card4 % 2 == 1) {
			int i = 0;
			if ((win_or_lose.get(i) == "LOSE" & win_or_lose.get(i + 1) == "LOSE")
					|| (win_or_lose.get(i + 1) == "LOSE" & win_or_lose.get(i + 2) == "LOSE")
					|| (win_or_lose.get(i) == "LOSE" & win_or_lose.get(i + 2) == "LOSE")) {
				show_function.setText("WINNER P" + judge_player);
			}
		} else if (judge_times_of_card4 % 2 == 0) {
			int i = 2;
			if ((win_or_lose.get(i) == "LOSE" & win_or_lose.get(i - 1) == "LOSE")
					|| (win_or_lose.get(i - 1) == "LOSE" & win_or_lose.get(i - 2) == "LOSE")
					|| (win_or_lose.get(i) == "LOSE" & win_or_lose.get(i - 2) == "LOSE")) {
				show_function.setText("WINNER P" + judge_player);
			}
		}

	}

	// ��犖頛訾��歲���
	public void function_player_lose_and_skip() {

		if (judge_times_of_card4 % 2 == 1) {
			int a = judge_player - 1;
			if (a + 1 == 3) {
				a = -1;
			}
			if (win_or_lose.get(a + 1) == "LOSE") {
				System.out.println(win_or_lose);
				System.out.println(judge_player);
				judge_player++;

			}
		} else if (judge_times_of_card4 % 2 == 0) {
			int b = judge_player - 1;
			if (b - 1 == -1) {
				b = 3;
			}
			if (win_or_lose.get(b - 1) == "LOSE") {
				System.out.println(win_or_lose);
				System.out.println(judge_player);
				judge_player--;

			}
		}

	}

	// ���狐
	public void function_show_player() {

		function_player_lose_and_skip();

		function_check_card5();
		if (judge_player == 4) {
			judge_player = 1;
		} else if (judge_player == 5) {
			judge_player = 2;
		} else if (judge_player == 0) {
			judge_player = 3;
		} else if (judge_player == -1) {
			judge_player = 2;
		}
		System.out.println(judge_player);
		System.out.println(win_or_lose);
		function_check_winner();
		show_player.setText("��layer" + judge_player);

	}

	// 瑼Ｘ�������99
	public void function_check() {
		if (Integer.valueOf(show_number.getText()) > 99) {
			show_number.setText("99");
			total_number_str = "99";
			total_number_int = 99;
			show_function.setText("YOU LOSE");
			win_or_lose.set(judge_player - 1, "LOSE");
		}
	}

	// ��������5
	public void function_check_card5() {
		if (judge_whether_use_card5 == 0) {// 瘝�����
			function_check_card4();
		} else if (judge_whether_use_card5 % 2 == 1) {// ������
			judge_whether_use_card5--;
			judge_player = judge_player_when_use;

		}
	}

	// ��������4
	public void function_check_card4() {
		if (judge_times_of_card4 % 2 == 1) {// �鈭�甈∟艘頧�
			judge_player++;// �����犖
		} else if (judge_times_of_card4 % 2 == 0) {// �鈭�甈∟艘頧�
			judge_player--;// �����犖
		}

	}
	// �������銝�撘�

//�������銝�撘�
	public void function_A() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 1;
		show_function.setText("+1");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_2() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 2;
		show_function.setText("+2");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_3() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 3;
		show_function.setText("+3");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_4() {
		show_function.setText("餈渲��!");// ��憿舐內�銝�
		judge_times_of_card4++;
		function_check();
		function_show_player();
	}

	public void function_5() {
		show_function.setText("����");
		judge_whether_use_card5++;
		function_check();
	}

	public void function_6() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 6;
		show_function.setText("+6");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_7() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 7;
		show_function.setText("+7");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_8() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 8;
		show_function.setText("+8");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_9() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += 9;
		show_function.setText("+9");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_10() {
		judge_ten_or_twenty = 10;
		show_function.setText("+-10");
	}

	public void function_J() {
		show_function.setText("PASS");
		function_check();
		function_show_player();
	}

	public void function_Q() {
		judge_ten_or_twenty = 20;
		show_function.setText("+-20");
	}

	public void function_K() {
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int = 99;
		show_function.setText("�����");
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	// �������皜��
	public void function_positive() {
		judge_pos_neg = 1;
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += judge_ten_or_twenty * judge_pos_neg;
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void function_negetive() {
		judge_pos_neg = -1;
		total_number_int = Integer.valueOf(total_number_str); // ��＊蝷箇�摮��������
		total_number_int += judge_ten_or_twenty * judge_pos_neg;
		total_number_str = String.valueOf(total_number_int);// ���摮���葡
		show_number.setText(total_number_str);// ��憿舐內�銝�
		function_check();
		function_show_player();
	}

	public void addicon() throws MalformedURLException {
		if (card_01.equals("暺�")) {
			url = "http://upload2.inven.co.kr/upload/2018/11/01/bbs/i15564270140.png";
		} else if (card_01.equals("暺��2")) {
			url = "https://o.quizlet.com/q6tSCqA.BiCeIodlD5Qv8A.png";
		} else if (card_01.equals("暺��3")) {
			url = "https://cdn.pixabay.com/photo/2015/08/11/11/56/spades-884155_960_720.png";
		} else if (card_01.equals("暺��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Playing_card_spade_4.svg/614px-Playing_card_spade_4.svg.png";
		} else if (card_01.equals("暺��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_spade_5.svg/819px-Playing_card_spade_5.svg.png";
		} else if (card_01.equals("暺��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Playing_card_spade_6.svg/2000px-Playing_card_spade_6.svg.png";
		} else if (card_01.equals("暺��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Playing_card_spade_7.svg/819px-Playing_card_spade_7.svg.png";
		} else if (card_01.equals("暺��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Playing_card_spade_8.svg/819px-Playing_card_spade_8.svg.png";
		} else if (card_01.equals("暺��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Playing_card_spade_9.svg/819px-Playing_card_spade_9.svg.png";
		} else if (card_01.equals("暺��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Playing_card_spade_10.svg/819px-Playing_card_spade_10.svg.png";
		} else if (card_01.equals("暺��11")) {
			url = "https://www.colourbox.com/preview/10382897-jack-of-spades.jpg";
		} else if (card_01.equals("暺��12")) {
			url = "https://i.pinimg.com/originals/64/fe/3a/64fe3aaedd0cd7e7a89f15127bbcc3f4.png";
		} else if (card_01.equals("暺��13")) {
			url = "https://www.colourbox.com/preview/10382907-king-of-spades.jpg";
		}

		else if (card_01.equals("蝝�")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Playing_card_heart_A.svg/1200px-Playing_card_heart_A.svg.png";
		} else if (card_01.equals("蝝��2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Playing_card_heart_2.svg/819px-Playing_card_heart_2.svg.png";
		} else if (card_01.equals("蝝��3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Playing_card_heart_3.svg/819px-Playing_card_heart_3.svg.png";
		} else if (card_01.equals("蝝��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Playing_card_heart_4.svg/819px-Playing_card_heart_4.svg.png";
		} else if (card_01.equals("蝝��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Playing_card_heart_5.svg/819px-Playing_card_heart_5.svg.png";
		} else if (card_01.equals("蝝��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Playing_card_heart_6.svg/819px-Playing_card_heart_6.svg.png";
		} else if (card_01.equals("蝝��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_heart_7.svg/819px-Playing_card_heart_7.svg.png";
		} else if (card_01.equals("蝝��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_8.svg/819px-Playing_card_heart_8.svg.png";
		} else if (card_01.equals("蝝��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_9.svg/819px-Playing_card_heart_9.svg.png";
		} else if (card_01.equals("蝝��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Playing_card_heart_10.svg/819px-Playing_card_heart_10.svg.png";
		} else if (card_01.equals("蝝��11")) {
			url = "https://as1.ftcdn.net/jpg/00/70/12/64/500_F_70126409_gjWU98odB9g2rVgRRl5nMjA7Qyu2EOdl.jpg";
		} else if (card_01.equals("蝝��12")) {
			url = "https://st2.depositphotos.com/2810953/8260/v/950/depositphotos_82602070-stock-illustration-poker-playing-card-queen-heart.jpg";
		} else if (card_01.equals("蝝��13")) {
			url = "https://pic.pimg.tw/wuchicake/1320816325-8500604.jpg";
		}

		else if (card_01.equals("璇A")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Playing_card_club_A.svg/614px-Playing_card_club_A.svg.png";
		} else if (card_01.equals("璇2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Playing_card_club_2.svg/819px-Playing_card_club_2.svg.png";
		} else if (card_01.equals("璇3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Playing_card_club_3.svg/819px-Playing_card_club_3.svg.png";
		} else if (card_01.equals("璇4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Playing_card_club_4.svg/819px-Playing_card_club_4.svg.png";
		} else if (card_01.equals("璇5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_club_5.svg/819px-Playing_card_club_5.svg.png";
		} else if (card_01.equals("璇6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Playing_card_club_6.svg/819px-Playing_card_club_6.svg.png";
		} else if (card_01.equals("璇7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Playing_card_club_7.svg/819px-Playing_card_club_7.svg.png";
		} else if (card_01.equals("璇8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Playing_card_club_8.svg/819px-Playing_card_club_8.svg.png";
		} else if (card_01.equals("璇9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Playing_card_club_9.svg/819px-Playing_card_club_9.svg.png";
		} else if (card_01.equals("璇10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Playing_card_club_10.svg/819px-Playing_card_club_10.svg.png";
		} else if (card_01.equals("璇11")) {
			url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7R6EehRNz6VHS0nhXo3OgN965rRoesKeqVvUQpuJH-tLFzJZY-w";
		} else if (card_01.equals("璇12")) {
			url = "https://cdn5.vectorstock.com/i/1000x1000/68/74/poker-playing-card-queen-club-vector-8696874.jpg";
		} else if (card_01.equals("璇13")) {
			url = "https://images.freeimages.com/images/premium/previews/7046/7046174-king-of-clubs-two-playing-card.jpg";
		}

		else if (card_01.equals("�憛")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Playing_card_diamond_A.svg/819px-Playing_card_diamond_A.svg.png";
		} else if (card_01.equals("�憛�2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Playing_card_diamond_2.svg/819px-Playing_card_diamond_2.svg.png";
		} else if (card_01.equals("�憛�3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Playing_card_diamond_3.svg/819px-Playing_card_diamond_3.svg.png";
		} else if (card_01.equals("�憛�4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Playing_card_diamond_4.svg/819px-Playing_card_diamond_4.svg.png";
		} else if (card_01.equals("�憛�5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Playing_card_diamond_5.svg/819px-Playing_card_diamond_5.svg.png";
		} else if (card_01.equals("�憛�6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Playing_card_diamond_6.svg/819px-Playing_card_diamond_6.svg.png";
		} else if (card_01.equals("�憛�7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Playing_card_diamond_7.svg/819px-Playing_card_diamond_7.svg.png";
		} else if (card_01.equals("�憛�8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Playing_card_diamond_8.svg/819px-Playing_card_diamond_8.svg.png";
		} else if (card_01.equals("�憛�9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Playing_card_diamond_9.svg/614px-Playing_card_diamond_9.svg.png";
		} else if (card_01.equals("�憛�10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Playing_card_diamond_10.svg/819px-Playing_card_diamond_10.svg.png";
		} else if (card_01.equals("�憛�11")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poker-sm-234-Jd.png";
		} else if (card_01.equals("�憛�12")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/7/70/Poker-sm-233-Qd.png";
		} else if (card_01.equals("�憛�13")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/d/d0/Poker-sm-232-Kd.png";
		}

		java.net.URL where = new URL(url);
		ImageIcon image = new ImageIcon(where);
		Image imgp = image.getImage();
		Image newimage = imgp.getScaledInstance(80, 120, java.awt.Image.SCALE_SMOOTH);
		ImageIcon card1 = new ImageIcon(newimage);
		give_card = card1;
		bt1.setIcon(card1);

	}
	public void addicon2() throws MalformedURLException {
		if (card_02.equals("暺�")) {
			url = "http://upload2.inven.co.kr/upload/2018/11/01/bbs/i15564270140.png";
		} else if (card_02.equals("暺��2")) {
			url = "https://o.quizlet.com/q6tSCqA.BiCeIodlD5Qv8A.png";
		} else if (card_02.equals("暺��3")) {
			url = "https://cdn.pixabay.com/photo/2015/08/11/11/56/spades-884155_960_720.png";
		} else if (card_02.equals("暺��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Playing_card_spade_4.svg/614px-Playing_card_spade_4.svg.png";
		} else if (card_02.equals("暺��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_spade_5.svg/819px-Playing_card_spade_5.svg.png";
		} else if (card_02.equals("暺��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Playing_card_spade_6.svg/2000px-Playing_card_spade_6.svg.png";
		} else if (card_02.equals("暺��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Playing_card_spade_7.svg/819px-Playing_card_spade_7.svg.png";
		} else if (card_02.equals("暺��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Playing_card_spade_8.svg/819px-Playing_card_spade_8.svg.png";
		} else if (card_02.equals("暺��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Playing_card_spade_9.svg/819px-Playing_card_spade_9.svg.png";
		} else if (card_02.equals("暺��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Playing_card_spade_10.svg/819px-Playing_card_spade_10.svg.png";
		} else if (card_02.equals("暺��11")) {
			url = "https://www.colourbox.com/preview/10382897-jack-of-spades.jpg";
		} else if (card_02.equals("暺��12")) {
			url = "https://i.pinimg.com/originals/64/fe/3a/64fe3aaedd0cd7e7a89f15127bbcc3f4.png";
		} else if (card_02.equals("暺��13")) {
			url = "https://www.colourbox.com/preview/10382907-king-of-spades.jpg";
		}

		else if (card_02.equals("蝝�")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Playing_card_heart_A.svg/1200px-Playing_card_heart_A.svg.png";
		} else if (card_02.equals("蝝��2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Playing_card_heart_2.svg/819px-Playing_card_heart_2.svg.png";
		} else if (card_02.equals("蝝��3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Playing_card_heart_3.svg/819px-Playing_card_heart_3.svg.png";
		} else if (card_02.equals("蝝��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Playing_card_heart_4.svg/819px-Playing_card_heart_4.svg.png";
		} else if (card_02.equals("蝝��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Playing_card_heart_5.svg/819px-Playing_card_heart_5.svg.png";
		} else if (card_02.equals("蝝��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Playing_card_heart_6.svg/819px-Playing_card_heart_6.svg.png";
		} else if (card_02.equals("蝝��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_heart_7.svg/819px-Playing_card_heart_7.svg.png";
		} else if (card_02.equals("蝝��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_8.svg/819px-Playing_card_heart_8.svg.png";
		} else if (card_02.equals("蝝��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_9.svg/819px-Playing_card_heart_9.svg.png";
		} else if (card_02.equals("蝝��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Playing_card_heart_10.svg/819px-Playing_card_heart_10.svg.png";
		} else if (card_02.equals("蝝��11")) {
			url = "https://as1.ftcdn.net/jpg/00/70/12/64/500_F_70126409_gjWU98odB9g2rVgRRl5nMjA7Qyu2EOdl.jpg";
		} else if (card_02.equals("蝝��12")) {
			url = "https://st2.depositphotos.com/2810953/8260/v/950/depositphotos_82602070-stock-illustration-poker-playing-card-queen-heart.jpg";
		} else if (card_02.equals("蝝��13")) {
			url = "https://pic.pimg.tw/wuchicake/1320816325-8500604.jpg";
		}

		else if (card_02.equals("璇A")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Playing_card_club_A.svg/614px-Playing_card_club_A.svg.png";
		} else if (card_02.equals("璇2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Playing_card_club_2.svg/819px-Playing_card_club_2.svg.png";
		} else if (card_02.equals("璇3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Playing_card_club_3.svg/819px-Playing_card_club_3.svg.png";
		} else if (card_02.equals("璇4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Playing_card_club_4.svg/819px-Playing_card_club_4.svg.png";
		} else if (card_02.equals("璇5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_club_5.svg/819px-Playing_card_club_5.svg.png";
		} else if (card_02.equals("璇6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Playing_card_club_6.svg/819px-Playing_card_club_6.svg.png";
		} else if (card_02.equals("璇7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Playing_card_club_7.svg/819px-Playing_card_club_7.svg.png";
		} else if (card_02.equals("璇8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Playing_card_club_8.svg/819px-Playing_card_club_8.svg.png";
		} else if (card_02.equals("璇9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Playing_card_club_9.svg/819px-Playing_card_club_9.svg.png";
		} else if (card_02.equals("璇10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Playing_card_club_10.svg/819px-Playing_card_club_10.svg.png";
		} else if (card_02.equals("璇11")) {
			url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7R6EehRNz6VHS0nhXo3OgN965rRoesKeqVvUQpuJH-tLFzJZY-w";
		} else if (card_02.equals("璇12")) {
			url = "https://cdn5.vectorstock.com/i/1000x1000/68/74/poker-playing-card-queen-club-vector-8696874.jpg";
		} else if (card_02.equals("璇13")) {
			url = "https://images.freeimages.com/images/premium/previews/7046/7046174-king-of-clubs-two-playing-card.jpg";
		}

		else if (card_02.equals("�憛")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Playing_card_diamond_A.svg/819px-Playing_card_diamond_A.svg.png";
		} else if (card_02.equals("�憛�2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Playing_card_diamond_2.svg/819px-Playing_card_diamond_2.svg.png";
		} else if (card_02.equals("�憛�3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Playing_card_diamond_3.svg/819px-Playing_card_diamond_3.svg.png";
		} else if (card_02.equals("�憛�4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Playing_card_diamond_4.svg/819px-Playing_card_diamond_4.svg.png";
		} else if (card_02.equals("�憛�5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Playing_card_diamond_5.svg/819px-Playing_card_diamond_5.svg.png";
		} else if (card_02.equals("�憛�6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Playing_card_diamond_6.svg/819px-Playing_card_diamond_6.svg.png";
		} else if (card_02.equals("�憛�7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Playing_card_diamond_7.svg/819px-Playing_card_diamond_7.svg.png";
		} else if (card_02.equals("�憛�8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Playing_card_diamond_8.svg/819px-Playing_card_diamond_8.svg.png";
		} else if (card_02.equals("�憛�9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Playing_card_diamond_9.svg/614px-Playing_card_diamond_9.svg.png";
		} else if (card_02.equals("�憛�10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Playing_card_diamond_10.svg/819px-Playing_card_diamond_10.svg.png";
		} else if (card_02.equals("�憛�11")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poker-sm-234-Jd.png";
		} else if (card_02.equals("�憛�12")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/7/70/Poker-sm-233-Qd.png";
		} else if (card_02.equals("�憛�13")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/d/d0/Poker-sm-232-Kd.png";
		}

		java.net.URL where = new URL(url);
		ImageIcon image = new ImageIcon(where);
		Image imgp = image.getImage();
		Image newimage = imgp.getScaledInstance(80, 120, java.awt.Image.SCALE_SMOOTH);
		ImageIcon card1 = new ImageIcon(newimage);
		give_card2 = card1;
		bt2.setIcon(card1);

	}
	public void addicon3() throws MalformedURLException {
		if (card_03.equals("暺�")) {
			url = "http://upload2.inven.co.kr/upload/2018/11/01/bbs/i15564270140.png";
		} else if (card_03.equals("暺��2")) {
			url = "https://o.quizlet.com/q6tSCqA.BiCeIodlD5Qv8A.png";
		} else if (card_03.equals("暺��3")) {
			url = "https://cdn.pixabay.com/photo/2015/08/11/11/56/spades-884155_960_720.png";
		} else if (card_03.equals("暺��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Playing_card_spade_4.svg/614px-Playing_card_spade_4.svg.png";
		} else if (card_03.equals("暺��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_spade_5.svg/819px-Playing_card_spade_5.svg.png";
		} else if (card_03.equals("暺��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Playing_card_spade_6.svg/2000px-Playing_card_spade_6.svg.png";
		} else if (card_03.equals("暺��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Playing_card_spade_7.svg/819px-Playing_card_spade_7.svg.png";
		} else if (card_03.equals("暺��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Playing_card_spade_8.svg/819px-Playing_card_spade_8.svg.png";
		} else if (card_03.equals("暺��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Playing_card_spade_9.svg/819px-Playing_card_spade_9.svg.png";
		} else if (card_03.equals("暺��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Playing_card_spade_10.svg/819px-Playing_card_spade_10.svg.png";
		} else if (card_03.equals("暺��11")) {
			url = "https://www.colourbox.com/preview/10382897-jack-of-spades.jpg";
		} else if (card_03.equals("暺��12")) {
			url = "https://i.pinimg.com/originals/64/fe/3a/64fe3aaedd0cd7e7a89f15127bbcc3f4.png";
		} else if (card_03.equals("暺��13")) {
			url = "https://www.colourbox.com/preview/10382907-king-of-spades.jpg";
		}

		else if (card_03.equals("蝝�")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Playing_card_heart_A.svg/1200px-Playing_card_heart_A.svg.png";
		} else if (card_03.equals("蝝��2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Playing_card_heart_2.svg/819px-Playing_card_heart_2.svg.png";
		} else if (card_03.equals("蝝��3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Playing_card_heart_3.svg/819px-Playing_card_heart_3.svg.png";
		} else if (card_03.equals("蝝��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Playing_card_heart_4.svg/819px-Playing_card_heart_4.svg.png";
		} else if (card_03.equals("蝝��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Playing_card_heart_5.svg/819px-Playing_card_heart_5.svg.png";
		} else if (card_03.equals("蝝��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Playing_card_heart_6.svg/819px-Playing_card_heart_6.svg.png";
		} else if (card_03.equals("蝝��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_heart_7.svg/819px-Playing_card_heart_7.svg.png";
		} else if (card_03.equals("蝝��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_8.svg/819px-Playing_card_heart_8.svg.png";
		} else if (card_03.equals("蝝��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_9.svg/819px-Playing_card_heart_9.svg.png";
		} else if (card_03.equals("蝝��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Playing_card_heart_10.svg/819px-Playing_card_heart_10.svg.png";
		} else if (card_03.equals("蝝��11")) {
			url = "https://as1.ftcdn.net/jpg/00/70/12/64/500_F_70126409_gjWU98odB9g2rVgRRl5nMjA7Qyu2EOdl.jpg";
		} else if (card_03.equals("蝝��12")) {
			url = "https://st2.depositphotos.com/2810953/8260/v/950/depositphotos_82602070-stock-illustration-poker-playing-card-queen-heart.jpg";
		} else if (card_03.equals("蝝��13")) {
			url = "https://pic.pimg.tw/wuchicake/1320816325-8500604.jpg";
		}

		else if (card_03.equals("璇A")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Playing_card_club_A.svg/614px-Playing_card_club_A.svg.png";
		} else if (card_03.equals("璇2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Playing_card_club_2.svg/819px-Playing_card_club_2.svg.png";
		} else if (card_03.equals("璇3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Playing_card_club_3.svg/819px-Playing_card_club_3.svg.png";
		} else if (card_03.equals("璇4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Playing_card_club_4.svg/819px-Playing_card_club_4.svg.png";
		} else if (card_03.equals("璇5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_club_5.svg/819px-Playing_card_club_5.svg.png";
		} else if (card_03.equals("璇6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Playing_card_club_6.svg/819px-Playing_card_club_6.svg.png";
		} else if (card_03.equals("璇7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Playing_card_club_7.svg/819px-Playing_card_club_7.svg.png";
		} else if (card_03.equals("璇8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Playing_card_club_8.svg/819px-Playing_card_club_8.svg.png";
		} else if (card_03.equals("璇9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Playing_card_club_9.svg/819px-Playing_card_club_9.svg.png";
		} else if (card_03.equals("璇10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Playing_card_club_10.svg/819px-Playing_card_club_10.svg.png";
		} else if (card_03.equals("璇11")) {
			url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7R6EehRNz6VHS0nhXo3OgN965rRoesKeqVvUQpuJH-tLFzJZY-w";
		} else if (card_03.equals("璇12")) {
			url = "https://cdn5.vectorstock.com/i/1000x1000/68/74/poker-playing-card-queen-club-vector-8696874.jpg";
		} else if (card_03.equals("璇13")) {
			url = "https://images.freeimages.com/images/premium/previews/7046/7046174-king-of-clubs-two-playing-card.jpg";
		}

		else if (card_03.equals("�憛")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Playing_card_diamond_A.svg/819px-Playing_card_diamond_A.svg.png";
		} else if (card_03.equals("�憛�2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Playing_card_diamond_2.svg/819px-Playing_card_diamond_2.svg.png";
		} else if (card_03.equals("�憛�3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Playing_card_diamond_3.svg/819px-Playing_card_diamond_3.svg.png";
		} else if (card_03.equals("�憛�4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Playing_card_diamond_4.svg/819px-Playing_card_diamond_4.svg.png";
		} else if (card_03.equals("�憛�5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Playing_card_diamond_5.svg/819px-Playing_card_diamond_5.svg.png";
		} else if (card_03.equals("�憛�6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Playing_card_diamond_6.svg/819px-Playing_card_diamond_6.svg.png";
		} else if (card_03.equals("�憛�7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Playing_card_diamond_7.svg/819px-Playing_card_diamond_7.svg.png";
		} else if (card_03.equals("�憛�8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Playing_card_diamond_8.svg/819px-Playing_card_diamond_8.svg.png";
		} else if (card_03.equals("�憛�9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Playing_card_diamond_9.svg/614px-Playing_card_diamond_9.svg.png";
		} else if (card_03.equals("�憛�10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Playing_card_diamond_10.svg/819px-Playing_card_diamond_10.svg.png";
		} else if (card_03.equals("�憛�11")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poker-sm-234-Jd.png";
		} else if (card_03.equals("�憛�12")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/7/70/Poker-sm-233-Qd.png";
		} else if (card_03.equals("�憛�13")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/d/d0/Poker-sm-232-Kd.png";
		}

		java.net.URL where = new URL(url);
		ImageIcon image = new ImageIcon(where);
		Image imgp = image.getImage();
		Image newimage = imgp.getScaledInstance(80, 120, java.awt.Image.SCALE_SMOOTH);
		ImageIcon card1 = new ImageIcon(newimage);
		give_card3 = card1;
		bt3.setIcon(card1);

	}
	public void addicon4() throws MalformedURLException {
		if (card_04.equals("暺�")) {
			url = "http://upload2.inven.co.kr/upload/2018/11/01/bbs/i15564270140.png";
		} else if (card_04.equals("暺��2")) {
			url = "https://o.quizlet.com/q6tSCqA.BiCeIodlD5Qv8A.png";
		} else if (card_04.equals("暺��3")) {
			url = "https://cdn.pixabay.com/photo/2015/08/11/11/56/spades-884155_960_720.png";
		} else if (card_04.equals("暺��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Playing_card_spade_4.svg/614px-Playing_card_spade_4.svg.png";
		} else if (card_04.equals("暺��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_spade_5.svg/819px-Playing_card_spade_5.svg.png";
		} else if (card_04.equals("暺��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Playing_card_spade_6.svg/2000px-Playing_card_spade_6.svg.png";
		} else if (card_04.equals("暺��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Playing_card_spade_7.svg/819px-Playing_card_spade_7.svg.png";
		} else if (card_04.equals("暺��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Playing_card_spade_8.svg/819px-Playing_card_spade_8.svg.png";
		} else if (card_04.equals("暺��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Playing_card_spade_9.svg/819px-Playing_card_spade_9.svg.png";
		} else if (card_04.equals("暺��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Playing_card_spade_10.svg/819px-Playing_card_spade_10.svg.png";
		} else if (card_04.equals("暺��11")) {
			url = "https://www.colourbox.com/preview/10382897-jack-of-spades.jpg";
		} else if (card_04.equals("暺��12")) {
			url = "https://i.pinimg.com/originals/64/fe/3a/64fe3aaedd0cd7e7a89f15127bbcc3f4.png";
		} else if (card_04.equals("暺��13")) {
			url = "https://www.colourbox.com/preview/10382907-king-of-spades.jpg";
		}

		else if (card_04.equals("蝝�")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Playing_card_heart_A.svg/1200px-Playing_card_heart_A.svg.png";
		} else if (card_04.equals("蝝��2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Playing_card_heart_2.svg/819px-Playing_card_heart_2.svg.png";
		} else if (card_04.equals("蝝��3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Playing_card_heart_3.svg/819px-Playing_card_heart_3.svg.png";
		} else if (card_04.equals("蝝��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Playing_card_heart_4.svg/819px-Playing_card_heart_4.svg.png";
		} else if (card_04.equals("蝝��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Playing_card_heart_5.svg/819px-Playing_card_heart_5.svg.png";
		} else if (card_04.equals("蝝��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Playing_card_heart_6.svg/819px-Playing_card_heart_6.svg.png";
		} else if (card_04.equals("蝝��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_heart_7.svg/819px-Playing_card_heart_7.svg.png";
		} else if (card_04.equals("蝝��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_8.svg/819px-Playing_card_heart_8.svg.png";
		} else if (card_04.equals("蝝��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_9.svg/819px-Playing_card_heart_9.svg.png";
		} else if (card_04.equals("蝝��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Playing_card_heart_10.svg/819px-Playing_card_heart_10.svg.png";
		} else if (card_04.equals("蝝��11")) {
			url = "https://as1.ftcdn.net/jpg/00/70/12/64/500_F_70126409_gjWU98odB9g2rVgRRl5nMjA7Qyu2EOdl.jpg";
		} else if (card_04.equals("蝝��12")) {
			url = "https://st2.depositphotos.com/2810953/8260/v/950/depositphotos_82602070-stock-illustration-poker-playing-card-queen-heart.jpg";
		} else if (card_04.equals("蝝��13")) {
			url = "https://pic.pimg.tw/wuchicake/1320816325-8500604.jpg";
		}

		else if (card_04.equals("璇A")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Playing_card_club_A.svg/614px-Playing_card_club_A.svg.png";
		} else if (card_04.equals("璇2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Playing_card_club_2.svg/819px-Playing_card_club_2.svg.png";
		} else if (card_04.equals("璇3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Playing_card_club_3.svg/819px-Playing_card_club_3.svg.png";
		} else if (card_04.equals("璇4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Playing_card_club_4.svg/819px-Playing_card_club_4.svg.png";
		} else if (card_04.equals("璇5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_club_5.svg/819px-Playing_card_club_5.svg.png";
		} else if (card_04.equals("璇6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Playing_card_club_6.svg/819px-Playing_card_club_6.svg.png";
		} else if (card_04.equals("璇7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Playing_card_club_7.svg/819px-Playing_card_club_7.svg.png";
		} else if (card_04.equals("璇8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Playing_card_club_8.svg/819px-Playing_card_club_8.svg.png";
		} else if (card_04.equals("璇9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Playing_card_club_9.svg/819px-Playing_card_club_9.svg.png";
		} else if (card_04.equals("璇10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Playing_card_club_10.svg/819px-Playing_card_club_10.svg.png";
		} else if (card_04.equals("璇11")) {
			url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7R6EehRNz6VHS0nhXo3OgN965rRoesKeqVvUQpuJH-tLFzJZY-w";
		} else if (card_04.equals("璇12")) {
			url = "https://cdn5.vectorstock.com/i/1000x1000/68/74/poker-playing-card-queen-club-vector-8696874.jpg";
		} else if (card_04.equals("璇13")) {
			url = "https://images.freeimages.com/images/premium/previews/7046/7046174-king-of-clubs-two-playing-card.jpg";
		}

		else if (card_04.equals("�憛")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Playing_card_diamond_A.svg/819px-Playing_card_diamond_A.svg.png";
		} else if (card_04.equals("�憛�2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Playing_card_diamond_2.svg/819px-Playing_card_diamond_2.svg.png";
		} else if (card_04.equals("�憛�3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Playing_card_diamond_3.svg/819px-Playing_card_diamond_3.svg.png";
		} else if (card_04.equals("�憛�4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Playing_card_diamond_4.svg/819px-Playing_card_diamond_4.svg.png";
		} else if (card_04.equals("�憛�5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Playing_card_diamond_5.svg/819px-Playing_card_diamond_5.svg.png";
		} else if (card_04.equals("�憛�6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Playing_card_diamond_6.svg/819px-Playing_card_diamond_6.svg.png";
		} else if (card_04.equals("�憛�7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Playing_card_diamond_7.svg/819px-Playing_card_diamond_7.svg.png";
		} else if (card_04.equals("�憛�8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Playing_card_diamond_8.svg/819px-Playing_card_diamond_8.svg.png";
		} else if (card_04.equals("�憛�9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Playing_card_diamond_9.svg/614px-Playing_card_diamond_9.svg.png";
		} else if (card_04.equals("�憛�10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Playing_card_diamond_10.svg/819px-Playing_card_diamond_10.svg.png";
		} else if (card_04.equals("�憛�11")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poker-sm-234-Jd.png";
		} else if (card_04.equals("�憛�12")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/7/70/Poker-sm-233-Qd.png";
		} else if (card_04.equals("�憛�13")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/d/d0/Poker-sm-232-Kd.png";
		}

		java.net.URL where = new URL(url);
		ImageIcon image = new ImageIcon(where);
		Image imgp = image.getImage();
		Image newimage = imgp.getScaledInstance(80, 120, java.awt.Image.SCALE_SMOOTH);
		ImageIcon card1 = new ImageIcon(newimage);
		give_card4 = card1;
		bt4.setIcon(card1);

	}	
	
	public void addicon5() throws MalformedURLException {
		if (card_05.equals("暺�")) {
			url = "http://upload2.inven.co.kr/upload/2018/11/01/bbs/i15564270140.png";
		} else if (card_05.equals("暺��2")) {
			url = "https://o.quizlet.com/q6tSCqA.BiCeIodlD5Qv8A.png";
		} else if (card_05.equals("暺��3")) {
			url = "https://cdn.pixabay.com/photo/2015/08/11/11/56/spades-884155_960_720.png";
		} else if (card_05.equals("暺��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/2c/Playing_card_spade_4.svg/614px-Playing_card_spade_4.svg.png";
		} else if (card_05.equals("暺��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_spade_5.svg/819px-Playing_card_spade_5.svg.png";
		} else if (card_05.equals("暺��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d2/Playing_card_spade_6.svg/2000px-Playing_card_spade_6.svg.png";
		} else if (card_05.equals("暺��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/66/Playing_card_spade_7.svg/819px-Playing_card_spade_7.svg.png";
		} else if (card_05.equals("暺��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Playing_card_spade_8.svg/819px-Playing_card_spade_8.svg.png";
		} else if (card_05.equals("暺��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e0/Playing_card_spade_9.svg/819px-Playing_card_spade_9.svg.png";
		} else if (card_05.equals("暺��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Playing_card_spade_10.svg/819px-Playing_card_spade_10.svg.png";
		} else if (card_05.equals("暺��11")) {
			url = "https://www.colourbox.com/preview/10382897-jack-of-spades.jpg";
		} else if (card_05.equals("暺��12")) {
			url = "https://i.pinimg.com/originals/64/fe/3a/64fe3aaedd0cd7e7a89f15127bbcc3f4.png";
		} else if (card_05.equals("暺��13")) {
			url = "https://www.colourbox.com/preview/10382907-king-of-spades.jpg";
		}

		else if (card_05.equals("蝝�")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/57/Playing_card_heart_A.svg/1200px-Playing_card_heart_A.svg.png";
		} else if (card_05.equals("蝝��2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d5/Playing_card_heart_2.svg/819px-Playing_card_heart_2.svg.png";
		} else if (card_05.equals("蝝��3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/b/b6/Playing_card_heart_3.svg/819px-Playing_card_heart_3.svg.png";
		} else if (card_05.equals("蝝��4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a2/Playing_card_heart_4.svg/819px-Playing_card_heart_4.svg.png";
		} else if (card_05.equals("蝝��5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/52/Playing_card_heart_5.svg/819px-Playing_card_heart_5.svg.png";
		} else if (card_05.equals("蝝��6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/c/cd/Playing_card_heart_6.svg/819px-Playing_card_heart_6.svg.png";
		} else if (card_05.equals("蝝��7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/94/Playing_card_heart_7.svg/819px-Playing_card_heart_7.svg.png";
		} else if (card_05.equals("蝝��8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_8.svg/819px-Playing_card_heart_8.svg.png";
		} else if (card_05.equals("蝝��9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_heart_9.svg/819px-Playing_card_heart_9.svg.png";
		} else if (card_05.equals("蝝��10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Playing_card_heart_10.svg/819px-Playing_card_heart_10.svg.png";
		} else if (card_05.equals("蝝��11")) {
			url = "https://as1.ftcdn.net/jpg/00/70/12/64/500_F_70126409_gjWU98odB9g2rVgRRl5nMjA7Qyu2EOdl.jpg";
		} else if (card_05.equals("蝝��12")) {
			url = "https://st2.depositphotos.com/2810953/8260/v/950/depositphotos_82602070-stock-illustration-poker-playing-card-queen-heart.jpg";
		} else if (card_05.equals("蝝��13")) {
			url = "https://pic.pimg.tw/wuchicake/1320816325-8500604.jpg";
		}

		else if (card_05.equals("璇A")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/36/Playing_card_club_A.svg/614px-Playing_card_club_A.svg.png";
		} else if (card_05.equals("璇2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/f5/Playing_card_club_2.svg/819px-Playing_card_club_2.svg.png";
		} else if (card_05.equals("璇3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/6/6b/Playing_card_club_3.svg/819px-Playing_card_club_3.svg.png";
		} else if (card_05.equals("璇4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3d/Playing_card_club_4.svg/819px-Playing_card_club_4.svg.png";
		} else if (card_05.equals("璇5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/50/Playing_card_club_5.svg/819px-Playing_card_club_5.svg.png";
		} else if (card_05.equals("璇6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a0/Playing_card_club_6.svg/819px-Playing_card_club_6.svg.png";
		} else if (card_05.equals("璇7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/4/4b/Playing_card_club_7.svg/819px-Playing_card_club_7.svg.png";
		} else if (card_05.equals("璇8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/eb/Playing_card_club_8.svg/819px-Playing_card_club_8.svg.png";
		} else if (card_05.equals("璇9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Playing_card_club_9.svg/819px-Playing_card_club_9.svg.png";
		} else if (card_05.equals("璇10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Playing_card_club_10.svg/819px-Playing_card_club_10.svg.png";
		} else if (card_05.equals("璇11")) {
			url = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT7R6EehRNz6VHS0nhXo3OgN965rRoesKeqVvUQpuJH-tLFzJZY-w";
		} else if (card_05.equals("璇12")) {
			url = "https://cdn5.vectorstock.com/i/1000x1000/68/74/poker-playing-card-queen-club-vector-8696874.jpg";
		} else if (card_05.equals("璇13")) {
			url = "https://images.freeimages.com/images/premium/previews/7046/7046174-king-of-clubs-two-playing-card.jpg";
		}

		else if (card_05.equals("�憛")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Playing_card_diamond_A.svg/819px-Playing_card_diamond_A.svg.png";
		} else if (card_05.equals("�憛�2")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/5/59/Playing_card_diamond_2.svg/819px-Playing_card_diamond_2.svg.png";
		} else if (card_05.equals("�憛�3")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/82/Playing_card_diamond_3.svg/819px-Playing_card_diamond_3.svg.png";
		} else if (card_05.equals("�憛�4")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Playing_card_diamond_4.svg/819px-Playing_card_diamond_4.svg.png";
		} else if (card_05.equals("�憛�5")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fd/Playing_card_diamond_5.svg/819px-Playing_card_diamond_5.svg.png";
		} else if (card_05.equals("�憛�6")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/8/80/Playing_card_diamond_6.svg/819px-Playing_card_diamond_6.svg.png";
		} else if (card_05.equals("�憛�7")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e6/Playing_card_diamond_7.svg/819px-Playing_card_diamond_7.svg.png";
		} else if (card_05.equals("�憛�8")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/7/78/Playing_card_diamond_8.svg/819px-Playing_card_diamond_8.svg.png";
		} else if (card_05.equals("�憛�9")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9e/Playing_card_diamond_9.svg/614px-Playing_card_diamond_9.svg.png";
		} else if (card_05.equals("�憛�10")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/thumb/3/34/Playing_card_diamond_10.svg/819px-Playing_card_diamond_10.svg.png";
		} else if (card_05.equals("�憛�11")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/a/aa/Poker-sm-234-Jd.png";
		} else if (card_05.equals("�憛�12")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/7/70/Poker-sm-233-Qd.png";
		} else if (card_05.equals("�憛�13")) {
			url = "https://upload.wikimedia.org/wikipedia/commons/d/d0/Poker-sm-232-Kd.png";
		}

		java.net.URL where = new URL(url);
		ImageIcon image = new ImageIcon(where);
		Image imgp = image.getImage();
		Image newimage = imgp.getScaledInstance(80, 120, java.awt.Image.SCALE_SMOOTH);
		ImageIcon card1 = new ImageIcon(newimage);
		give_card5 = card1;
		bt5.setIcon(card1);

	}	
	// ������隞�暻�
	public void actionPerformed(ActionEvent e) {
		if ((e.getActionCommand().equals("璇A")) || (e.getActionCommand().equals("�憛"))
				|| (e.getActionCommand().equals("蝝�")) || (e.getActionCommand().equals("暺�"))) {
			function_A();

		} else if ((e.getActionCommand().equals("璇2")) || (e.getActionCommand().equals("�憛�2"))
				|| (e.getActionCommand().equals("蝝��2")) || (e.getActionCommand().equals("暺��2"))) {
			function_2();
		} else if ((e.getActionCommand().equals("璇3")) || (e.getActionCommand().equals("�憛�3"))
				|| (e.getActionCommand().equals("蝝��3")) || (e.getActionCommand().equals("暺��3"))) {
			function_3();
		} else if ((e.getActionCommand().equals("璇4")) || (e.getActionCommand().equals("�憛�4"))
				|| (e.getActionCommand().equals("蝝��4")) || (e.getActionCommand().equals("暺��4"))) {
			function_4();
		} else if ((e.getActionCommand().equals("璇5")) || (e.getActionCommand().equals("�憛�5"))
				|| (e.getActionCommand().equals("蝝��5")) || (e.getActionCommand().equals("暺��5"))) {
			function_5();
		} else if ((e.getActionCommand().equals("璇6")) || (e.getActionCommand().equals("�憛�6"))
				|| (e.getActionCommand().equals("蝝��6")) || (e.getActionCommand().equals("暺��6"))) {
			function_6();
		} else if ((e.getActionCommand().equals("璇7")) || (e.getActionCommand().equals("�憛�7"))
				|| (e.getActionCommand().equals("蝝��7")) || (e.getActionCommand().equals("暺��7"))) {
			function_7();
		} else if ((e.getActionCommand().equals("璇8")) || (e.getActionCommand().equals("�憛�8"))
				|| (e.getActionCommand().equals("蝝��8")) || (e.getActionCommand().equals("暺��8"))) {
			function_8();
		} else if ((e.getActionCommand().equals("璇9")) || (e.getActionCommand().equals("�憛�9"))
				|| (e.getActionCommand().equals("蝝��9")) || (e.getActionCommand().equals("暺��9"))) {
			function_9();
		} else if ((e.getActionCommand().equals("璇10")) || (e.getActionCommand().equals("�憛�10"))
				|| (e.getActionCommand().equals("蝝��10")) || (e.getActionCommand().equals("暺��10"))) {
			function_10();
		} else if ((e.getActionCommand().equals("璇J")) || (e.getActionCommand().equals("�憛"))
				|| (e.getActionCommand().equals("蝝�")) || (e.getActionCommand().equals("暺�"))) {
			function_J();
		} else if ((e.getActionCommand().equals("璇Q")) || (e.getActionCommand().equals("�憛"))
				|| (e.getActionCommand().equals("蝝�")) || (e.getActionCommand().equals("暺�"))) {
			function_Q();
		} else if ((e.getActionCommand().equals("璇K")) || (e.getActionCommand().equals("�憛"))
				|| (e.getActionCommand().equals("蝝�")) || (e.getActionCommand().equals("暺�"))) {
			function_K();
		} else if (e.getActionCommand().equals("+")) {
			function_positive();
		} else if (e.getActionCommand().equals("-")) {
			function_negetive();
		} else if (e.getActionCommand().equals("P1")) {
			judge_player_when_use = 1;
			function_show_player();
		} else if (e.getActionCommand().equals("P2")) {
			judge_player_when_use = 2;
			function_show_player();
		} else if (e.getActionCommand().equals("P3")) {
			judge_player_when_use = 3;
			function_show_player();
		}

		if ((e.getSource().equals(bt1))) {
			card_01 = String.valueOf(cardbase.get(counts_cards));
			bt1.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
			bt11.setIcon(give_card);
			try {
				addicon();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		} else if ((e.getSource().equals(bt2))) {
			card_02 = String.valueOf(cardbase.get(counts_cards));
			bt2.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
			bt11.setIcon(give_card2);
			try {
				addicon2();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if ((e.getSource().equals(bt3))) {
			card_03 = String.valueOf(cardbase.get(counts_cards));
			bt3.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
			bt11.setIcon(give_card3);
			try {
				addicon3();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if ((e.getSource().equals(bt4))) {
			card_04 = String.valueOf(cardbase.get(counts_cards));
			bt4.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
			bt11.setIcon(give_card4);
			try {
				addicon4();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		} else if ((e.getSource().equals(bt5))) {
			card_05 = String.valueOf(cardbase.get(counts_cards));
			bt5.setText(String.valueOf(cardbase.get(counts_cards)));
			counts_cards++;
			bt11.setIcon(give_card5);
			try {
				addicon5();
			} catch (MalformedURLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		// implement button listener
	}

}
