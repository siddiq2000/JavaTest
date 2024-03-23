import java.util.*;
import java.time.*;

class Voter {
    private int id;
    private String name;
    private LocalDate date;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Voter() {
    }

    public Voter(String name, int id, LocalDate date) {
        this.name = name;
        this.id = id;
        this.date = date;
    }

    public Period calculateAge() {
        LocalDate currentDate = LocalDate.now();
        return Period.between(date, currentDate);
    }
}

public class VotingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Voter> al = new ArrayList<Voter>();
        for (int i = 0; i < 3; i++) {
            System.out.println("Enter Voter name, id, birthdate (YYYY-MM-DD)");
            String name = sc.nextLine();
            int id = sc.nextInt();
            sc.nextLine();
            String date = sc.nextLine();
            LocalDate birthdate = LocalDate.parse(date);
            al.add(new Voter(name, id, birthdate));
        }
        ArrayList<Voter> validVoter = new ArrayList<Voter>();
        Iterator<Voter> iterator = al.iterator();
        while (iterator.hasNext()) {
            Voter voter = iterator.next();
            Period age = voter.calculateAge();
            if (age.getYears() >= 18) {
                validVoter.add(voter);
            }
        }
        System.out.println("Valid Voters: ");
        for (Voter v : validVoter) {
            Period age = v.calculateAge();
            System.out.println("Id: " + v.getId() + "\t" + "Name: " + v.getName() + "\t" + "Age: " + age.getYears()
                    + " years " + age.getMonths() + " months " + age.getDays() + " days");
        }
        sc.close();
    }
}