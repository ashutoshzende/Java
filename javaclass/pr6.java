class Cone{
    int r=5,h=10;
    double V=(1/3f)*(3.14*r*r)*h;
    public void volumeOfCone()
    {
        System.out.println("Volume of Cone:"+V);
    }
}
public class pr6 
{
    public static void main(String[] args) {
        
    
    Cone a;
    a=new Cone();
    
    a.volumeOfCone();

}

}