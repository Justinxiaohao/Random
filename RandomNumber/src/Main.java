
/**
 * ClassName:${NAME}
 * Package:
 * Author:@Wyh
 */
public class Main {
    public static void main(String[] args) {
        double d1 =Math.random();//random()调用以后会随机返回一个[0.0-1.0)double类型的数
        System.out.println("d1="+d1);
        int num1=(int)(Math.random()*101);
        System.out.println("num1="+num1);//获取一个[0,100]的随机整数
        int num2=(int)(Math.random()*100)+1;
        System.out.println("num2="+num2);//获取一个[0,100]的随机整数
        //总结：获取一个[a,b]的随机数
        //(int)(Math.random()*(b-a+1))+a
        }
    }