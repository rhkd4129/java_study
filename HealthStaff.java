package mid_report_1821028;

public class HealthStaff extends HealthMember {

	int contracRestDays;
	String jobPlay;
	int teachMembers;
	int salary;

	public HealthStaff(String name, String phoneNumber, String gender, int age, String jobPlay, int contractRestDays) {
		super(name, phoneNumber, gender, age);
		this.jobPlay = jobPlay;
		this.contracRestDays = contractRestDays;
		dvision = "Staff";

	}

	
	public void staffSalary(int teachMembers) {
		if (jobPlay == "trainer") {
			salary = 140 + teachMembers * 25;
			System.out.println("트레이너 분이 담당하시는 회원수는" + teachMembers + "명이고 급여는" + salary + "만원 입니다");
		}

		else if (jobPlay == "cleaner") {

			System.out.println("청소부는 한달기준 급여는 220만원입니다.");
		} 
		else {
			System.out.println("이 헬스장 직원이 아니거나 등록이 안되어있습니다");
		}
	}
	
	public String showMemberUseInfo() {
		if(jobPlay == "cleaner"|| jobPlay == "trainer")
		{
			return "직원들은 시설 이용료는 따로 없습니다.";
		}
		else return "이 헬스장 직원 아니거나 등록이 안 되어있습니다";
	}

	public String showMemberInfo() {
		return "이름:" + name + " 성별:" + gender + " 나이:" + age + "\n핸드폰 번호:" + phoneNumber + " 구분:" + dvision + " 주요업무는:"
				+ jobPlay + " 남은계약기간은:" + contracRestDays;
	}

}
