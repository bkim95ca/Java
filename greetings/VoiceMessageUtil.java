import java.util.*;

public class VoiceMessageUtil {
    public String greeting(String name) {
    //^ access modifier
        return "Hello," + name;
    }

    public void getTodaysDate() {
        Date today = new Date();
        System.out.println("Hello, the current date is: " + today);
    }

    public String greeting(int age) {
        return "Hello, " + age;
    }

    public String greeting(double age) {
        return "Hello, your age is: " + age;
    }

    public int countTotalMessages(int[] messageCount) {
        int output = 0;
        for (int i = 0; i < messageCount.length; i++) {
            output += messageCount[i];
        }
        return output;
    }

    public void printAllMessages(ArrayList<String> messages) {
        for(int i = 0; i < messages.size(); i++) {
            System.out.println(i + messages.get(i));
        }
        // for (String message : messages) {
        //     System.out.println(message);
        // }
    }

}
