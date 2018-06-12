public class Numbers {

    //Translate a number to its equivalent in letters.

    public static String say(long n) {
        //Here we have the special numbers stored, that is, the ones that are not repeated.
        switch ((int) n){
            case 0: return "Zero";
            case 1: return "One";
            case 2: return "Two";
            case 3: return "Three";
            case 4: return "Four";
            case 5: return "Five";
            case 6: return "Six";
            case 7: return "Seven";
            case 8: return "Eight";
            case 9: return "Nine";
            case 10: return "Ten";
            case 11: return "Eleven";
            case 12: return "Twelve";
            case 13: return "Thirteen";
            case 14: return "Fourteen";
            case 15: return "Fifteen";
            case 16: return "Sixteen";
            case 17: return "Seventeen";
            case 18: return "Eighteen";
            case 19: return "Nineteen";
        }

        //Transform the long variable into a string to be able to calculate its length.
        String strLong = Long.toString(n);
        long larg = strLong.length();

        //Here we define which function should return the number solved depending on the length of the number.
        //This function will be called from the rest of functions to resolve the rest of the number, used in this methodology as we will see below.

        if (n > 19 && larg == 2) {
            return tens(n);
        } else if (larg == 3) {
            return hundreds(n);
        } else if (larg == 4 || larg == 5){
            return thousands(n);
        }else if (larg == 6) {
            return huntho(n);
        } else if (larg == 7 || larg == 8 || larg == 9){
            return million(n);
        } else if (larg == 10 || larg == 11 || larg == 12){
            return billion(n);
        } else if (larg == 13 || larg == 14 || larg == 15){
            return trillion(n);
        } else if (larg == 16 || larg == 17 || larg == 18){
            return quadrillion(n);
        }else if (larg == 19 || larg == 20 || larg == 21){
            return quintillion(n);
        }else {
            return "No pot ser";
        }
    }

    static String decenas(long x){
        //Here we have the numbers from 20 to 90 stored of ten in ten.
        switch ((int) x){
            case 2: return "Twenty";
            case 3: return "Thirty";
            case 4: return "Forty";
            case 5: return "Fifty";
            case 6: return "Sixty";
            case 7: return "Seventy";
            case 8: return "Eighty";
            case 9: return "Ninety";
        }
        return "Número invalid";
    }

    static String tens(long n){
        // transforms the numbers from 20 to 99.

        //Discover the tens
        long q = n /10;
        //Discover the units
        long rest = n % 10;

        //check if the number is finished in 0.
        if ( rest == 0) {
            return decenas(q);
        }
        //In case the number does not end at 0, the function will return tens and units concatenated.
        else {
            return decenas(q) + "-" + say(rest).toLowerCase();
        }
    }

    static String hundreds(long n){

        //Transforms the numbers from 100 to 999

        //Same methodology to decompose the number.
        long q = n /100;

        long rest = n % 100;

        //Solve the exact hundreds(100-900)
        if (rest == 0) {
            return say(q) + " hundred";
        } else {
        //In this case and in the remainder of cases the rest of the division will be sent to the function "say" which will be responsible for returning the necessary number.
            return say(q) +" hundred and " +say(rest).toLowerCase() ;
        }
    }

    static String thousands(long n){
        //Transforms the numbers from 1000 to 99999

        //Same methodology to decompose the number.
        long q = n / 1000;
        long rest = n % 1000;

        //Same methodology as with the hundreds changing the word "hundred" for the "thousand" one.
       if (rest == 0) {
           return say(q) + " thousand";
       } else{
           return say(q) + " thousand " +say(rest).toLowerCase();
       }
    }

    static String huntho(long n) {
        //Transforms the numbers from 100.000 to 999.999

        long q = n / 100000;
        long rest = n % 100000;
        long q2 = n / 1000;
        long rest2 = rest % 1000;

        //Same methodology as with the hundreds changing the word "hundred" for the "hundred thousand" or "thousand" one.
        if (rest == 0) {
            return say(q) + " hundred thousand";
        } else {
            return say(q2) + " thousand " + say(rest2).toLowerCase();
        }
    }

    static String million(long n) {
        //Transforms the numbers from 1.000.000 to 999.999.999

        long q = n / 1000000;
        long rest = n % 1000000;

        //Same methodology as with the hundreds changing the word "hundred" for the "million" one.
        if (rest == 0)  {
            return say(q) + " million";
        } else {
            return say(q) + " million " + say(rest).toLowerCase();
        }
    }

    static String billion(long n){
        //Transforms the numbers from 1.000.000.000 to 999.999.999.999

        long q = n / 1000000000;
        long rest = n % 1000000000;

        //Same methodology as with the hundreds changing the word "hundred" for the "billion" one.
        if (rest == 0)  {
            return say(q) + " billion";
        } else {
            return say(q) + " billion " + say(rest).toLowerCase();
        }
    }

    static String trillion(long n) {
        //Transforms the numbers from 1.000.000.000.000 to 999.999.999.999.999

        long q = n / 1_000_000_000_000L;
        long rest = n % 1_000_000_000_000L;

        //Same methodology as with the hundreds changing the word "hundred" for the "trillion" one.
        if (rest == 0)  {
            return say(q) + " trillion";
        } else {
            return say(q) + " trillion " + say(rest).toLowerCase();
        }
    }

    static String quadrillion(long n) {
        //Transforms the numbers from 1.000.000.000.000.000 to 999.999.999.999.999.999

        long q = n / 1_000_000_000_000_000L;
        long rest = n % 1_000_000_000_000_000L;

        //Same methodology as with the hundreds changing the word "hundred" for the "quadrillion" one.
        if (rest == 0)  {
            return say(q) + " quadrillion";
        } else {
            return say(q) + " quadrillion " + say(rest).toLowerCase();
        }
    }

    static String quintillion (long n) {
        //Transforms the numbers from 1.000.000.000.000.000.000 to 999.999.999.999.999.999.999

        long q = n / 1_000_000_000_000_000_000L;
        long rest = n % 1_000_000_000_000_000_000L;

        //Same methodology as with the hundreds changing the word "hundred" for the "quintillion" one.
        if (rest == 0)  {
            return say(q) + " quintillion";
        } else {
            return say(q) +" quintillion " + say(rest).toLowerCase();
        }
    }


    //Transform a number written in letters to one written in digits
    public static long words(String s) {

        //we will receive a string which we'll store in an array of strings separated by spaces.
        String[] paraules = s.split(" ");

        //Here we declare the variable cont which will be what the program returns
        long cont = 0;

        //Here we identify and translate the numbers from 0 to 99
        if (paraules.length == 1 & s.contains("-")){
            return DToW(s);
        } else if (paraules.length == 1 & !s.contains("-")){
            cont = cont + db(paraules[0]);

            //Here we identify the rest of the numbers up to the hundreds of quintillion.
        } else {
            if (s.contains("quintillion") & paraules[1].contains("hundred")){
                return HQTToW(s);
            } else if (s.contains("quintillion")){
                return QTToW(s);
            } else if (s.contains("quadrillion") & paraules[1].contains("hundred")){
                return HQToW(s);
            } else if (s.contains("quadrillion")){
                return QToW(s);
            } else if (s.contains("trillion") & paraules[1].contains("hundred")){
                return HTRToW(s);
            } else if (s.contains("trillion")){
                return TRToW(s);
            } else if (s.contains("billion") & paraules[1].contains("hundred")) {
                return HBToW(s);
            } else if (s.contains("billion")) {
                return BToW(s);
            } else if (s.contains("million") & paraules[1].contains("hundred")) {
                return HMToW(s);
            } else if (s.contains("million")) {
                return MToW(s);
            } else if (s.contains("hundred thousand") || s.contains("thousand") & paraules[1].contains("hundred")) {
                return HTToW(s);
            } else if (s.contains("thousand")) {
                return TToW(s);
            } else if (s.contains("hundred")) {
                return HToW(s);
            }
        }

        return cont;
    }

    static long db (String s){

        //Here we have the special numbers stored, that is, the ones that are not repeated, and the numbers from 20 to 90 stored of ten in ten.
        switch (s) {
            case "zero":     return(0);
            case "one":      return(1);
            case "two":      return(2);
            case "three":    return(3);
            case "four":     return(4);
            case "five":     return(5);
            case "six":      return(6);
            case "seven":    return(7);
            case "eight":    return(8);
            case "nine":     return(9);
            case "ten":      return(10);
            case "eleven":   return(11);
            case "twelve":   return(12);
            case "thirteen": return(13);
            case "fourteen": return(14);
            case "fifteen":  return(15);
            case "sixteen":  return(16);
            case "seventeen":return(17);
            case "eighteen": return(18);
            case "nineteen": return(19);
            case "twenty":  return(20);
            case "thirty":  return(30);
            case "forty":   return(40);
            case "fifty":   return(50);
            case "sixty":   return(60);
            case "seventy": return(70);
            case "eighty":  return(80);
            case "ninety":  return(90);
        }
        return 0;
    }


    static long DToW (String s){

        //Solve the numbers from 20 to 99 but only the ones with a hyphens on it.

        //in this case, as the string that we pass has a hyphens, we separate the string by hyphens to process it.
        long cont = 0;

        //Then we just have to request to the function sb the values from each word and add it.
        String[] s2 = s.split("-");
        cont = cont + db(s2[0]);
        cont = cont + db(s2[1]);

        return cont;
    }

    static long HToW (String s) {

        //Solve the numbers from 100 to 999.

        //Here we divide the string by spaces to be able to process it and store those parts on a array.
        long cont = 0;
        String[] paraules = s.split(" ");

        //Solve the exact numbers(100,200...).
        cont = cont + db(paraules[0]);
        cont = cont * 100;

        //If the number is not exact, add the result of the rest.
        if (paraules.length == 4) {
            cont = cont + words(paraules[3]);
        }
        return cont;
    }

    static long TToW (String s) {

        //Solve the numbers from 1000 to 99999.

        //Same procedure and reason as the case of the hundreds.
        long cont = 0;
        String[] paraules = s.split(" ");

        //Resolve the exact thousands(1000,2000...).
        if (paraules.length == 2){
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1000;
            //Solve the thousands with a rest
        } else  {

            //Here we calculate the equivalent in numbers form the 2 first words.
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1000;

            //Transforms the part of the array not used to build a shorter string to process.
            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < paraules.length; i++) {
                sb.append(paraules[i]);
                sb.append(" ");
            }
            //Once we have the string shortened we send it to the global purpose function, which will be responsible for calculating its equivalent, this methodology will be repeated in every function.
            String ns = sb.toString();
            cont = cont + words(ns);

        }

        return cont;
    }
    static long HTToW (String s){

        //Solve the numbers from 100.000 to 999.999.
        long cont = 0;

        //Same procedure and reason as the case of the hundreds.
        String[] paraules = s.split(" ");


        //Here we solve the exact hundred thousands(100.000, 200.000...).
        if (paraules.length == 3) {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 100000;
            //Here we solve the hundred thousand with some kind of rest.
        } else {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 100000;

            //Here we create again a new string shortened from the first,not counting the used parts.
            StringBuilder sb = new StringBuilder();
            for (int i = 3; i < paraules.length; i++) {
                sb.append(paraules[i]);
                sb.append(" ");
            }

            //Same procedure and reason as in the TToW function
            String ns = sb.toString();
            cont = cont + words(ns);
        }
        return cont;
    }


    //The next 2 functions solve the numbers from 1.000.000 to 999.999.999.
    static long MToW(String s) {

        long cont = 0;
        String[] paraules = s.split(" ");

        //Solve the exact millions.
        if (paraules.length == 2) {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1000000;
            //Solve the millions with a rest.
        } else {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1000000;

            //Solve the millions WITHOUT a hundred thousand part
            if (paraules[2].contains("and")){

                //We shortened the string again to process it.
                StringBuilder sb = new StringBuilder();
                for (int i = 3; i < paraules.length; i++) {
                    sb.append(paraules[i]);
                    sb.append(" ");
                }
                String ns = sb.toString();
                cont = cont + words(ns);

                //Solve the millions WITH a hundred thousand part.
            }else {

                //We shortened the string again to process it,the difference with the one above is the number of words taken.
                StringBuilder sb = new StringBuilder();
                for (int i = 2; i < paraules.length; i++) {
                    sb.append(paraules[i]);
                    sb.append(" ");
                }
                String ns = sb.toString();
                cont = cont + words(ns);
            }
        }
        return cont;
    }

    static long HMToW(String s) {

        long cont = 0;
        String[] paraules = s.split(" ");

        //Solve the exact hundred of millions.
        if (s.contains("hundred million")) {
            cont = cont + words(paraules[0]);
            cont = cont * 100_000_000;

            //Solve the hundreds of millions with a rest.
        } else {

            //Here we create a string containing only the hundred part from the hundred million, and we multiply it by a million to obtain the hundred millions
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(paraules[i]);
                sb.append(" ");
            }
            String ns = sb.toString();
            cont = cont + words(ns.toLowerCase());
            cont = cont * 1_000_000;

            //Here we create a string with the not processed part from the original string to process it and add it to the return value.
            StringBuilder sb2 = new StringBuilder();
            for (int i = 5; i < paraules.length; i++) {
                sb2.append(paraules[i]);
                sb2.append(" ");
            }
            String ns2 = sb2.toString();
            cont = cont + words(ns2);
        }
        return cont;
    }

    //From this point on, the procedure is exactly the same as the one showed on the million and hundred millions, varying only in the number to process.

    //The next 2 functions solve the numbers from 1.000.000.000 to 999.999.999.999
    static long BToW(String s){

        //Same procedure than the showed in the millions, but this time we don't need to pay attention to the word "and".
        long cont = 0;
        String[] paraules = s.split(" ");

        if (paraules.length == 2) {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000;
        } else {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000;

                StringBuilder sb = new StringBuilder();
                for (int i = 2; i < paraules.length; i++) {
                    sb.append(paraules[i]);
                    sb.append(" ");
                }
                String ns = sb.toString();
                cont = cont + words(ns);
        }
        return cont;
    }

    static long HBToW(String s){

        //Same procedure than the ones showed on the function "HMToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (s.contains("hundred billion")) {
            cont = cont + words(paraules[0]);
            cont = cont * 100_000_000_000L;
        } else {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(paraules[i]);
                sb.append(" ");
            }
            String ns = sb.toString();

            cont = cont + words(ns.toLowerCase());
            cont = cont * 1_000_000_000L;

            StringBuilder sb2 = new StringBuilder();
            for (int i = 5; i < paraules.length; i++) {
                sb2.append(paraules[i]);
                sb2.append(" ");
            }
            String ns2 = sb2.toString();
            cont = cont + words(ns2);
        }
        return cont;
    }

    //The next 2 functions solve the numbers from 1.000.000.000.000 to 999.999.999.999.999
    static long TRToW(String s){

        //Same procedure than the one showed on the function "BToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (paraules.length == 2) {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000_000L;
        } else {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000_000L;

            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < paraules.length; i++) {
                sb.append(paraules[i].toLowerCase());
                sb.append(" ");
            }
            String ns = sb.toString();
            cont = cont + words(ns.toLowerCase());
        }
        return cont;
    }

    static long HTRToW(String s){

        //Same procedure than the ones showed on the function "HBToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (s.contains("hundred trillion")) {
            cont = cont + words(paraules[0]);
            cont = cont * 100_000_000_000_000L;
        } else {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(paraules[i].toLowerCase());
                sb.append(" ");
            }
            String ns = sb.toString();

            cont = cont + words(ns.toLowerCase());
            cont = cont * 1_000_000_000_000L;

            StringBuilder sb2 = new StringBuilder();
            for (int i = 5; i < paraules.length; i++) {
                sb2.append(paraules[i].toLowerCase());
                sb2.append(" ");
            }
            String ns2 = sb2.toString();
            cont = cont + words(ns2.toLowerCase());
        }
        return cont;
    }

    //The next 2 functions solve the numbers from 1.000.000.000.000.000 to 999.999.999.999.999.999
    static long QToW(String s){

        //Same procedure than the one showed on the function "BToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (paraules.length == 2) {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000_000_000L;
        } else {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000_000_000L;

            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < paraules.length; i++) {
                sb.append(paraules[i].toLowerCase());
                sb.append(" ");
            }
            String ns = sb.toString();
            cont = cont + words(ns.toLowerCase());
        }
        return cont;
    }

    static long HQToW(String s){

        //Same procedure than the ones showed on the function "HBToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (s.contains("hundred quadrillion")) {
            cont = cont + words(paraules[0]);
            cont = cont * 100_000_000_000_000_000L;
        } else {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(paraules[i].toLowerCase());
                sb.append(" ");
            }
            String ns = sb.toString();

            cont = cont + words(ns.toLowerCase());
            cont = cont * 1_000_000_000_000_000L;

            StringBuilder sb2 = new StringBuilder();
            for (int i = 5; i < paraules.length; i++) {
                sb2.append(paraules[i].toLowerCase());
                sb2.append(" ");
            }
            String ns2 = sb2.toString();
            cont = cont + words(ns2.toLowerCase());
        }
        return cont;
    }

    //The next 2 functions solve the numbers from 1.000.000.000.000.000.000 to 999.999.999.999.999.999.999
    static long QTToW(String s){

        //Same procedure than the one showed on the function "BToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (paraules.length == 2) {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000_000_000_000L;
        } else {
            cont = cont + words(paraules[0].toLowerCase());
            cont = cont * 1_000_000_000_000_000_000L;

            StringBuilder sb = new StringBuilder();
            for (int i = 2; i < paraules.length; i++) {
                sb.append(paraules[i].toLowerCase());
                sb.append(" ");
            }
            String ns = sb.toString();
            cont = cont + words(ns.toLowerCase());
        }
        return cont;
    }

    static long HQTToW(String s){

        //Same procedure than the ones showed on the function "HBToW" changing the number that we use to multiply.
        long cont = 0;
        String[] paraules = s.split(" ");

        if (s.contains("hundred quintillion")) {
            cont = cont + words(paraules[0]);
            cont = cont * 1_000_000_000_000_000_000L;
        } else {

            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 4; i++) {
                sb.append(paraules[i].toLowerCase());
                sb.append(" ");
            }
            String ns = sb.toString();

            cont = cont + words(ns.toLowerCase());
            cont = cont * 1_000_000_000_000_000_000L;

            StringBuilder sb2 = new StringBuilder();
            for (int i = 5; i < paraules.length; i++) {
                sb2.append(paraules[i].toLowerCase());
                sb2.append(" ");
            }
            String ns2 = sb2.toString();
            cont = cont + words(ns2.toLowerCase());
        }
        return cont;
    }
}