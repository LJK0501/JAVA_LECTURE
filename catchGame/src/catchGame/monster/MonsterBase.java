package catchGame.monster;

import java.util.Random;

/// 등장확률
// 땅, 바다, 하늘, 우주(히든)
// 땅3개(피카츄,마자용,다꼬리) 바다3개(잉어킹,가이오가,그란돈)  하늘3개(뮤츠,펄기아,디아루가), 우주1개(아르세우스)
// 땅,바다,하늘 배열길이 4개
// 우주 배열길이 11개

public class MonsterBase {
	// print문 색깔
	public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
	
	public Random r = new Random();

	public int probabilityValue;
	// 조우했는지 안 했는지 여부 0. 못 만남 1. 만남
	public int isMet = 1;
	// 몬스터 이름
	public String name;
	// 스폰 장소
	public String spawnMap;
	// 몬스터 소개란
	public String present;
	// 이 몬스터가 한 번이라도 잡혔는지 안 잡혔는지 판단
	// true: 잡힌 거
	// false: 안 잡힌 거
	public boolean ifCatch = false;

	public MonsterBase() {
		this.name = "기본";
	}

	public MonsterBase(String name) {
		this.name = name;
	}

	// 마주쳤을 때
	// 등장멘트
	public void appearanceComment() {
		// System.out.println();
	}

	// 도망칠 확률 "개별사건"
	// 유저가 싸운다 or 도망친다에서 '싸운다' 선택지가 선택 경우
	// 확률적으로 몬스터가 도망치는 메서드
	// 그 뒤 이동을 하든 지시 메뉴가 떠야됨
	// 반환 값 => 도망칠 때:false | 안도망칠 때:true
	public boolean runMonster() {
		return true;
	}

	// 잡힐 확률 "개별사건"
	// 유저가 '싸운다' 라는 선택지를 선택 할 경우
	// 확률적으로 몬스터 잡거나 못잡는 이벤트 발생
	// 잡히면 도감 등록을 해야함
	// 반환 값 => 잡혔을 때:true | 아닐 때:false
	public boolean catchMonster() throws InterruptedException {

		return true;
	}

	public void delayTime() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("\n>> ...");
		Thread.sleep(500);
		System.out.println("\n>> ...");
	}
}
