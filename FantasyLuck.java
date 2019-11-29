import java.util.*;

public class FantasyLuck {
  private static String MELL = "Kennan";
  private static String STAM = "Ellis";
  private static String SHIT = "Justin";
  private static String CTE = "Andy";
  private static String DDNP = "Cole";
  private static String THRU = "Lucas";
  private static String CHUB = "Derek";
  private static String OG = "Nathan";
  private static String AURA = "Nikhil";
  private static String DELG = "Bryce";
  private static String NGUY = "Hannah";
  private static String SING = "Rahul";
  
  public static void main(String[] args) {
    Map<String, Integer> result = new HashMap<>();
    List<Map<String, Point>> data = FantasyLuck.data();
    for (Map<String, Point> week : data) {
      for (String player : week.keySet()) {
        double score = week.get(player).score;
        String opponent = week.get(player).opponent;
        double opponentScore = week.get(opponent).score;
        if (!result.containsKey(player)) {
          result.put(player, 0);
        }
        for (String otherPlayer : week.keySet()) {
          double otherScore = week.get(otherPlayer).score;
          if ((score < opponentScore && score > otherScore) || (score > opponentScore && score < otherScore)) {
            result.put(player, result.get(player) + 1);
          }
        }
      }
    }
    System.out.println(result.toString());
  }

  static List<Map<String, Point>> data() {
    List<Map<String, Point>> result = new ArrayList<>();
    
    Map<String, Point> week1 = new HashMap<>();
    week1.put(MELL, new Point(119, STAM));
    week1.put(STAM, new Point(92.1, MELL));
    week1.put(SHIT, new Point(155.5, CTE));
    week1.put(CTE, new Point(159.9, SHIT));
    week1.put(DDNP, new Point(139.4, THRU));
    week1.put(THRU, new Point(137.1, DDNP));
    week1.put(CHUB, new Point(122.8, OG));
    week1.put(OG, new Point(110.9, CHUB));
    week1.put(AURA, new Point(124.4, DELG));
    week1.put(DELG, new Point(130.4, AURA));
    week1.put(NGUY, new Point(122.8, SING));
    week1.put(SING, new Point(169.7, NGUY));
    result.add(week1);
    
    Map<String, Point> week2 = new HashMap<>();
    week2.put(MELL, new Point(126.4, THRU));
    week2.put(STAM, new Point(121, CTE));
    week2.put(SHIT, new Point(121.3, DDNP));
    week2.put(CTE, new Point(131.9, STAM));
    week2.put(DDNP, new Point(101.5, SHIT));
    week2.put(THRU, new Point(120.8, MELL));
    week2.put(CHUB, new Point(109.4, AURA));
    week2.put(OG, new Point(122.7, NGUY));
    week2.put(AURA, new Point(111, CHUB));
    week2.put(DELG, new Point(88.2, SING));
    week2.put(NGUY, new Point(122.7, OG));
    week2.put(SING, new Point(83.7, DELG));
    result.add(week2);

    Map<String, Point> week3 = new HashMap<>();
    week3.put(MELL, new Point(83.5, DDNP));
    week3.put(STAM, new Point(112.2, SHIT));
    week3.put(SHIT, new Point(133.4, STAM));
    week3.put(CTE, new Point(141.5, THRU));
    week3.put(DDNP, new Point(162.1, MELL));
    week3.put(THRU, new Point(130.6, CTE));
    week3.put(CHUB, new Point(122.6, NGUY));
    week3.put(OG, new Point(76.5, DELG));
    week3.put(AURA, new Point(151.1, SING));
    week3.put(DELG, new Point(134.5, OG));
    week3.put(NGUY, new Point(133.7, CHUB));
    week3.put(SING, new Point(188.7, AURA));
    result.add(week3);

    Map<String, Point> week4 = new HashMap<>();
    week4.put(MELL, new Point(101.3, SHIT));
    week4.put(STAM, new Point(99.1, THRU));
    week4.put(SHIT, new Point(90.1, MELL));
    week4.put(CTE, new Point(86, DDNP));
    week4.put(DDNP, new Point(93.7, CTE));
    week4.put(THRU, new Point(100.7, STAM));
    week4.put(CHUB, new Point(123, SING));
    week4.put(OG, new Point(167.8, AURA));
    week4.put(AURA, new Point(82.5, OG));
    week4.put(DELG, new Point(140.4, NGUY));
    week4.put(NGUY, new Point(103.3, DELG));
    week4.put(SING, new Point(137.8, CHUB));
    result.add(week4);

    Map<String, Point> week5 = new HashMap<>();
    week5.put(MELL, new Point(78, CTE));
    week5.put(STAM, new Point(159.6, DDNP));
    week5.put(SHIT, new Point(105.3, THRU));
    week5.put(CTE, new Point(180.1, MELL));
    week5.put(DDNP, new Point(137, STAM));
    week5.put(THRU, new Point(132.3, SHIT));
    week5.put(CHUB, new Point(169.2, DELG));
    week5.put(OG, new Point(127.1, SING));
    week5.put(AURA, new Point(110.9, NGUY));
    week5.put(DELG, new Point(99.8, CHUB));
    week5.put(NGUY, new Point(145.8, AURA));
    week5.put(SING, new Point(161.1, OG));
    result.add(week5);

    Map<String, Point> week6 = new HashMap<>();
    week6.put(MELL, new Point(96.3, SING));
    week6.put(STAM, new Point(74.6, NGUY));
    week6.put(SHIT, new Point(120.1, CHUB));
    week6.put(CTE, new Point(122.2, OG));
    week6.put(DDNP, new Point(121.8, AURA));
    week6.put(THRU, new Point(113.2, DELG));
    week6.put(CHUB, new Point(155.6, SHIT));
    week6.put(OG, new Point(153.7, CTE));
    week6.put(AURA, new Point(163.5, DDNP));
    week6.put(DELG, new Point(100.3, THRU));
    week6.put(NGUY, new Point(74.4, STAM));
    week6.put(SING, new Point(107.7, MELL));
    result.add(week6);

    Map<String, Point> week7 = new HashMap<>();
    week7.put(MELL, new Point(121.6, NGUY));
    week7.put(STAM, new Point(144.2, AURA));
    week7.put(SHIT, new Point(93.7, DELG));
    week7.put(CTE, new Point(145.6, CHUB));
    week7.put(DDNP, new Point(76.5, OG));
    week7.put(THRU, new Point(98.6, SING));
    week7.put(CHUB, new Point(127.6, CTE));
    week7.put(OG, new Point(92, DDNP));
    week7.put(AURA, new Point(92.2, STAM));
    week7.put(DELG, new Point(112.2, SHIT));
    week7.put(NGUY, new Point(82.1, MELL));
    week7.put(SING, new Point(81.5, THRU));
    result.add(week7);

    Map<String, Point> week8 = new HashMap<>();
    week8.put(MELL, new Point(92.9, AURA));
    week8.put(STAM, new Point(130.1, OG));
    week8.put(SHIT, new Point(104, SING));
    week8.put(CTE, new Point(124.1, DELG));
    week8.put(DDNP, new Point(102.6, CHUB));
    week8.put(THRU, new Point(108.2, NGUY));
    week8.put(CHUB, new Point(132.9, DDNP));
    week8.put(OG, new Point(112.3, STAM));
    week8.put(AURA, new Point(97.2, MELL));
    week8.put(DELG, new Point(131.2, CTE));
    week8.put(NGUY, new Point(181.7, THRU));
    week8.put(SING, new Point(103.9, SHIT));
    result.add(week8);

    Map<String, Point> week9 = new HashMap<>();
    week9.put(MELL, new Point(126.8, OG));
    week9.put(STAM, new Point(89.8, CHUB));
    week9.put(SHIT, new Point(115.8, NGUY));
    week9.put(CTE, new Point(118.2, SING));
    week9.put(DDNP, new Point(108.6, DELG));
    week9.put(THRU, new Point(147.4, AURA));
    week9.put(CHUB, new Point(109.5, STAM));
    week9.put(OG, new Point(98.2, MELL));
    week9.put(AURA, new Point(157.9, THRU));
    week9.put(DELG, new Point(130.3, DDNP));
    week9.put(NGUY, new Point(88.8, SHIT));
    week9.put(SING, new Point(97.4, CTE));
    result.add(week9);

    Map<String, Point> week10 = new HashMap<>();
    week10.put(MELL, new Point(79.6, CHUB));
    week10.put(STAM, new Point(146.3, DELG));
    week10.put(SHIT, new Point(132.5, AURA));
    week10.put(CTE, new Point(155, NGUY));
    week10.put(DDNP, new Point(88.9, SING));
    week10.put(THRU, new Point(123.3, OG));
    week10.put(CHUB, new Point(128, MELL));
    week10.put(OG, new Point(119, THRU));
    week10.put(AURA, new Point(161.3, SHIT));
    week10.put(DELG, new Point(112.9, STAM));
    week10.put(NGUY, new Point(94.5, CTE));
    week10.put(SING, new Point(84.4, DDNP));
    result.add(week10);

    Map<String, Point> week11 = new HashMap<>();
    week11.put(MELL, new Point(62.4, DELG));
    week11.put(STAM, new Point(138.4, SING));
    week11.put(SHIT, new Point(152.3, OG));
    week11.put(CTE, new Point(118.6, AURA));
    week11.put(DDNP, new Point(110.3, NGUY));
    week11.put(THRU, new Point(131.2, CHUB));
    week11.put(CHUB, new Point(80.3, THRU));
    week11.put(OG, new Point(119.8, SHIT));
    week11.put(AURA, new Point(112.6, CTE));
    week11.put(DELG, new Point(107.4, MELL));
    week11.put(NGUY, new Point(110.7, DDNP));
    week11.put(SING, new Point(76.4, STAM));
    result.add(week11);
    
    Map<String, Point> week12 = new HashMap<>();
    week12.put(MELL, new Point(95.8, SING));
    week12.put(STAM, new Point(105.2, NGUY));
    week12.put(SHIT, new Point(109, CHUB));
    week12.put(CTE, new Point(80.1, OG));
    week12.put(DDNP, new Point(131.9, AURA));
    week12.put(THRU, new Point(114.6, DELG));
    week12.put(CHUB, new Point(123.8, SHIT));
    week12.put(OG, new Point(113.2, CTE));
    week12.put(AURA, new Point(122.4, DDNP));
    week12.put(DELG, new Point(129.5, THRU));
    week12.put(NGUY, new Point(78.7, STAM));
    week12.put(SING, new Point(82.1, MELL));
    result.add(week12);
    
    return result;
  }

  static class Point {
    double score;
    String opponent;

    Point(double score, String opponent) {
      this.score = score;
      this.opponent = opponent;
    }
  }
}

