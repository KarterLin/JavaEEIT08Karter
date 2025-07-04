package karter.api;

import java.util.*;

class Player {
    String name;
    String job;
    boolean hasAOE;

    public Player(String name, String job, boolean hasAOE) {
        this.name = name;
        this.job = job;
        this.hasAOE = hasAOE;
    }

    public boolean isMage() {
        return job.equals("法師");
    }

    @Override
    public String toString() {
        return name + "（" + job + (hasAOE ? "✓群體" : "") + "）";
    }
}

public class TeamDivider {

    public static void main(String[] args) {
        List<Player> players = Arrays.asList(
            new Player("12", "法師", true),
            new Player("蚊子", "法師", true),
            new Player("呱呱", "槍手", false),
            new Player("龜龜", "刀", false),
            new Player("index", "弓箭", true),
            new Player("sj", "祭司", false),
            new Player("小白", "法師", false),
            new Player("標賊", "標", false),
            new Player("彬彬", "劍士", false)
        );

        boolean success = false;
        int attempts = 0;

        // 嘗試最多 1000 次找到合法分組
        while (!success && attempts < 1000) {
            Collections.shuffle(players); // 每次隨機打亂

            List<List<Player>> teams = Arrays.asList(
                new ArrayList<>(),
                new ArrayList<>(),
                new ArrayList<>()
            );

            success = assignToTeams(players, teams, 0);
            if (success) {
                System.out.println("✅ 成功組隊（第 " + (attempts + 1) + " 次嘗試）：\n");
                for (int i = 0; i < teams.size(); i++) {
                    System.out.println("第 " + (i + 1) + " 組：");
                    for (Player p : teams.get(i)) {
                        System.out.println("  " + p);
                    }
                    System.out.println();
                }
            }

            attempts++;
        }

        if (!success) {
            System.out.println("❌ 無法在合理次數內找到符合條件的組合。");
        }
    }

    // 遞迴 + 回朔嘗試將玩家加入每組
    public static boolean assignToTeams(List<Player> players, List<List<Player>> teams, int index) {
        if (index >= players.size()) {
            for (List<Player> team : teams) {
                if (team.size() != 3) return false;

                boolean hasAOE = false;
                int mageCount = 0;
                for (Player p : team) {
                    if (p.hasAOE) hasAOE = true;
                    if (p.isMage()) mageCount++;
                }
                if (!hasAOE || mageCount > 2) return false;
            }
            return true;
        }

        Player current = players.get(index);
        for (List<Player> team : teams) {
            if (team.size() < 3) {
                team.add(current);
                if (assignToTeams(players, teams, index + 1)) return true;
                team.remove(team.size() - 1); // 回朔
            }
        }

        return false;
    }
}

