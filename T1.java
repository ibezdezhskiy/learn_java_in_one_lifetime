public class T1 {
    public void write(T1 e) {
        print("T1/T2");
        e.write();
    }
    protected void write(){
        print("  T1");
    }

    protected void print(String s){
        System.out.println(s);
    }
}
