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
				System.out.println(name+"님의 체지방률은 "+bodyFat);
			}

			else if (gender == "woman") {
				bodyFat =  (float) ((1.07 * weight) - ((128 * weight) / height));
				System.out.println(name+"님의 체지방률은 "+bodyFat);
			}

			else {
				System.out.println("성별이 올바르지 않습니다.");
			}
		} else {
			System.out.println("체지방 검사는 16세 이상부터 할 수 있습니다.");
		}
	}
	
	
	public String extend(int extendPT) {
		if (extendPT % 10 == 0) {
			this.extendPT = extendPT;
			contractCal();
			if (extendPT > 50) {
				return "PT이용을 " + extendPT + " 더 연장하셨습니다. 이제 횟수는" + contractPT
						+ "일 입니다 50번 이상 구매 회원권은 서비스로 40번 가격만 수납하시면 됩니다.";
			} else {
				return "PT이용을 " + extendPT + " 더 연장하셨습니다. 이제 남은일수는" + contractPT
						+ "일 입니다 추가비용은 10일 기준 30만원입니다.";
			}
		} else {
			return "PT연장기간은 10일 기준입니다. 다시입력바랍니다. ";
		}
	}

	public String showMemberInfo() {
		return "이름:" + name + " 성별:" + gender + " 나이:" + age + "\n핸드폰 번호:" + phoneNumber + " 회원 구분:" + dvision
				+ "\n남은 PT횟수:" +contractPT;
	}

	public String showMemberUseInfo() {
		return "PT를 이용하시는 고객은 락커와 샤워시설과 운동복은 무료입나다.";
	}
}
