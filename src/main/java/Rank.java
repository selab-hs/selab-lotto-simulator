import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum Rank {
    FIRST(6, false, "1등"),     // 1등: 6개 일치
    SECOND(5, true, "2등"), // 2등: 5개 일치 + 보너스 번호 1개 일치
    THIRD(5, false, "3등"),     // 3등: 5개 일치
    FOURTH(4, false, "4등"),    // 4등: 4개 일치
    FIFTH(3, false, "5등"),     // 5등: 3개 일치
    LOSER(0, false, "낙첨");     // 낙첨: 그 외

    private final int matchingNumbers;
    private final boolean hasBonus;
    private final String displayName;
    static List<Integer> ranks = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0, 0));
    Rank(int matchingNumbers, boolean hasBonus, String displayName) {
        this.matchingNumbers = matchingNumbers;
        this.hasBonus = hasBonus;
        this.displayName = displayName;
    }

    public static void setRankResult(int matchCount, boolean hasBonus) {
        int rank = 5;

        switch (matchCount) {
            case 6:
                rank = 0; // 1등
                break;
            case 5:
                if (hasBonus) {
                    rank = 1; // 2등
                } else {
                    rank = 2; // 3등
                }
                break;
            case 4:
                rank = 3; // 4등
                break;
            case 3:
                rank = 4; // 5등
                break;
        }

        ranks.set(rank, ranks.get(rank) + 1);
    }


    public int getMatchingNumbers() {
        return matchingNumbers;
    }

    public boolean getBonusNumbers() {
        return hasBonus;
    }

    public String getDisplayName() {
        return displayName;
    }
}

/* 당첨 기준
    - 1등: 기본 번호 6개 일치
    - 2등: 기본 번호 5개 일치, 보너스 번호 1개 일치
    - 3등: 기본 번호 5개 일치
    - 4등: 기본 번호 4개 일치
    - 5등: 기본 번호 3개 일치
    - 낙첨: 그 외
 */