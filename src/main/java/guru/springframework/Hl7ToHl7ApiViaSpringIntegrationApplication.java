package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource("classpath*:spring/si-config.xml")
public class Hl7ToHl7ApiViaSpringIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(Hl7ToHl7ApiViaSpringIntegrationApplication.class, args);
	}
}
