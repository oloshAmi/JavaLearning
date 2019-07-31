package multiThreadTest;


public class Main {

	public static void main(String[] args) {
		String[] inFiles= {".\files1.txt",".\files2.txt",".\files3.txt",".\files4.txt",".\files5.txt",".\files6.txt"};
		String[] outFiles= {".\files1.out.txt",".\files2.out.txt",".\files3.out.txt",".\files4.out.txt",".\files5.out.txt",".\files6.out.txt"};
		
		Thread[] threads=new Thread[inFiles.length];
		for (int i=0;i<inFiles.length;i++) {
			Adder adder=new Adder(inFiles[i],outFiles[i]);
			Thread thread= new Thread(adder);
			thread.start();

		}
		
		for(Thread thread:threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}


	}
}
