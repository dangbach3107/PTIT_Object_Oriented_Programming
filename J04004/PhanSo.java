package J04004;

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

    public PhanSo add(PhanSo other) {
        long newTuSo = tuSo * other.mauSo + other.tuSo * mauSo;
        long newMauSo = mauSo * other.mauSo;
        return new PhanSo(newTuSo, newMauSo);
    }

    public String toString() {
        return tuSo + "/" + mauSo;
    }
}

