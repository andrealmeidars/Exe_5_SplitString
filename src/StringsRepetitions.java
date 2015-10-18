
public class StringsRepetitions {
    private String textString;
    private int numberRepetitions;




    public String returnStringsRepetitions(String text, int numberRepetitions){
        String stringConcat = "";

        for (int i = 0; i<= numberRepetitions - 1; i++){
            String stringValue = text.substring(numberRepetitions);
            stringConcat = stringConcat + stringValue;
        }
     return stringConcat;
    }
}
