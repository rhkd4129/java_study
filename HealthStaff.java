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
			System.out.println("Ʈ���̳� ���� ����Ͻô� ȸ������" + teachMembers + "���̰� �޿���" + salary + "���� �Դϴ�");
		}

		else if (jobPlay == "cleaner") {

			System.out.println("û�Һδ� �Ѵޱ��� �޿��� 220�����Դϴ�.");
		} 
		else {
			System.out.println("�� �ｺ�� ������ �ƴϰų� ����� �ȵǾ��ֽ��ϴ�");
		}
	}
	
	public String showMemberUseInfo() {
		if(jobPlay == "cleaner"|| jobPlay == "trainer")
		{
			return "�������� �ü� �̿��� ���� �����ϴ�.";
		}
		else return "�� �ｺ�� ���� �ƴϰų� ����� �� �Ǿ��ֽ��ϴ�";
	}

	public String showMemberInfo() {
		return "�̸�:" + name + " ����:" + gender + " ����:" + age + "\n�ڵ��� ��ȣ:" + phoneNumber + " ����:" + dvision + " �ֿ������:"
				+ jobPlay + " �������Ⱓ��:" + contracRestDays;
	}

}
