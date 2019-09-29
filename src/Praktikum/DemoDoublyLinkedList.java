package Praktikum;

/**
 * @author Augie Winanda Favourite
 */
public class DemoDoublyLinkedList {
    public static void printListDouble(DoublyLinkedList<Double> list) {
        Node<Double> temp = list.head.getNext();
        while (temp != list.tail) {
            System.out.print(temp.getElement().doubleValue() + "  ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public static void printListCharacter(DoublyLinkedList<Character> list) {
        Node<Character> temp = list.head.getNext();
        while (temp != list.tail) {
            System.out.print(temp.getElement().charValue() + "  ");
            temp = temp.getNext();
        }
        System.out.println("");
    }
    public static void printListString(DoublyLinkedList<String> list) {
        Node<String> temp = list.head.getNext();
        while (temp != list.tail) {
            System.out.print(temp.getElement().toString() + "  ");
            temp = temp.getNext();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        DoublyLinkedList<Double> list = new DoublyLinkedList<>();
        DoublyLinkedList<Character> list2 = new DoublyLinkedList<>();
        DoublyLinkedList<String> list3 = new DoublyLinkedList<>();

        System.out.println("\t\t\tDATA DOUBLE");

        list.addFirst(10D);
        System.out.println("List awal :");
        printListDouble(list);

        list.addLast(20D);
        list.addFirst(15D);
        list.addFirst(16D);
        System.out.println("Tambahkan 16.0 15.0 diawal dan 20.0 diakhir : ");
        printListDouble(list);

        list.removeLast();
        System.out.println("Hapus Elemen terakhir : ");
        printListDouble(list);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<\n");

        System.out.println("\t\t\tDATA CHARACTER");

        list2.addFirst('Z');
        System.out.println("List awal : ");
        printListCharacter(list2);

        list2.addLast('A');
        list2.addLast('A');
        list2.addLast('B');
        System.out.println("Tambahkan A A B diakhir : ");
        printListCharacter(list2);

        list2.removeFirst();
        list2.removeFirst();
        list2.addFirst('P');
        list2.addLast('N');
        list2.addLast('N');
        System.out.println("Hapus 2 Elemen pertama Z A, Tambahkan P diawal dan N N diakhir : ");
        printListCharacter(list2);

        list2.removeFirst();
        list2.removeFirst();
        list2.addFirst('P');
        list2.addFirst('C');
        list2.addFirst('D');
        list2.removeLast();
        list2.removeLast();
        list2.addLast('X');
        list2.addLast('X');
        System.out.println("Hapus 2 Elemen Pertama P A, Tambahkan D C P diawal. Hapus 2 Elemen diakhir, Tambahkan X X diakhir : ");
        printListCharacter(list2);

        System.out.println("\n>>>>>>>>>>>>>>>>>>>><<<<<<<<<<<<<<<<<<<<\n");

        System.out.println("\t\t\tDATA STRING");

        list3.addFirst("Malang");
        list3.addLast("Surabaya");
        list3.addLast("Jakarta");
        printListString(list3);

        list3.addLast("Semarang");
        list3.addLast("Bandung");
        printListString(list3);

        list3.removeLast();
        list3.removeLast();
        list3.removeLast();
        list3.addLast("Semarang");
        list3.addLast("Bandung");
        printListString(list3);

        list3.addLast("Madiun");
        list3.addLast("Blitar");
        printListString(list3);

        list3.removeLast();
        list3.removeFirst();
        list3.removeFirst();
        list3.addFirst("Malang");
        printListString(list3);

        list3.addLast("Kediri");
        printListString(list3);

        list3.removeLast();
        list3.removeLast();
        list3.addLast("Kediri");
        printListString(list3);

        list3.addLast("Garut");
        list3.addLast("Sumedang");
        printListString(list3);
    }
}
