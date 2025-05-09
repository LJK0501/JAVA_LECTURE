package catchGame.monster;

import java.util.Random;

/// 몬스터 등장 확률 관리 클래스
public class MonsterArrays {

	/// 이쪽은 신경 안써도 됨
	////// 이쪽은 신경 안써도 됨
	////// 이쪽은 신경 안써도 됨
	// 확률 테스트 및 초기화
	public int n1 = 0;
	public int n2 = 0;
	public int n3 = 0;
	public int n4 = 0;

	public void printAndReset(int num) {

		for (int i = 0; i < 9999; i++) {
			if (num == 0) {
				this.earthMonsters();
			}
			if (num == 1) {
				this.seaMonsters();
			}
			if (num == 2) {
				this.skyMonsters();
			}
			if (num == 3) {
				this.universeMonsters();
			}
		}

		System.out.println(this.n1 / (double) 9999);
		System.out.println(this.n2 / (double) 9999);
		System.out.println(this.n3 / (double) 9999);
		System.out.println(this.n4 / (double) 9999);
		System.out.println("총합: " + ((this.n1 + this.n2 + this.n3 + this.n4)/(double)9999));
		this.n1 = 0;
		this.n2 = 0;
		this.n3 = 0;
		this.n4 = 0;
	}

	
	
	
	
	
	
	
	
	/// 여기가 등장 확률
	Random r = new Random();
	int ranNum;

	// 땅맵에서 출현할 몬스터 등장확률
	public MonsterBase earthMonsters() {
		MonsterBase[] earth = {
				// 최소 공배수 20
				new Monster0(), // 아무것도 만나지 않았을 때 20% => 1/5 => 4/20 | 0~3
				new Monster2(), // 피카츄 15% => 3/20 => | 4~6
				new Monster3(), // 다꼬리 15% => 3/20 => | 7~9
				new Monster4() }; // 마자용 50% => 1/2 => 10/20 | 10~19
		this.ranNum = r.nextInt(20);
		if (this.ranNum <= 3) {
			this.n1 += 1;
			return earth[0];
		} else if (this.ranNum <= 8) {
			this.n2 += 1;
			return earth[1];
		} else if (this.ranNum <= 13) {
			this.n3 += 1;
			return earth[2];
		} else {
			this.n4 += 1;
			return earth[3];
		}
	}

	// 바다맵에서 출현할 몬스터 등장확률
	// 바다라는 망망대해에선 만나기 쉽지 않게 설정
	public MonsterBase seaMonsters() {
		MonsterBase[] sea = {
				// 최소 공배수 20
				new Monster0(), // 아무것도 만나지 않았을 때 10% => 1/10 => 2/20 | 0~1
				new Monster1(), // 잉어킹 40% => 2/5 => 8/20 | 2~9
				new Monster5(), // 가이오가 25% => 1/4 => 5/20 | 10~14
				new Monster6() }; // 그란돈 25% => 1/4 => 5/20 | 15~19
//		this.ranNum = r.nextInt(20);
//		if (this.ranNum <= 7) {
//			this.n1 += 1;
//			return sea[0];
//		} else if (this.ranNum <= 15) {
//			this.n2 += 1;
//			return sea[1];
//		} else if (this.ranNum == 16) {
//			this.n3 += 1;
//			return sea[2];
//		} else {
//			this.n4 += 1;
//			return sea[3];
//		}
		
		
		
		// 시연을 위한 높은 확률 조정
		this.ranNum = r.nextInt(10);
		if (this.ranNum == 0) {
			this.n1 += 1;
			return sea[0];
		} else if (this.ranNum <= 3) {
			this.n2 += 1;
			return sea[1];
		} else if (this.ranNum <= 6) {
			this.n3 += 1;
			return sea[2];
		} else {
			this.n4 += 1;
			return sea[3];
		}
	}

	// 하늘맵에서 출현한 몬스터 등장확률
	public MonsterBase skyMonsters() {
		MonsterBase[] sky = {
				// 최소 공배수 10
				new Monster0(), // 아무것도 만나지 않았을 때 10% => 1/10 | 0
				new Monster7(), // 뮤츠 30% => 3/10 | 1~3
				new Monster8(), // 디아루가 30% => 3/10 | 4~6
				new Monster9()}; // 펄기아 30% => 3/10 | 7~9
		this.ranNum = r.nextInt(10);
		if (this.ranNum == 0) {
			this.n1 += 1;
			return sky[0];
		} else if (this.ranNum <= 3) {
			this.n2 += 1;
			return sky[1];
		} else if (this.ranNum <= 6) {
			this.n3 += 1;
			return sky[2];
		} else {
			this.n4 += 1;
			return sky[3];
		}
	}

	// 우주맵(히든맵)에서 출현한 몬스터 등장확률
	public MonsterBase universeMonsters() {
		MonsterBase[] universe = {
				// 최소 공배수 200
				new Monster0(), // 아무것도 만나지 않았을 때 90% => 9/10 => 180/200 | 0~179
				new Monster8(), // 디아루가 4% => 1/25 => 8/200 | 180~187
				new Monster9(), // 펄기아 4% => 1/25 => 8/200 | 188~195
				new Monster10() }; // 아르세우스 2% => 1/50 => 4/200 | 196~199
//		this.ranNum = r.nextInt(200);
//		if (this.ranNum <= 179) {
//			this.n1 += 1;
//			return universe[0];
//		} else if (this.ranNum <= 187) {
//			this.n2 += 1;
//			return universe[1];
//		} else if (this.ranNum <= 195) {
//			this.n3 += 1;
//			return universe[2];
//		} else {
//			this.n4 += 1;
//			return universe[3];
//		}
		// 시연을 위한 높은 확률 조정
		this.ranNum = r.nextInt(10);
		if (this.ranNum == 0) {
			this.n1 += 1;
			return universe[0];
		} else if (this.ranNum <= 3) {
			this.n2 += 1;
			return universe[1];
		} else if (this.ranNum <= 6) {
			this.n3 += 1;
			return universe[2];
		} else {
			this.n4 += 1;
			return universe[3];
		}
		
		
	}

}
