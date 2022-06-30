package p2022_06_30;

import java.util.Scanner;

class NewMemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;


	
	//setters
	public void setName(String name) {
		this.name = name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setAddress(String address) {
		this.address = address;
	}


	// 메소드
	public void print() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 이메일 : " + email + " 주소 : " + address);
	}
}

public class NewMemberInput {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int i;
		// 멤버들을 저장할 객체배열
		NewMemberInfo[] members = new NewMemberInfo[5];

		for (i = 0; i < members.length; i++) {
			// 입력받기
			
			// 객체배열
			members[i] = new NewMemberInfo();	
			
			System.out.println("--" + (i + 1) + "번째 사람--");
			System.out.print("이름 > ");
			String name = sc.nextLine();
			members[i].setName(name);
			
			System.out.print("나이 > ");
			int age = sc.nextInt();
			members[i].setAge(age);
			
			sc.nextLine(); // 엔터가 값으로 입력되는걸 막기위해서

			System.out.print("이메일 > ");
			String email = sc.nextLine();
			members[i].setEmail(email);
			
			System.out.print("주소 > ");
			String address = sc.nextLine();
			members[i].setAddress(address);

			
			// 더 입력받을지 물어보기
			System.out.println("계속 입력하시겠습니까? y 또는 n");
			String a = sc.nextLine();
			
			if (a.equals("y") || a.equals("Y") ) {
				continue;
			}else if(a.equals("n") || a.equals("N")) {
				break;
			}

		}

		// 들어있는 만큼 출력
		for (int j = 0; j < (i + 1); j++) {
			members[j].print();
		}

	}
}
