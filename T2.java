public class T2 extends T1{
    public void write(T2 e){
        print("T2/T2");
        e.write();
    }
    protected void write(){
        print("  T2");
    }
    protected void print(String s){
        System.out.println(s);
    }
}
