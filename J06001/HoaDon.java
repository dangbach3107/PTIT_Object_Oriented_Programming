package J06001;

class HoaDon {
    private static int ID = 0;
    private String id;
    private int amount;
    private SanPham sanPham;
    private int discount;
    private int finalPrice;

    public HoaDon(String id, int amount) {
        this.id = String.format("%s-%03d", id, ++ID);
        this.amount = amount;
        discount = 0;
    }

    public String getId() {
        return id;
    }

    public void setSanPham(SanPham sanPham, char type) {
        this.sanPham = sanPham;
        int unitPrice = 0;
        if (type == '1') unitPrice = sanPham.getType1Price();
        else unitPrice = sanPham.getType2Price();
        int price = unitPrice * amount;
        if (amount >= 150) discount = (int) (price * 0.5);
        else if (amount >= 100) discount = (int) (price * 0.3);
        else if (amount >= 50) discount = (int) (price * 0.15);
        finalPrice = price - discount;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d %d", id, sanPham.getName(), discount, finalPrice);
    }
}