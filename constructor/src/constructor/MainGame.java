package constructor;

public class MainGame {
    public static void main(String[] args) {
        Character valquiria = new Character("valquiria",1200,120,4);
        Character minipekka = new Character("minipekka",1000,300,4);
        Deack deack = new Deack(8,4,"exotico",13);
        Arena arena = new Arena();
        Arena arena2 =new Arena(23,3);
        Arena arena3 = new Arena(31,21);
    }
}

