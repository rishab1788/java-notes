package httpsessionevent;

import javax.servlet.http.HttpSessionEvent;

public class HttpSessionListenerTest implements javax.servlet.http.HttpSessionListener{
static int c=0;
	
	@Override
	public void sessionCreated(HttpSessionEvent arg0) {
	System.out.println("session cereated");
		c++;
	}
	
	
	
	@Override
	public void sessionDestroyed(HttpSessionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println("session destroyed");
	c--;
	}
	
	
}
