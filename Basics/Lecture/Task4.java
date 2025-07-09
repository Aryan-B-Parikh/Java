package Basics.Lecture;
abstract class game {
    abstract void play();
}
class cricket extends game {
    void play() {
        System.out.println("Playing cricket");
    }
}
class tennis extends game {
    void play() {
        System.out.println("Playing tennis");
    }
}
 class Task4 {
    public static void main(String[] args) {
        game g1 = new cricket();
        game g2 = new tennis();
        g1.play();
        g2.play();
    }
 }
