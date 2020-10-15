public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> listInteger = new MyList<Integer>();
        listInteger.add(10);
        listInteger.add(20);
        listInteger.add(30);
        listInteger.add(40);
        listInteger.add(50);
        listInteger.add(60);
        listInteger.add(-1);

        System.out.println("Element 4: " + listInteger.get(4));
        System.out.println("Element 5: " + listInteger.get(5));
        System.out.println("Element 2: " + listInteger.get(2));
        System.out.println("Element 1: " + listInteger.get(1));
        System.out.println("Element -1 : " + listInteger.get(-1));


    }
}
