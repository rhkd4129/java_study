package mid_report_1821028;

public class PTMember extends HealthMember {
	private int weight;
	private int height;
	private float bodyFat;
	int extendPT;
	int contractPT;
	public PTMember(String name, String phoneNumber, String gender, int age, int weight, int height,int contractPT) {
		super(name, phoneNumber, gender, age);
		this.weight = weight;
		this.height = height;
		this.contractPT = contractPT;
		dvision = "PTMember";
	}
	
	public int getWeight() {
		return weight;}


	public void setWeight(int weight) {
		this.weight = weight;}

	public int getHeight() {
		return height;}

	public void setHeight(int height) {
		this.height = height;}


	public float getBodyFat() {
		return bodyFat;}

	public void setBodyFat(float bodyFat) {
		this.bodyFat = bodyFat;
	}

	public  void contractCal() {
		contractPT = contractPT + extendPT;
	}

	public void showBodyFatCalculate() {
		if (age > 16) {
			if (gender == "man") {
				bodyFat = (float) ((1.10 * weight)- ((128 * weight) / height));
				System.out.println(name+"���� ü������� "+bodyFat);
			}

			else if (gender == "woman") {
				bodyFat =  (float) ((1.07 * weight) - ((128 * weight) / height));
				System.out.println(name+"���� ü������� "+bodyFat);
			}

			else {
				System.out.println("������ �ùٸ��� �ʽ��ϴ�.");
			}
		} else {
			System.out.println("ü���� �˻�� 16�� �̻���� �� �� �ֽ��ϴ�.");
		}
	}
	
	
	public String extend(int extendPT) {
		if (extendPT % 10 == 0) {
			this.extendPT = extendPT;
			contractCal();
			if (extendPT > 50) {
				return "PT�̿��� " + extendPT + " �� �����ϼ̽��ϴ�. ���� Ƚ����" + contractPT
						+ "�� �Դϴ� 50�� �̻� ���� ȸ������ ���񽺷� 40�� ���ݸ� �����Ͻø� �˴ϴ�.";
			} else {
				return "PT�̿��� " + extendPT + " �� �����ϼ̽��ϴ�. ���� �����ϼ���" + contractPT
						+ "�� �Դϴ� �߰������ 10�� ���� 30�����Դϴ�.";
			}
		} else {
			return "PT����Ⱓ�� 10�� �����Դϴ�. �ٽ��Է¹ٶ��ϴ�. ";
		}
	}

	public String showMemberInfo() {
		return "�̸�:" + name + " ����:" + gender + " ����:" + age + "\n�ڵ��� ��ȣ:" + phoneNumber + " ȸ�� ����:" + dvision
				+ "\n���� PTȽ��:" +contractPT;
	}

	public String showMemberUseInfo() {
		return "PT�� �̿��Ͻô� ���� ��Ŀ�� �����ü��� ����� �����Գ���.";
	}
}
