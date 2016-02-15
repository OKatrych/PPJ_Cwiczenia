package cw20;

import java.util.HashMap;

public class Fabryka {

    private static HashMap<Integer, Cukierek> cukierekHashMap = new HashMap<>();

    public static Cukierek make(int x){
        int randWaga = (int)(Math.random()*10);
        if (cukierekHashMap.size() == 0) {
            cukierekHashMap.put(x,new Cukierek(x,randWaga));
            return cukierekHashMap.get(x);
        }else {
            if (cukierekHashMap.containsKey(x)){
                return cukierekHashMap.get(x);
            }else {
                cukierekHashMap.put(x,new Cukierek(x,randWaga));
                return cukierekHashMap.get(x);
            }

        }
    }
    public static void showCukierek(){
        System.out.println(cukierekHashMap);
    }


}



