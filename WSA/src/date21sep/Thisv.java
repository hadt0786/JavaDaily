public class Thisv{
    int id;

    public Thisv( int id){
        //id=id;//return 0 as default value
        this.id = id;//return 10 now
    }
    void display(){
        System.out.println(id);
    }

    public static void main(String[] args){
        Thisv a1 = new Thisv(10);
        a1.display();
    }
}