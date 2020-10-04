import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Beispiel1 {
    List<String> li = new ArrayList<>();

    public static void main(String [] args){
        Beispiel1 bsp1 = new Beispiel1();
        bsp1.Bsp2();
    }

    public void Bsp2(){
        li.add("Hallo");
        li.add("Hi");
        for (String s:li) {
            System.out.println(s);
        }
        li.forEach((String s) -> System.out.println(s));
        Consumer<String> consumer = (String s) -> System.out.println(s);
        li.forEach(System.out::println);
    }


}
