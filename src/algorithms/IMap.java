
package algorithms;


public interface IMap<k, v> {
    
    public void put(k key, v value);
    public v get(k key);
    public int size();
}
