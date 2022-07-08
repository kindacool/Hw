package p2022_07_08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListMemberInfo {
	private String name;
	private int age;
	private String email;
	private String address;

	// setters
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

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
}

public class ListMemberInput {

	public static void main(String[] args) {

		// 멤버들을 저장할 자료구조
		List<ListMemberInfo> members = new ArrayList<ListMemberInfo>();
		Scanner sc = new Scanner(System.in);
		String yn;

		// 입력받기
		do {
			System.out.println("--" + (members.size() + 1) + "번째 사람 입력--");
			System.out.print("이름 > ");
			String name = sc.nextLine();

			System.out.print("나이 > ");
			int age = sc.nextInt();
			sc.nextLine();

			System.out.print("이메일 > ");
			String email = sc.nextLine();

			System.out.print("주소 > ");
			String address = sc.nextLine();

			ListMemberInfo m = new ListMemberInfo();

			m.setName(name);
			m.setAge(age);
			m.setEmail(email);
			m.setAddress(address);

			// 리스트에 추가
			members.add(m);

			System.out.print("계속할려면 y, 멈출려면 n을 입력?");
			yn = sc.nextLine();

			if (yn.equals("y") || yn.equals("Y")) {
				continue;
			} else if (yn.equals("n") || yn.equals("N")) {
				break;
			}

		} while (true);

		for (int j = 0; j < members.size(); j++) {
			System.out.println("--" + (j + 1) + "번째 사람 출력--");
			System.out.println("성명 : " + members.get(j).getName());
			System.out.println("나이 :" + members.get(j).getAge());
			System.out.println("E-Mail : " + members.get(j).getEmail());
			System.out.println("주소 : " + members.get(j).getAddress());
		}

	}
}
