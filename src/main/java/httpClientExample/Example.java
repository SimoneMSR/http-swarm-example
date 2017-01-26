package httpClientExample;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;

import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;

@Startup
@Singleton
public class Example {
	
	@PostConstruct
	public void createHttpClient(){
		PoolingHttpClientConnectionManager cm = new PoolingHttpClientConnectionManager();
	}
}
