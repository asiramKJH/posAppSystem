package posApp;

import java.sql.SQLException;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

public class Test {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

		ItemDAO dao = ItemDAO.getInstance();
		
		Vector<Item> list = new Vector<Item>();
		
//		list = dao.getAllItem();
//		
//		Iterator it = list.iterator();
//		
//		System.out.println("전체 상품 목록 출력");
//		while(it.hasNext()) {
//			Item item = (Item)it.next();
//			System.out.println(item.getId() + ", " 
//							+ item.getItem_name() + ", " 
//							+ item.getItem_stock() + ", "
//							+ item.getItem_price());
//		}
//		
//		System.out.println("상품명 출력");
//		
//		Vector<String> itemlist = new Vector<String>();
//		
//		itemlist = dao.getItem();
//		
//		it = itemlist.iterator();
//		
//		while(it.hasNext()) {
//			String item = (String)it.next();
//			System.out.println(item);
//		}
		
//		System.out.println("상품 가격 출력");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("상품 이름 입력 : ");
//		String input = sc.next();
//		String price = dao.getPrice(input);
//		System.out.println("상품 가격 : " + price);
		
//		System.out.println("상품 재고 반환");
//		Scanner sc  = new Scanner(System.in);
//		System.out.print("상품 이름 입력 : ");
//		String input = sc.next();
//		String stock = dao.getStock(input);
//		System.out.println("상품 재고 : " + stock);
		
//		System.out.println("상품 재고 업데이트");
//		String total = dao.getStock("aaa");
//		Scanner sc = new Scanner(System.in);
//		System.out.print("판매수량 : ");
//		String count = sc.next();
//		dao.updateStock(total, count, "aaa");
//		System.out.println("변경된 재고 현황");
//		System.out.println(dao.getStock("aaa"));
		
		System.out.println("제품 신규 등록");
		Scanner sc = new Scanner(System.in);
		System.out.print("상품 이름 입력 : ");
		String inputName = sc.next();
		System.out.print("재고 입력 : ");
		int inputStock = sc.nextInt();
		System.out.print("가격 입력 : ");
		int inputPrice = sc.nextInt();
		
		Item inputItem = new Item();
		inputItem.setItem_name(inputName);
		inputItem.setItem_stock(inputStock);
		inputItem.setItem_price(inputPrice);
		
		boolean result = dao.insertItem(inputItem);
		
		
		list = dao.getAllItem();
		
		Iterator it = list.iterator();
		
		System.out.println("전체 상품 목록 출력");
		while(it.hasNext()) {
			Item item = (Item)it.next();
			System.out.println(item.getId() + ", " 
							+ item.getItem_name() + ", " 
							+ item.getItem_stock() + ", "
							+ item.getItem_price());
		}
		
		
	}

}
