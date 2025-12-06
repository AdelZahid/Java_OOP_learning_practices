import java.util.*;

class Employe {
  private String firstname;
  private String lastname;
  private double salary;

  Employe(String fn, String ln, double s) {
    this.firstname = fn;
    this.lastname = ln;
     if (s < 0.0) {
      this.salary = 0;
    } else {
      this.salary = s;
    }
  }

  public void setfn(String fn) {
    this.firstname = fn;
  }

  public void setln(String ln) {
    this.lastname = ln;
  }

  public void setsalary(double s) {
    if (s < 0.0) {
      this.salary = 0;
    } else {
      this.salary = s;
    }
  }

  public String getfn() {
    return this.firstname;
  }

  public String getln() {
    return this.lastname;
  }
  public double getsalary() {
    return this.salary;
    }

  public void increase() {
    salary += (salary * (.1));
  }

  public void printinfo() {
    System.out.println("First Name: " + getfn());
    System.out.println("Last Name: " + getln());
    System.out.println("Salary: " + getsalary());
  }
}

public class EmployeeTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double n, m;
    n = sc.nextDouble();
    m = sc.nextDouble();
    Employe e1 = new Employe("Nadir", "Alis", n);
    Employe e2 = new Employe("Hadi", "BC", m);
    e1.printinfo();
    e2.printinfo();
    e1.increase();
    e1.printinfo();
    e2.increase();
    e2.printinfo();
  }

}
