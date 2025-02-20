package ClassWork.L19_12_24;

public class Task01 {
    public static void main(String[] args) {
        int sec =186385;

        int cekInDay=24*60*60;
        int days = sec/cekInDay;
        int res=days*cekInDay;
        int res1=sec-res;
        int hors=res1/3600;
        int res3=hors*60*3;
        int sec2=res1-res3;







        System.out.println(res3);
    }
}
