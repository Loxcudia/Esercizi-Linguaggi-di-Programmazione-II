import java.util.*;
public class BoundedMap<K,V> {
    private Map<K,V> map;
    private Map<K, Integer> getCounterMap;
    private Integer dimensioneMassima;
    private Integer dimensioneAttuale;

    public BoundedMap(Integer dimensioneMassima)
    {
        this.dimensioneMassima = dimensioneMassima;
        this.dimensioneAttuale = 0;
        this.getCounterMap = new TreeMap<K,Integer>();
        this.map = new TreeMap<K,V>();
    }

    public void put(K key, V value)
    {
        if(!this.dimensioneAttuale.equals(this.dimensioneMassima))
        {
            map.put(key, value);
            getCounterMap.put(key, 0);
            this.dimensioneAttuale++;
        }
        else
        {
            Integer min = Integer.MAX_VALUE;
            K tmpKey = null;
            V tmpObject = null;
            for (K k: getCounterMap.keySet())
            {
                if(getCounterMap.get(k).compareTo(min) < 0)
                {
                    min = getCounterMap.get(k);
                    tmpKey = k;
                    tmpObject = map.get(k);
                }
            }
            map.remove(tmpKey,tmpObject);
        }
    }

    public V get(K key)
    {
       getCounterMap.replace(key, getCounterMap.get(key).intValue() + 1);
       return map.get(key);
    }
}
