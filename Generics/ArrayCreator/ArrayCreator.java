package Lab.Generics.ArrayCreator_02;

import java.lang.reflect.Array;

public class ArrayCreator {

    public static <T> T[] create(int length, T item) {
        T[] array = (T[]) new Object[length];
        for (int i = 0; i < length; i++) {
            array[i] = item;
        }
        return array;
    }
    public static <T> T[] create(Class<T> clazz, int length,T item){
        T[] array=(T[]) Array.newInstance(clazz,length);
        for (int i = 0; i <length; i++) {
            array[i]=item;
        }
        return array;
    }
}
