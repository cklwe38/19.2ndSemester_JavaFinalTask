/*7�� �ǽ����� 6�� ����
 * �ؽø��� �̿��� ���� ����Ʈ�� ���� �����ϴ� ���α׷�
 */
import java.util.*;

public class PointsManagement {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("*****����Ʈ ���� ���α׷��Դϴ�*****");
	System.out.println("[1.����Ʈ ����] [2.����Ʈ ��ȸ] [3.ȸ�� Ż��] [4.��üȸ��] [5.����]"+'\n');
	System.out.print("# ��ȣ�� �Է��ϼ���(���ڸ�): ");
	HashMap<String, Integer> cp = new HashMap<String, Integer>();
	int ask = scanner.nextInt();
	String name; Integer point;
	do {
		switch(ask){
		case 1:
			System.out.print("# ������ ȸ�� �� :");
			int num = scanner.nextInt();
			for(int i=0;i<num;i++) {
			System.out.print("["+(i+1)+"]�̸��� ����Ʈ �Է�>>");
			name=scanner.next();
			point=scanner.nextInt();
			if(cp.containsKey(name)) point=point+cp.get(name);//����ȸ���� ����Ʈ ����
			cp.put(name,point);} break;
		case 2:
			System.out.print("��ȸ�� ȸ���̸�>>");
			name=scanner.next();
			System.out.println("("+name+","+cp.get(name)+")"); break;
		case 3:
			System.out.print("Ż���� ȸ���̸�>>");
			cp.remove(name=scanner.next());
			System.out.println(name+"���� ������ �����Ǿ����ϴ�."); break;
		case 4:
			Set<String> cpList=cp.keySet();
			Iterator<String> it = cpList.iterator();
			while(it.hasNext()) {
			String Consumer = it.next();
			Integer CPoints =cp.get(Consumer);
			System.out.print("("+Consumer+","+CPoints+")");}System.out.print('\n'); break;}	
		System.out.print('\n'+"# ��ȣ�� �Է��ϼ���(���ڸ�): ");
		ask = scanner.nextInt();
	} while(ask!=5);
	System.out.println("���α׷��� �����մϴ�.");
	

	}
	
}
