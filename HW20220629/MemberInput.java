package p2022_06_29;

import java.util.Scanner;

class MemberInfo {

	private String name;
	private int age;
	private String email;
	private String address;

	// 생성자
	public MemberInfo(String name, int age, String email, String address) {
		this.name = name;
		this.age = age;
		this.email = email;
		this.address = address;
	}

	// 메소드
	public void print() {
		System.out.println("이름 : " + name + " 나이 : " + age + " 이메일 : " + email + " 주소 : " + address);
	}

}

public class MemberInput {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		MemberInfo[] members = new MemberInfo[3];

		for (int i = 0; i < members.length; i++) {
			// 입력받기
			System.out.println("--" + (i + 1) + "번째 사람--");
			System.out.print("이름 > ");
			String name = sc.nextLine();

			System.out.print("나이 > ");
			int age = sc.nextInt();

			sc.nextLine(); // 엔터가 값으로 입력되는걸 막기위해서

			System.out.print("이메일 > ");
			String email = sc.nextLine();

			System.out.print("주소 > ");
			String address = sc.nextLine();

			// 저장하기
			members[i] = new MemberInfo(name, age, email, address);

		}

		for (int i = 0; i < members.length; i++) {
			members[i].print();
		}

	}

}
