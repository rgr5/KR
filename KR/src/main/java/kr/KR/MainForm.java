package kr.KR;
/**
 * объявление пакета
 */

/**
 * Импорт библиотек классов, необходимых для работы.
 */
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.text.NumberFormatter;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.awt.event.ActionEvent;
/**
 * 
 * Объявление публичного класса, наследующего члены класса JFrame 
 */
public class MainForm extends JFrame {
	int k1,k2,k3;
	/**
	 * Метод, отвечающий за запуск фрейма
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm frame = new MainForm();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Объявление метода, в котором объявляются элементы экранной формы, ее события
	 */
	public MainForm() {
		ImageIcon icon = new ImageIcon("src/rgr/unicorn2.png");
		setIconImage(icon.getImage());
		/**
		 * Создание главной панели
		 */
		TitledBorder titledBorder = BorderFactory.createTitledBorder(null, "Выберите необходимый вам калькулятор", TitledBorder.DEFAULT_JUSTIFICATION, TitledBorder.DEFAULT_POSITION, new Font("times new roman",Font.PLAIN,15), Color.black);
		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setBorder(titledBorder);
		JPanel Panel1 = new JPanel();
		Panel1.setBounds(50,15,500,650);
		JPanel Panel2 = new JPanel();
		Panel2.setLayout(null);
		Panel2.setBounds(5,15,650,650);
		/**
		 * Задание шрифта и размера надписей для кнопок, меток, переключателей
		 */
		Font font = new Font("Times New Roman", Font.PLAIN, 25);
		/**
		 * Создание меток 
		 */
		/**
		 * создание маски ввода 
		 */
		NumberFormat number = new DecimalFormat("##0.###");//маска ввода
		/**
		 * Создание текстовый полей 
		 */
		/**
		 * Создание кнопки
		 */
		JButton btnNewButton1 = new JButton("Для жилых помещений");
		JButton btnNewButton2 = new JButton("Для производственных помещений");
		JButton btnNewButton3 = new JButton("Для трансформаторов");
		btnNewButton1.setFont(font);
		btnNewButton1.setBounds(1, 10, 620, 100);
		btnNewButton1.setFocusable(isDisplayable());
		btnNewButton2.setFont(font);
		btnNewButton2.setBounds(1,110, 620, 100);
		btnNewButton2.setFocusable(isDisplayable());
		/**
		 * Добавление элементов на панель для текстовых полей
		 */
		/**
		 * Добавление элементов на панель для кнопки
		 */
		Panel2.add(btnNewButton1);
		Panel2.add(btnNewButton2);
		/**
		 * Добавление элементов на главную панель
		 */
		contentPane.add(Panel2);
		contentPane.add(Panel1);
		/**
		 * Указание размера, расположения, названия экранной формы, добавление на нее главной панели
		 */
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setResizable(false);
		setTitle("Расчет номинала предохранителей в электрической цепи");
		setContentPane(contentPane);
		setBounds(100, 100, 650, 280);	
		
		btnNewButton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Для жилых помещений")) {
				new form1().setVisible(true);
				//new form2().hide();
				    }
				
			
			}
		});
		//////////////////////////////////////////////////////////////
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (e.getActionCommand().equals("Для производственных помещений")) {
				new form2().setVisible(true);
				    }
				
			
			}
		});
	}
	
}

