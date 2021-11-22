
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SendMail mail = new SendMail("vsk22vsk@gmail.com");
		if(mail.sendEmail())
		{
			System.out.println("Sent!");
		}
		else
		{
			System.out.println("Not Sent!");
		}
		
	}

}
