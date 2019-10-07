public class CookieJarMain {
    public static void main(String[] args) {
        CookieJar c = new CookieJar( 3000 ); //sets capacity to 300
        System.out.println( c.isFull( ) ); //cookiejar is not full
        c.addStuff( 500 ); //add 500 items
        System.out.println( c.isFull( ) ); //cookiejar is not full
        System.out.println( c.addStuff( 2000 ) ); //add 2000 items
        System.out.println( c.spaceLeft( ) ); //space left is 500
        System.out.println( c.isFull( ) ); //cookiejar is not full
        System.out.println( c.addStuff( 2000 ) ); //attempt to add 2000
//adds 500 and returns 1500
//1500 was amount left
//that could not be added
        System.out.println( c.spaceLeft( ) ); //no space left – returns 0
        System.out.println( c.isFull( ) );
    }
}
class CookieJar{
    private int cookienum, maxcookie;
    private CookieJar(int capacity){
        maxcookie = capacity;
    }
    private boolean isFull(){
        if(cookienum == maxcookie){
            return true;
        }
        return false;
    }
    private int addStuff(int addedStuff){
        cookienum + addedStuff
    }
    private int spaceLeft(){
        return maxcookie - cookienum;
    }
}
