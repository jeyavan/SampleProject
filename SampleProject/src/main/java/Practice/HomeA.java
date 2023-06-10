package Practice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class HomeA {
	@Autowired
	@Qualifier("abc")
	private InternetConnections modem;  //object
	
	public HomeA() {
		System.out.println("Constractor");
	}
	public void connection() {
		          
		modem.switchon();          //call obj(modem) here
		
		System.out.println("connecting to internet(Practice package)");
		
	}

}
