package Test;


import java.util.ArrayList;
import java.util.List;


interface Predicate <T>{
    boolean test(T t);
}

class test{
    public static void main(String[] args){
        Predicate<Integer> number = n -> {
          return n % 2 == 0;
        };

        int[] array={1,2,3,4,5,6,7,8,9};

        List<Integer> list = new ArrayList<>();

        for(int i =0 ; i < array.length ; i++){
            if(number.test(array[i])){
                list.add(array[i]);
            }
        }

        System.out.println(list);
    }

}
