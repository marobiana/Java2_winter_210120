package constructor_quiz02;

public class OmrCard {
	// 속성: 필드
	private int studentNo;
	private String name;
	private int[] answers = new int[5];   // 학생이 입력한 정답
	
	// 메소드
	public OmrCard(int studentNo, String name) {
		this.studentNo = studentNo;
		this.name = name;
	}
	
	public void setAnswer(int a1, int a2, int a3, int a4, int a5) {
		this.answers[0] = a1;
		this.answers[1] = a2;
		this.answers[2] = a3;
		this.answers[3] = a4;
		this.answers[4] = a5;
	}

	public int getStudentNo() {
		return studentNo;
	}

	public String getName() {
		return name;
	}

	public int[] getAnswers() {
		return answers;
	}
}




