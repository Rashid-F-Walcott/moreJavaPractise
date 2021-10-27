package Day_2_tues;

import java.util.HashMap;

public class DataStructuresExercise {


    public static void PrintRandomString(){

//        String randomString = "h,d,f,g,r,s,d,f,g,d,s,a,d,r,t,e,w,,s,d,f,r,e";
        String randomString = "q,z,f,o,y,u,u,t,e,w,d,k,c,v,n,j,o,k,h,d,,c,g,h,y,r,d,v,b,n,j,y,g,f,g,h,u,f,g,g,h,f,d,r,s,d,f,g,d,s,a,d,r,t,e,w,s,d,i,r,e,a,q,i,g,t";

        System.out.println(randomString);
    }

    public static void StringCount(){

//        String randomString = "h,d,f,g,r,s,d,f,g,d,s,a,d,r,t,e,w,s,d,f,r,e";
          String randomString = "q,z,f,o,y,u,u,t,e,w,d,k,c,v,n,j,o,k,h,d,,c,g,h,y,r,d,v,b,n,j,y,g,f,g,h,u,f,g,g,h,f,d,r,s,d,f,g,d,s,a,d,r,t,e,w,s,d,i,r,e,a,q,i,g,t";


        HashMap<Character, Integer> LetterCount = new HashMap<>();
        for (int i = 0; i < randomString.length(); i++) {
            char x = randomString.charAt(i);
            if (LetterCount.containsKey(x)){
                LetterCount.put(x, LetterCount.get(x) +1 );
            } else {
                LetterCount.put(x, 1);
            }
        }

        System.out.println(LetterCount);

    }





}
