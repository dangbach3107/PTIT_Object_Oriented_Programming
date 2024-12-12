package J04003;
/*
 * @author dangbach
 * 07/09/2024
 * 14:40
 */

public class PhanSo {
    private long tuSo, mauSo;

    public long gcd(long a, long b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }

    public PhanSo(long tuSo, long mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        simplify();
    }

    public void simplify() {
        long gcd = gcd(tuSo, mauSo);
        tuSo /= gcd;
        mauSo /= gcd;
    }

    @Override
    public String toString() {
        return tuSo + "/" + mauSo;
    }
}
