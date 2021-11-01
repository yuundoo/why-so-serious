package Quiz;

public class SalaryMan {
	//필드
	int salary = 1000000; 
	//생성자
	public SalaryMan() {
	}
	public SalaryMan(int salary) {
		this.salary = salary;
	}
	//메소드
	public int  getAnnualGross() {
		return salary*12 + salary*5;
	}
	
	
	
	}
	
