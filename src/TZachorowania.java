/**
 * */
public class TZachorowania extends TCzynnosc

{
    private int zachorowania;

    public TZachorowania(String arg1, int zachorowania)
    {
        super(arg1);
        this.zachorowania = zachorowania;
    }

    public int getZachorowania()
    {
        return zachorowania;
    }

    public void setZachorowania(int zachorowania)
    {
        this.zachorowania = zachorowania;
    }
}
