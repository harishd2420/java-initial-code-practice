class simple{
    void kit(){
        System.out.println();
    }
}
class calc extends simple{
    @Override
    void area(int a,int b){
        System.out.println(a*b);
    }
}
class rectangle{
    public static void main(String[] args){
        calc r=new calc();
        r.area(10,20);
    }
}