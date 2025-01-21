package Section6;

public class SwitchStatement {
    public static void main(String[] args) {
        String command = "stop";

        if (command == null) {
            System.out.println("Command not understood...");
        } else {
            switch (command) {
                case "Stop":
                    System.out.println("Stoping now...");
                    break;
                case "Go":
                    System.out.println("Going now...");
                    break;
            }
        }

//        if ("stop".equals(command)) {
//            System.out.println("Stopping now...");
//        } else if ("go".equals(command)) {
//            System.out.println("Going now...");
//        } else {
//            System.out.println("Command not understood...");
//        }


    }
}