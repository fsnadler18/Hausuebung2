import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class BeispieleZuLambdas {
    List<String> li = new ArrayList<>();

    public void Bsp2(){
        for (String s:li) {
            System.out.println(s);
        }
        li.forEach((String s) -> System.out.println(s));
        Consumer<String> consumer = (String s) -> System.out.println(s);
        li.forEach(System.out::println);


    }

    public void Bsp3(){
        
    }

}
