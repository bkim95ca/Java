public class Test {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String firstName = "Bobby";
        String lastName = "Brown";
        System.out.println(firstName + " " + lastName);
        int age = 54;
        boolean isBald = true;
        double weight = 204.5;
        char grade = 'F';
        System.out.println("Name: " + firstName + " " + lastName + "\n" +
                            "age: " + age + "\n" +
                            "weight: " + weight + "\n" +
                            "grade: " + grade + " | is bald: " + isBald);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        // if(weight < 100) {
        //     System.out.println("you need to gain some weight");
        // } else {
        //     System.out.println("you're fine");
        // }
        System.out.println(weight < 100 ? "you need to gain some weight" : "you're fine");

        String fullName = firstName.concat(lastName);
        System.out.println("full name length: " + fullName.length());
        System.out.println("full name: " + fullName);

        String greeting = String.format("Hi %s, you are %d years old.", fullName, age);
        System.out.println(greeting);
        System.out.printf("Hi %s, you are %d years old.", fullName, age);

        String firstName1 = "Martha";
        String firstName2 = new String("Martha");
        String firstName3 = "Martha";
        System.out.println(firstName1 + " " + firstName2);
        System.out.println(firstName1.equals(firstName2));
    }
}
