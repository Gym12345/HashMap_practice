자바 구조체와 해쉬맵자료구조를 활용한 간단한 검색 프로그램을 만들어보았다


메모 


주석은 내가 헷갈렷던부분

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
    //hashMapArray.get(key)는 userName 을 키값으로 가지고있는 인덱스의 value 까지 다불러오는거임
			

				System.out.println("Student_score [math_score=" + student_score.getMath_score() + ","
						+ " eng_score=" + student_score.getEng_score() + ", kor_score=" + student_score.getKor_score()
						+ "]");  
				//여기서 student_score.getMath_score() 사실상 userName.getMath_score() 과 같다고 생각하면 됨
				
				
			}
		}

		
		
		
	}

	

}

	

}

