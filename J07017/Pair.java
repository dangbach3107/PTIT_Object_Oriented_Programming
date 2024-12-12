package J07017;

public class Pair<K,V> {
    private K key;
    private V value;
    public Pair(K key, V value){
        this.key=key;
        this.value=value;
    }
    public static <K,V> Pair of(K key, V value){
        return new Pair<>(key, value);
    }
    public boolean prime(int n){
        if(n<2) return false;
        for(int i=2; i<=Math.sqrt(n); i++){
            if(n%i==0) return false;
        }
        return true;
    }
    public boolean isPrime(){
        return prime(Integer.parseInt(key.toString()))&&prime(Integer.parseInt(value.toString()));
    }
    public String toString(){
        return key+" "+value;
    }
}
