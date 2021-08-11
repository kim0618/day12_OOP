package day12_OOP;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.sun.source.tree.CatchTree;

class Time{
	private Date date;
	private SimpleDateFormat simpl;
	public void setDate(){
		date = new Date();
		simpl =	new SimpleDateFormat("yyyy년 MM월 dd일 aa hh시 mm분 ss초");
	}
	public String getDate() {
		return simpl.format(date);
	}
	public void ti() {
		for(int i=0; i<10; i++) {
			setDate();
			System.out.println(getDate());
		try {
			Thread.sleep(1000);
		}catch (Exception e) {
			// TODO: handle exception
		}
		}
	}
}



public class Quiz02 {
	public static void main(String[] args) {
	Time ex = new Time();
	ex.ti();
	
}
}
