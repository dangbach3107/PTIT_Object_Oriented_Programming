package J06001;

class SanPham {
    private String id;
    private String name;
    private int type1Price;
    private int type2Price;

    public SanPham(String id, String name, int type1Price, int type2Price) {
        this.id = id;
        this.name = name;
        this.type1Price = type1Price;
        this.type2Price = type2Price;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getType1Price() {
        return type1Price;
    }

    public int getType2Price() {
        return type2Price;
    }
}