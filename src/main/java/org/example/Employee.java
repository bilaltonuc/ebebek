package org.example;


    public class Employee {
        private String name;
        private double salary;
        private double workHours;
        private int hireYear;

        public Employee(String name, double salary, double workHours, int hireYear) {
            this.name = name;
            this.salary = salary;
            this.workHours = workHours;
            this.hireYear = hireYear;
        }

        public double tax(){
            if (salary<0){throw new RuntimeException("Lütfen geçerli değer giriniz");}
            double taxPaid = (salary<1000? 0:salary*0.03);
            return taxPaid;
        }

        public double bonus(){
            double bonusSalary=0;
            if (workHours<=40 && workHours>0){ bonusSalary=0;
            }else if (workHours>40 && workHours<=72){
                bonusSalary=(workHours-40)*30;
            }else{throw new RuntimeException("Lütfen hocam naptın bu kadar calısılır mı !!!");}
            return bonusSalary;
        }

        public double raiseSalary(){
            double raiseSalary=0;
            if (hireYear>2021 || hireYear<1960){throw new RuntimeException("...");}
            double bonusSalary= bonus();
            double taxPaid= tax();
            double totalSalary=salary+bonusSalary+taxPaid;
            int totalYear= 2021-hireYear;
            if (totalYear<10){raiseSalary=totalSalary*0.05;}
            else if (20>totalYear && totalYear>9){raiseSalary=totalSalary*0.1;}
            else {raiseSalary=totalSalary*0.15;}
            return raiseSalary;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public double getWorkHours() {
            return workHours;
        }

        public void setWorkHours(double workHours) {
            this.workHours = workHours;
        }

        public int getHireYear() {
            return hireYear;
        }

        public void setHireYear(int hireYear) {
            this.hireYear = hireYear;
        }

        @Override
        public String toString() {
            return "Employee{" + "name='" + name + '\'' + ", salary= " + salary +
                    ", workHours= " + workHours + ", hireYear= " + hireYear + ", tax= " + tax() +
                    ", bonus= " + bonus() + ", raise salary= "+ raiseSalary() +
                    ", salary with tax and bonus= " + (salary+tax()+bonus()) +
                    ", total salary= " + (salary+tax()+bonus()+raiseSalary())+
                    '}';
        }
    }

