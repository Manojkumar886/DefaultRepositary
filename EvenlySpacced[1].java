

//tushar.kapila@gmail.com
public class EvenlySpacced {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EvenlySpacced space=new EvenlySpacced();
		space.evenlyspacedTestCases();

	}
	private int count;
	private int errs;
	
	public boolean evenlySpaced(int a, int b, int c,boolean expectedReturn) 
	{
		boolean actualReturn = false;
		count++;
		if(a<b&&a<c)
		{
			 if(b<c)
			{
			try {
				actualReturn =evenlySpaced(a, b, c, expectedReturn);
			} catch (Throwable e) {
				e.printStackTrace();// log it
				System.err.println("Error " + e);
			}
		}
		if (actualReturn != expectedReturn) {
			System.out.println("Actual :" + actualReturn + ", expected :" + expectedReturn + ", for a :" + a + ", b :" + b + ", c :"+ c
					+ ", count :" + count + ".");
			errs++;
		}
		System.err.println("Error " + errs);
		return actualReturn;
		}
		return true;

	}

	private void evenlyspacedTestCases()
	{
		System.out.println("EvenlySpace Test cases, run at " + new java.util.Date());// copy to your test cases and change text IcyHot ...

		evenlySpaced(2, 4, 6,true);
		evenlySpaced(4, 6, 2,true); 
		evenlySpaced(4, 6, 3,false); 
		System.out.println("evenlyspaces test cases count " + count
				+ ", Errors (test case expected value wrong or implmentaion wrong or problem understanding wrong):" + errs + ".");

		
	}

}
