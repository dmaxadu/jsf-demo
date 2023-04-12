import java.io.Serializable;

import javax.inject.Named;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@Named("helloworld")
@SessionScoped
@ManagedBean(name="helloworld")
public class HelloWorldBean implements Serializable {

/**
	 * 
	 */
	private static final long serialVersionUID = -8503772689575091022L;
	public String message = "Leobardo foda";
	public String getMessage() {
      return "Hello World from Fuertefentura";
   }

}