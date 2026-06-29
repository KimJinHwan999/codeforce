import java.util.Scanner;

public class PetyaAndStrings {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        String firstWord = sc.nextLine();
        String lastWord = sc.nextLine();

        String upperFword = firstWord.toUpperCase();
        String upperLword = lastWord.toUpperCase();

        if(upperFword.equals(upperLword)){
            System.out.println("0");            
        }

        String parseFword[] = upperFword.split("");
        String parseLword[] = upperLword.split("");

        for(int i = 0; i < parseFword.length; i++){
            if(parseFword[i].charAt(0) == parseLword[i].charAt(0)){
                continue;
            }else if(parseFword[i].charAt(0) > parseLword[i].charAt(0)){
                System.out.println("1");
                break;
            }else if(parseFword[i].charAt(0) < parseLword[i].charAt(0)){
                System.out.println("-1");
                break;
            }
        }

        sc.close();
    }
}

/*
split.("")로 입력받은 단어를 단어별로 잘라서 배열에 저장 가능
charAt(index) 를 이용하면 단어 별로 잘라서 확인 가능
*/
