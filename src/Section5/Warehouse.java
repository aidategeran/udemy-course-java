package Section5;

public class Warehouse {
    private int[] items;
    private int[] classes;
    int currentIndex;
    int currentClassIndex;

    public Warehouse() {
        items = new int[]{
                13, 49, 90, 130, 175, 181, 255, 310, 320, 359
        };


        currentIndex = 0;
        currentClassIndex = 0;
    }

    public int[] getItems() {
        return items;
    }

    public void setItems(int[] items) {
        this.items = items;
    }

    public int next() {
        if (currentIndex < items.length) {
            int timeItems = items[currentIndex];
            if (timeItems < currentClassIndex){

            }
            currentIndex++;
            int i = currentClassIndex + 89;
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        Warehouse warehouse = new Warehouse();
        for (int i = 0; i < 10; i++) {
            System.out.println(warehouse.next());
        }
    }

}

