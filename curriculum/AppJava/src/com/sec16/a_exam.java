package com.sec16;

// Runnable 인터페이스를 이용해서 야옹이, 멍멍이 2개의 스레드를 생성해서 실행 해보자.
// -Runnable 인터페이스를 구현한 클래스를 Thread로 만들어서 start()을 해야 한다.

public class a_exam implements Runnable {

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++ ) {
			System.out.println("나 스레드야!!! ❤️❤️");
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
		// new Thread(new a_exam()).start();
		System.out.println("========= main start =========");
		Thread t1 = new Thread(new a_exam(), "야옹이");
		Thread t2 = new Thread(new a_exam(), "멍멍이");
		t1.start();
		t2.start();
		System.out.println("========= main mid =========");
		try {
			t1.join(); // t1이 종료 될 때까지 main 스레드를 대기
			t2.join(); // t2이 종료 될 때까지 main 스레드를 대기
		} catch (InterruptedException i) {
			i.getStackTrace();
		}
		System.out.println("========= main end =========");
	}

//	@Override
//	public void run() {
//		
//		
//	
//		
//	}

}
