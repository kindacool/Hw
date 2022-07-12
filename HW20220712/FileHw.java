package p2022_07_12;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;

public class FileHw {

	public static void main(String[] args) {

		String inputMessage = null;
		FileWriter fw = null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 입력
		System.out.print("입력 > ");
		try {
			inputMessage = br.readLine();
		} catch (Exception e) {
			System.out.println(e.toString());
		}

		// 출력
		try {
			fw = new FileWriter("result.txt");
			fw.write(inputMessage);

		} catch (Exception e) {
			System.out.println(e.toString());
		} finally {
			try {
				if (fw != null) {
					fw.close();
				}
				br.close();
			} catch (Exception e) {

			}
		}

	}

}
