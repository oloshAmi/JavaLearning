package reflectionTest;

import java.lang.reflect.*;


public class ReflectionTestMain {
	public static void main(String[] args) {
		BankAccount acct=new HighVolumeAccount("1234");
		doWork(acct);
		getModifiers(acct);
		fieldInfo(acct);
		methodInfo(acct);

		BankAccount bankAcct=new BankAccount("1234");
		fieldInfo(bankAcct);
		callGetId(bankAcct);
		
		BankAccount bankAcctOne=new BankAccount("5678",500);
		callDeposit(bankAcctOne,50);
		System.out.println("Balance: "+bankAcctOne.getBalance());

	}

	private static void callDeposit(Object obj, int amt) {
		Class<?> theClass=obj.getClass();
		try {
			Method m=theClass.getMethod("deposit", int.class);
			m.invoke(obj,amt);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	private static void callGetId(Object obj) {
		Class<?> theClass=obj.getClass();

		try {
			Method m=theClass.getMethod("getId");
			Object result=m.invoke(obj);
			System.out.println("Result: "+result);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}



	private static void methodInfo(Object obj) {
		Class<?> theClass=obj.getClass();
		Method[] methods=theClass.getMethods();
		displayMethods(methods);

		Method[] declaredMethods=theClass.getDeclaredMethods();
		displayMethods(declaredMethods);
	}

	private static void displayMethods(Method[] arr) {
		for (Method m:arr) {
			if(m.getDeclaringClass()!=Object.class) {
				System.out.println(m.getName());
			}
		}		
	}

	private static void fieldInfo(Object obj) {
		Class<?> theClass=obj.getClass();

		Field[] fields=theClass.getFields();		
		displayFields(fields);

		Field[] declaredFields=theClass.getDeclaredFields();		
		displayFields(declaredFields);
	}

	private static void displayFields(Field[] arr) {
		for (Field f:arr) {
			System.out.println(f.getName()+" : "+f.getType());
		}
	}

	private static void doWork(Object obj) {
		Class<?> theClass=obj.getClass();
		showName(theClass);

		Class<?>theSuperClass=theClass.getSuperclass();
		showName(theSuperClass);

		Class<?>theBaseClass=theSuperClass.getSuperclass();
		showName(theBaseClass);

	}


	private static void showName(Class<?> theClass) {
		System.out.println(theClass.getSimpleName());
	}

	private static void getModifiers(Object obj) {
		Class<?> theClass=obj.getClass();
		int modifiers=theClass.getModifiers();
		if((modifiers & Modifier.FINAL)>0) {
			System.out.println("Bitwise Check --- final");
		}
		if(Modifier.isFinal(modifiers)) {
			System.out.println("Method Check --- final");
		}
		if(Modifier.isPrivate(modifiers)) {
			System.out.println("Method Check --- private");
		}else if(Modifier.isProtected(modifiers)) {
			System.out.println("Method Check --- protected");
		}else if(Modifier.isPublic(modifiers)) {
			System.out.println("Method Check --- public");
		}
	}

}
