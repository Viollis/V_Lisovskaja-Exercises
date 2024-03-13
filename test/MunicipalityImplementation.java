package lt.techin.municipality.test;

import lt.techin.municipality.IllegalCitizenException;
import lt.techin.municipality.Municipality;
import lt.techin.municipality.Person;
import lt.techin.municipality.PersonPredicate;

import java.time.LocalDate;
import java.time.Period;
import java.util.*;

public class MunicipalityImplementation implements Municipality {

    private List<Person> personList = new ArrayList<>();
    @Override
    public void registerCitizen(Person person) throws IllegalCitizenException {
            if (person.getFirstName() == null || person.getFirstName().isEmpty() ||
                    person.getLastName() == null || person.getLastName().isEmpty() ||
                    person.getDateOfBirth() == null || person.getYearlyIncome() < 0) {
                throw new IllegalCitizenException(person);
            } LocalDate currentData = LocalDate.now();
            if (person.getDateOfBirth().isAfter(currentData)) {
                throw new IllegalCitizenException(person);
            }

        for (Person registerPersonToList : personList){
            if (registerPersonToList.equals(person)) {
                return;
            }
        }
        personList.add(person);
        }


    @Override
    public int getCitizenCount() {
        return personList.size();
    }

    @Override
    public double getAverageCitizenIncome() {
        if(personList.isEmpty()) {
            return 0;
        }
        double totalIncome = 0;
        for (Person person : personList){
            totalIncome += person.getYearlyIncome();
        }
        return totalIncome / personList.size();
    }

    @Override
    public boolean isRegisteredCitizen(Person person) {
        for (Person registeredPerson : personList) {
            if (registeredPerson.equals(person)){
                return true;
            }
        }
        return false;
    }

    @Override
    public Person findOldestPerson() {
        if (personList.isEmpty()) {
            return null;
        }
        Person oldestPerson = personList.get(0);
        LocalDate oldestBirthdate = oldestPerson.getDateOfBirth();
        for (int i = 1; i < personList.size(); i++) {
            Person currentPerson = personList.get(i);
            LocalDate currentBirthdate = currentPerson.getDateOfBirth();
            if (currentBirthdate.isBefore(oldestBirthdate)) {
                oldestPerson = currentPerson;
                oldestBirthdate = currentBirthdate;
            }
        }
        return oldestPerson;
    }

    @Override
    public int countAdultCitizens() {
        int adultCount = 0;
        LocalDate currentDate = LocalDate.now();
        for (Person person : personList){
            int age = Period.between(person.getDateOfBirth(), currentDate).getYears();
            if (age > 18){
                adultCount++;
            }
        }
        return adultCount;
    }

    @Override
    public double totalIncomeInTaxes() {
        double totalTaxIncome = 0.0;
        for (Person person : personList){
            double income = person.getYearlyIncome();
            double taxRate = 0;
            if (income < 14000) {
            }else if (income > 1000000) {
                taxRate = 0.16;
            } else {
                taxRate = 0.15;
            }
            totalTaxIncome += income * taxRate;
        }
        return totalTaxIncome;
    }

    @Override
    public Collection<Person> findCitizensBy(PersonPredicate personPredicate) {
        return null;
    }



    @Override
    public Collection<Person> getOrderedCitizens() {
        return null;

    }

    @Override
    public Map<Integer, List<Person>> groupByYearOfBirth() {
        for (Person person : personList){
            int yearOfBirth = person.getDateOfBirth().getDayOfYear();
            List<Person> personByYear = groupByYearOfBirth().getOrDefault(yearOfBirth, new ArrayList<>());
            personByYear.add(person);
            groupByYearOfBirth().put(yearOfBirth, personByYear);
        }
        return groupByYearOfBirth();
    }
}
