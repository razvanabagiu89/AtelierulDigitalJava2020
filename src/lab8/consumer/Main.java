package lab8.consumer;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Main {
    @Test
    public  void ex1() {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        Consumer<List<String>> consumer = list1 -> list1.clear();
        consumer.accept(list);
        System.out.println(list);
        if(list.size()==0){
            System.out.println("0");
        }else{
            System.out.println("1");

        }
        Assert.assertEquals(list,new ArrayList<>());
    }

    @Test
    public void ex2() {
        List<String> list = new ArrayList<String>(Arrays.asList("a","b","c"));
        List<String> list2 = new ArrayList<String>(Arrays.asList("a","b","c","first","second"));

        Consumer<List<String>> consumer = list12 -> list12.add("first");
        Consumer<List<String>> consumer2 = list1 -> list1.add("second");

        Consumer<List<String>> consumer3 = consumer.andThen(consumer2);
        consumer3.accept(list);

        Assert.assertEquals(list,list2);
    }


}
