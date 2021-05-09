package kakao;

public class CodingPrac {

    public int souu(String hell) {
        int answer = 0;

        return 0;
    }

    public static void main(String[] args) {

        String s = "one2three4zero9seven";
        s = s.replace("zero", "0");
        s = s.replace("one","1");
        s = s.replace("two", "2");
        s = s.replace("three", "3");
        s = s.replace("four", "4");
        s = s.replace("five", "5");
        s = s.replace("six", "6");
        s = s.replace("seven", "7");
        s = s.replace("eight", "8");
        s = s.replace("nine", "9");

    }
    static class soll {
        public int[] solution (String code1, String day1, String[]data){
            int[] answer = {};
            String code = "987654";
            String day = "2019062113";
            int j=0;
            String[] data2 = new String[]{"price=80 code=987654 time=2019062113","price=100 code=987654 time=2019062113","price=80 code=987354 time=2019022113","price=80 code=987154 time=2019068113"};


            for (int i = 0; i < data2.length; i++) {
                String s = data2[i];
                String s1 = s.substring(6, 8);
                String s2 = s.substring(14, 20);
                String s3 = s.substring(26, 36);
                if(s2.equals(code) && day.equals(s3)){
                    answer[j++] = Integer.parseInt(s1);
                }
            }

            System.out.println("answer = " + answer[0]);
            System.out.println("answer = " + answer[1]);

            return answer;
        }
    }
//    static class Solution {
//
//        public int solution(String s) {
//            s = s.replace("zero", "0");
//            s = s.replace("one","1");
//            s = s.replace("two", "2");
//            s = s.replace("three", "3");
//            s = s.replace("four", "4");
//            s = s.replace("five", "5");
//            s = s.replace("six", "6");
//            s = s.replace("seven", "7");
//            s = s.replace("eight", "8");
//            s = s.replace("nine", "9");
//
//            int answer = Integer.parseInt(s);
//            return answer;
//        }
//
//    }

}
