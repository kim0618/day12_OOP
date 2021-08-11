package com.care.test;


import java.util.Date;

import com.care.zzz.*;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			// 다른 패키지에 있는것은 디폴트로 가져올수 없다
			// 같은 패키지는 가져올수 잇다
			Test t = new Test();
			t.test();
			
			TestClass tc = new TestClass();
			tc.testClass();
	
			TestClass02 tc02 = new TestClass02();
			tc02.testClass02();
			
			Date d = new Date();
			System.out.println(d);
			
			a.a.a.TestClass tt = new a.a.a.TestClass();
			
	}
}
