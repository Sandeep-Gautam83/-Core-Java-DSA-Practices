//public class linearSearchArray {
//    public static int searchkey(int numbers[], int key) {
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] == key) {
//                return i;
//            }
//        }
//        return -1;
//    }
//
//    public static void main(String[] args) {
//        int numbers[] = {2, 4, 6, 8, 10, 12, 14, 16};
//        int key = 10;
//
//        int index = searchkey(numbers, key);
//        if (index == -1) {
//            System.out.println("NOT found");
//        } else {
//            System.out.println("key at index : " + index);
//        }
//    }
//}


public class linearSearchArray {

    public static int searchkey(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        String menu[] = {"dosa", "chole bhature", "samosa", "paneer", "bhailpuri"};
        String key = "paneer";


        int index = searchkey(menu, key);
        if (index == -1) {
            System.out.println("NOT found");
        } else {
            System.out.println("key is at index : " + index);
        }
        System.out.println();
    }
}

// time complexcity = O(n)