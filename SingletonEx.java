
package coffemachine;
class CoffeMac
{
    private float waterQty;
    private float sugarQty;
    private float milkQty;
    private float coffeQty;
    static private CoffeMac my=null;
    private CoffeMac()
    {
        coffeQty=1;
        waterQty=1;
        milkQty=1;
        sugarQty=1;
    }
    public void fillSugar(float qty)
    {
        sugarQty=qty;
    }
    public void fillWater(float qty)
    {
        waterQty=qty;
    }
    public void fillMilk(float qty)
    {
        milkQty=qty;
    }
    public void fillCoffe(float qty)
    {
        coffeQty=qty;
    }
    static float getCoffe()
    {
        return 0.15f;
    }
    static CoffeMac getInstance ()
    {
        if(my==null)
            my=new CoffeMac();
        return my;
    }
    
}
public class CoffeMachine {

    
    public static void main(String[] args) {
        CoffeMac m1=CoffeMac.getInstance();
        CoffeMac m2=CoffeMac.getInstance();
        CoffeMac m3=CoffeMac.getInstance();
        System.out.println(m1+" "+m2+" "+m3);
        if(m1==m2 && m1==m3)
            System.out.println("Same");

    }
    
}
