package estruturasDeDados.listas.estaticas;

// Define os métodos que qualquer implementação
// de lista deve ter
// (isto é, eles PRECISAM ser implementados)
public interface ListaTAD {
     void add(int e);
     void add(int index, int element);
     int get(int index);
     int set(int index, int element);
     boolean remove(int e);
     boolean isEmpty();
     int size();
     boolean contains(int e);
     int indexOf(int e);
     void clear();
}
