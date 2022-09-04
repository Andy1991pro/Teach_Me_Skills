package homework.By.homewor.twen;




public class DocumentMethod {


    public static void outNumber (String document){
        char[] myDocument = new char[9];
        document.getChars(0,4,myDocument,0);
        document.getChars(9,13,myDocument,5);
        myDocument[4] = ' ';
        System.out.println(myDocument);
        }
    public static void outLetters (String document){
        char[] myDocument = new char[21];
        document.getChars(0,21,myDocument,0);
        myDocument[5]='*';
        myDocument[6]='*';
        myDocument[7]='*';
        myDocument[14]='*';
        myDocument[15]='*';
        myDocument[16]='*';
        System.out.println(myDocument);
    }

    public static void outAllLiters (String document){
         char[] myDocument = new char[11];
        document.getChars(5,8,myDocument,0);
        document.getChars(13,17,myDocument,3);
        document.getChars(18,20,myDocument,7);
        document.getChars(20,22,myDocument,9);
        myDocument[3]='/';
        myDocument[7]='/';
        myDocument[9]='/';
        System.out.println(myDocument);
    }

    public static void commitMyDocument (String document){
        char[] myDocument = new char[11];
        document.getChars(5,8,myDocument,0);
        document.getChars(13,17,myDocument,3);
        document.getChars(18,20,myDocument,7);
        document.getChars(20,22,myDocument,9);
        myDocument[3]='/';
        myDocument[7]='/';
        myDocument[9]='/';
        StringBuilder commit = new StringBuilder(String.valueOf(myDocument));
        commit.insert(0,"Letters:");
        System.out.println(commit);
    }
    public static void testStart555 (String document){

        System.out.println("Test start 555, result: "+document.startsWith("555"));}

        public static void matchTestABC (String document){
        System.out.println("Match 'abc','ABC', result: "+document.toLowerCase().contains("abc".toLowerCase()));
    }
    public static void matchTestEnd (String document){
        System.out.println("Test end 1a2b, result: "+document.toLowerCase().endsWith("1a2b".toLowerCase()));
    }

}






