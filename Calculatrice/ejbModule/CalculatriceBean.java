import javax.ejb.Local;
import javax.ejb.Stateless;

import org.jboss.ejb3.annotation.SecurityDomain;
@Stateless (name="bean1")
@Local (Calculate.class)
public class CalculatriceBean implements Calculate {

	@Override
	public double add(double a, double b) {
		// TODO Auto-generated method stub
		return a+b;
	}


	
	@Override
	public double sub(double a, double b) {
		// TODO Auto-generated method stub
		return a-b;
	}

}
