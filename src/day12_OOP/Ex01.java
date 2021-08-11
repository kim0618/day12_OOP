package day12_OOP;


import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex01 {
	public static void main(String[] args) {
			long time = System.currentTimeMillis();	// ��¥�� �ʴ����� ��������
			System.out.println(time);
			
			SimpleDateFormat s =	// ��¥�� ������ �ٲ��ִ°�
					new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
			String str = s.format(time);
			System.out.println(str);
			
			Date d = new Date();
			System.out.println("date : "+d);
			System.out.println("format(d) : "+s.format(d));
			
			Calendar cal = Calendar.getInstance();
			System.out.println("cal : "+cal);
			System.out.println(cal.get(Calendar.YEAR));
			System.out.println(cal.get(Calendar.MONTH)+1);
			System.out.println(cal.get(Calendar.DATE));
			
	}
}
