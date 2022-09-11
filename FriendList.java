/**
 * FriendList class keeps the whole data related to friends
 * and theri friends too
 */

import java.util.*;
import javax.swing.JOptionPane;

public class FriendList {
    private LinkedList<Person> personList;
    private LinkedList<String> sortedNames = new LinkedList<>();

    /**
     * The FriendList constructor
     */
    public FriendList() {
        this.personList = new LinkedList<>();
    }

    /**
     * The setPersonList method store the value of user defined List
     * @param personList store the data of person
     */
    public void setPersonList(LinkedList<Person> personList) {
        this.personList = personList;
    }

    /**
     * The setSortedNames method store the value of sorted List
     * @param sortedNames store the sorted names in list
     */
    public void setSortedNames(LinkedList<String> sortedNames) {
        this.sortedNames = sortedNames;
    }

    /**
     * The getPersonList method return the list
     * @return the list of a person
     */
    public LinkedList<Person> getPersonList() {
        return personList;
    }

    /**
     * The getSortedNames method return the list
     * @return the list of a sorted names
     */
    public LinkedList<String> getSortedNames() {
        return sortedNames;
    }

    /**
     * The addInFriendList method store the person in the List
     * @param p is the instance of Person
     */
    public void addInFriendList(Person p) {
        this.personList.add(p);
    }

    /**
     * The sortByFirstName method sort the List by First name
     */
    public void sortByFirstName() {
        LinkedList<Person> tempList = new LinkedList<>(personList);
        JOptionPane.showMessageDialog(null, "Friends List sorted by the First Name");
        for (Person person : personList) {
            sortedNames.add(person.getFirstName().toUpperCase());
        }
        Collections.sort(sortedNames);
        int i = 0;
        for (String string : sortedNames) {
            i = 0;
            for (Person person : tempList) {
                if (string.equals(person.getFirstName().toUpperCase())) {
                    JOptionPane.showMessageDialog(null, person);
                    tempList.remove(i);
                    i++;
                    break;
                }
                i++;
            }
        }
        sortedNames.clear();
    }

    /**
     * The sortByLastName method sort the List by last name
     */
    public void sortByLastName() {
        LinkedList<Person> tempList = new LinkedList<>(personList);
        JOptionPane.showMessageDialog(null, "Friends List sorted by the Last Name");
        for (Person person : personList) {
            sortedNames.add(person.getLastName().toUpperCase());
        }
        Collections.sort(sortedNames);
        int i = 0;
        for (String string : sortedNames) {
            i = 0;
            for (Person person : tempList) {
                if (string.equals(person.getLastName().toUpperCase())) {
                    JOptionPane.showMessageDialog(null, person);
                    tempList.remove(i);
                    i++;
                    break;
                }
                i++;
            }
        }
        sortedNames.clear();
    }

    /**
     * The detailFromFirstName store the detail of list by 
     * the first name of a person
     * @param fname store the first name of a person
     */
    public void detailFromFirstName(String fname) {
        int i = 0;
        for (Person person : this.personList) {
            if (person.getFirstName().equalsIgnoreCase(fname)) {
                JOptionPane.showMessageDialog(null, person);
                i++;
            }
        }
        if (i == 0) {
            JOptionPane.showMessageDialog(null, String.format("Oops you don't have any friend with name %s", fname));
        }
    }

    /**
     * The detailFromLastName store the detail of list by
     * the lat name of a person
     * @param lname store the last name of a person
     */
    public void detailFromLastName(String lname) {
        int i = 0;
        for (Person person : this.personList) {
            if (person.getLastName().equalsIgnoreCase(lname)) {
                JOptionPane.showMessageDialog(null, person);
                i++;
            }
        }
        if (i == 0) {
            JOptionPane.showMessageDialog(null, String.format("Oops you don't have any friend with name %s", lname));
        }
    }
    
    /**
     * The detailFromCellNumber method store the detail by
     * last name of a person
     * @param cell_number
     */
    public void detailFromCellNumber(String cell_number) {
        int i = 0;
        for (Person person : this.personList) {
            if (person.getCellNumber().equalsIgnoreCase(cell_number)) {
                JOptionPane.showMessageDialog(null, person);
                i++;
            }
        }
        if (i == 0) {
            JOptionPane.showMessageDialog(null, String.format("Oops you don't have any friend with cell number %s", cell_number));
        }
    }

    /**
     * The removeFromList method remove the details of
     * a person from the List
     * @param fname store the first name of a person
     * @param lname store the last name of a person
     */
    public void removeFromList(String fname, String lname) {
        int i = 0;
        for (Person person : this.personList) {
            if (person.getFirstName().equalsIgnoreCase(fname) && person.getLastName().equalsIgnoreCase(lname))
                break;
            i++;
        }
        if (i >= 0 && i < personList.size()) {
            personList.remove(i);
            JOptionPane.showMessageDialog(null, "!!!Removed Successfully!!!");
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("Oops you don't have any friend whose name is %s %s", fname, lname));
        }
    }

    /**
     * The listByBornMonth method accessed by the birth of month
     * of a person
     * @param month store the birth of month of a person
     */
    public void listByBornMonth(int month) {
        if (month == 1)
            JOptionPane.showMessageDialog(null, "List of Friends born in January");
        else if (month == 2)
            JOptionPane.showMessageDialog(null, "List of Friends born in February");
        else if (month == 3)
            JOptionPane.showMessageDialog(null, "List of Friends born in March");
        else if (month == 4)
            JOptionPane.showMessageDialog(null, "List of Friends born in April");
        else if (month == 5)
            JOptionPane.showMessageDialog(null, "List of Friends born in May");
        else if (month == 6)
            JOptionPane.showMessageDialog(null, "List of Friends born in June");
        else if (month == 7)
            JOptionPane.showMessageDialog(null, "List of Friends born in July");
        else if (month == 8)
            JOptionPane.showMessageDialog(null, "List of Friends born in August:");
        else if (month == 9)
            JOptionPane.showMessageDialog(null, "List of Friends born in September");
        else if (month == 10)
            JOptionPane.showMessageDialog(null, "List of Friends born in October");
        else if (month == 11)
            JOptionPane.showMessageDialog(null, "List of Friends born in November");
        else if (month == 12)
            JOptionPane.showMessageDialog(null, "List of Friends born in December");

        for (int i = 1; i <= 31; i++) {
            for (Person person : this.personList) {
                if (person.getMonth() == month) {
                    if (i == person.getDay())
                        JOptionPane.showMessageDialog(null, person);
                }
            }
        }
    }

    /**
     * The editListDetails method edit the List by the
     * first and last name of a person
     * @param fname store the first name of a person
     * @param lname store the last name of a person
     */
    public void editListDetalis(String fname, String lname) {
        int i = 0;
        for (Person person : this.personList) {
            if (person.getFirstName().equalsIgnoreCase(fname)
                    && person.getLastName().equalsIgnoreCase(lname)) {
                while (true) {
                    String choice = JOptionPane.showInputDialog(null, "Enter the operation:\nEdit First Name(F)\nLast Name(L)\n" + 
                                                                     "Cell Number(C)\nBirth Month(M)\nBirth Day(D)");
                    if (choice.toUpperCase().charAt(0) == 'F') {
                        JOptionPane.showMessageDialog(null, String.format("First Name: %s", person.getFirstName()));
                        String new_fname = JOptionPane.showInputDialog(null, "Enter New First Name");
                        person.setFirstName(new_fname);
                        JOptionPane.showMessageDialog(null, "!!!Your List is Updated!!!");
                    }
                    else if (choice.toUpperCase().charAt(0) == 'L') {
                        JOptionPane.showMessageDialog(null, String.format("Last Name: %s", person.getLastName()));
                        String new_lname = JOptionPane.showInputDialog(null, "Enter New Last Name");
                        person.setFirstName(new_lname);
                        JOptionPane.showMessageDialog(null, "!!!Your List is Updated!!!");
                    }
                    else if (choice.toUpperCase().charAt(0) == 'C') {
                        JOptionPane.showMessageDialog(null, String.format("Cell Number: %s", person.getCellNumber()));
                        String new_cell_number = JOptionPane.showInputDialog(null, "Enter New Cell Number");
                        person.setFirstName(new_cell_number);
                        JOptionPane.showMessageDialog(null, "!!!Your List is Updated!!!");
                    }
                    else if (choice.toUpperCase().charAt(0) == 'M') {
                        JOptionPane.showMessageDialog(null, String.format("Birth Month: %d", person.getMonth()));
                        String new_month = JOptionPane.showInputDialog(null, "Enter New Birth Month");
                        int month = Integer.parseInt(new_month);
                        person.setMonth(month);
                        JOptionPane.showMessageDialog(null, "!!!Your List is Updated!!!");
                    }
                    else if (choice.toUpperCase().charAt(0) == 'D') {
                        JOptionPane.showMessageDialog(null, String.format("Birth Day: %d", person.getDay()));
                        String new_day = JOptionPane.showInputDialog(null, "Enter New Birth Day");
                        int day = Integer.parseInt(new_day);
                        person.setMonth(day);
                        JOptionPane.showMessageDialog(null, "!!!Your List is Updated!!!");
                    }
                    i++;
                    String ch = JOptionPane.showInputDialog(null, "To Update anything else in the List\n Enter: 'Y'(Yes), 'N'(NO)");
                    if (ch.toUpperCase().charAt(0) != 'Y')
                        break;
                }
            }
        }
        if (i == 0) {
            JOptionPane.showMessageDialog(null, "Oops you don't have any friends in the List as per details given by you");
        }
    }

    /**
     * The getTotalFriends method store the total friends
     * of the user
     * @return the total friends
     */
    public int getTotalFriends() {
        return personList.size();
    }

    /**
     * The removeShaneFromList method remove the all person
     * with First Name Shane
     * @param fname store the First Name of a Person
     */
    public void removeShaneFromList(String fname) {
        int i = 0;
        while (i < getTotalFriends()) {
            for (Person person : this.personList) {
                if (person.getFirstName().compareTo(fname) == 0) {
                    personList.remove(i);
                    break;
                }
                i++;
            }    
        }
        if (i >= 0) {
            JOptionPane.showMessageDialog(null, "!!!Removed Successfully!!!");
        }
        else {
            JOptionPane.showMessageDialog(null, String.format("Oops you don't have any friend whose First Name is %s", fname));
        }
    }
}