import java.time.LocalDate;

public class Fitness {
    String name;
    LocalDate birthday;
    String email;
    String number;
    String surname;
    int weight;
    int pressure;
    int steps;
    int age;


    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getEmail() {
        return email;
    }

    public String getNumber() {
        return number;
    }

    public int getAge() {
        return age;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public int getSteps() {
        return steps;
    }

    public void setSteps(int steps) {
        this.steps = steps;
    }


    public Fitness(String name, LocalDate birthday, String email, String number, String surname, int weight, int pressure, int steps) {
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.number = number;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.steps = steps;
    }


    public void printAccountInfo() {
        System.out.println("Ім'я: " + name);
        System.out.println("День народження: " + birthday);
        System.out.println("Email: " + email);
        System.out.println("Номер телефону: " + number);
        System.out.println("Прізвище: " + surname);
        System.out.println("Вага: " + weight);
        System.out.println("Тиск: " + pressure);
        System.out.println("Кількість пройдених за день кроків: " + steps);
    }


    public static void main(String[] args) {
        LocalDate birthday1 = LocalDate.of(1997, 7, 30);
        Fitness customer1 = new Fitness("Андрій", birthday1, "andrey@gmail.com", "1234567", "Котляренко", 75, 90, 3500);
        customer1.printAccountInfo();

        System.out.println("------------------------");

        LocalDate birthday2 = LocalDate.of(1984, 11, 3);
        Fitness customer2 = new Fitness("Олег", birthday2, "oleg@gmail.com", "1357903", "Деркач", 87, 90, 12000);
        customer2.printAccountInfo();

        System.out.println("------------------------");

        LocalDate birthday3 = LocalDate.of(1999, 12, 14);
        Fitness customer3 = new Fitness("Артур", birthday3, "arthur@gmail.com", "3446673", "Рейн", 77, 100, 6580);
        customer3.printAccountInfo();

        System.out.println("------------------------");

        LocalDate birthday4 = LocalDate.of(1990, 4, 26);
        Fitness customer4 = new Fitness("Роман", birthday4, "roman@gmail.com", "1238569", "Олейник", 55, 80, 7900);
        customer4.printAccountInfo();

        System.out.println("------------------------");

        LocalDate birthday5 = LocalDate.of(1990, 4, 26);
        Fitness customer5 = new Fitness("Сергій", birthday5, "sergey@gmail.com", "3840736", "Бойко", 94, 100, 15000);
        customer5.printAccountInfo();

        System.out.println("------------------------");
        System.out.println("ЗМІНЕНО: ");
        System.out.println("------------------------");

        customer2.setSurname("Дергач");
        customer2.setWeight(82);
        customer2.setPressure(100);
        customer2.setSteps(12500);
        customer2.printAccountInfo();

        System.out.println("------------------------");

        customer4.setSurname("Олейко");
        customer4.setWeight(65);
        customer4.setPressure(90);
        customer4.setSteps(16000);
        customer4.printAccountInfo();
    }
}