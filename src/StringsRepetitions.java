
public class StringsRepetitions {



    public String returnStringsRepetitions(String text, int numberRepetitions){
        String stringConcat = "";

        if (numberRepetitions == 0) {
            return "";
        }


         if (numberRepetitions > text.length()){
             return "error";

         }
                int newTextSize = text.length() - numberRepetitions;

                for (int i = 0; i <= numberRepetitions - 1; i++) {
                    String stringValue = text.substring(newTextSize, text.length());

                    stringConcat = stringConcat + stringValue;
                }

     return stringConcat;
    }
}
