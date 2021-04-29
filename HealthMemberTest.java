package mid_report_1821028;
import java.util.ArrayList;

public class HealthMemberTest {

	ArrayList<HealthMember> HealthMemberList = new ArrayList<HealthMember>(); // HealthMember Type array ����

	public static void main(String[] args) {

		HealthMemberTest aTest = new HealthMemberTest();
	
		aTest.addHealthMember();
		aTest.MemberShow();
		aTest.testUP();
		aTest.testDown();

	}
	public void addHealthMember() {
		HealthMember Lee = new HealthMember("Lee", "010", "man", 20, 150);
		HealthMember Kim = new HealthMember("Kim", "011", "waman", 25, 90);
		// �� ĳ����
		// PTMmber -> HealthMember
		HealthMember kag = new PTMember("kag", "012", "man", 30, 78, 180, 12);
		HealthMember Sin = new PTMember("Sin", "013", "woman", 24, 61, 168, 20);

		// HealthStaff -> HealthMember
		HealthMember Jo = new HealthStaff("JO", "014", "woman", 45, "cleaner", 500);
		HealthMember Hong = new HealthStaff("Hong", "015", "man", 35, "trainer", 300);

		// HealthMemberList�� �߰�
		HealthMemberList.add(Lee);
		HealthMemberList.add(Kim);
		HealthMemberList.add(kag);
		HealthMemberList.add(Sin);
		HealthMemberList.add(Jo);
		HealthMemberList.add(Hong);
	}

	public void MemberShow(){
		System.out.println("-----------------����Ŭ���� �޼��� ------------------");
		HealthMember Member  = HealthMemberList.get(0);
		System.out.println(Member.showMemberInfo());
		System.out.println(Member.showMemberUseInfo());
		System.out.println(Member.extend(30));
		System.out.println(Member.suspendHealth());
		
		
	}
	public void testUP() {
		System.out.println("----------------�� ĳ���ÿ��� �������̵��� �޼��� ���----------------\n");
		for(int i =2; i<HealthMemberList.size();i++) {
			HealthMember Member = HealthMemberList.get(i);
			System.out.println(Member.showMemberInfo());
			System.out.println(Member.showMemberUseInfo());
			System.out.println();
		}
	}
	
	public void testDown() {
		System.out.println("----------------- �ٿ� ĳ�����Ͽ� �ڱ� �޼ҵ� ���  ------------");
		for( int i=2; i<HealthMemberList.size(); i++)
		{	
			HealthMember name = HealthMemberList.get(i);
			if(name instanceof PTMember)
			{
				PTMember PT = (PTMember)name;
				PT.showBodyFatCalculate();
				
			}
			else if(name instanceof HealthStaff)
			{
				HealthStaff Staff = (HealthStaff)name;
				Staff.staffSalary(20);		
			}
			else System.out.println("type�� �˼� �����ϴ�");	
		}
	}
	
	
	
	
}
