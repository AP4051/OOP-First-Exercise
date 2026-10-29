public class Main {
    public static void main(String[] args) {
        Employee[] employees = {
                new FullTimeEmployee("2021", "Ali",3000,500,200),
                new PartTimeEmployee("2022","sara",40,25)
        };

        for (Employee e : employees) {
            e.displayInfo();
        }
    }
}