package constructor_quiz02;

public class OmrCardTest {

	public static void main(String[] args) {
		// 의식
		
		// OMR 카드    학번, 이름, 정답 마킹   => OMRCARD
		OmrCard omrCard = new OmrCard(20200101, "신보람");
		omrCard.setAnswer(5, 2, 1, 1, 2);
		// OMR READER   점수 몇점???
		OmrCardReader reader = new OmrCardReader(5, 3, 5, 1, 2);
		reader.printScore(omrCard);
	}

}
