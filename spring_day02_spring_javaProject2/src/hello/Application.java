package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class Application {
	
	@Bean
	MessageService mockMessageService() {
		return new MessageService() {
			
			@Override
			public String getMessage() {
				return "ㅋㅋ";
			}
		};
	}
	
	public static void main(String[] args) {
		ApplicationContext factory = new AnnotationConfigApplicationContext(Application.class);
		MessagePrinter printer = (MessagePrinter)factory.getBean(MessagePrinter.class);
		printer.printMessage();
	}
}
