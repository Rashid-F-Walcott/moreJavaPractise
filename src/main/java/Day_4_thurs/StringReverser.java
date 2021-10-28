package Day_4_thurs;

public class StringReverser {

    public String reverse(String input) {

        StringBuilder result = new StringBuilder();

        if(input == null){
            return " ";
        }

        for (int i = input.length() - 1; i >= 0; i--) {
            result.append(input.charAt(i));
        }
        return result.toString();
    }
}
