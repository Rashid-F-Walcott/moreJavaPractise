package Day_2_tues;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class DataStructuresExercise {

//////////////////////////////////////////////////////////////////////////////////////////
    // Practise exercise just to make sure the string prints
    public static void PrintRandomString(){

//        String randomString = "h,d,f,g,r,s,d,f,g,d,s,a,d,r,t,e,w,,s,d,f,r,e";
        String randomString = "q,z,f,o,y,u,u,t,e,w,d,k,c,v,n,j,o,k,h,d,,c,g,h,y,r,d,v,b,n,j,y,g,f,g,h,u,f,g,g,h,f,d,r,s,d,f,g,d,s,a,d,r,t,e,w,s,d,i,r,e,a,q,i,g,t";

        System.out.println(randomString);
    }

 //////////////////////////////////////////////////////////////////////////////////////////
    // Excersie 1 ) First method using a hashmap to count Character occurrence's


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

    //// Exercise 1) second method using .Stream (Nelsons code)


    public static void groupingAndCounting() {
        Function<String, String> stringStringFunction = letter -> letter.toUpperCase();
//        Predicate<String> predicate = letter -> !letter.equals("z");

        Map<String, Long> list = List.of("q","z","f","o","y","u","u","t","e","w","d","k","c","v","n","j","o","k","h","d","c","g","h","y","r","d","v","b","n","j","y","g","f","g","h","u","f","g","g","h","f","d","r","s","d","f","g","d","s","a","d","r","t","e","w","s","d","i","r","e","a","q","i","g","t")
                .stream()
//                .filter(predicate)
                .map(stringStringFunction)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println(list);
    }


// The predicate lines included are not necessary for functioning code, Nelson included them to show how a desired key can be filtered out of a list if necessary
// when uncommented, the first line states any letter that doesn't equal z should be included, the 2nd line just activates that code using .filter

// More on streams in Day_4 package




///////////////////////////////////////////////////////////////////////////////////////////////////////////
    // exercise 2 : bracket question, code answer below sourced from the internet ngl

//    public class bracketexercise() {
//
//        public static char TOKENS[][] = {{'{', '}'}, {'(', ')'}, {'[', ']'}};
//
//        public boolean isValid(String expr) {
//            Stack<Character> stack = new Stack<Character>();
//            for (char ch : expr.toCharArray()) {
//                if (isOpenTerm(ch)) {
//                    stack.push(ch);
//                } else {
//                    if (stack.isEmpty() || !matches(stack.pop(), ch)) {
//                        return false;
//                    }
//                }
//            }
//            return stack.isEmpty();
//        }
//
//        public boolean isOpenTerm(char ch) {
//            for (char[] chArr : TOKENS) {
//                if (chArr[0] == ch) {
//                    return true;
//                }
//            }
//            return false;
//        }
//
//        public boolean matches(char openTerm, char closeTerm) {
//            for (char[] chArr : TOKENS) {
//                if (chArr[0] == openTerm) {
//                    return chArr[1] == closeTerm;
//                }
//            }
//            return false;
//        }
//
//    }






}
