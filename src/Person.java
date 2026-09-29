public class Person implements Comparable<Person> {
    public String name;
    public String surname;

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //Method to get full name
    public String getFullName() {
        return name + " "  + surname;
    }

    @Override
    public int compareTo(Person o) {
        if (this.surname.compareTo(o.surname) > 0) {
            return 1;
        }else if (this.surname.compareTo(o.surname) == 0) {
            if (this.name.compareTo(o.name) > 0) {
                return 1;
            } else if (this.name.compareTo(o.name) == 0) {
                return 0;
            }
        }
        return -1;
    }
}
/*
Person temp;
// Sorting strings using bubble sort
        for (int j = 0; j < n - 1; j++) {
        for (int i = j + 1; i < n; i++) {
        if (people[j].surname.compareTo(people[i].surname) > 0) {
temp = people[j];
people[j] = people[i];
people[i] = temp;
                }else if (people[j].surname.compareTo(people[i].surname) == 0) {
        if (people[j].name.compareTo(people[i].name) > 0) {
temp = people[j];
people[j] = people[i];people[i] = temp;
                    }
                            }
                            }
                            }

 */