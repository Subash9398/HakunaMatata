package Jan27;

public class Mainclass  {


	public static void main(String args[]) {
		
		IView view=new View();
		view.setPresenter(new Presenter(view,new Model()));
		
	}
}
