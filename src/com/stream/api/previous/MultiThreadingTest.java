package com.check.codepractice;

public class MultiThreadingTest implements Runnable {

//	@Override
//	public void run() {
//
//
//
//	}
	
	public static void main(String[] args) throws InterruptedException {
		
		Runnable r = () -> {
	
			for(int i = 0; i <= 10; i++) {
				System.out.println("Thread "+ i );
				try {
					Thread.sleep(2000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable r1 = () -> {
			
			for(int i = 0; i <= 10; i++) {
				System.out.println("Second Thread "+ i );
				try {
					Thread.sleep(3000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Thread t = new Thread(r);
		Thread t2 = new Thread(r1);
		t.start();
		t2.start();
		
		t.join(1111);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
