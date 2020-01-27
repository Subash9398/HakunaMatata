package Jan27;

import java.util.Scanner;

public class View implements IView {
	private IPresenter presenter; 
	public void userlogin() {
	Scanner scannerObject = new Scanner(System.in);
	String username = scannerObject.nextLine();
	String password = scannerObject.nextLine();
	scannerObject.close();
	presenter.pass(password,username);
	presenter.login();
	}

	public void setPresenter(Presenter prese) {
		// TODO Auto-generated method stub
		this.presenter = prese;
		userlogin();

	}

	public void updateStatusLabel(String result) {
		// TODO Auto-generated method stub
		System.out.println(result);
	}

	
}
