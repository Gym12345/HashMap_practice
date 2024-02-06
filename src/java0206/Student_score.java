package java0206;

public class Student_score {
	
	private int math_score, eng_score, kor_score;
	
	public Student_score(int math_score, int eng_score, int kor_score) {
		super();
		this.math_score = math_score;
		this.eng_score = eng_score;
		this.kor_score = kor_score;
	}
	
	public Student_score() {
		// TODO Auto-generated constructor stub
	}
	public int getMath_score() {
		return math_score;
	}

	public void setMath_score(int math_score) {
		this.math_score = math_score;
	}

	public int getEng_score() {
		return eng_score;
	}

	public void setEng_score(int eng_score) {
		this.eng_score = eng_score;
	}

	public int getKor_score() {
		return kor_score;
	}

	public void setKor_score(int kor_score) {
		this.kor_score = kor_score;
	}

	
	

}
