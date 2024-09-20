package ImpPrograms.StringPrograms;

public class PrintGivenStringOfCharNumbers {

    public static void main(String[] args) {
        String str="3a3b4c2d";
        StringBuffer b=new StringBuffer();
        int count=0;
        for(int i=0;i<str.length();i++){
            char c =str.charAt(i);
            System.out.print(" Index Value-"+String.valueOf(c));
            if(Character.isDigit(c)){
                count=Integer.valueOf(String.valueOf(c));
                System.out.print("  Number-"+count);
                for (int j=0;j<count;j++){
                    b.append(str.charAt(i+1));
                }
            }
        } System.out.print(b.toString());
    }
}
