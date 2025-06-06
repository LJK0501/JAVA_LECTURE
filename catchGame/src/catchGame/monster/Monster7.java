package catchGame.monster;

public class Monster7 extends MonsterBase {

	public Monster7() {
		super("뮤츠");
		this.spawnMap = "하늘";
		this.present = "에스퍼 타입 포켓몬 | 난 누구? 난 뮤츠! 근데 아직도 자기 이름 외우는 게 힘든 불사의 진짜 엘리트 포켓몬";
	}

	// 마주쳤을 때
	// 등장멘트
	@Override
	public void appearanceComment() {
		//System.out.println("=========포켓몬 조우=========");
		this.probabilityValue = r.nextInt(3);
		if (this.probabilityValue == 0) {
			System.out.println(this.GREEN + "\"머릿속에 직접 들려오는 목소리… 눈앞에 뮤츠가 나타났다!\"\n" + "➤ \"…이게 너의 최선인가?\"\n" + "(상대가 포켓볼 꺼내기도 전에 멘탈 공격 완료됨.)" + this.RESET);
		} else if (this.probabilityValue == 1) {
			System.out.println(this.GREEN + "\"하늘이 찢기듯 갈라지며 뮤츠 등장! 마치 시간을 조종한 듯한 연출!\"\n"
					+ "➤ \"나는 왜 여기에 있는가... 그리고 넌 왜 긴장을 푸는가?\"\n" + "(뮤츠는 철학 질문을 던지며 전투 시작 전부터 혼란을 유도한다.)" + this.RESET);
		} else {
			System.out.println(this.GREEN + "\"어디선가 들려오는 고요한 목소리… 정신을 차리고 보니 뮤츠가 앞에 서 있다!\"\n" + "➤ \"나는 싸움을 원치 않는다. 단, 이기기 전까진.\"\n"
					+ "(심오한 말투로 등장했지만, 은근히 싸움 좋아하는 타입이다.)" + this.RESET);
		}
		System.out.println();
	}

	// 도망칠 확률 "개별사건"
	// 15% => 3/20
	// 랜덤 값 1~3 나오면 도망, 그외 숫자 안 도망침
	// 반환 값 => 도망칠 때:false | 안도망칠 때:true
	@Override
	public boolean runMonster() {
		this.probabilityValue = r.nextInt(3);

		// 도망칠 때 false
		if (this.r.nextInt(20) + 1 <= 3) {
			System.out.println(this.YELLOW + "=========포켓몬이 도망쳤다!=========" + this.RESET);
			if (this.probabilityValue == 0) {
				System.out.println(this.GREEN + "\"15% 확률로 뮤츠가 갑자기 눈을 감더니 사라졌다!\"\n" + "➤ \"...넌 아직 나를 상대할 준비가 안 됐다.\"\n"
						+ "(그 말과 동시에 자취를 감췄다. 카페 간 걸 수도 있음.)" + this.RESET);
			} else if (this.probabilityValue == 1) {
				System.out.println(this.GREEN + "\"15% 확률로 뮤츠가 순간이동했다! 남은 건 싸늘한 공기와 자괴감뿐!\"\n" + "➤ \"이 시간은… 무의미하다.\"\n"
						+ "(딱 봐도 중2병인데 말은 멋지게 한다.)" + this.RESET);
			} else {
				System.out.println(this.GREEN + "\"15% 확률로 머리속에 뮤츠의 마지막 목소리가 울린다. '그만하자… 나 피곤하다.'\"\n"
						+ "➤ (그리고 뮤츠는 전자기파와 함께 도망쳤다.)\n" + "(진짜 이유는 점심시간이다.)" + this.RESET);
			}
			System.out.println();
			return false;
		}
		// 안 도망칠 때 true
		System.out.println(this.YELLOW + "=========포켓몬이 도망치지 않았다!=========" + this.RESET);
		if (this.probabilityValue == 0) {
			System.out.println(this.GREEN + "\"85% 확률로 뮤츠가 당신을 똑바로 응시하고 있다. 절대 도망칠 생각은 없는 듯하다.\"\n"
					+ "➤ \"네 생각은… 읽었다. 그래도 상대해주지.\"\n" + "(무서운 건데 이상하게 약간 설렌다?)" + this.RESET);
		} else if (this.probabilityValue == 1) {
			System.out.println(this.GREEN + "\"85% 확률로 뮤츠는 미동도 하지 않는다. 그 자리에 서 있는 것만으로 포스가 넘친다.\"\n"
					+ "➤ \"여기서 물러나는 건… 내 존재를 부정하는 것이다.\"\n" + "(자기 정체성까지 걸고 안 도망침. 역시 전설.)" + this.RESET);
		} else {
			System.out.println(this.GREEN + "\"85% 확률로 뮤츠는 눈썹 하나 까딱하지 않고 있다. 사실 눈썹도 없음.\"\n" + "➤ \"이 세계에서 도망칠 건 너다.\"\n"
					+ "(이쯤 되면 누가 주인공인지 헷갈린다.)" + this.RESET);
		}
		System.out.println();
		return true;
	}

	// 잡힐 확률 "개별사건"
	// 25% => 1/4
	// 반환 값 => 잡혔을 때:true | 아닐 때:false
	@Override
	public boolean catchMonster() throws InterruptedException {
		delayTime();
		// 잡혔을 때 true
		if (this.r.nextInt(4) + 1 == 1) {
			System.out.println(this.YELLOW + "=========포켓몬 포획 성공!=========" + this.RESET);
			System.out.println(this.GREEN + "\"25% 확률로 뮤츠가 포켓볼에 갇힌 순간, 전 우주의 지적 생명체들이 충격에 빠졌다!\"\n"
					+ "➤ \"잠깐만… 이거 시뮬레이션 아니야? 나 진짜 잡힌 거야?!\"\n" + "(현실인지 가상현실인지, 뮤츠도 헷갈리는 중.)" + this.RESET);
			System.out.println();
			this.ifCatch = true;
			return true;
		}
		// 안 잡혔을 때 false
		System.out.println(this.YELLOW + "=========포켓몬 포획 실패!=========" + this.RESET);
		System.out.println(this.GREEN + "\"75% 확률로 뮤츠가 볼 안에서 순간이동으로 빠져나왔다! 전설은 갇히지 않는다.\"\n"
				+ "➤ \"넌 나를 가둘 수 없다. 포켓볼도 그렇고, 기대도 마찬가지야.\"\n" + "(명대사 제조기 뮤츠, 탈출하면서도 멘트는 기가 막히다.)" + this.RESET);
		System.out.println();
		return false;
	}

}
