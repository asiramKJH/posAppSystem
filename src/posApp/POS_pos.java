package posApp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class POS_pos extends JPanel implements ActionListener{

	//ItemDAO 객체 생성(dao) 및 로드
	ItemDAO dao = ItemDAO.getInstance();

	//패널에 삽입될 컴포넌트들
	JLabel labelItemName;//2
	JLabel labelItemStock;//4
	JComboBox comboBoxItem;//3
	JTextField jTextFieldStock;//5
	JButton buttonItemAdd;//8
	JButton buttonPay;//9
	JButton buttonCancer;//a
	static JTable jTableBasket;//b
	JLabel labelTotal;//6
	JTextField jTextFieldTotal;//7
	JButton buttonRefresh;//1
	
	//JTable에 출력할 Model 객체 선언(tableModel)
	DefaultTableModel tableModel;
	
	//JComboBox에 출력할 Model 객체 선언(comboModel)
	DefaultComboBoxModel comboModel;
	
	//총가격 저장할 정수형 멤버변수 선언(total)
	int total;
	
	//멤버 변수들의 초기화 - 생성자 메소드
	public POS_pos() {
		
		//테이블에 열 이름 넣기
		tableModel = new DefaultTableModel();
		tableModel.addColumn("ID");
		tableModel.addColumn("상품명");
		tableModel.addColumn("재고량");
		tableModel.addColumn("단가");
		jTableBasket = new JTable(tableModel);//테이블의 형태로 데이터 출력 뷰(데이터 필요)
		JScrollPane jtable = new JScrollPane(jTableBasket);
		
		
		comboModel = new DefaultComboBoxModel(makeInVector());
		
		
		comboBoxItem = new JComboBox(comboModel);
		
		setLayout(null);
		
		//화면 구성
		buttonRefresh = new JButton("제품 불러오기");//1
		buttonRefresh.setLocation(20, 20);
		buttonRefresh.setSize(140, 40);
		
		buttonItemAdd = new JButton("추가");//8
		buttonItemAdd.setLocation(170, 190);
		buttonItemAdd.setSize(100, 40);
		
		labelItemName = new JLabel("상품");//2
		labelItemName.setLocation(20, 90);
		labelItemName.setSize(100, 30);
		
		labelItemStock = new JLabel("수량");//4
		labelItemStock.setLocation(20, 140);
		labelItemStock.setSize(100, 30);
		
//		comboBoxItem = new JComboBox();//3
		comboBoxItem.setLocation(70, 90);
		comboBoxItem.setSize(200, 30);
		
		jTextFieldStock = new JTextField();//5
		jTextFieldStock.setLocation(70, 140);
		jTextFieldStock.setSize(200, 30);
		
		labelTotal = new JLabel("총가격");//6
		labelTotal.setLocation(20, 250);
		labelTotal.setSize(100, 40);
		
		jTextFieldTotal = new JTextField();//7
		jTextFieldTotal.setLocation(70, 250);
		jTextFieldTotal.setSize(200, 40);
		
		buttonPay = new JButton("결제");//9
		buttonPay.setLocation(300, 250);
		buttonPay.setSize(100, 40);
		
		buttonCancer = new JButton("취소");//a
		buttonCancer.setLocation(410, 250);
		buttonCancer.setSize(100, 40);
		
//		jTableBasket = new JTable();//b
		jTableBasket.setLocation(300, 20);
		jTableBasket.setSize(210, 210);
		
		
		add(buttonRefresh);
		add(buttonItemAdd);
		add(labelItemName);
		add(labelItemStock);
		add(comboBoxItem);
		add(jTextFieldStock);
		add(labelTotal);
		add(jTextFieldTotal);
		add(buttonPay);
		add(buttonCancer);
		add(jTableBasket);
		
		buttonRefresh.addActionListener(this);
		buttonItemAdd.addActionListener(this);
		buttonPay.addActionListener(this);
		buttonCancer.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		tableModel = (DefaultTableModel)jTableBasket.getModel();
		
		Object buttonObject = e.getSource();
		//제품 불러오기
		if(buttonObject == buttonRefresh) {
			//
		}
	}
	
	public Vector<String[]> makeInVector() {
		Vector<String[]> list = new Vector<String[]>();
		
		return list;
	}
//	
//	public void clean() {
//		
//	}
//	
//	public boolean isCheck(String string, DefaultTableModel dtm) {
//		return;
//	}
//	
//	public void stock_update(DefaultTableModel dtm) {
//		
//	}
//	
//	public DefaultComboBoxModel combo_model_update() {
//		return;
//	}

}
