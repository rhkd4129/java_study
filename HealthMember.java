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
			return "�ｺ�� �̿��� �ߴ� �ϼ̽��ϴ� ���� �̿��"+contractDays + "���̰� ȯ�ұݾ��� ���� �Ͽ��� 80%�� ȯ�� ó�� �˴ϴ�.";
		} else
			return "�̿���� 15�� ���Ϸ� ���� �־ ȯ���� ��ƽ��ϴ�.";
	}
	
	

	public String extend(int extendDays) {
		if (extendDays % 30 == 0) {
			this.extendDays = extendDays;
			cotractCal();
			if (extendDays > 360) {
				
				return "�ｺ�̿��� " + extendDays + "�� �� �����ϼ̽��ϴ�. ���� �����ϼ���" + contractDays
						+ "�� �Դϴ� 1�� ȸ������ ���񽺷� 11����ġ ���ݸ� �����Ͻø� �˴ϴ�.";
			} else {
				return "�ｺ�̿��� " + extendDays + "�� �� �����ϼ̽��ϴ�. ���� �����ϼ���" + contractDays + "�� �Դϴ� �߰������ 30�� ���� 13�����Դϴ�.";
			}
		} else {
			return "�ｺ �̿��� ���� �� ���� 30�� �����Դϴ�. �ٽ��Է¹ٶ��ϴ�. ";
		}
	}

	public String showMemberUseInfo() {
			cotractCal();
		if (contractDays > 100) {
			return "100�� �̻� �̿���� �����ϴ� ���� ��Ŀ�� �����ü� ����� �����Դϴ�";

		} else
			return "ȸ������ ��Ŀ�� �����ü� ��� �뿩 ���񽺿� ����� �ȵǾ� �ֽ��ϴ�. " + "���� ����Ͻô� ��� ī���Ϳ� �����Ͻʽÿ�";
	}

	public String showMemberInfo() {
		return "�̸�:" + name + " ����:" + gender + " ����:" + age + "\n�ڵ�����ȣ:" + phoneNumber + " ȸ������:" + dvision
				+ "\n�̿�Ⱓ:" + contractDays ;
	}

}
