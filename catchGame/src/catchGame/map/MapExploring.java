package catchGame.map;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MapExploring {

    public ArrayList<String> mapData; // ->  추가
    public boolean loopActivate = true;
    public String answerMap;
    Scanner scanner = new Scanner(System.in);

    public MapExploring() {
        this.mapData = new ArrayList<String>();
    }

    public static String toString(String selectMap) {
        return selectMap + "맵 페이지로 이동합니다 ";
    }

    public void mapInput() throws InterruptedException {
        this.loopActivate = true;
        while (this.loopActivate) {
            if (mapData.isEmpty()) {
                System.out.println("\n+++ 몬스터 잡기 게임 +++");
            }
            System.out.println("🗺️ 맵을 선택하세요 (🌴 땅|🌊 바다|☁️ 하늘|🎲 랜덤|⚠️ 취소)");
            this.answerMap = scanner.nextLine().trim();
            this.loopActivate = mapSelect(this.answerMap);

            Thread.sleep(500);
            if (!this.loopActivate && !this.mapData.isEmpty()) {
                System.out.println("\n>> 맵 이동중입니다...");
                Thread.sleep(500);
            }
        }
    }

    public boolean mapSelect(String answerMap) throws InterruptedException {
        switch (answerMap) {
            case "땅":
                mapData.add("땅"); // -> 추가
                System.out.println("\u001B[32m" + "🌴" + MapExploring.toString("땅") + "\u001B[0m");
                return false;

            case "바다":
                mapData.add("바다"); // -> 추가
                System.out.println("\u001B[34m" + "🌊" + MapExploring.toString("바다") + "\u001B[0m");
                return false;

            case "하늘":
                mapData.add("하늘"); // -> 추가;
                System.out.println("\u001B[34m" + "☁️" + MapExploring.toString("하늘") + "\u001B[0m");
                return false;

            case "랜덤":
                System.out.println("\u001B[33m" + "=========랜덤맵 생성 중...=========" + "\u001B[0m");// -> 추가
                mapProbability();
                return false;

            case "취소":
                mapData.add("취소");
                return false;

            default:
                System.out.println("잘못된 입력입니다. 다시 선택해주세요.");
                return true;
        }
    }

    public void mapProbability() throws InterruptedException {
        Random random = new Random();
        int index = random.nextInt(15);
        if (index <= 1) {
            mapSelect("땅");
        } else if (index <= 3) {
            mapSelect("바다");
        } else if (index <= 5) {
            mapSelect("하늘");
        } else {
            System.out.println("\u001B[32m" + "🚀" + MapExploring.toString("우주") + "\u001B[0m");
            mapData.add("우주");
        }
    }
}