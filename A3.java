import java.lang.annotation.*;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;


@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Execute{
	int sequence() default 0;
}

public class A3 {

	public static void main(String[] args) {
	
	}
}

class testing{
	private int pin;
	public testing(int pin)
	{
		this.pin = pin;
	}
	
	@Execute(sequence = 2)
	public static void run2() {
	
	}
	
	@Execute(sequence = 1)
	public static void run1() {
		
	}
}
