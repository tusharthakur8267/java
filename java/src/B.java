interface I
{
    public void prnI();
}
class B implements I{
    public void prnI() {
        System.out.println(" i am in prnl();");
    }

    public void prnB()
    {
        System.out.println(" i am in prnA()");
    }
}
class Ma
{
    public static void main(String[] args) {
         B obj= new B();
         obj.prnI();
         obj.prnB();
    }
}

