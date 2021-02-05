package constructor_quiz02;

public class OmrCardReader {
	private int[] realAnswer = new int[5];
	
	// 진짜 정답을 '사용자'로부터 입력 받음 => 확장성을 위해서
	public OmrCardReader(int r1, int r2, int r3, int r4, int r5) {
		this.realAnswer[0] = r1;
		this.realAnswer[1] = r2;
		this.realAnswer[2] = r3;
		this.realAnswer[3] = r4;
		this.realAnswer[4] = r5;
	}
	
	// OMR CARD에 적힌 사람의 정보와 점수 출력
	public void printScore(OmrCard omrCard) {
		System.out.println("이름: " + omrCard.getName());
		System.out.println("학번: " + omrCard.getStudentNo());
		int score = 0;
		for (int i = 0; i < this.realAnswer.length; i++) {
			int[] answers = omrCard.getAnswers();
			if (this.realAnswer[i] == answers[i]) {
				score += 100 / this.realAnswer.length;
			}
		}
		System.out.println("점수:" + score);
	}
}





