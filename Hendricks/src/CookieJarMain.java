public class CookieJarMain {
    //Justin Ecarma
    //10/9/2019
    //CookieJarLab
    //Cookie Eat Method
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
        c.eatCookie(1000);
//that could not be added
        System.out.println( c.spaceLeft( ) ); //no space left – returns 0
        System.out.println( c.isFull( ) );
    }
}
class CookieJar{
    public int cookienum = 0, maxcookie, cookieoverflow = 0, spaceLeft;
    public CookieJar(int capacity){
        maxcookie = capacity;
    }
    public boolean isFull(){
        if(cookienum >= maxcookie){
            return true;
        }
        return false;
    }
    public int addStuff(int addedStuff){
        cookienum += addedStuff;
        if(cookienum > maxcookie){
            cookieoverflow = cookienum - maxcookie;
            cookienum = 3000;
            return cookieoverflow;
        }
        return 0;
    }
    public int spaceLeft(){
        spaceLeft = maxcookie - cookienum;
        return spaceLeft;
    }
    public void eatCookie(int cookiesAte){
        cookienum -= cookiesAte;
        if(cookienum < 0) {
            System.out.println("You ate all the cookies!");
            cookienum = 0;
        }
        else{
            System.out.println("You ate " + cookiesAte + " cookies!");
        }
    }
}
