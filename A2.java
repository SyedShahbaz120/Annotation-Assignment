import java.lang.annotation.*;

@Target({ElementType.TYPE, ElementType.METHOD})
@interface info
{
	int authorID();
	String authorName() default "shah";
	String supervisor() default "SS";
	String date();
	String time();
	int version();
	String description() default "Normal class";
}


@info(authorID = 12, date = "11 nov", time= "1pm" ,version = 2)
public class A2 {

	public static void main(String[] args) {
		
	}
	
	@info (authorID = 11, date = "11 nov", time= "1pm" ,version = 3)
	public void test()
	{
		
	}
}
