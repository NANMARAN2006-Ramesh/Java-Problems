class Computer{
    public void playMusic(){
        System.out.println("Music Playing..");
    }
    public String getPen(int cost){
        if(cost>=10){
            return "Pen";
        }
        return "Nothing";
    }
}
public class Method{
    public static void main(String[] args) {
        Computer obj = new Computer();
        obj.playMusic();
        String str = obj.getPen(10);
        System.out.println(str);
    }
}