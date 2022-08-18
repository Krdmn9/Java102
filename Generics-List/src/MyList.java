import java.util.Arrays;

public class MyList <T>{
    private T[] arr;
    private T[] tempArr;
    public MyList() {
        this.arr = (T[]) new Object[10];
    }
    public MyList(int capacity) {
        this.arr = (T[]) new Object[capacity];
    }
    public void add(T data) {
        if(this.size() == this.getCapacity()) {
            this.setCapacity();
        }
        arr[size()] = data;
    }
    public T remove(int index) {
        if(index >= this.getCapacity())
            return null;
        T deletedItem = arr[index];
        arr[index] = null;
        boolean isDeleted = false;
        for(int i = 0; i < this.getCapacity();i++) {
            if(arr[i] == null)
                isDeleted = true;
            if (isDeleted && i<this.getCapacity()-1)
                arr[i] = arr[i+1];
            else if (!isDeleted)
                arr[i] = arr[i];
            else
                arr[i] = null;
        }
        return deletedItem;
    }
    public T get(int index) {
        if(index<this.getCapacity()) {
            return arr[index];
        }
        else
            return null;
    }
    public T set(int index, T data) {
        if (index >= this.getCapacity())
            return null;
        arr[index] = data;
        return data;
    }
    public void arrToTemp(){
        tempArr = (T[]) new Object[arr.length];
        for(int i = 0; i<arr.length;i++) {
            tempArr[i] = arr[i];
        }
    }

    public int indexOf(T data) {
        int counter = 0;
        for(T item: arr) {
            if(item == data) {
                return counter;
            }
            counter++;
        }
        return -1;
    }
    // 1 2 3 1
    // 0 1 2 3
    //
    public int lastIndexOf(T data) {
        for(int i = this.size()-1; i>=0; i--) {
            if (arr[i] == data)
                return i;
        }
        return -1;
    }

    public boolean isEmpty() {
        return (this.size() == 0);
    }

    public void clear() {
        for(int i = 0; i<this.getCapacity() ; i++) {
            arr[i] = null;
        }
    }
    public void tempToArr() {
        for(int i = 0; i<tempArr.length;i++) {
            arr[i] = tempArr[i];
        }
    }

    public boolean contains(T data) {
        for(T item : arr) {
            if (item == data)
                return true;
        }
        return false;
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> newArr = new MyList<>(finish-start+1);
        int counter = 0;
        for(int i = start; i<=finish; i++) {
            newArr.add(arr[i]);
            counter++;
        }
        return newArr;
    }

    public T[] toArray() {
        return arr;
    }
    public void setCapacity() {
        arrToTemp();
        this.arr = (T[]) new Object[this.getCapacity()*2];
        tempToArr();
    }
    public int getCapacity() {
        return arr.length;
    }

    public int size() {
        int counter = 0;
        for(T item: this.getArr()) {
            if (item != null)
                counter++;
            else
                break;
        }
        return counter;
    }

    public T[] getArr() {
        return arr;
    }

    public void setArr(T[] arr) {
        this.arr = arr;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("[");
        for(T arr : this.arr){
            if(arr!=null){
                stringBuilder.append(arr.toString() + ",");
            }
        }
        if(stringBuilder.length()==1) {
            stringBuilder.append("]");
            return stringBuilder.toString();
        }

        stringBuilder.deleteCharAt(stringBuilder.length()-1);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }
}
