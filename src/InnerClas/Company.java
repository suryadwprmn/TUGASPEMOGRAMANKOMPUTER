package InnerClas;

import java.util.Objects;

public class Company {

     String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee{
        //Inner class
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }


        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Employee employee = (Employee) o;

            return Objects.equals(name, employee.name);
        }

        @Override
        public int hashCode() {
            return name != null ? name.hashCode() : 0;
        }

        public String getCompany(){
            return Company.this.name;

        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Company company = (Company) o;

        return Objects.equals(name, company.name);
    }


}
