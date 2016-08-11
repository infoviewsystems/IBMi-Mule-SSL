package ibmissldemo;

import org.mule.api.lifecycle.Initialisable;
import org.mule.api.lifecycle.InitialisationException;

public class CustomSystemPropertiesLoader implements Initialisable {
	private String path;
	private String pwd;
	public CustomSystemPropertiesLoader(){

	}
	
	@Override
	public void initialise() throws InitialisationException{
		System.setProperty("javax.net.ssl.trustStore", path);
		System.setProperty("javax.net.ssl.trustStorePassword", pwd);
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

}
