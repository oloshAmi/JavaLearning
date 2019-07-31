package multiThreadTest.callableTest;

import java.util.concurrent.*;

public class Main {

	public static void main(String[] args) {
		String[] inFiles= {".\files1.txt",".\files2.txt",".\files3.txt",".\files4.txt",".\files5.txt",".\files6.txt"};
		ExecutorService es= Executors.newFixedThreadPool(3);
		Future<Integer>[] results=new Future[inFiles.length];
		
		for (int i=0;i<inFiles.length;i++) {
			Adder adder=new Adder(inFiles[i]);
			results[i]=es.submit(adder);
		}
		
		for(Future<Integer> result:results) {
			int value;
			try {
				value = result.get();
				System.out.println("Total: "+value);
			} catch (ExecutionException e) {
				Throwable adderEx=e.getCause();
				e.printStackTrace();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}

	}

}
