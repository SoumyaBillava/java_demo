package inheritance;

public class Nokia {
	public static void main(String args[])
	{

		//Basic phone
		MobilePhones basicmodel =new MobilePhones();
		basicmodel.call();
		basicmodel.message();
	
		//android phone
		AndroidPhones newmodel =new AndroidPhones();
		newmodel.call();
		newmodel.videoCall();
	}
	
}
