public class basic2 {
    // a very basic implementation not optimised
    // demonstrating how insertion, retrieval, and deletion can be achieved in constant time
    static class MapUsingHash {
        public Entity[] entities;
        public MapUsingHash() {
            entities = new Entity[100];
        }
        public class Entity {
            String key;
            String value;
            public Entity(String key, String value) {
                this.key = key;
                this.value = value;
            }
        }
        public void put(String key, String value) {
            int hash = Math.abs(key.hashCode()%entities.length);
            entities[hash] = new Entity(key,value); // it will override if element is already there
        }
        public String get(String key) {
            int hash = Math.abs(key.hashCode()%entities.length);
            if (entities[hash] != null && entities[hash].key.equals(key)) { // cause might have been removed or updated
                return entities[hash].value;
            }
            return null; // doesn't voilate String return type, because it's refrence datatype
        }
        public void remove(String key) {
            int hash = Math.abs(key.hashCode()%entities.length);
            if(entities[hash] != null && entities[hash].key.equals(key)) {
                entities[hash] = null;
            }
        }
    }
    public static void main(String[] args) {
        MapUsingHash map = new MapUsingHash();
        map.put("Mango", "King of fruits");
        map.put("Mango", "Sweet");

        System.out.println(map.get("Mango")); // Sweet

    }
}
