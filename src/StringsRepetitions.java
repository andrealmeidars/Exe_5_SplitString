
public class StringsRepetitions {
    private String textString;
    private int numberRepetitions;




    public String returnStringsRepetitions(String text, int numberRepetitions){
        String stringConcat = "";

        for (int i = 0; i<= numberRepetitions - 1; i++){
            stringConcat = stringConcat + text;
        }
     return stringConcat;
    }
}
