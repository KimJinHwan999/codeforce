package java;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class BoyOrGirl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nickName = sc.nextLine();
       
        Set<Character> set = new HashSet<>();
        
        for(int i = 0; i < nickName.length(); i++){
            set.add(nickName.charAt(i));
        }

        if(set.size() % 2 == 0){
            //girl
            System.out.println("CHAT WITH HER!");
        }else{
            //boy
            System.out.println("IGNORE HIM!");
        }
        sc.close();
    }
}


/*
Set 은 중복을 허용하지 않는 자료구조.
Set에 입력받은 단어를 찢어서 저장하면 중복되지 않는 값들을 확인가능
*/