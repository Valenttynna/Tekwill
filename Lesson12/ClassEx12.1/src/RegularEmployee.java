public class RegularEmployee extends Employee {
    protected long salary;
    protected String hireDate;

    public RegularEmployee(String name, String birthDate, long salary, String hireDate) {
        super(name, birthDate);
        this.salary = salary;
        this.hireDate = hireDate;
    }
}
