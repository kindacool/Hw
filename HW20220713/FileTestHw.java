package p2022_07_13;

// File 클래스는 데이터들이 입.출력 하면서 사용하는 파일이나
// 디렉토리 체제를 관리하는 클래스임.

import java.io.*;

public class FileTestHw {

	public static void main(String[] args) {
		try {
			File tempFileHw = new File("testhw");
			System.out.println("create directory state : " + tempFileHw.mkdirs());
			
			// 2. 비어있지 않는 디렉토리 삭제(과제)
			File[] fileList = tempFileHw.listFiles();
			for (int i = 0; i < fileList.length; i++) {
				fileList[i].delete();
			}
			tempFileHw.delete();
			
		} catch (Exception e) {
		}
	}
}