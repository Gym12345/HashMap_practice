
package java0206;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Ex05 {
	
	public static void main(String[] args) {
		try (Scanner scan = new Scanner(System.in)) {
			System.out.println("enter your name:");
			String userName=scan.next();
			
			Map<String,Student_score> Student_info=new HashMap<>();
			
			Student_info.put("kim", new Student_score(90,80,50));
			Student_info.put("lee", new Student_score(80,70,60));
			Student_info.put("choi",new Student_score(60,90,40));
			
			if(Student_info.containsKey(userName)) {
				Student_score student_score = Student_info.get(userName);
    //hashMapArray.get(key)�� userName �� Ű������ �������ִ� �ε����� value ���� �ٺҷ����°���
			
				
				System.out.println("Student_score [math_score=" + student_score.getMath_score() + ","
						+ " eng_score=" + student_score.getEng_score() + ", kor_score=" + student_score.getKor_score()
						+ "]");  
				//���⼭ student_score.getMath_score() ��ǻ� userName.getMath_score() �� ���ٰ� �����ϸ� ��
				
				
			}
		}

		
		
		
	}

	

}

	



