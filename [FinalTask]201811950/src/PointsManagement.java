import java.util.*;

public class PointsManagement {
	public static void main(String[] args) {
	System.out.println("**����Ʈ ���� ���α׷��Դϴ�**");
	HashMap<String, Integer> cp = new HashMap<String, Integer>();
	Scanner scanner = new Scanner(System.in);
	
	String name; Integer point;
	System.out.print("�̸��� ����Ʈ �Է�>>");
	name=scanner.next();
	
	while (!(name.equals("exit"))){
		point=scanner.nextInt();
		if(cp.containsKey(name)) point=point+cp.get(name);
		cp.put(name,point);
		Set<String> cpList=cp.keySet();
		Iterator<String> it = cpList.iterator();
		while(it.hasNext()) {
			String Consumer = it.next();
			Integer CPoints =cp.get(Consumer);
			System.out.print("("+Consumer+","+CPoints+")");
		}System.out.print('\n');
		System.out.print("�̸��� ����Ʈ �Է�>>");
		name=scanner.next();
	}	
	
	System.out.println("���α׷��� �����մϴ�....");

	
	}
}
