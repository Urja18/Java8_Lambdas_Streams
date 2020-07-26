package java8;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class One {
	public static void main(String args[]) {
        IntStream stream=IntStream.of(1,2,5,3,4,66,7,8,18);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println("Stream Average : " +obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}


