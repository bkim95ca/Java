import java.util.ArrayList;
public class VoiceMessageTest {
    public static void main(String[] arg) {
        VoiceMessageUtil messageUtil = new VoiceMessageUtil();

        System.out.println(messageUtil.greeting("Bobby"));
        System.out.println(messageUtil.greeting(23.6));

        messageUtil.getTodaysDate();

        // System.out.println("fixed array: " + messagesPerDay);
        int[] messagesPerDay = {5,4,6};
        for (int i = 0; i < messagesPerDay.length; i++) {
            System.out.println(messagesPerDay[i]);
        }

        ArrayList<String> todoList = new ArrayList<String>();
        todoList.add("Finish Alfred Bot");
        todoList.add("Cafe Business Logic");
        todoList.add("Read Ahead for OOP");

        messageUtil.printAllMessages(todoList);

        //type casting
        int days = 7;
        double cost = 10.99;
        

        //implicit casting
        double totalCost = days * cost;
        System.out.println(totalCost);
        //explicit casting
        int totalCost1 = days * (int)cost;
        System.out.println(totalCost1);
    }
}
