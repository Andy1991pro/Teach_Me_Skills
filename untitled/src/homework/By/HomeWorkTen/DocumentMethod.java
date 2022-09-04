package homework.By.HomeWorkTen;




public class DocumentMethod {


    public static void OutNumber (String document){
        char[] myDocument = new char[9];
        document.getChars(0,4,myDocument,0);
        document.getChars(9,13,myDocument,5);
        myDocument[4] = ' ';
        System.out.println(myDocument);
        }
    public static void OutLetters (String document){
        char[] myDocument =new char[7];
        document.getChars(5,8,myDocument,0);
        document.getChars(13,17,myDocument,3);
        myDocument[3] = ' ';
        myDocument[0] = '*';
        myDocument[1] = '*';
        myDocument[2] = '*';
        myDocument[4] = '*';
        myDocument[5] = '*';
        myDocument[6] = '*';
        System.out.println(myDocument);
    }

    public static void OutAllLiters (String document){
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

    public static void CommitMyDocument (String document){
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
    public static void TestStart555 (String document){
        System.out.println("Test start 555, result: "+document.toLowerCase().startsWith("555".toLowerCase()));
    }

    public static void MatchTestABC (String document){
        System.out.println("Match 'abc','ABC', result: "+document.toLowerCase().contains("abc".toLowerCase()));
    }
    public static void MatchTestEnd (String document){
        System.out.println("Test end 1a2b, result: "+document.toLowerCase().endsWith("1a2b".toLowerCase()));
    }

}






