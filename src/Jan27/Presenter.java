package Jan27;

public class Presenter implements IPresenter{
	private IModel model;
	private IView view;

public Presenter(IView view, IModel model) {
	// TODO Auto-generated constructor stub
	this.model=model;
	this.view=view;
}
public void pass(String pass,String user)
{
	model.set(pass,user);
}
public void login() 
{
    String result = "Incorrect";
     
    if (model.getPassword().equals("12345")&&model.getuser().equals("subash")) 
    {
        result = "Correct ";
    }
    view.updateStatusLabel(result);
}

}
