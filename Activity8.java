package activities;

class CustomException extends Exception
{
	private String name=null;
	
	 public CustomException(String name) {
		this.name=name;

	}
	 
	 public String getMessage()
	 {
		 return name;
	 }
}


public class Activity8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Activity8.exceptionTest("will print to console");
			Activity8.exceptionTest(null);
			Activity8.exceptionTest("won't execute");
		}
		catch(CustomException mae)
		{
			System.out.println("Inside catch block"+ mae.getMessage());
		}
	}
	static void	exceptionTest(String str) throws CustomException
		{
			if(str==null)
			{
				throw new CustomException("String value is null");
			}else
			{
				System.out.println(str);
			}
		}

	}


