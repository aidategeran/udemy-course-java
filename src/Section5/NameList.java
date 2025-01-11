package Section5;

public class NameList {
    private String [] names;
    private int currentIndex;


    public String[] getNames() {
        return names;
    }

    public void setNames(String[] names) {
        this.names = names;
    }

    public NameList(){
        names = new String[]{
                "alice", "bob", "carol", "dave", "eve",
                "frank", "grace", "heidi", "ivan", "judy"
        };
        currentIndex = 0;
    }

    public String next(){
        if (currentIndex < names.length){
            String name = names[currentIndex];
            String capitalized = name.substring(0,1).toUpperCase()+name.substring(1);
            currentIndex++;
            return capitalized;
        } else {
            return "No more names";
        }
    }

    public static void main(String[] args) {
        NameList nameList = new NameList();
        for (int i = 0; i < 10; i++) {
            System.out.println(nameList.next());
        }

        System.out.println(nameList.next());

    }
}


