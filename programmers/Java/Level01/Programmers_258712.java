package programmers.Java.Level01;

import java.util.*;

public class Programmers_258712 {
    public static void main(String[] args) {
        String[] friends = {"joy", "brad", "alessandro", "conan", "david"};
        String[] gifts = {"alessandro brad", "alessandro joy", "alessandro conan", "david alessandro", "alessandro david"};
        System.out.println(solution(friends,gifts));
        
        String[] friends2 = {"muzi", "ryan", "frodo", "neo"};
        String[] gifts2 = {"muzi frodo", "muzi frodo", "ryan muzi", "ryan muzi", "ryan muzi", "frodo muzi", "frodo ryan", "neo muzi"};
        System.out.println(solution(friends2,gifts2));
        
    }

    private static int solution(String[] friends, String[] gifts) {
        Map<String, GiftHist> giftMap = setFriends(friends);

        setGifts(giftMap, gifts);

        int maxCnt = 0;

        for(String friend: friends) {
            GiftHist hist = giftMap.get(friend);
            int histCnt = 0;
            for(String key: friends) {
                if(hist.diffGiveToReceive(key) > 0) {
                    histCnt++;
                } else if(hist.diffGiveToReceive(key) == 0){
                    if(hist.getIdx() > giftMap.get(key).getIdx()) {
                        histCnt++;
                    }
                };
            }

            System.out.println("friend : " + friend + "(" + histCnt +")");
            if(maxCnt <= histCnt) {
                maxCnt = histCnt;
            }
        }

        return maxCnt;
    }

    private static Map<String, GiftHist> setFriends(String[] friends) {
        Map<String, GiftHist> user = new HashMap<>();
        for(String friend: friends) {
            user.put(friend, new GiftHist());
        }
        return user;
    }

    private static void setGifts(Map<String,GiftHist> giftMap, String[] gifts) {
        for(String gift: gifts) {
            // idx:0 == 준사람, idx:1 == 받은사람
            String[] hist = gift.split(" ");

            // hist[0]이 hist[1]에게 선물을 줌
            giftMap.get(hist[0]).putGives(hist[1]);

            // hist[1]이 hist[0]에게 선물을 받음
            giftMap.get(hist[1]).putReceives(hist[0]);
        }
    }
}

class GiftHist {
    private Map<String, Integer> gives = new HashMap<>();
    private Map<String, Integer> receives = new HashMap<>();

    private int idx = 0;

    public void putGives(String key) {
        this.gives.put(key, gives.containsKey(key) ? this.gives.get(key) + 1 : 1);
        this.idx++;
    }

    public void putReceives(String key) {
        this.receives.put(key, receives.containsKey(key) ? this.receives.get(key) + 1 : 1);
        this.idx--;
    }

    public int diffGiveToReceive(String key) {
        int givesCnt = this.gives.containsKey(key) ? this.gives.get(key) : 0;
        int receiveCnt = this.receives.containsKey(key) ? this.receives.get(key) : 0;
        return givesCnt - receiveCnt ;
    }

    public int getGives(String key) {
        return gives.get(key); 
    }

    public int getReceives(String key) {
        return receives.get(key);
    }

    public int getIdx() {
        return this.idx;
    }
}