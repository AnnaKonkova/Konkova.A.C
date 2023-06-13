package HashT;
import java.util.NoSuchElementException;

public class HashTable<K, V> {
    private final int DEFAULT_INITIAL_CAPACITY = 16;
    private final double DEFAULT_LOAD_FACTOR = 0.75;
    private int size;

    private Entry<K, V>[] table;
    private static class Entry<K, V> {
        K key;
        V value;
        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
    public HashTable() {
        table = new Entry[DEFAULT_INITIAL_CAPACITY];
        size = 0;
    }

    private int hash(K key) {
        int hashCode = key.hashCode();
        int index = (hashCode ^ (hashCode >>> 16)) % table.length;
        return index >= 0 ? index : -index;
    }

    private void resize() {
        Entry<K, V>[] newTable = new Entry[table.length * 2];
        for (Entry<K, V> entry : table) {
            if (entry != null) {
                Entry<K, V> curr = entry;
                int index = hash(curr.key);
                while (newTable[index] != null) {
                    index = (index + 1) % newTable.length; // Линейное пробирование при коллизии
                }
                newTable[index] = new Entry<>(curr.key, curr.value);
            }
        }
        table = newTable;
    }

    public void put(K key, V value) {
        if ((double) size / table.length >= DEFAULT_LOAD_FACTOR) {
            resize();
        }
        int index = hash(key);
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                table[index].value = value;
                return;
            }
            index = (index + 1) % table.length; // Линейное пробирование при коллизии
        }
        table[index] = new Entry<>(key, value);
        size++;
    }

    public boolean remove(K key) {
        int index = hash(key);
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                table[index] = null;
                size--;
                rehash();
                return true;
            }
            index = (index + 1) % table.length;
        }
        return false;
    }

    private void rehash() {
        Entry<K, V>[] tempTable = table;
        table = new Entry[DEFAULT_INITIAL_CAPACITY];
        size = 0;
        for (Entry<K, V> entry : tempTable) {
            if (entry != null) {
                put(entry.key, entry.value);
            }
        }
    }

    public V get(K key) {
        int index = hash(key);
        while (table[index] != null) {
            if (table[index].key.equals(key)) {
                return table[index].value;
            }
            index = (index + 1) % table.length;
        }
        throw new NoSuchElementException("Ключ не найден");
    }


}