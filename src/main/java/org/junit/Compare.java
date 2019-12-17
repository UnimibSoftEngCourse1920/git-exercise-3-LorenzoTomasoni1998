package org.junit;

public class Compare<T> implements java.util.Comparator<T>
{

    public int compare(T o1, T o2) {
        if(o1.equals(o2))
            return 0;
        else
            return -1;
    }
    
}
