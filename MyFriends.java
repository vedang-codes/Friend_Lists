import java.util.*;
import javax.swing.JOptionPane;

public class MyFriends {
    public static void main(String[] args) {
        FriendList friend_list = new FriendList();
        FriendList shane_list = friend_list;
        friend_list.addInFriendList(new Person("Shane", "Johnson", "2135469870", 4, 12));
        friend_list.addInFriendList(new Person("Jessy", "Hanes", "1478523690", 1, 30));
        friend_list.addInFriendList(new Person("Lisa", "Kaif", "1236547410", 6, 18));
        friend_list.addInFriendList(new Person("Mike", "Clauss", "8796542130", 5, 1));
        friend_list.addInFriendList(new Person("Shane", "Straut", "2135469870", 4, 12));
        friend_list.addInFriendList(new Person("Melina", "Jenn", "3589621470", 6, 15));

        while (true) {
            JOptionPane.showMessageDialog(null, "---Available Operations---\n" + 
                                    "Enter 'A': To Add Friend in the List\n" + 
                                    "Enter 'U': To See Unsorted List\n" +
                                    "Enter 'R': To Remove Friend from the List\n" +
                                    "Enter 'S': To Remove Friend with First Name Shane from the List\n" +
                                    "Enter 'C': To get the details of a person from the Cell Number\n" +
                                    "Enter 'X': To get the details of a person from the First Name\n" +
                                    "Enter 'Y': To get the details of a person from the Last Name\n" +
                                    "Enter 'Z': To Edit the details of a friend in the List\n" +
                                    "Enter 'F': To see the Sorted List by the First Name of a friend\n" +
                                    "Enter 'L': To see the Sorted List by the Last Name of a friend\n" +
                                    "Enter 'M': To see the List of a friend born in given Months\n" +
                                    "Enter 'T': To see the total number of a Friends in the List\n" +
                                    "Enter 'E': To Exit\n");
            String answer = JOptionPane.showInputDialog(null, "Enter your response");
            if (answer.toUpperCase().charAt(0) == 'A') {
                String first_name = JOptionPane.showInputDialog(null, "Enter First Name");
                String last_name = JOptionPane.showInputDialog(null, "Enter Last Name");
                String cell_number = JOptionPane.showInputDialog(null, "Enter Cell Number");
                String s_month = JOptionPane.showInputDialog(null, "Enter Birth Month");
                int month = Integer.parseInt(s_month);
                String s_day = JOptionPane.showInputDialog(null, "Enter Birth Day");
                int day = Integer.parseInt(s_day);
                friend_list.addInFriendList(new Person(first_name, last_name, cell_number, month, day));
                JOptionPane.showMessageDialog(null, "!!!Friend Added Successfully in the List!!!");
            }
            else if (answer.toUpperCase().charAt(0) == 'U') {
                if (friend_list.getPersonList().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Oops you haven't added any friend in the List...");
                }
                else {
                    JOptionPane.showMessageDialog(null, "First Name    Last Name    Cell Number    Birthdate");
                    for (Person person : friend_list.getPersonList()) {
                        JOptionPane.showMessageDialog(null, person);;
                    }
                }
            }
            else if (answer.toUpperCase().charAt(0) == 'R') {
                String first_name = JOptionPane.showInputDialog(null, "Enter Person's First Name");
                String last_name = JOptionPane.showInputDialog(null, "Enter Person's Last Name");
                friend_list.removeFromList(first_name, last_name);
                JOptionPane.showMessageDialog(null, "First Name    Last Name    Cell Number    Birthdate");
                for (Person person : friend_list.getPersonList()) {
                    JOptionPane.showMessageDialog(null, person);;
                }
            }
            else if (answer.toUpperCase().charAt(0) == 'S') {
                shane_list.removeShaneFromList("Shane");
                JOptionPane.showMessageDialog(null, "First Name    Last Name    Cell Number    Birthdate");
                for (Person person : shane_list.getPersonList()) {
                    JOptionPane.showMessageDialog(null, person);;
                }
            }
            else if (answer.toUpperCase().charAt(0) == 'C') {
                String cell_number = JOptionPane.showInputDialog(null, "Enter Cell Number");
                friend_list.detailFromCellNumber(cell_number);
            }
            else if (answer.toUpperCase().charAt(0) == 'X') {
                String first_name = JOptionPane.showInputDialog(null, "Enter First Name");
                friend_list.detailFromFirstName(first_name);
            }
            else if (answer.toUpperCase().charAt(0) == 'Y') {
                String last_name = JOptionPane.showInputDialog(null, "Enter Last Name");
                friend_list.detailFromLastName(last_name);
            }
            else if (answer.toUpperCase().charAt(0) == 'Z') {
                JOptionPane.showMessageDialog(null, "To change any Person's details?\n Enter their First Name and Last Name");
                String first_name = JOptionPane.showInputDialog(null, "Enter Person's First Name");
                String last_name = JOptionPane.showInputDialog(null, "Enter Person's Last Name");
                friend_list.editListDetalis(first_name, last_name);
            }
            else if (answer.toUpperCase().charAt(0) == 'F') {
                friend_list.sortByFirstName();
            }
            else if (answer.toUpperCase().charAt(0) == 'L') {
                friend_list.sortByLastName();
            }
            else if (answer.toUpperCase().charAt(0) == 'M') {
                String new_month = JOptionPane.showInputDialog(null, "Enter Birth Month");
                int n_month = Integer.parseInt(new_month);
                friend_list.listByBornMonth(n_month);
            }
            else if (answer.toUpperCase().charAt(0) == 'T') {
                JOptionPane.showMessageDialog(null, String.format("Total Friends in the List: %d", friend_list.getPersonList().size()));
            }
            else if (answer.toUpperCase().charAt(0) == 'E') {
                break;
            }
        }

        System.exit(0);
    }
}
