package Jan27;

public class Model implements IModel {
	
	  private String password;
	  private String username;
	    public void set(String pass,String user) 
	    {
	        this.password = pass;
	        this.username=user;
	    } 
	    public Object getuser() {
			// TODO Auto-generated method stub
			return username;}
		public Object getPassword() {
			// TODO Auto-generated method stub
			return password;
		}
}
