package InnerClas;

public class CompanyApp {

    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Surya Dwi Pramana");

        Company.Employee employee = company.new Employee();
        employee.setName("Kharisma Naufal Fauzi");

        System.out.println(company.getName());
        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
        System.out.println(company.equals(employee.getCompany()));// false

    }
}
