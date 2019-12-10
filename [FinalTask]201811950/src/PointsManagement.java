/*7장 실습문제 6번 변형
 * 해시맵을 이용한 고객의 포인트를 누적 관리하는 프로그램
 */
import java.util.*;

public class PointsManagement {
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("*****포인트 관리 프로그램입니다*****");
	System.out.println("[1.포인트 적립] [2.포인트 조회] [3.회원 탈퇴] [4.전체회원] [5.종료]"+'\n');
	System.out.print("# 번호를 입력하세요(숫자만): ");
	HashMap<String, Integer> cp = new HashMap<String, Integer>();
	int ask = scanner.nextInt();
	String name; Integer point;
	do {
		switch(ask){
		case 1:
			System.out.print("# 적립할 회원 수 :");
			int num = scanner.nextInt();
			for(int i=0;i<num;i++) {
			System.out.print("["+(i+1)+"]이름과 포인트 입력>>");
			name=scanner.next();
			point=scanner.nextInt();
			if(cp.containsKey(name)) point=point+cp.get(name);//기존회원은 포인트 누적
			cp.put(name,point);} break;
		case 2:
			System.out.print("조회할 회원이름>>");
			name=scanner.next();
			System.out.println("("+name+","+cp.get(name)+")"); break;
		case 3:
			System.out.print("탈퇴할 회원이름>>");
			cp.remove(name=scanner.next());
			System.out.println(name+"님의 정보가 삭제되었습니다."); break;
		case 4:
			Set<String> cpList=cp.keySet();
			Iterator<String> it = cpList.iterator();
			while(it.hasNext()) {
			String Consumer = it.next();
			Integer CPoints =cp.get(Consumer);
			System.out.print("("+Consumer+","+CPoints+")");}System.out.print('\n'); break;}	
		System.out.print('\n'+"# 번호를 입력하세요(숫자만): ");
		ask = scanner.nextInt();
	} while(ask!=5);
	System.out.println("프로그램을 종료합니다.");
	

	}
	
}
