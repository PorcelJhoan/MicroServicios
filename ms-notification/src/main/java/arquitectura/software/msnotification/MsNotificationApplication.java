package arquitectura.software.msnotification;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MsNotificationApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsNotificationApplication.class, args);
	}

}
