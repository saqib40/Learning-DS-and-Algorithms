public class basic3 {
    // not a fixed size implementation
    // but still basic
    // involves chaining to avoid collision
    // load factor = 0.5 implies doubling of size on insertion when half of elements are already inserted
    // to pretty print custom objects we override toString() method, check kunal's githu for that
    public class MapUsingLinkList<K,V> {
        ArrayList<LinkedList<Entity>> list;
        int size = 0;
        float lf = 0.5f;
        public class Entity {
            V key;
            V value;
            public Entity(V key, V value) {
                this.key = key;
                this.value = value;
            }
        }
        public MapUsingLinkList() {
            list = new ArrayList<>();
            for(int i=0; i < 10; i++) {
                list.add(new LinkedList<>());
            }
        }
        public void put(K key, V value) {
            int hash = Math.abs(key.hashCode() % list.size());
            LinkedList<Entity> entities = list.get(hash);
            // say the key is already inserted
            for (Entity entity : entities) {
                if(entity.key.equals(key)) {
                  entity.value = value;
                  return;
                }
            }
            // now we know the key is new
            // gotta check the size and the load factor
            if((float)(size) / list.size() > lf) {
                reHash();
            }
            entities.add(new Entity(key, value));
            size++;
        }
        public V get(K key) {
            int hash = Math.abs(key.hashCode() % list.size());
            LinkedList<Entity> entities = list.get(hash);
            for(Entity entity : entities) {
                if(entity.key.equals(key)) {
                  return entity.value;
                }
            }
            return null;
        }
        public void remove(K key) {
            int hash = Math.abs(key.hashCode() % list.size());
            LinkedList<Entity> entities = list.get(hash);
            Entity target;
            for(Entity entity : entities) {
                if(entity.key.equals(key)) {
                  target = entity;
                  break;
                }
            }
            entities.remove(target);
            size--;
        }
        public boolean containsKey(K key) {
            return get(key) != null;
        }
        public void reHash() { // to double the size of list
            ArrayList<LinkedList<Entity>> old = list;
            list = new ArrayList<>();
            size = 0;
            for(int i=0; i<old.size() * 2; i++) {
                list.add(new LinkedList<>());
            }
            for(LinkedList<Entity> entries :old) {
                for(Entity entry : entries) {
                    put(entry.key, entry.value);
                }
            }
        }
    }
}
