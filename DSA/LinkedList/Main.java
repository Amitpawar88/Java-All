public class Main {
    public static void main(String[] args) {
        CustomLL list = new CustomLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(6);
        list.insertFirst(76);
        list.insertLast(81);
        list.insert(101, 3); 
        list.display();
        System.out.println(list.deleteFirst());
        list.display();
        System.out.println(list.deleteLast());
        list.display();
        System.out.println(list.delete(2));
        list.display();
        list.insertRec(88, 2);
        list.display();


        // DLL list = new DLL();
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(8);
        // list.insertFirst(17);
        // list.insertLast(99);
        // list.insert(8, 65);

        // list.display();


        // CLL list = new CLL();
        // list.insert(23);
        // list.insert(3);
        // list.insert(19);
        // list.insert(75);
        // list.delete(19);
        // list.display();

    }
}
