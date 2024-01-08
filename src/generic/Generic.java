package generic;

public class Generic<T> {
    private  T data;


    public T getData() {
//        new T();
        return data;
    }

    public Generic<T> setData(T data) {
        this.data = data;
        return this;
    }


}
