package mid_report_1821028;

public class HealthMember {
	protected String name;
	protected String phoneNumber;
	protected String gender;
	protected int age;
	private int extendDays = 0;
	int contractDays;
	String dvision;

	public HealthMember() {
		memberCondtion();

	}

	public HealthMember(String name, String phoneNumber, String gender, int age, int contractDays) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.gender = gender;
		this.contractDays = contractDays;
		memberCondtion();
	}

	public HealthMember(String name, String phoneNumber, String gender, int age) {
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.age = age;
		this.gender = gender;
	}

	private void memberCondtion() {
		dvision = "normalMember";}

	public String getName() {
		return name;}

	public void setName(String name) {
		this.name = name;}

	public String getPhoneNumber() {
		return phoneNumber;}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;}

	public String getGender() {
		return gender;}

	public void setGender(String gender) {
		this.gender = gender;}

	public int getAge() {
		return age;}

	public void setAge(int age) {
		this.age = age;}
	
	
	public  void cotractCal() {
		contractDays = contractDays + extendDays;
	}
	
	
	public String suspendHealth() {
			cotractCal();
		if (contractDays > 15) {
			return "헬스장 이용을 중단 하셨습니다 남은 이용권"+contractDays + "일이고 환불금액은 남은 일에서 80%만 환불 처리 됩니다.";
		} else
			return "이용권이 15일 이하로 남아 있어서 환불은 어렵습니다.";
	}
	
	

	public String extend(int extendDays) {
		if (extendDays % 30 == 0) {
			this.extendDays = extendDays;
			cotractCal();
			if (extendDays > 360) {
				
				return "헬스이용을 " + extendDays + "일 더 연장하셨습니다. 이제 남은일수는" + contractDays
						+ "일 입니다 1년 회원권은 서비스로 11개월치 가격만 수납하시면 됩니다.";
			} else {
				return "헬스이용을 " + extendDays + "일 더 연장하셨습니다. 이제 남은일수는" + contractDays + "일 입니다 추가비용은 30일 기준 13만원입니다.";
			}
		} else {
			return "헬스 이용을 연장 일 수는 30일 기준입니다. 다시입력바랍니다. ";
		}
	}

	public String showMemberUseInfo() {
			cotractCal();
		if (contractDays > 100) {
			return "100일 이상 이용권을 구매하는 고객은 락커와 샤워시설 운동복은 무료입니다";

		} else
			return "회원님은 락커와 샤워시설 운동복 대여 서비스에 등록이 안되어 있습니다. " + "따로 등록하시는 경우 카운터에 문의하십시요";
	}

	public String showMemberInfo() {
		return "이름:" + name + " 성별:" + gender + " 나이:" + age + "\n핸드폰번호:" + phoneNumber + " 회원구분:" + dvision
				+ "\n이용기간:" + contractDays ;
	}

}
