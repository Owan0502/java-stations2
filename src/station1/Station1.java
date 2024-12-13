import java.util.ArrayList;

public class Station1 {

    public static void main(String[] args) {
        // 自分で動作確認をするコードを書く場合はここに書きましょう
        ArrayList<String> list = q1();
        System.out.println(list);
    }

    public static ArrayList<String> q1() {
        // 問題1: ここから

        ArrayList<String> tt = new ArrayList<>();

        tt.add("Tech");
        tt.add("Train");

        return tt;

        // 問題1: ここまで
    }

    public static int q2(ArrayList<String> list, ArrayList<String> searchWords) {
        // 問題2: ここから
        
        int count = 0;

        for (String word : searchWords) {
            if (list.contains(word)) {
                count++;
            }
        }

        return count;

        // 問題2: ここまで
    } 
}