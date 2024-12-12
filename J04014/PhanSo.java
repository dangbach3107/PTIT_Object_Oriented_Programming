package J04014;

public class PhanSo 
{
    private long tu, mau;

    public PhanSo(){}

    public PhanSo(long tu, long mau)
    {
        this.tu = tu;
        this.mau = mau;
    }

    public long gcd(long a, long b)
    {
        if(b == 0) return a;
        else return gcd(b, a % b);
    }

    PhanSo tong(PhanSo x){
        long a = this.tu * x.mau + x.tu * this.mau;
        long b = this.mau*x.mau;
        long c  = a/ gcd(a, b);
        long d =  b/ gcd(a, b);

        return new PhanSo(c, d);
    }

    PhanSo binhPhuong()
    {
        return new PhanSo(this.tu * this.tu, this.mau * this.mau);
    }

    PhanSo tich(PhanSo x)
    {
        long a = this.tu * x.tu;
        long b = this.mau * x.mau;
        long c = a / gcd(a, b);
        long d = b / gcd(a, b);

        return new PhanSo(c, d);
    }

    public String toString()
    {
        return this.tu + "/" + this.mau ;
    }

}
